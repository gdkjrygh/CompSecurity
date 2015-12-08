// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.d.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.d.a:
//            c, b, f, d

public final class com.d.a.a
    implements Closeable
{
    public final class a
    {

        final com.d.a.a a;
        private final b b;
        private final boolean c[];
        private boolean d;
        private boolean e;

        static b a(a a1)
        {
            return a1.b;
        }

        static boolean[] b(a a1)
        {
            return a1.c;
        }

        static boolean c(a a1)
        {
            a1.d = true;
            return true;
        }

        public final OutputStream a()
        {
            com.d.a.a a1 = a;
            a1;
            JVM INSTR monitorenter ;
            if (b.b(b) != this)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_31;
            Object obj;
            obj;
            a1;
            JVM INSTR monitorexit ;
            throw obj;
            File file;
            if (!b.e(b))
            {
                c[0] = true;
            }
            file = b.b(0);
            Object obj1 = new FileOutputStream(file);
_L1:
            obj1 = new a(this, ((OutputStream) (obj1)), (byte)0);
            a1;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
            obj1;
            com.d.a.a.g(a).mkdirs();
            obj1 = new FileOutputStream(file);
              goto _L1
            obj1;
            obj1 = com.d.a.a.b();
            a1;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
        }

        public final void b()
        {
            if (d)
            {
                com.d.a.a.a(a, this, false);
                a.c(b.d(b));
            } else
            {
                com.d.a.a.a(a, this, true);
            }
            e = true;
        }

        public final void c()
        {
            com.d.a.a.a(a, this, false);
        }

        public final void d()
        {
            if (e)
            {
                break MISSING_BLOCK_LABEL_11;
            }
            c();
            return;
            IOException ioexception;
            ioexception;
        }

        private a(b b1)
        {
            a = com.d.a.a.this;
            super();
            b = b1;
            if (b.e(b1))
            {
                a1 = null;
            } else
            {
                a1 = new boolean[com.d.a.a.f(com.d.a.a.this)];
            }
            c = com.d.a.a.this;
        }

        a(b b1, byte byte0)
        {
            this(b1);
        }
    }

    private final class a.a extends FilterOutputStream
    {

        final a a;

        public final void close()
        {
            try
            {
                out.close();
                return;
            }
            catch (IOException ioexception)
            {
                a.c(a);
            }
        }

        public final void flush()
        {
            try
            {
                out.flush();
                return;
            }
            catch (IOException ioexception)
            {
                a.c(a);
            }
        }

        public final void write(int i1)
        {
            try
            {
                out.write(i1);
                return;
            }
            catch (IOException ioexception)
            {
                a.c(a);
            }
        }

        public final void write(byte abyte0[], int i1, int j1)
        {
            try
            {
                out.write(abyte0, i1, j1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                a.c(a);
            }
        }

        private a.a(a a1, OutputStream outputstream)
        {
            a = a1;
            super(outputstream);
        }

        a.a(a a1, OutputStream outputstream, byte byte0)
        {
            this(a1, outputstream);
        }
    }

    private final class b
    {

        final com.d.a.a a;
        private final String b;
        private final long c[];
        private boolean d;
        private a e;
        private long f;

        static long a(b b1, long l1)
        {
            b1.f = l1;
            return l1;
        }

        static a a(b b1, a a1)
        {
            b1.e = a1;
            return a1;
        }

        private static IOException a(String as[])
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
        }

        static void a(b b1, String as[])
        {
            if (as.length != com.d.a.a.f(b1.a))
            {
                throw a(as);
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
                    b1.c[i1] = Long.parseLong(as[i1]);
                }
                // Misplaced declaration of an exception variable
                catch (b b1)
                {
                    throw a(as);
                }
                i1++;
            } while (true);
        }

        static boolean a(b b1)
        {
            b1.d = true;
            return true;
        }

        static a b(b b1)
        {
            return b1.e;
        }

        static long[] c(b b1)
        {
            return b1.c;
        }

        static String d(b b1)
        {
            return b1.b;
        }

        static boolean e(b b1)
        {
            return b1.d;
        }

        static long f(b b1)
        {
            return b1.f;
        }

        public final File a(int i1)
        {
            return new File(com.d.a.a.g(a), (new StringBuilder()).append(b).append(".").append(i1).toString());
        }

        public final String a()
        {
            StringBuilder stringbuilder = new StringBuilder();
            long al[] = c;
            int j1 = al.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                long l1 = al[i1];
                stringbuilder.append(' ').append(l1);
            }

            return stringbuilder.toString();
        }

        public final File b(int i1)
        {
            return new File(com.d.a.a.g(a), (new StringBuilder()).append(b).append(".").append(i1).append(".tmp").toString());
        }

        private b(String s)
        {
            a = com.d.a.a.this;
            super();
            b = s;
            c = new long[com.d.a.a.f(com.d.a.a.this)];
        }

        b(String s, byte byte0)
        {
            this(s);
        }
    }

    public final class c
        implements Closeable
    {

        final com.d.a.a a;
        private final String b;
        private final long c;
        private final InputStream d[];
        private final long e[];

        public final InputStream a()
        {
            return d[0];
        }

        public final void close()
        {
            InputStream ainputstream[] = d;
            int j1 = ainputstream.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.d.a.f.a(ainputstream[i1]);
            }

        }

        private c(String s, long l1, InputStream ainputstream[], long al[])
        {
            a = com.d.a.a.this;
            super();
            b = s;
            c = l1;
            d = ainputstream;
            e = al;
        }

        c(String s, long l1, InputStream ainputstream[], long al[], byte byte0)
        {
            this(s, l1, ainputstream, al);
        }
    }


    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream p = new com.d.a.c();
    final ThreadPoolExecutor b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g = 1;
    private long h;
    private final int i = 1;
    private long j;
    private Writer k;
    private final LinkedHashMap l = new LinkedHashMap(0, 0.75F, true);
    private int m;
    private long n;
    private final Callable o = new com.d.a.b(this);

    private com.d.a.a(File file)
    {
        j = 0L;
        n = 0L;
        b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        c = file;
        d = new File(file, "journal");
        e = new File(file, "journal.tmp");
        f = new File(file, "journal.bkp");
        h = 0x6400000L;
    }

    public static com.d.a.a a(File file)
    {
        Object obj;
        if (0x6400000L <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
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
        obj = new com.d.a.a(file);
        if (!((com.d.a.a) (obj)).d.exists())
        {
            break MISSING_BLOCK_LABEL_181;
        }
        ((com.d.a.a) (obj)).c();
        ((com.d.a.a) (obj)).d();
        obj.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((com.d.a.a) (obj)).d, true), f.a));
        return ((com.d.a.a) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder("DiskLruCache ")).append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((com.d.a.a) (obj)).close();
        com.d.a.f.a(((com.d.a.a) (obj)).c);
        file.mkdirs();
        file = new com.d.a.a(file);
        file.e();
        return file;
    }

    static Writer a(com.d.a.a a1)
    {
        return a1.k;
    }

    private void a(a a1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        b b1;
        b1 = a.a(a1);
        if (b.b(b1) != a1)
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
        if (b.e(b1)) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= i) goto _L2; else goto _L4
_L4:
        if (!a.b(a1)[i1])
        {
            a1.c();
            throw new IllegalStateException((new StringBuilder("Newly created entry didn't create value for index ")).append(i1).toString());
        }
        if (b1.b(i1).exists()) goto _L6; else goto _L5
_L5:
        a1.c();
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
        for (; j1 >= i; j1++)
        {
            break MISSING_BLOCK_LABEL_224;
        }

        a1 = b1.b(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (a1.exists())
        {
            file = b1.a(j1);
            a1.renameTo(file);
            l1 = b.c(b1)[j1];
            l2 = file.length();
            b.c(b1)[j1] = l2;
            j = (j - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_406;
        b(a1);
        break MISSING_BLOCK_LABEL_406;
        m = m + 1;
        b.a(b1, null);
        if (!(b.e(b1) | flag))
        {
            break MISSING_BLOCK_LABEL_359;
        }
        b.a(b1);
        k.write((new StringBuilder("CLEAN ")).append(b.d(b1)).append(b1.a()).append('\n').toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        l1 = n;
        n = 1L + l1;
        b.a(b1, l1);
_L9:
        k.flush();
        if (j > h || f())
        {
            b.submit(o);
        }
          goto _L8
        l.remove(b.d(b1));
        k.write((new StringBuilder("REMOVE ")).append(b.d(b1)).append('\n').toString());
          goto _L9
    }

    static void a(com.d.a.a a1, a a2, boolean flag)
    {
        a1.a(a2, flag);
    }

    private static void a(File file, File file1, boolean flag)
    {
        if (flag)
        {
            b(file1);
        }
        if (!file.renameTo(file1))
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    static OutputStream b()
    {
        return p;
    }

    static void b(com.d.a.a a1)
    {
        a1.h();
    }

    private static void b(File file)
    {
        if (file.exists() && !file.delete())
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private void c()
    {
        d d1 = new d(new FileInputStream(d), f.a);
        Exception exception;
        String s = d1.a();
        String s2 = d1.a();
        String s3 = d1.a();
        String s4 = d1.a();
        String s6 = d1.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(g).equals(s3) || !Integer.toString(i).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
        int i1 = 0;
_L2:
        String s5;
        int j1;
        s5 = d1.a();
        j1 = s5.indexOf(' ');
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        try
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        }
        catch (EOFException eofexception) { }
        finally
        {
            com.d.a.f.a(d1);
            throw exception;
        }
        m = i1 - l.size();
        com.d.a.f.a(d1);
        return;
        int k1 = j1 + 1;
        int l1 = s5.indexOf(' ', k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        String s1 = s5.substring(k1);
        if (j1 != 6)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        if (s5.startsWith("REMOVE"))
        {
            l.remove(s1);
            break MISSING_BLOCK_LABEL_519;
        }
        break MISSING_BLOCK_LABEL_329;
        s1 = s5.substring(k1, l1);
        b b2 = (b)l.get(s1);
        b b1;
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        b1 = new b(s1, (byte)0);
        l.put(s1, b1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        if (s5.startsWith("CLEAN"))
        {
            String as[] = s5.substring(l1 + 1).split(" ");
            b.a(b1);
            b.a(b1, null);
            b.a(b1, as);
            break MISSING_BLOCK_LABEL_519;
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        if (s5.startsWith("DIRTY"))
        {
            b.a(b1, new a(b1, (byte)0));
            break MISSING_BLOCK_LABEL_519;
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        if (s5.startsWith("READ"))
        {
            break MISSING_BLOCK_LABEL_519;
        }
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static boolean c(com.d.a.a a1)
    {
        return a1.f();
    }

    private a d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        g();
        e(s);
        b1 = (b)l.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (b1 == null) goto _L4; else goto _L3
_L3:
        long l1 = b.f(b1);
        if (l1 == -1L) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (b1 != null) goto _L6; else goto _L5
_L5:
        b1 = new b(s, (byte)0);
        l.put(s, b1);
_L8:
        a a1;
        a1 = new a(b1, (byte)0);
        b.a(b1, a1);
        k.write((new StringBuilder("DIRTY ")).append(s).append('\n').toString());
        k.flush();
        s = a1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        a1 = b.b(b1);
        if (a1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void d()
    {
        b(e);
        for (Iterator iterator = l.values().iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (b.b(b1) == null)
            {
                int i1 = 0;
                while (i1 < i) 
                {
                    j = j + b.c(b1)[i1];
                    i1++;
                }
            } else
            {
                b.a(b1, null);
                for (int j1 = 0; j1 < i; j1++)
                {
                    b(b1.a(j1));
                    b(b1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static void d(com.d.a.a a1)
    {
        a1.e();
    }

    static int e(com.d.a.a a1)
    {
        a1.m = 0;
        return 0;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (k != null)
        {
            k.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(e), f.a));
        Iterator iterator;
        ((Writer) (obj)).write("libcore.io.DiskLruCache");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(g));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(i));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = l.values().iterator();
_L1:
        b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_238;
            }
            b1 = (b)iterator.next();
            if (b.b(b1) == null)
            {
                break MISSING_BLOCK_LABEL_199;
            }
            ((Writer) (obj)).write((new StringBuilder("DIRTY ")).append(b.d(b1)).append('\n').toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder("CLEAN ")).append(b.d(b1)).append(b1.a()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        if (d.exists())
        {
            a(d, f, true);
        }
        a(e, d, false);
        f.delete();
        k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d, true), f.a));
        this;
        JVM INSTR monitorexit ;
    }

    private static void e(String s)
    {
        if (!a.matcher(s).matches())
        {
            throw new IllegalArgumentException((new StringBuilder("keys must match regex [a-z0-9_-]{1,64}: \"")).append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    static int f(com.d.a.a a1)
    {
        return a1.i;
    }

    private boolean f()
    {
        return m >= 2000 && m >= l.size();
    }

    static File g(com.d.a.a a1)
    {
        return a1.c;
    }

    private void g()
    {
        if (k == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private void h()
    {
        while (j > h) 
        {
            c((String)((java.util.Map.Entry)l.entrySet().iterator().next()).getKey());
        }
    }

    public final c a(String s)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        b b1;
        g();
        e(s);
        b1 = (b)l.get(s);
        if (b1 != null) goto _L2; else goto _L1
_L1:
        c c1 = obj;
_L7:
        this;
        JVM INSTR monitorexit ;
        return c1;
_L2:
        c1 = obj;
        InputStream ainputstream[];
        if (!b.e(b1))
        {
            continue; /* Loop/switch isn't completed */
        }
        ainputstream = new InputStream[i];
        int i1 = 0;
_L4:
        if (i1 >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        ainputstream[i1] = new FileInputStream(b1.a(i1));
        i1++;
        if (true) goto _L4; else goto _L3
        s;
        i1 = 0;
_L5:
        c1 = obj;
        if (i1 >= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        c1 = obj;
        if (ainputstream[i1] == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.d.a.f.a(ainputstream[i1]);
        i1++;
        if (true) goto _L5; else goto _L3
_L3:
        m = m + 1;
        k.append((new StringBuilder("READ ")).append(s).append('\n').toString());
        if (f())
        {
            b.submit(o);
        }
        c1 = new c(s, b.f(b1), ainputstream, b.c(b1), (byte)0);
        if (true) goto _L7; else goto _L6
_L6:
        s;
        throw s;
    }

    public final File a()
    {
        return c;
    }

    public final a b(String s)
    {
        return d(s);
    }

    public final boolean c(String s)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        b b1;
        g();
        e(s);
        b1 = (b)l.get(s);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        Object obj = b.b(b1);
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        j = j - b.c(b1)[i1];
        b.c(b1)[i1] = 0L;
        i1++;
_L3:
        if (i1 >= i)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = b1.a(i1);
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        throw new IOException((new StringBuilder("failed to delete ")).append(obj).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        m = m + 1;
        k.append((new StringBuilder("REMOVE ")).append(s).append('\n').toString());
        l.remove(s);
        if (f())
        {
            b.submit(o);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = k;
        if (writer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = (new ArrayList(l.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            if (b.b(b1) != null)
            {
                b.b(b1).c();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        h();
        k.close();
        k = null;
          goto _L1
    }

}
