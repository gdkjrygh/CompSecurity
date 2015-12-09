// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.crashlytics.android.internal:
//            br, bs, bt, bq

public class bp
    implements Closeable
{

    private static final Logger a = Logger.getLogger(com/crashlytics/android/internal/bp.getName());
    private final RandomAccessFile b;
    private int c;
    private int d;
    private br e;
    private br f;
    private final byte g[];

    public bp(File file)
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

    static int a(bp bp1, int i)
    {
        return bp1.b(i);
    }

    private static int a(byte abyte0[], int i)
    {
        return ((abyte0[i] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
    }

    private br a(int i)
        throws IOException
    {
        if (i == 0)
        {
            return br.a;
        } else
        {
            b.seek(i);
            return new br(i, b.readInt());
        }
    }

    static RandomAccessFile a(bp bp1)
    {
        return bp1.b;
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

    static void a(bp bp1, int i, byte abyte0[], int j, int k)
        throws IOException
    {
        bp1.b(i, abyte0, j, k);
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
        br br1;
        br1 = new br(i, j);
        a(g, 0, j);
        a(br1.b, g, 0, 4);
        a(br1.b + 4, abyte0, 0, j);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        i = br1.b;
_L4:
        a(c, d + 1, i, br1.b);
        f = br1;
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
        int i1 = i + 4;
        i = c - a();
        if (i >= i1)
        {
            return;
        }
        int j = c;
        int k;
        int l;
        do
        {
            l = i + j;
            k = j << 1;
            j = k;
            i = l;
        } while (l < i1);
        d(k);
        i = b(f.b + 4 + f.c);
        if (i < e.b)
        {
            FileChannel filechannel = b.getChannel();
            filechannel.position(c);
            i -= 4;
            if (filechannel.transferTo(16L, i, filechannel) != (long)i)
            {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (f.b < e.b)
        {
            i = (c + f.b) - 16;
            a(k, d, e.b, i);
            f = new br(i, f.c);
        } else
        {
            a(k, d, e.b, f.b);
        }
        c = k;
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

    public final void a(bt bt1)
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
        br br1 = a(j);
        bt1.a(new bs(this, br1, (byte)0), br1.c);
        j = br1.b;
        j = b(br1.c + (j + 4));
        i++;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        bt1;
        throw bt1;
    }

    public final void a(byte abyte0[])
        throws IOException
    {
        b(abyte0, 0, abyte0.length);
    }

    public final boolean a(int i, int j)
    {
        return a() + 4 + i <= j;
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
            a(new bq(this, stringbuilder));
        }
        catch (IOException ioexception)
        {
            a.log(Level.WARNING, "read error", ioexception);
        }
        stringbuilder.append("]]");
        return stringbuilder.toString();
    }

}
