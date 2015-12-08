// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a.a;

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

// Referenced classes of package com.b.a.a.a.a.a:
//            c, b, g, e

final class com.b.a.a.a.a.a.a
    implements Closeable
{
    public final class a
    {

        final b a;
        final boolean b[];
        boolean c;
        final com.b.a.a.a.a.a.a d;
        private boolean e;

        public final OutputStream a()
            throws IOException
        {
            com.b.a.a.a.a.a.a a1 = d;
            a1;
            JVM INSTR monitorenter ;
            if (a.d != this)
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
            if (!a.c)
            {
                b[0] = true;
            }
            file = a.b(0);
            Object obj1 = new FileOutputStream(file);
_L1:
            obj1 = new a(this, ((OutputStream) (obj1)), (byte)0);
            a1;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
            obj1;
            com.b.a.a.a.a.a.a.h(d).mkdirs();
            obj1 = new FileOutputStream(file);
              goto _L1
            obj1;
            obj1 = com.b.a.a.a.a.a.a.d();
            a1;
            JVM INSTR monitorexit ;
            return ((OutputStream) (obj1));
        }

        public final void b()
            throws IOException
        {
            if (c)
            {
                com.b.a.a.a.a.a.a.a(d, this, false);
                d.c(a.a);
            } else
            {
                com.b.a.a.a.a.a.a.a(d, this, true);
            }
            e = true;
        }

        public final void c()
            throws IOException
        {
            com.b.a.a.a.a.a.a.a(d, this, false);
        }

        private a(b b1)
        {
            d = com.b.a.a.a.a.a.a.this;
            super();
            a = b1;
            if (b1.c)
            {
                a1 = null;
            } else
            {
                a1 = new boolean[com.b.a.a.a.a.a.a.g(com.b.a.a.a.a.a.a.this)];
            }
            b = com.b.a.a.a.a.a.a.this;
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
                a.c = true;
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
                a.c = true;
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
                a.c = true;
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
                a.c = true;
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

        final String a;
        final long b[];
        boolean c;
        a d;
        long e;
        final com.b.a.a.a.a.a.a f;

        private static IOException b(String as[])
            throws IOException
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
        }

        public final File a(int i1)
        {
            return new File(com.b.a.a.a.a.a.a.h(f), (new StringBuilder()).append(a).append(".").append(i1).toString());
        }

        public final String a()
            throws IOException
        {
            StringBuilder stringbuilder = new StringBuilder();
            long al[] = b;
            int j1 = al.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                long l1 = al[i1];
                stringbuilder.append(' ').append(l1);
            }

            return stringbuilder.toString();
        }

        final void a(String as[])
            throws IOException
        {
            if (as.length != com.b.a.a.a.a.a.a.g(f))
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
                    b[i1] = Long.parseLong(as[i1]);
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw b(as);
                }
                i1++;
            } while (true);
        }

        public final File b(int i1)
        {
            return new File(com.b.a.a.a.a.a.a.h(f), (new StringBuilder()).append(a).append(".").append(i1).append(".tmp").toString());
        }

        private b(String s)
        {
            f = com.b.a.a.a.a.a.a.this;
            super();
            a = s;
            b = new long[com.b.a.a.a.a.a.a.g(com.b.a.a.a.a.a.a.this)];
        }

        b(String s, byte byte0)
        {
            this(s);
        }
    }

    public final class c
        implements Closeable
    {

        File a[];
        final com.b.a.a.a.a.a.a b;
        private final String c;
        private final long d;
        private final InputStream e[];
        private final long f[];

        public final void close()
        {
            InputStream ainputstream[] = e;
            int j1 = ainputstream.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.b.a.a.a.a.a.g.a(ainputstream[i1]);
            }

        }

        private c(String s, long l1, File afile[], InputStream ainputstream[], long al[])
        {
            b = com.b.a.a.a.a.a.a.this;
            super();
            c = s;
            d = l1;
            a = afile;
            e = ainputstream;
            f = al;
        }

        c(String s, long l1, File afile[], InputStream ainputstream[], long al[], 
                byte byte0)
        {
            this(s, l1, afile, ainputstream, al);
        }
    }


    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream r = new com.b.a.a.a.a.a.c();
    final File b;
    final ThreadPoolExecutor c;
    private final File d;
    private final File e;
    private final File f;
    private final int g = 1;
    private long h;
    private int i;
    private final int j = 1;
    private long k;
    private int l;
    private Writer m;
    private final LinkedHashMap n = new LinkedHashMap(0, 0.75F, true);
    private int o;
    private long p;
    private final Callable q = new com.b.a.a.a.a.a.b(this);

    private com.b.a.a.a.a.a.a(File file, long l1, int i1)
    {
        k = 0L;
        l = 0;
        p = 0L;
        c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        b = file;
        d = new File(file, "journal");
        e = new File(file, "journal.tmp");
        f = new File(file, "journal.bkp");
        h = l1;
        i = i1;
    }

    public static com.b.a.a.a.a.a.a a(File file, long l1, int i1)
        throws IOException
    {
        Object obj;
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("maxFileCount <= 0");
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
        obj = new com.b.a.a.a.a.a.a(file, l1, i1);
        if (!((com.b.a.a.a.a.a.a) (obj)).d.exists())
        {
            break MISSING_BLOCK_LABEL_205;
        }
        ((com.b.a.a.a.a.a.a) (obj)).e();
        ((com.b.a.a.a.a.a.a) (obj)).f();
        obj.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((com.b.a.a.a.a.a.a) (obj)).d, true), g.a));
        return ((com.b.a.a.a.a.a.a) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder("DiskLruCache ")).append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((com.b.a.a.a.a.a.a) (obj)).c();
        file.mkdirs();
        file = new com.b.a.a.a.a.a.a(file, l1, i1);
        file.g();
        return file;
    }

    static Writer a(com.b.a.a.a.a.a.a a1)
    {
        return a1.m;
    }

    private void a(a a1, boolean flag)
        throws IOException
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        b b1;
        b1 = a1.a;
        if (b1.d != a1)
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
        if (b1.c) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= j) goto _L2; else goto _L4
_L4:
        if (!a1.b[i1])
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
        for (; j1 >= j; j1++)
        {
            break MISSING_BLOCK_LABEL_234;
        }

        a1 = b1.b(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (a1.exists())
        {
            file = b1.a(j1);
            a1.renameTo(file);
            l1 = b1.b[j1];
            l2 = file.length();
            b1.b[j1] = l2;
            k = (k - l1) + l2;
            l = l + 1;
        }
        break MISSING_BLOCK_LABEL_425;
        a(((File) (a1)));
        break MISSING_BLOCK_LABEL_425;
        o = o + 1;
        b1.d = null;
        if (!(b1.c | flag))
        {
            break MISSING_BLOCK_LABEL_378;
        }
        b1.c = true;
        m.write((new StringBuilder("CLEAN ")).append(b1.a).append(b1.a()).append('\n').toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        l1 = p;
        p = 1L + l1;
        b1.e = l1;
_L9:
        m.flush();
        if (k > h || l > i || h())
        {
            c.submit(q);
        }
          goto _L8
        n.remove(b1.a);
        m.write((new StringBuilder("REMOVE ")).append(b1.a).append('\n').toString());
          goto _L9
    }

    static void a(com.b.a.a.a.a.a.a a1, a a2, boolean flag)
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

    static void b(com.b.a.a.a.a.a.a a1)
        throws IOException
    {
        a1.j();
    }

    static void c(com.b.a.a.a.a.a.a a1)
        throws IOException
    {
        a1.k();
    }

    static OutputStream d()
    {
        return r;
    }

    private static void d(String s)
    {
        if (!a.matcher(s).matches())
        {
            throw new IllegalArgumentException((new StringBuilder("keys must match regex [a-z0-9_-]{1,64}: \"")).append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    static boolean d(com.b.a.a.a.a.a.a a1)
    {
        return a1.h();
    }

    private void e()
        throws IOException
    {
        e e1 = new e(new FileInputStream(d), g.a);
        Exception exception;
        String s = e1.a();
        String s2 = e1.a();
        String s3 = e1.a();
        String s4 = e1.a();
        String s6 = e1.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(g).equals(s3) || !Integer.toString(j).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
        int i1 = 0;
_L2:
        String s5;
        int j1;
        s5 = e1.a();
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
            com.b.a.a.a.a.a.g.a(e1);
            throw exception;
        }
        o = i1 - n.size();
        com.b.a.a.a.a.a.g.a(e1);
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
            n.remove(s1);
            break MISSING_BLOCK_LABEL_517;
        }
        break MISSING_BLOCK_LABEL_329;
        s1 = s5.substring(k1, l1);
        b b2 = (b)n.get(s1);
        b b1;
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        b1 = new b(s1, (byte)0);
        n.put(s1, b1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        if (s5.startsWith("CLEAN"))
        {
            String as[] = s5.substring(l1 + 1).split(" ");
            b1.c = true;
            b1.d = null;
            b1.a(as);
            break MISSING_BLOCK_LABEL_517;
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_465;
        }
        if (s5.startsWith("DIRTY"))
        {
            b1.d = new a(b1, (byte)0);
            break MISSING_BLOCK_LABEL_517;
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        if (s5.startsWith("READ"))
        {
            break MISSING_BLOCK_LABEL_517;
        }
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void e(com.b.a.a.a.a.a.a a1)
        throws IOException
    {
        a1.g();
    }

    static int f(com.b.a.a.a.a.a.a a1)
    {
        a1.o = 0;
        return 0;
    }

    private void f()
        throws IOException
    {
        a(e);
        for (Iterator iterator = n.values().iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (b1.d == null)
            {
                int i1 = 0;
                while (i1 < j) 
                {
                    k = k + b1.b[i1];
                    l = l + 1;
                    i1++;
                }
            } else
            {
                b1.d = null;
                for (int j1 = 0; j1 < j; j1++)
                {
                    a(b1.a(j1));
                    a(b1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static int g(com.b.a.a.a.a.a.a a1)
    {
        return a1.j;
    }

    private void g()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (m != null)
        {
            m.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(e), g.a));
        Iterator iterator;
        ((Writer) (obj)).write("libcore.io.DiskLruCache");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(g));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(j));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = n.values().iterator();
_L1:
        b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_238;
            }
            b1 = (b)iterator.next();
            if (b1.d == null)
            {
                break MISSING_BLOCK_LABEL_199;
            }
            ((Writer) (obj)).write((new StringBuilder("DIRTY ")).append(b1.a).append('\n').toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder("CLEAN ")).append(b1.a).append(b1.a()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        if (d.exists())
        {
            a(d, f, true);
        }
        a(e, d, false);
        f.delete();
        m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d, true), g.a));
        this;
        JVM INSTR monitorexit ;
    }

    static File h(com.b.a.a.a.a.a.a a1)
    {
        return a1.b;
    }

    private boolean h()
    {
        return o >= 2000 && o >= n.size();
    }

    private void i()
    {
        if (m == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private void j()
        throws IOException
    {
        while (k > h) 
        {
            c((String)((java.util.Map.Entry)n.entrySet().iterator().next()).getKey());
        }
    }

    private void k()
        throws IOException
    {
        while (l > i) 
        {
            c((String)((java.util.Map.Entry)n.entrySet().iterator().next()).getKey());
        }
    }

    public final long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = h;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public final c a(String s)
        throws IOException
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        b b1;
        i();
        d(s);
        b1 = (b)n.get(s);
        if (b1 != null) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
_L8:
        this;
        JVM INSTR monitorexit ;
        return ((c) (obj));
_L2:
        obj = obj1;
        InputStream ainputstream[];
        if (!b1.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new File[j];
        ainputstream = new InputStream[j];
        int i1 = 0;
_L5:
        if (i1 >= j) goto _L4; else goto _L3
_L3:
        File file = b1.a(i1);
        obj[i1] = file;
        ainputstream[i1] = new FileInputStream(file);
        i1++;
          goto _L5
        s;
        i1 = 0;
_L6:
        obj = obj1;
        if (i1 >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (ainputstream[i1] == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.b.a.a.a.a.a.g.a(ainputstream[i1]);
        i1++;
        if (true) goto _L6; else goto _L4
_L4:
        o = o + 1;
        m.append((new StringBuilder("READ ")).append(s).append('\n').toString());
        if (h())
        {
            c.submit(q);
        }
        obj = new c(s, b1.e, ((File []) (obj)), ainputstream, b1.b, (byte)0);
        if (true) goto _L8; else goto _L7
_L7:
        s;
        throw s;
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = i;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    final a b(String s)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        i();
        d(s);
        b1 = (b)n.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (b1 == null) goto _L4; else goto _L3
_L3:
        long l1 = b1.e;
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
        n.put(s, b1);
_L8:
        a a1;
        a1 = new a(b1, (byte)0);
        b1.d = a1;
        m.write((new StringBuilder("DIRTY ")).append(s).append('\n').toString());
        m.flush();
        s = a1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        a1 = b1.d;
        if (a1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void c()
        throws IOException
    {
        close();
        com.b.a.a.a.a.a.g.a(b);
    }

    public final boolean c(String s)
        throws IOException
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        b b1;
        i();
        d(s);
        b1 = (b)n.get(s);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        Object obj = b1.d;
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        k = k - b1.b[i1];
        l = l - 1;
        b1.b[i1] = 0L;
        i1++;
_L3:
        if (i1 >= j)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj = b1.a(i1);
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        throw new IOException((new StringBuilder("failed to delete ")).append(obj).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        o = o + 1;
        m.append((new StringBuilder("REMOVE ")).append(s).append('\n').toString());
        n.remove(s);
        if (h())
        {
            c.submit(q);
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
        Writer writer = m;
        if (writer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = (new ArrayList(n.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            if (b1.d != null)
            {
                b1.d.c();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        j();
        k();
        m.close();
        m = null;
          goto _L1
    }

}
