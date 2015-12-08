// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.bumptech.glide.a:
//            b, c

public final class com.bumptech.glide.a.a
    implements Closeable
{
    public final class a
    {

        final com.bumptech.glide.a.a a;
        private final b b;
        private final boolean c[];
        private boolean d;

        static b a(a a1)
        {
            return a1.b;
        }

        static boolean[] b(a a1)
        {
            return a1.c;
        }

        public File a(int i1)
            throws IOException
        {
            com.bumptech.glide.a.a a1 = a;
            a1;
            JVM INSTR monitorenter ;
            if (b.a(b) != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Exception exception;
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
            File file;
            if (!b.d(b))
            {
                c[i1] = true;
            }
            file = b.b(i1);
            if (!com.bumptech.glide.a.a.f(a).exists())
            {
                com.bumptech.glide.a.a.f(a).mkdirs();
            }
            a1;
            JVM INSTR monitorexit ;
            return file;
        }

        public void a()
            throws IOException
        {
            com.bumptech.glide.a.a.a(a, this, true);
            d = true;
        }

        public void b()
            throws IOException
        {
            com.bumptech.glide.a.a.a(a, this, false);
        }

        public void c()
        {
            if (d)
            {
                break MISSING_BLOCK_LABEL_11;
            }
            b();
            return;
            IOException ioexception;
            ioexception;
        }

        private a(b b1)
        {
            a = com.bumptech.glide.a.a.this;
            super();
            b = b1;
            if (b.d(b1))
            {
                a1 = null;
            } else
            {
                a1 = new boolean[com.bumptech.glide.a.a.e(com.bumptech.glide.a.a.this)];
            }
            c = com.bumptech.glide.a.a.this;
        }

    }

    private final class b
    {

        File a[];
        File b[];
        final com.bumptech.glide.a.a c;
        private final String d;
        private final long e[];
        private boolean f;
        private a g;
        private long h;

        static long a(b b1, long l1)
        {
            b1.h = l1;
            return l1;
        }

        static a a(b b1)
        {
            return b1.g;
        }

        static a a(b b1, a a1)
        {
            b1.g = a1;
            return a1;
        }

        static void a(b b1, String as[])
            throws IOException
        {
            b1.a(as);
        }

        private void a(String as[])
            throws IOException
        {
            if (as.length != com.bumptech.glide.a.a.e(c))
            {
                throw b(as);
            }
            int i1 = 0;
            do
            {
                try
                {
                    if (i1 >= as.length)
                    {
                        break;
                    }
                    e[i1] = Long.parseLong(as[i1]);
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw b(as);
                }
                i1++;
            } while (true);
        }

        static boolean a(b b1, boolean flag)
        {
            b1.f = flag;
            return flag;
        }

        private IOException b(String as[])
            throws IOException
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
        }

        static long[] b(b b1)
        {
            return b1.e;
        }

        static String c(b b1)
        {
            return b1.d;
        }

        static boolean d(b b1)
        {
            return b1.f;
        }

        static long e(b b1)
        {
            return b1.h;
        }

        public File a(int i1)
        {
            return a[i1];
        }

        public String a()
            throws IOException
        {
            StringBuilder stringbuilder = new StringBuilder();
            long al[] = e;
            int j1 = al.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                long l1 = al[i1];
                stringbuilder.append(' ').append(l1);
            }

            return stringbuilder.toString();
        }

        public File b(int i1)
        {
            return b[i1];
        }

        private b(String s)
        {
            c = com.bumptech.glide.a.a.this;
            super();
            d = s;
            e = new long[com.bumptech.glide.a.a.e(com.bumptech.glide.a.a.this)];
            a = new File[com.bumptech.glide.a.a.e(com.bumptech.glide.a.a.this)];
            b = new File[com.bumptech.glide.a.a.e(com.bumptech.glide.a.a.this)];
            s = (new StringBuilder(s)).append('.');
            int j1 = s.length();
            for (int i1 = 0; i1 < com.bumptech.glide.a.a.e(com.bumptech.glide.a.a.this); i1++)
            {
                s.append(i1);
                a[i1] = new File(com.bumptech.glide.a.a.f(com.bumptech.glide.a.a.this), s.toString());
                s.append(".tmp");
                b[i1] = new File(com.bumptech.glide.a.a.f(com.bumptech.glide.a.a.this), s.toString());
                s.setLength(j1);
            }

        }

    }

    public final class c
    {

        final com.bumptech.glide.a.a a;
        private final String b;
        private final long c;
        private final long d[];
        private final File e[];

        public File a(int i1)
        {
            return e[i1];
        }

        private c(String s, long l1, File afile[], long al[])
        {
            a = com.bumptech.glide.a.a.this;
            super();
            b = s;
            c = l1;
            e = afile;
            d = al;
        }

        c(String s, long l1, File afile[], long al[], _cls1 _pcls1)
        {
            this(s, l1, afile, al);
        }
    }


    final ThreadPoolExecutor a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final int f;
    private long g;
    private final int h;
    private long i;
    private Writer j;
    private final LinkedHashMap k = new LinkedHashMap(0, 0.75F, true);
    private int l;
    private long m;
    private final Callable n = new Callable() {

        final com.bumptech.glide.a.a a;

        public Void a()
            throws Exception
        {
label0:
            {
                synchronized (a)
                {
                    if (com.bumptech.glide.a.a.a(a) != null)
                    {
                        break label0;
                    }
                }
                return null;
            }
            com.bumptech.glide.a.a.b(a);
            if (com.bumptech.glide.a.a.c(a))
            {
                com.bumptech.glide.a.a.d(a);
                com.bumptech.glide.a.a.a(a, 0);
            }
            a1;
            JVM INSTR monitorexit ;
            return null;
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Object call()
            throws Exception
        {
            return a();
        }

            
            {
                a = com.bumptech.glide.a.a.this;
                super();
            }
    };

    private com.bumptech.glide.a.a(File file, int i1, int j1, long l1)
    {
        i = 0L;
        m = 0L;
        a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        b = file;
        f = i1;
        c = new File(file, "journal");
        d = new File(file, "journal.tmp");
        e = new File(file, "journal.bkp");
        h = j1;
        g = l1;
    }

    static int a(com.bumptech.glide.a.a a1, int i1)
    {
        a1.l = i1;
        return i1;
    }

    private a a(String s, long l1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        f();
        b1 = (b)k.get(s);
        if (l1 == -1L) goto _L2; else goto _L1
_L1:
        if (b1 == null) goto _L4; else goto _L3
_L3:
        long l2 = b.e(b1);
        if (l2 == l1) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (b1 != null) goto _L6; else goto _L5
_L5:
        b1 = new b(s);
        k.put(s, b1);
_L8:
        a a1;
        a1 = new a(b1);
        b.a(b1, a1);
        j.append("DIRTY");
        j.append(' ');
        j.append(s);
        j.append('\n');
        j.flush();
        s = a1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        a1 = b.a(b1);
        if (a1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static com.bumptech.glide.a.a a(File file, int i1, int j1, long l1)
        throws IOException
    {
        Object obj;
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (j1 <= 0)
        {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        obj = new File(file, "journal.bkp");
        if (((File) (obj)).exists())
        {
            File file1 = new File(file, "journal");
            if (file1.exists())
            {
                ((File) (obj)).delete();
            } else
            {
                a(((File) (obj)), file1, false);
            }
        }
        obj = new com.bumptech.glide.a.a(file, i1, j1, l1);
        if (!((com.bumptech.glide.a.a) (obj)).c.exists())
        {
            break MISSING_BLOCK_LABEL_174;
        }
        ((com.bumptech.glide.a.a) (obj)).b();
        ((com.bumptech.glide.a.a) (obj)).c();
        return ((com.bumptech.glide.a.a) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder()).append("DiskLruCache ").append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((com.bumptech.glide.a.a) (obj)).a();
        file.mkdirs();
        file = new com.bumptech.glide.a.a(file, i1, j1, l1);
        file.d();
        return file;
    }

    static Writer a(com.bumptech.glide.a.a a1)
    {
        return a1.j;
    }

    private void a(a a1, boolean flag)
        throws IOException
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        b b1;
        b1 = a.a(a1);
        if (b.a(b1) != a1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (b.d(b1)) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= h) goto _L2; else goto _L4
_L4:
        if (!a.b(a1)[i1])
        {
            a1.b();
            throw new IllegalStateException((new StringBuilder()).append("Newly created entry didn't create value for index ").append(i1).toString());
        }
        if (b1.b(i1).exists()) goto _L6; else goto _L5
_L5:
        a1.b();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i1++;
          goto _L7
_L2:
        File file;
        long l1;
        long l2;
        for (; j1 >= h; j1++)
        {
            break MISSING_BLOCK_LABEL_227;
        }

        a1 = b1.b(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (a1.exists())
        {
            file = b1.a(j1);
            a1.renameTo(file);
            l1 = b.b(b1)[j1];
            l2 = file.length();
            b.b(b1)[j1] = l2;
            i = (i - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_437;
        a(((File) (a1)));
        break MISSING_BLOCK_LABEL_437;
        l = l + 1;
        b.a(b1, null);
        if (!(b.d(b1) | flag))
        {
            break MISSING_BLOCK_LABEL_379;
        }
        b.a(b1, true);
        j.append("CLEAN");
        j.append(' ');
        j.append(b.c(b1));
        j.append(b1.a());
        j.append('\n');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        l1 = m;
        m = 1L + l1;
        b.a(b1, l1);
_L9:
        j.flush();
        if (i > g || e())
        {
            a.submit(n);
        }
          goto _L8
        k.remove(b.c(b1));
        j.append("REMOVE");
        j.append(' ');
        j.append(b.c(b1));
        j.append('\n');
          goto _L9
    }

    static void a(com.bumptech.glide.a.a a1, a a2, boolean flag)
        throws IOException
    {
        a1.a(a2, flag);
    }

    private static void a(File file)
        throws IOException
    {
        if (file.exists() && !file.delete())
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private static void a(File file, File file1, boolean flag)
        throws IOException
    {
        if (flag)
        {
            a(file1);
        }
        if (!file.renameTo(file1))
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private void b()
        throws IOException
    {
        com.bumptech.glide.a.b b1 = new com.bumptech.glide.a.b(new FileInputStream(c), com.bumptech.glide.a.c.a);
        String s = b1.a();
        String s1 = b1.a();
        String s2 = b1.a();
        String s3 = b1.a();
        String s4 = b1.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(f).equals(s2) || !Integer.toString(h).equals(s3) || !"".equals(s4))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal header: [").append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s4).append("]").toString());
        }
        break MISSING_BLOCK_LABEL_184;
        Object obj;
        obj;
        com.bumptech.glide.a.c.a(b1);
        throw obj;
        int i1 = 0;
_L2:
        d(b1.a());
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        l = i1 - k.size();
        if (!b1.b())
        {
            break MISSING_BLOCK_LABEL_235;
        }
        d();
_L3:
        com.bumptech.glide.a.c.a(b1);
        return;
        j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c, true), com.bumptech.glide.a.c.a));
          goto _L3
    }

    static void b(com.bumptech.glide.a.a a1)
        throws IOException
    {
        a1.g();
    }

    private void c()
        throws IOException
    {
        a(d);
        for (Iterator iterator = k.values().iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (b.a(b1) == null)
            {
                int i1 = 0;
                while (i1 < h) 
                {
                    i = i + b.b(b1)[i1];
                    i1++;
                }
            } else
            {
                b.a(b1, null);
                for (int j1 = 0; j1 < h; j1++)
                {
                    a(b1.a(j1));
                    a(b1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static boolean c(com.bumptech.glide.a.a a1)
    {
        return a1.e();
    }

    private void d()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (j != null)
        {
            j.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d), com.bumptech.glide.a.c.a));
        Iterator iterator;
        ((Writer) (obj)).write("libcore.io.DiskLruCache");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(f));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(h));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = k.values().iterator();
_L1:
        b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_244;
            }
            b1 = (b)iterator.next();
            if (b.a(b1) == null)
            {
                break MISSING_BLOCK_LABEL_202;
            }
            ((Writer) (obj)).write((new StringBuilder()).append("DIRTY ").append(b.c(b1)).append('\n').toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder()).append("CLEAN ").append(b.c(b1)).append(b1.a()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        if (c.exists())
        {
            a(c, e, true);
        }
        a(d, c, false);
        e.delete();
        j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c, true), com.bumptech.glide.a.c.a));
        this;
        JVM INSTR monitorexit ;
    }

    static void d(com.bumptech.glide.a.a a1)
        throws IOException
    {
        a1.d();
    }

    private void d(String s)
        throws IOException
    {
        int i1;
        int j1;
        int k1;
        i1 = s.indexOf(' ');
        if (i1 == -1)
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        j1 = i1 + 1;
        k1 = s.indexOf(' ', j1);
        if (k1 != -1) goto _L2; else goto _L1
_L1:
        String s1 = s.substring(j1);
        if (i1 != "REMOVE".length() || !s.startsWith("REMOVE")) goto _L4; else goto _L3
_L3:
        k.remove(s1);
_L6:
        return;
_L2:
        s1 = s.substring(j1, k1);
_L4:
        b b2 = (b)k.get(s1);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = new b(s1);
            k.put(s1, b1);
        }
        if (k1 != -1 && i1 == "CLEAN".length() && s.startsWith("CLEAN"))
        {
            s = s.substring(k1 + 1).split(" ");
            b.a(b1, true);
            b.a(b1, null);
            b.a(b1, s);
            return;
        }
        if (k1 == -1 && i1 == "DIRTY".length() && s.startsWith("DIRTY"))
        {
            b.a(b1, new a(b1));
            return;
        }
        if (k1 != -1 || i1 != "READ".length() || !s.startsWith("READ"))
        {
            throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int e(com.bumptech.glide.a.a a1)
    {
        return a1.h;
    }

    private boolean e()
    {
        return l >= 2000 && l >= k.size();
    }

    static File f(com.bumptech.glide.a.a a1)
    {
        return a1.b;
    }

    private void f()
    {
        if (j == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private void g()
        throws IOException
    {
        while (i > g) 
        {
            c((String)((java.util.Map.Entry)k.entrySet().iterator().next()).getKey());
        }
    }

    public c a(String s)
        throws IOException
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        b b1;
        f();
        b1 = (b)k.get(s);
        if (b1 != null) goto _L2; else goto _L1
_L1:
        c c1 = obj;
_L6:
        this;
        JVM INSTR monitorexit ;
        return c1;
_L2:
        c1 = obj;
        File afile[];
        int j1;
        if (!b.d(b1))
        {
            continue; /* Loop/switch isn't completed */
        }
        afile = b1.a;
        j1 = afile.length;
        int i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = obj;
        if (!afile[i1].exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        l = l + 1;
        j.append("READ");
        j.append(' ');
        j.append(s);
        j.append('\n');
        if (e())
        {
            a.submit(n);
        }
        c1 = new c(s, b.e(b1), b1.a, b.b(b1));
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    public void a()
        throws IOException
    {
        close();
        com.bumptech.glide.a.c.a(b);
    }

    public a b(String s)
        throws IOException
    {
        return a(s, -1L);
    }

    public boolean c(String s)
        throws IOException
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        b b1;
        f();
        b1 = (b)k.get(s);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        Object obj = b.a(b1);
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        i = i - b.b(b1)[i1];
        b.b(b1)[i1] = 0L;
        i1++;
_L3:
        if (i1 >= h)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        obj = b1.a(i1);
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        throw new IOException((new StringBuilder()).append("failed to delete ").append(obj).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        l = l + 1;
        j.append("REMOVE");
        j.append(' ');
        j.append(s);
        j.append('\n');
        k.remove(s);
        if (e())
        {
            a.submit(n);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = j;
        if (writer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = (new ArrayList(k.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            if (b.a(b1) != null)
            {
                b.a(b1).b();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        g();
        j.close();
        j = null;
          goto _L1
    }
}
