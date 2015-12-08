// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package a.a.a.a.a.b:
//            ad, ae, af, ac

public class ab
    implements Closeable
{

    private static final Logger b = Logger.getLogger(a/a/a/a/a/b/ab.getName());
    int a;
    private final RandomAccessFile c;
    private int d;
    private ad e;
    private ad f;
    private final byte g[];

    public ab(File file)
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
        c = a(file);
        c.seek(0L);
        c.readFully(g);
        a = b(g, 0);
        if ((long)a > c.length())
        {
            throw new IOException((new StringBuilder("File is truncated. Expected length: ")).append(a).append(", Actual length: ").append(c.length()).toString());
        } else
        {
            d = b(g, 4);
            int i = b(g, 8);
            int j = b(g, 12);
            e = a(i);
            f = a(j);
            return;
        }
    }

    static int a(ab ab1, int i)
    {
        return ab1.b(i);
    }

    private ad a(int i)
    {
        if (i == 0)
        {
            return ad.a;
        } else
        {
            c.seek(i);
            return new ad(i, c.readInt());
        }
    }

    static RandomAccessFile a(ab ab1)
    {
        return ab1.c;
    }

    private static RandomAccessFile a(File file)
    {
        return new RandomAccessFile(file, "rwd");
    }

    static Object a(Object obj, String s)
    {
        return b(obj, s);
    }

    private void a(int i, int j, int k, int l)
    {
        a(g, new int[] {
            i, j, k, l
        });
        c.seek(0L);
        c.write(g);
    }

    private void a(int i, byte abyte0[], int j)
    {
        i = b(i);
        if (i + j <= a)
        {
            c.seek(i);
            c.write(abyte0, 0, j);
            return;
        } else
        {
            int k = a - i;
            c.seek(i);
            c.write(abyte0, 0, k);
            c.seek(16L);
            c.write(abyte0, k + 0, j - k);
            return;
        }
    }

    static void a(ab ab1, int i, byte abyte0[], int j, int k)
    {
        i = ab1.b(i);
        if (i + k <= ab1.a)
        {
            ab1.c.seek(i);
            ab1.c.readFully(abyte0, j, k);
            return;
        } else
        {
            int l = ab1.a - i;
            ab1.c.seek(i);
            ab1.c.readFully(abyte0, j, l);
            ab1.c.seek(16L);
            ab1.c.readFully(abyte0, j + l, k - l);
            return;
        }
    }

    private static void a(byte abyte0[], int i, int j)
    {
        abyte0[i] = (byte)(j >> 24);
        abyte0[i + 1] = (byte)(j >> 16);
        abyte0[i + 2] = (byte)(j >> 8);
        abyte0[i + 3] = (byte)j;
    }

    private static transient void a(byte abyte0[], int ai[])
    {
        int i = 0;
        int j = 0;
        for (; i < 4; i++)
        {
            a(abyte0, j, ai[i]);
            j += 4;
        }

    }

    private int b(int i)
    {
        if (i < a)
        {
            return i;
        } else
        {
            return (i + 16) - a;
        }
    }

    private static int b(byte abyte0[], int i)
    {
        return ((abyte0[i] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
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

    private void c(int i)
    {
        int i1 = i + 4;
        i = a - a();
        if (i >= i1)
        {
            return;
        }
        int j = a;
        int k;
        int l;
        do
        {
            l = i + j;
            k = j << 1;
            j = k;
            i = l;
        } while (l < i1);
        c.setLength(k);
        c.getChannel().force(true);
        i = b(f.b + 4 + f.c);
        if (i < e.b)
        {
            FileChannel filechannel = c.getChannel();
            filechannel.position(a);
            i -= 4;
            if (filechannel.transferTo(16L, i, filechannel) != (long)i)
            {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (f.b < e.b)
        {
            i = (a + f.b) - 16;
            a(k, d, e.b, i);
            f = new ad(i, f.c);
        } else
        {
            a(k, d, e.b, f.b);
        }
        a = k;
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
            return (f.b + 4 + f.c + a) - e.b;
        }
    }

    public final void a(af af1)
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
        ad ad1 = a(j);
        af1.a(new ae(this, ad1, (byte)0), ad1.c);
        j = ad1.b;
        j = b(ad1.c + (j + 4));
        i++;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        af1;
        throw af1;
    }

    public final void a(byte abyte0[], int i)
    {
        this;
        JVM INSTR monitorenter ;
        b(abyte0, "buffer");
        if ((i | 0) < 0)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        if (i <= abyte0.length + 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        throw new IndexOutOfBoundsException();
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        boolean flag;
        c(i);
        flag = b();
        if (!flag) goto _L2; else goto _L1
_L1:
        int j = 16;
_L3:
        ad ad1;
        ad1 = new ad(j, i);
        a(g, 0, i);
        a(ad1.b, g, 4);
        a(ad1.b + 4, abyte0, i);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        i = ad1.b;
_L4:
        a(a, d + 1, i, ad1.b);
        f = ad1;
        d = d + 1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        e = f;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        j = b(f.b + 4 + f.c);
          goto _L3
        i = e.b;
          goto _L4
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
    {
        this;
        JVM INSTR monitorenter ;
        c.close();
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
        stringbuilder.append("fileLength=").append(a);
        stringbuilder.append(", size=").append(d);
        stringbuilder.append(", first=").append(e);
        stringbuilder.append(", last=").append(f);
        stringbuilder.append(", element lengths=[");
        try
        {
            a(new ac(this, stringbuilder));
        }
        catch (IOException ioexception)
        {
            b.log(Level.WARNING, "read error", ioexception);
        }
        stringbuilder.append("]]");
        return stringbuilder.toString();
    }

}
