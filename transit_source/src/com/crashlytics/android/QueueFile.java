// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.crashlytics.android:
//            ao, ap, an

class QueueFile
    implements Closeable
{

    private static final Logger a = Logger.getLogger(com/crashlytics/android/QueueFile.getName());
    private final RandomAccessFile b;
    private int c;
    private int d;
    private ao e;
    private ao f;
    private final byte g[];

    public QueueFile(File file)
        throws IOException
    {
        RandomAccessFile randomaccessfile;
        File file1;
        g = new byte[16];
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        file1 = new File((new StringBuilder()).append(file.getPath()).append(".tmp").toString());
        randomaccessfile = a(file1);
        randomaccessfile.setLength(4096L);
        randomaccessfile.seek(0L);
        byte abyte0[] = new byte[16];
        a(abyte0, new int[] {
            4096, 0, 0, 0
        });
        randomaccessfile.write(abyte0);
        randomaccessfile.close();
        if (!file1.renameTo(file))
        {
            throw new IOException("Rename failed!");
        }
        break MISSING_BLOCK_LABEL_133;
        file;
        randomaccessfile.close();
        throw file;
        b = a(file);
        b.seek(0L);
        b.readFully(g);
        c = a(g, 0);
        if ((long)c > b.length())
        {
            throw new IOException((new StringBuilder("File is truncated. Expected length: ")).append(c).append(", Actual length: ").append(b.length()).toString());
        } else
        {
            d = a(g, 4);
            int i = a(g, 8);
            int j = a(g, 12);
            e = a(i);
            f = a(j);
            return;
        }
    }

    static int a(QueueFile queuefile, int i)
    {
        return queuefile.b(i);
    }

    private static int a(byte abyte0[], int i)
    {
        return ((abyte0[i] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
    }

    private ao a(int i)
        throws IOException
    {
        if (i == 0)
        {
            return ao.a;
        } else
        {
            b.seek(i);
            return new ao(i, b.readInt());
        }
    }

    static RandomAccessFile a(QueueFile queuefile)
    {
        return queuefile.b;
    }

    private static RandomAccessFile a(File file)
        throws FileNotFoundException
    {
        return new RandomAccessFile(file, "rwd");
    }

    static Object a(Object obj, String s)
    {
        return b(obj, s);
    }

    private void a(int i, int j, int k, int l)
        throws IOException
    {
        a(g, new int[] {
            i, j, k, l
        });
        b.seek(0L);
        b.write(g);
    }

    private void a(int i, byte abyte0[], int j, int k)
        throws IOException
    {
        i = b(i);
        if (i + k <= c)
        {
            b.seek(i);
            b.write(abyte0, j, k);
            return;
        } else
        {
            int l = c - i;
            b.seek(i);
            b.write(abyte0, j, l);
            b.seek(16L);
            b.write(abyte0, j + l, k - l);
            return;
        }
    }

    static void a(QueueFile queuefile, int i, byte abyte0[], int j, int k)
        throws IOException
    {
        queuefile.b(i, abyte0, j, k);
    }

    private static void a(byte abyte0[], int i, int j)
    {
        abyte0[i] = j >> 24;
        abyte0[i + 1] = (byte)(j >> 16);
        abyte0[i + 2] = (byte)(j >> 8);
        abyte0[i + 3] = (byte)j;
    }

    private static transient void a(byte abyte0[], int ai[])
    {
        int i = 0;
        int k = ai.length;
        int j = 0;
        for (; i < k; i++)
        {
            a(abyte0, j, ai[i]);
            j += 4;
        }

    }

    private int b(int i)
    {
        if (i < c)
        {
            return i;
        } else
        {
            return (i + 16) - c;
        }
    }

    private static Object b(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException(s);
        } else
        {
            return obj;
        }
    }

    private void b(int i, byte abyte0[], int j, int k)
        throws IOException
    {
        i = b(i);
        if (i + k <= c)
        {
            b.seek(i);
            b.readFully(abyte0, j, k);
            return;
        } else
        {
            int l = c - i;
            b.seek(i);
            b.readFully(abyte0, j, l);
            b.seek(16L);
            b.readFully(abyte0, j + l, k - l);
            return;
        }
    }

    private void b(byte abyte0[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b(abyte0, "buffer");
        if ((j | 0) < 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        if (j <= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        throw new IndexOutOfBoundsException();
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        boolean flag;
        c(j);
        flag = b();
        if (!flag) goto _L2; else goto _L1
_L1:
        i = 16;
_L3:
        ao ao1;
        ao1 = new ao(i, j);
        a(g, 0, j);
        a(ao1.b, g, 0, 4);
        a(ao1.b + 4, abyte0, 0, j);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        i = ao1.b;
_L4:
        a(c, d + 1, i, ao1.b);
        f = ao1;
        d = d + 1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        e = f;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = b(f.b + 4 + f.c);
          goto _L3
        i = e.b;
          goto _L4
    }

    private void c(int i)
        throws IOException
    {
        int l = i + 4;
        int j = c - a();
        if (j >= l)
        {
            return;
        }
        i = c;
        do
        {
            j += i;
            i <<= 1;
        } while (j < l);
        d(i);
        j = b(f.b + 4 + f.c);
        if (j < e.b)
        {
            FileChannel filechannel = b.getChannel();
            filechannel.position(c);
            j -= 4;
            if (filechannel.transferTo(16L, j, filechannel) != (long)j)
            {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (f.b < e.b)
        {
            int k = (c + f.b) - 16;
            a(i, d, e.b, k);
            f = new ao(k, f.c);
        } else
        {
            a(i, d, e.b, f.b);
        }
        c = i;
    }

    private void d()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        a(4096, 0, 0, 0);
        d = 0;
        e = ao.a;
        f = ao.a;
        if (c > 4096)
        {
            d(4096);
        }
        c = 4096;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d(int i)
        throws IOException
    {
        b.setLength(i);
        b.getChannel().force(true);
    }

    public final int a()
    {
        if (d == 0)
        {
            return 16;
        }
        if (f.b >= e.b)
        {
            return (f.b - e.b) + 4 + f.c + 16;
        } else
        {
            return (f.b + 4 + f.c + c) - e.b;
        }
    }

    public final void a(ElementReader elementreader)
        throws IOException
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        int j = e.b;
_L1:
        if (i >= d)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ao ao1 = a(j);
        elementreader.read(new ap(this, ao1, (byte)0), ao1.c);
        j = ao1.b;
        j = b(ao1.c + (j + 4));
        i++;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        elementreader;
        throw elementreader;
    }

    public final void a(byte abyte0[])
        throws IOException
    {
        b(abyte0, 0, abyte0.length);
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = d;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (b())
        {
            throw new NoSuchElementException();
        }
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (d != 1)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        d();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        int i = b(e.b + 4 + e.c);
        b(i, g, 0, 4);
        int j = a(g, 0);
        a(c, d - 1, i, f.b);
        d = d - 1;
        e = new ao(i, j);
          goto _L1
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append('[');
        stringbuilder.append("fileLength=").append(c);
        stringbuilder.append(", size=").append(d);
        stringbuilder.append(", first=").append(e);
        stringbuilder.append(", last=").append(f);
        stringbuilder.append(", element lengths=[");
        try
        {
            a(new an(this, stringbuilder));
        }
        catch (IOException ioexception)
        {
            a.log(Level.WARNING, "read error", ioexception);
        }
        stringbuilder.append("]]");
        return stringbuilder.toString();
    }


    private class ElementReader
    {

        public abstract void read(InputStream inputstream, int i)
            throws IOException;
    }

}
