// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class n
    implements Closeable
{
    static final class a
    {

        static final a a = new a(0, 0);
        final int b;
        final int c;

        public final String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append("[position = ").append(b).append(", length = ").append(c).append("]").toString();
        }


        a(int i, int j)
        {
            b = i;
            c = j;
        }
    }

    private final class b extends InputStream
    {

        final n a;
        private int b;
        private int c;

        public final int read()
            throws IOException
        {
            if (c == 0)
            {
                return -1;
            } else
            {
                n.a(a).seek(b);
                int i = n.a(a).read();
                b = n.a(a, b + 1);
                c = c - 1;
                return i;
            }
        }

        public final int read(byte abyte0[], int i, int j)
            throws IOException
        {
            n.a(abyte0, "buffer");
            if ((i | j) < 0 || j > abyte0.length - i)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (c > 0)
            {
                int k = j;
                if (j > c)
                {
                    k = c;
                }
                n.a(a, b, abyte0, i, k);
                b = n.a(a, b + k);
                c = c - k;
                return k;
            } else
            {
                return -1;
            }
        }

        private b(a a1)
        {
            a = n.this;
            super();
            b = n.a(n.this, a1.b + 4);
            c = a1.c;
        }

        b(a a1, byte byte0)
        {
            this(a1);
        }
    }

    public static interface c
    {

        public abstract void a(InputStream inputstream, int i)
            throws IOException;
    }


    private static final Logger b = Logger.getLogger(io/fabric/sdk/android/services/common/n.getName());
    int a;
    private final RandomAccessFile c;
    private int d;
    private a e;
    private a f;
    private final byte g[];

    public n(File file)
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

    static int a(n n1, int i)
    {
        return n1.b(i);
    }

    private a a(int i)
        throws IOException
    {
        if (i == 0)
        {
            return a.a;
        } else
        {
            c.seek(i);
            return new a(i, c.readInt());
        }
    }

    static RandomAccessFile a(n n1)
    {
        return n1.c;
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
        c.seek(0L);
        c.write(g);
    }

    private void a(int i, byte abyte0[], int j)
        throws IOException
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

    private void a(int i, byte abyte0[], int j, int k)
        throws IOException
    {
        i = b(i);
        if (i + k <= a)
        {
            c.seek(i);
            c.readFully(abyte0, j, k);
            return;
        } else
        {
            int l = a - i;
            c.seek(i);
            c.readFully(abyte0, j, l);
            c.seek(16L);
            c.readFully(abyte0, j + l, k - l);
            return;
        }
    }

    static void a(n n1, int i, byte abyte0[], int j, int k)
        throws IOException
    {
        n1.a(i, abyte0, j, k);
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
        throws IOException
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
        d(k);
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
            f = new a(i, f.c);
        } else
        {
            a(k, d, e.b, f.b);
        }
        a = k;
    }

    private void d()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        a(4096, 0, 0, 0);
        d = 0;
        e = a.a;
        f = a.a;
        if (a > 4096)
        {
            d(4096);
        }
        a = 4096;
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
        c.setLength(i);
        c.getChannel().force(true);
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

    public final void a(c c1)
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
        a a1 = a(j);
        c1.a(new b(a1, (byte)0), a1.c);
        j = a1.b;
        j = b(a1.c + (j + 4));
        i++;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    public final void a(byte abyte0[], int i)
        throws IOException
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
        a a1;
        a1 = new a(j, i);
        a(g, 0, i);
        a(a1.b, g, 4);
        a(a1.b + 4, abyte0, i);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        i = a1.b;
_L4:
        a(a, d + 1, i, a1.b);
        f = a1;
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
        a(i, g, 0, 4);
        int j = b(g, 0);
        a(a, d - 1, i, f.b);
        d = d - 1;
        e = new a(i, j);
          goto _L1
    }

    public void close()
        throws IOException
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
            a(new c(stringbuilder) {

                boolean a;
                final StringBuilder b;
                final n c;

                public final void a(InputStream inputstream, int i)
                    throws IOException
                {
                    if (a)
                    {
                        a = false;
                    } else
                    {
                        b.append(", ");
                    }
                    b.append(i);
                }

            
            {
                c = n.this;
                b = stringbuilder;
                super();
                a = true;
            }
            });
        }
        catch (IOException ioexception)
        {
            b.log(Level.WARNING, "read error", ioexception);
        }
        stringbuilder.append("]]");
        return stringbuilder.toString();
    }

}
