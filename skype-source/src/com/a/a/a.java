// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

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

// Referenced classes of package com.a.a:
//            c, b

public final class com.a.a.a
    implements Closeable
{
    public final class a
    {

        final com.a.a.a a;
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

        public final OutputStream a(int i1)
            throws IOException
        {
            com.a.a.a a1 = a;
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
                c[i1] = true;
            }
            file = b.b(i1);
            Object obj1 = new FileOutputStream(file);
_L1:
            obj1 = new a(this, ((OutputStream) (obj1)), (byte)0);
            a1;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
            obj1;
            com.a.a.a.g(a).mkdirs();
            obj1 = new FileOutputStream(file);
              goto _L1
            obj1;
            obj1 = com.a.a.a.a();
            a1;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
        }

        public final void a()
            throws IOException
        {
            if (d)
            {
                com.a.a.a.a(a, this, false);
                a.c(b.d(b));
            } else
            {
                com.a.a.a.a(a, this, true);
            }
            e = true;
        }

        public final void b()
            throws IOException
        {
            com.a.a.a.a(a, this, false);
        }

        private a(b b1)
        {
            a = com.a.a.a.this;
            super();
            b = b1;
            if (b.e(b1))
            {
                a1 = null;
            } else
            {
                a1 = new boolean[com.a.a.a.f(com.a.a.a.this)];
            }
            c = com.a.a.a.this;
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

        final com.a.a.a a;
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
            throws IOException
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
        }

        static void a(b b1, String as[])
            throws IOException
        {
            if (as.length != com.a.a.a.f(b1.a))
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
            return new File(com.a.a.a.g(a), (new StringBuilder()).append(b).append(".").append(i1).toString());
        }

        public final String a()
            throws IOException
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
            return new File(com.a.a.a.g(a), (new StringBuilder()).append(b).append(".").append(i1).append(".tmp").toString());
        }

        private b(String s)
        {
            a = com.a.a.a.this;
            super();
            b = s;
            c = new long[com.a.a.a.f(com.a.a.a.this)];
        }

        b(String s, byte byte0)
        {
            this(s);
        }
    }

    public final class c
        implements Closeable
    {

        final com.a.a.a a;
        private final String b;
        private final long c;
        private final InputStream d[];
        private final long e[];

        public final InputStream a(int i1)
        {
            return d[i1];
        }

        public final void close()
        {
            InputStream ainputstream[] = d;
            int j1 = ainputstream.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.a.a.c.a(ainputstream[i1]);
            }

        }

        private c(String s, long l1, InputStream ainputstream[], long al[])
        {
            a = com.a.a.a.this;
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
    private static final OutputStream p = new OutputStream() {

        public final void write(int i1)
            throws IOException
        {
        }

    };
    final ThreadPoolExecutor b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final int g = 1;
    private long h;
    private final int i = 2;
    private long j;
    private Writer k;
    private final LinkedHashMap l = new LinkedHashMap(0, 0.75F, true);
    private int m;
    private long n;
    private final Callable o = new Callable() {

        final com.a.a.a a;

        private Void a()
            throws Exception
        {
label0:
            {
                synchronized (a)
                {
                    if (com.a.a.a.a(a) != null)
                    {
                        break label0;
                    }
                }
                return null;
            }
            com.a.a.a.b(a);
            if (com.a.a.a.c(a))
            {
                com.a.a.a.d(a);
                com.a.a.a.e(a);
            }
            a1;
            JVM INSTR monitorexit ;
            return null;
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final Object call()
            throws Exception
        {
            return a();
        }

            
            {
                a = com.a.a.a.this;
                super();
            }
    };

    private com.a.a.a(File file, long l1)
    {
        j = 0L;
        n = 0L;
        b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        c = file;
        d = new File(file, "journal");
        e = new File(file, "journal.tmp");
        f = new File(file, "journal.bkp");
        h = l1;
    }

    public static com.a.a.a a(File file, long l1)
        throws IOException
    {
        Object obj;
        if (l1 <= 0L)
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
        obj = new com.a.a.a(file, l1);
        if (!((com.a.a.a) (obj)).d.exists())
        {
            break MISSING_BLOCK_LABEL_185;
        }
        ((com.a.a.a) (obj)).b();
        ((com.a.a.a) (obj)).c();
        obj.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((com.a.a.a) (obj)).d, true), com.a.a.c.a));
        return ((com.a.a.a) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder("DiskLruCache ")).append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((com.a.a.a) (obj)).close();
        com.a.a.c.a(((com.a.a.a) (obj)).c);
        file.mkdirs();
        file = new com.a.a.a(file, l1);
        file.d();
        return file;
    }

    static OutputStream a()
    {
        return p;
    }

    static Writer a(com.a.a.a a1)
    {
        return a1.k;
    }

    private void a(a a1, boolean flag)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        b1 = a.a(a1);
        if (b.b(b1) != a1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_28;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (b.e(b1)) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        if (i1 >= i) goto _L2; else goto _L4
_L4:
        if (!a.b(a1)[i1])
        {
            a1.b();
            throw new IllegalStateException((new StringBuilder("Newly created entry didn't create value for index ")).append(i1).toString());
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
        i1 = 0;
_L10:
        if (i1 >= i)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        a1 = b1.b(i1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (a1.exists())
        {
            File file = b1.a(i1);
            a1.renameTo(file);
            long l1 = b.c(b1)[i1];
            long l3 = file.length();
            b.c(b1)[i1] = l3;
            j = (j - l1) + l3;
        }
        break MISSING_BLOCK_LABEL_394;
        a(((File) (a1)));
        break MISSING_BLOCK_LABEL_394;
        m = m + 1;
        b.a(b1, null);
        if (!(b.e(b1) | flag))
        {
            break MISSING_BLOCK_LABEL_347;
        }
        b.a(b1);
        k.write((new StringBuilder("CLEAN ")).append(b.d(b1)).append(b1.a()).append('\n').toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        long l2 = n;
        n = 1L + l2;
        b.a(b1, l2);
_L9:
        k.flush();
        if (j > h || e())
        {
            b.submit(o);
        }
          goto _L8
        l.remove(b.d(b1));
        k.write((new StringBuilder("REMOVE ")).append(b.d(b1)).append('\n').toString());
          goto _L9
        i1++;
          goto _L10
    }

    static void a(com.a.a.a a1, a a2, boolean flag)
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
        com.a.a.b b3 = new com.a.a.b(new FileInputStream(d), com.a.a.c.a);
        Exception exception;
        String s = b3.a();
        String s2 = b3.a();
        String s3 = b3.a();
        String s4 = b3.a();
        String s6 = b3.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(g).equals(s3) || !Integer.toString(i).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
        int i1 = 0;
_L2:
        String s5;
        int j1;
        s5 = b3.a();
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
            com.a.a.c.a(b3);
            throw exception;
        }
        m = i1 - l.size();
        com.a.a.c.a(b3);
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

    static void b(com.a.a.a a1)
        throws IOException
    {
        a1.g();
    }

    private void c()
        throws IOException
    {
        a(e);
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
                    a(b1.a(j1));
                    a(b1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static boolean c(com.a.a.a a1)
    {
        return a1.e();
    }

    private a d(String s)
        throws IOException
    {
        a a1 = null;
        this;
        JVM INSTR monitorenter ;
        b b1;
        f();
        e(s);
        b1 = (b)l.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        Object obj = a1;
        if (b1 == null) goto _L4; else goto _L3
_L3:
        long l1 = b.f(b1);
        if (l1 == -1L) goto _L2; else goto _L5
_L5:
        obj = a1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((a) (obj));
_L2:
        if (b1 != null) goto _L7; else goto _L6
_L6:
        obj = new b(s, (byte)0);
        l.put(s, obj);
_L9:
        a1 = new a(((b) (obj)), (byte)0);
        b.a(((b) (obj)), a1);
        k.write((new StringBuilder("DIRTY ")).append(s).append('\n').toString());
        k.flush();
        obj = a1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L7:
        a a2 = b.b(b1);
        obj = b1;
        if (a2 == null) goto _L9; else goto _L8
_L8:
        obj = a1;
        if (true) goto _L4; else goto _L10
_L10:
    }

    private void d()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (k != null)
        {
            k.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(e), com.a.a.c.a));
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
        k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d, true), com.a.a.c.a));
        this;
        JVM INSTR monitorexit ;
    }

    static void d(com.a.a.a a1)
        throws IOException
    {
        a1.d();
    }

    static int e(com.a.a.a a1)
    {
        a1.m = 0;
        return 0;
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

    private boolean e()
    {
        return m >= 2000 && m >= l.size();
    }

    static int f(com.a.a.a a1)
    {
        return a1.i;
    }

    private void f()
    {
        if (k == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    static File g(com.a.a.a a1)
    {
        return a1.c;
    }

    private void g()
        throws IOException
    {
        while (j > h) 
        {
            c((String)((java.util.Map.Entry)l.entrySet().iterator().next()).getKey());
        }
    }

    public final c a(String s)
        throws IOException
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        b b1;
        f();
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
        com.a.a.c.a(ainputstream[i1]);
        i1++;
        if (true) goto _L5; else goto _L3
_L3:
        m = m + 1;
        k.append((new StringBuilder("READ ")).append(s).append('\n').toString());
        if (e())
        {
            b.submit(o);
        }
        c1 = new c(s, b.f(b1), ainputstream, b.c(b1), (byte)0);
        if (true) goto _L7; else goto _L6
_L6:
        s;
        throw s;
    }

    public final a b(String s)
        throws IOException
    {
        return d(s);
    }

    public final boolean c(String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        f();
        e(s);
        b1 = (b)l.get(s);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        a a1 = b.b(b1);
        if (a1 == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        int i1 = 0;
_L5:
        if (i1 >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        File file = b1.a(i1);
        if (file.exists() && !file.delete())
        {
            throw new IOException((new StringBuilder("failed to delete ")).append(file).toString());
        }
        break MISSING_BLOCK_LABEL_106;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        j = j - b.c(b1)[i1];
        b.c(b1)[i1] = 0L;
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
        m = m + 1;
        k.append((new StringBuilder("REMOVE ")).append(s).append('\n').toString());
        l.remove(s);
        if (e())
        {
            b.submit(o);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void close()
        throws IOException
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
                b.b(b1).b();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        g();
        k.close();
        k = null;
          goto _L1
    }

}
