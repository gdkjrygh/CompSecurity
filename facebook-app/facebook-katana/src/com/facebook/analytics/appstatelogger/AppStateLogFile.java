// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

// Referenced classes of package com.facebook.analytics.appstatelogger:
//            LogFileState

class AppStateLogFile
{

    private static final byte e[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        65, 66, 67, 68, 69, 70
    };
    private final FileLock a;
    private final RandomAccessFile b;
    private final MessageDigest c = MessageDigest.getInstance("MD5");
    private boolean d;

    public AppStateLogFile(File file)
    {
        b = new RandomAccessFile(file, "rw");
        a = b.getChannel().tryLock();
        if (a == null)
        {
            throw new IOException(String.format("Unable to acquire lock for app state log file: %s", new Object[] {
                file.getAbsolutePath()
            }));
        }
        int i = c.getDigestLength() * 2;
        if (i != 32)
        {
            throw new IllegalArgumentException(String.format("Expected digest to have length %d; found %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(32)
            }));
        } else
        {
            return;
        }
    }

    static MessageDigest a(AppStateLogFile appstatelogfile)
    {
        return appstatelogfile.c;
    }

    static void a(AppStateLogFile appstatelogfile, byte abyte0[])
    {
        appstatelogfile.a(abyte0);
    }

    private void a(byte abyte0[])
    {
        d();
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            byte byte0 = e[j >>> 4];
            j = e[j & 0xf];
            b.writeByte(byte0);
            b.writeByte(j);
        }

    }

    static boolean a(AppStateLogFile appstatelogfile, boolean flag)
    {
        appstatelogfile.d = flag;
        return flag;
    }

    static RandomAccessFile b(AppStateLogFile appstatelogfile)
    {
        return appstatelogfile.b;
    }

    private void c()
    {
        b.seek(0L);
    }

    private void d()
    {
        b.seek(1L);
    }

    private void e()
    {
        b.seek(33L);
    }

    private void f()
    {
        b.setLength(1L);
    }

    public final OutputStream a()
    {
        if (d)
        {
            throw new IllegalStateException("Only one output stream to the log file can be open at a time");
        } else
        {
            d = true;
            f();
            e();
            c.reset();
            return new DigestOutputStream(new ContentOutputStream(), c);
        }
    }

    public final void a(int i)
    {
        i = LogFileState.a(i);
        if (i < 0 || i > 127)
        {
            throw new IllegalStateException("Status byte should be ASCII");
        } else
        {
            c();
            b.write(i);
            return;
        }
    }

    public final void b()
    {
        if (b != null)
        {
            b.close();
        }
    }


    private class ContentOutputStream extends OutputStream
    {

        final AppStateLogFile a;
        private boolean b;

        private void a()
        {
            if (b)
            {
                throw new IOException("Stream is closed");
            } else
            {
                return;
            }
        }

        public void close()
        {
            a();
            flush();
            b = true;
            byte abyte0[] = AppStateLogFile.a(a).digest();
            AppStateLogFile.a(a, abyte0);
            AppStateLogFile.a(a, false);
        }

        public void flush()
        {
            a();
        }

        public void write(int i)
        {
            a();
            AppStateLogFile.b(a).write(i);
        }

        public void write(byte abyte0[])
        {
            a();
            AppStateLogFile.b(a).write(abyte0);
        }

        public void write(byte abyte0[], int i, int j)
        {
            a();
            AppStateLogFile.b(a).write(abyte0, i, j);
        }

        public ContentOutputStream()
        {
            a = AppStateLogFile.this;
            super();
            b = false;
        }
    }

}
