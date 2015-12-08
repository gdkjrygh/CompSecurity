// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
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

public final class cvq
    implements Closeable
{

    private static Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream o = new OutputStream() {

        public final void write(int i1)
        {
        }

    };
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private long f;
    private final int g;
    private long h;
    private Writer i;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75F, true);
    private int k;
    private long l;
    private ThreadPoolExecutor m;
    private final Callable n = new Callable() {

        private cvq a;

        private Void a()
        {
label0:
            {
                synchronized (a)
                {
                    if (cvq.a(a) != null)
                    {
                        break label0;
                    }
                }
                return null;
            }
            cvq.b(a);
            if (cvq.c(a))
            {
                cvq.d(a);
                cvq.e(a);
            }
            cvq1;
            JVM INSTR monitorexit ;
            return null;
            exception;
            cvq1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final Object call()
        {
            return a();
        }

            
            {
                a = cvq.this;
                super();
            }
    };

    private cvq(File file, int i1, long l1)
    {
        h = 0L;
        l = 0L;
        m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        b = file;
        c = new File(file, "journal");
        d = new File(file, "journal.tmp");
        e = new File(file, "journal.bkp");
        g = i1;
        f = l1;
    }

    public static cvq a(File file, int i1, long l1)
    {
        Object obj;
        if (l1 <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i1 <= 0)
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
        obj = new cvq(file, i1, l1);
        if (!((cvq) (obj)).c.exists())
        {
            break MISSING_BLOCK_LABEL_213;
        }
        ((cvq) (obj)).d();
        ((cvq) (obj)).e();
        obj.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((cvq) (obj)).c, true), cvw.a));
        return ((cvq) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder("DiskLruCache ")).append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((cvq) (obj)).close();
        cvw.a(((cvq) (obj)).b);
        file.mkdirs();
        file = new cvq(file, i1, l1);
        file.f();
        return file;
    }

    static Writer a(cvq cvq1)
    {
        return cvq1.i;
    }

    static void a(cvq cvq1, cvr cvr1, boolean flag)
    {
        cvq1.a(cvr1, flag);
    }

    private void a(cvr cvr1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        cvt cvt1;
        cvt1 = cvr1.a;
        if (cvt1.d != cvr1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        cvr1;
        this;
        JVM INSTR monitorexit ;
        throw cvr1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (cvt1.c) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= g) goto _L2; else goto _L4
_L4:
        if (!cvr1.b[i1])
        {
            cvr1.b();
            throw new IllegalStateException((new StringBuilder("Newly created entry didn't create value for index ")).append(i1).toString());
        }
        if (cvt1.b(i1).exists()) goto _L6; else goto _L5
_L5:
        cvr1.b();
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
        for (; j1 >= g; j1++)
        {
            break MISSING_BLOCK_LABEL_224;
        }

        cvr1 = cvt1.b(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (cvr1.exists())
        {
            file = cvt1.a(j1);
            cvr1.renameTo(file);
            l1 = cvt1.b[j1];
            l2 = file.length();
            cvt1.b[j1] = l2;
            h = (h - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_404;
        a(((File) (cvr1)));
        break MISSING_BLOCK_LABEL_404;
        k = k + 1;
        cvt1.d = null;
        if (!(cvt1.c | flag))
        {
            break MISSING_BLOCK_LABEL_357;
        }
        cvt1.c = true;
        i.write((new StringBuilder("CLEAN ")).append(cvt1.a).append(cvt1.a()).append('\n').toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        l1 = l;
        l = 1L + l1;
        cvt1.e = l1;
_L9:
        i.flush();
        if (h > f || g())
        {
            m.submit(n);
        }
          goto _L8
        j.remove(cvt1.a);
        i.write((new StringBuilder("REMOVE ")).append(cvt1.a).append('\n').toString());
          goto _L9
    }

    private static void a(File file)
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

    static void b(cvq cvq1)
    {
        cvq1.i();
    }

    static OutputStream c()
    {
        return o;
    }

    static boolean c(cvq cvq1)
    {
        return cvq1.g();
    }

    private void d()
    {
        cvv cvv1 = new cvv(new FileInputStream(c), cvw.a);
        Exception exception;
        String s = cvv1.a();
        String s2 = cvv1.a();
        String s3 = cvv1.a();
        String s4 = cvv1.a();
        String s6 = cvv1.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(1).equals(s3) || !Integer.toString(g).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
        int i1 = 0;
_L2:
        String s5;
        int j1;
        s5 = cvv1.a();
        j1 = s5.indexOf(' ');
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        try
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        }
        catch (EOFException eofexception) { }
        finally
        {
            cvw.a(cvv1);
            throw exception;
        }
        k = i1 - j.size();
        cvw.a(cvv1);
        return;
        int k1 = j1 + 1;
        int l1 = s5.indexOf(' ', k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        String s1 = s5.substring(k1);
        if (j1 != 6)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        if (s5.startsWith("REMOVE"))
        {
            j.remove(s1);
            break MISSING_BLOCK_LABEL_514;
        }
        break MISSING_BLOCK_LABEL_326;
        s1 = s5.substring(k1, l1);
        cvt cvt2 = (cvt)j.get(s1);
        cvt cvt1;
        cvt1 = cvt2;
        if (cvt2 != null)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        cvt1 = new cvt(this, s1, (byte)0);
        j.put(s1, cvt1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        if (s5.startsWith("CLEAN"))
        {
            String as[] = s5.substring(l1 + 1).split(" ");
            cvt1.c = true;
            cvt1.d = null;
            cvt1.a(as);
            break MISSING_BLOCK_LABEL_514;
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_462;
        }
        if (s5.startsWith("DIRTY"))
        {
            cvt1.d = new cvr(this, cvt1, (byte)0);
            break MISSING_BLOCK_LABEL_514;
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        if (s5.startsWith("READ"))
        {
            break MISSING_BLOCK_LABEL_514;
        }
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void d(cvq cvq1)
    {
        cvq1.f();
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

    static int e(cvq cvq1)
    {
        cvq1.k = 0;
        return 0;
    }

    private void e()
    {
        a(d);
        for (Iterator iterator = j.values().iterator(); iterator.hasNext();)
        {
            cvt cvt1 = (cvt)iterator.next();
            if (cvt1.d == null)
            {
                int i1 = 0;
                while (i1 < g) 
                {
                    h = h + cvt1.b[i1];
                    i1++;
                }
            } else
            {
                cvt1.d = null;
                for (int j1 = 0; j1 < g; j1++)
                {
                    a(cvt1.a(j1));
                    a(cvt1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static int f(cvq cvq1)
    {
        return cvq1.g;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (i != null)
        {
            i.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d), cvw.a));
        Iterator iterator;
        ((Writer) (obj)).write("libcore.io.DiskLruCache");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(1));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(g));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = j.values().iterator();
_L1:
        cvt cvt1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_235;
            }
            cvt1 = (cvt)iterator.next();
            if (cvt1.d == null)
            {
                break MISSING_BLOCK_LABEL_196;
            }
            ((Writer) (obj)).write((new StringBuilder("DIRTY ")).append(cvt1.a).append('\n').toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder("CLEAN ")).append(cvt1.a).append(cvt1.a()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        if (c.exists())
        {
            a(c, e, true);
        }
        a(d, c, false);
        e.delete();
        i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c, true), cvw.a));
        this;
        JVM INSTR monitorexit ;
    }

    static File g(cvq cvq1)
    {
        return cvq1.b;
    }

    private boolean g()
    {
        return k >= 2000 && k >= j.size();
    }

    private void h()
    {
        if (i == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private void i()
    {
        while (h > f) 
        {
            c((String)((java.util.Map.Entry)j.entrySet().iterator().next()).getKey());
        }
    }

    public final cvu a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        cvt cvt1;
        h();
        d(s);
        cvt1 = (cvt)j.get(s);
        if (cvt1 != null) goto _L2; else goto _L1
_L1:
        s = null;
_L8:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (!cvt1.c)
        {
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        InputStream ainputstream[] = new InputStream[g];
        int i1 = 0;
_L4:
        if (i1 >= g)
        {
            break; /* Loop/switch isn't completed */
        }
        ainputstream[i1] = new FileInputStream(cvt1.a(i1));
        i1++;
        if (true) goto _L4; else goto _L3
        s;
        i1 = 0;
_L6:
        if (i1 >= g || ainputstream[i1] == null)
        {
            break; /* Loop/switch isn't completed */
        }
        cvw.a(ainputstream[i1]);
        i1++;
        if (true) goto _L6; else goto _L5
_L3:
        k = k + 1;
        i.append((new StringBuilder("READ ")).append(s).append('\n').toString());
        if (g())
        {
            m.submit(n);
        }
        s = new cvu(ainputstream, (byte)0);
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L5:
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = i;
        boolean flag;
        if (writer == null)
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

    public final cvr b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        cvt cvt1;
        h();
        d(s);
        cvt1 = (cvt)j.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (cvt1 == null) goto _L4; else goto _L3
_L3:
        long l1 = cvt1.e;
        if (l1 == -1L) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (cvt1 != null) goto _L6; else goto _L5
_L5:
        cvt1 = new cvt(this, s, (byte)0);
        j.put(s, cvt1);
_L8:
        cvr cvr1;
        cvr1 = new cvr(this, cvt1, (byte)0);
        cvt1.d = cvr1;
        i.write((new StringBuilder("DIRTY ")).append(s).append('\n').toString());
        i.flush();
        s = cvr1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        cvr1 = cvt1.d;
        if (cvr1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        h();
        i();
        i.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c(String s)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        cvt cvt1;
        h();
        d(s);
        cvt1 = (cvt)j.get(s);
        if (cvt1 == null) goto _L2; else goto _L1
_L1:
        Object obj = cvt1.d;
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        h = h - cvt1.b[i1];
        cvt1.b[i1] = 0L;
        i1++;
_L3:
        if (i1 >= g)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = cvt1.a(i1);
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        throw new IOException((new StringBuilder("failed to delete ")).append(obj).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        k = k + 1;
        i.append((new StringBuilder("REMOVE ")).append(s).append('\n').toString());
        j.remove(s);
        if (g())
        {
            m.submit(n);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        Writer writer = i;
        if (writer != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = (new ArrayList(j.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cvt cvt1 = (cvt)iterator.next();
            if (cvt1.d != null)
            {
                cvt1.d.b();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        i();
        i.close();
        i = null;
          goto _L1
    }

}
