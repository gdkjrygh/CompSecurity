// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class amm
    implements Closeable
{

    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private long h;
    private Writer i;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75F, true);
    private int k;
    private long l;
    private ThreadPoolExecutor m;
    private final Callable n = new amn(this);

    private amm(File file, int i1, int j1, long l1)
    {
        h = 0L;
        l = 0L;
        m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a = file;
        e = i1;
        b = new File(file, "journal");
        c = new File(file, "journal.tmp");
        d = new File(file, "journal.bkp");
        g = j1;
        f = l1;
    }

    static int a(amm amm1, int i1)
    {
        amm1.k = 0;
        return 0;
    }

    public static amm a(File file, int i1, int j1, long l1)
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
        obj = new amm(file, 1, 1, l1);
        if (!((amm) (obj)).b.exists())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        ((amm) (obj)).a();
        ((amm) (obj)).b();
        return ((amm) (obj));
        IOException ioexception;
        ioexception;
        PrintStream printstream = System.out;
        String s = String.valueOf(file);
        String s1 = String.valueOf(ioexception.getMessage());
        printstream.println((new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(s1).length())).append("DiskLruCache ").append(s).append(" is corrupt: ").append(s1).append(", removing").toString());
        ((amm) (obj)).close();
        amt.a(((amm) (obj)).a);
        file.mkdirs();
        file = new amm(file, 1, 1, l1);
        file.c();
        return file;
    }

    static Writer a(amm amm1)
    {
        return amm1.i;
    }

    private void a()
    {
        amr amr1 = new amr(new FileInputStream(b), amt.a);
        Exception exception;
        String s = amr1.a();
        String s1 = amr1.a();
        String s2 = amr1.a();
        String s3 = amr1.a();
        String s5 = amr1.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(e).equals(s2) || !Integer.toString(g).equals(s3) || !"".equals(s5))
        {
            throw new IOException((new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s1).length() + String.valueOf(s3).length() + String.valueOf(s5).length())).append("unexpected journal header: [").append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s5).append("]").toString());
        }
        int i1 = 0;
_L9:
        String s4;
        int j1;
        s4 = amr1.a();
        j1 = s4.indexOf(' ');
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(s4);
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "unexpected journal line: ".concat(((String) (obj)));
_L5:
        throw new IOException(((String) (obj)));
_L6:
        k = i1 - j.size();
        String as[];
        amp amp1;
        amp amp2;
        int k1;
        int l1;
        if (amr1.b == -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        c();
_L7:
        amt.a(amr1);
        return;
_L4:
        obj = new String("unexpected journal line: ");
          goto _L5
_L2:
        k1 = j1 + 1;
        l1 = s4.indexOf(' ', k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        obj = s4.substring(k1);
        if (j1 != 6)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        try
        {
            if (s4.startsWith("REMOVE"))
            {
                j.remove(obj);
                break MISSING_BLOCK_LABEL_640;
            }
            break MISSING_BLOCK_LABEL_396;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            amt.a(amr1);
            throw exception;
        }
          goto _L6
        obj = s4.substring(k1, l1);
        amp2 = (amp)j.get(obj);
        amp1 = amp2;
        if (amp2 != null)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        amp1 = new amp(this, ((String) (obj)));
        j.put(obj, amp1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        if (s4.startsWith("CLEAN"))
        {
            as = s4.substring(l1 + 1).split(" ");
            amp1.e = true;
            amp1.f = null;
            amp1.a(as);
            break MISSING_BLOCK_LABEL_640;
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_530;
        }
        if (s4.startsWith("DIRTY"))
        {
            amp1.f = new amo(this, amp1);
            break MISSING_BLOCK_LABEL_640;
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        if (s4.startsWith("READ"))
        {
            break MISSING_BLOCK_LABEL_640;
        }
        as = String.valueOf(s4);
        if (as.length() != 0)
        {
            as = "unexpected journal line: ".concat(as);
        } else
        {
            as = new String("unexpected journal line: ");
        }
        throw new IOException(as);
        i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b, true), amt.a));
          goto _L7
        i1++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(amm amm1, amo amo1, boolean flag)
    {
        amm1.a(amo1, flag);
    }

    private void a(amo amo1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        amp amp1;
        amp1 = amo1.a;
        if (amp1.f != amo1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        amo1;
        this;
        JVM INSTR monitorexit ;
        throw amo1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (amp1.e) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= g) goto _L2; else goto _L4
_L4:
        if (!amo1.b[i1])
        {
            amo1.a();
            throw new IllegalStateException((new StringBuilder(61)).append("Newly created entry didn't create value for index ").append(i1).toString());
        }
        if (amp1.d[i1].exists()) goto _L6; else goto _L5
_L5:
        amo1.a();
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
            break MISSING_BLOCK_LABEL_233;
        }

        amo1 = amp1.d[j1];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        if (amo1.exists())
        {
            file = amp1.c[j1];
            amo1.renameTo(file);
            l1 = amp1.b[j1];
            l2 = file.length();
            amp1.b[j1] = l2;
            h = (h - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_439;
        a(((File) (amo1)));
        break MISSING_BLOCK_LABEL_439;
        k = k + 1;
        amp1.f = null;
        if (!(amp1.e | flag))
        {
            break MISSING_BLOCK_LABEL_382;
        }
        amp1.e = true;
        i.append("CLEAN");
        i.append(' ');
        i.append(amp1.a);
        i.append(amp1.a());
        i.append('\n');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        l1 = l;
        l = 1L + l1;
        amp1.g = l1;
_L9:
        i.flush();
        if (h > f || d())
        {
            m.submit(n);
        }
          goto _L8
        j.remove(amp1.a);
        i.append("REMOVE");
        i.append(' ');
        i.append(amp1.a);
        i.append('\n');
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

    private void b()
    {
        a(c);
        for (Iterator iterator = j.values().iterator(); iterator.hasNext();)
        {
            amp amp1 = (amp)iterator.next();
            if (amp1.f == null)
            {
                int i1 = 0;
                while (i1 < g) 
                {
                    h = h + amp1.b[i1];
                    i1++;
                }
            } else
            {
                amp1.f = null;
                for (int j1 = 0; j1 < g; j1++)
                {
                    a(amp1.c[j1]);
                    a(amp1.d[j1]);
                }

                iterator.remove();
            }
        }

    }

    static void b(amm amm1)
    {
        amm1.f();
    }

    private boolean b(String s)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        amp amp1;
        e();
        amp1 = (amp)j.get(s);
        if (amp1 == null) goto _L2; else goto _L1
_L1:
        Object obj = amp1.f;
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        h = h - amp1.b[i1];
        amp1.b[i1] = 0L;
        i1++;
_L3:
        if (i1 >= g)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        obj = amp1.c[i1];
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        s = String.valueOf(obj);
        throw new IOException((new StringBuilder(String.valueOf(s).length() + 17)).append("failed to delete ").append(s).toString());
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        k = k + 1;
        i.append("REMOVE");
        i.append(' ');
        i.append(s);
        i.append('\n');
        j.remove(s);
        if (d())
        {
            m.submit(n);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (i != null)
        {
            i.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), amt.a));
        Iterator iterator;
        ((Writer) (obj)).write("libcore.io.DiskLruCache");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("1");
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(e));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write(Integer.toString(g));
        ((Writer) (obj)).write("\n");
        ((Writer) (obj)).write("\n");
        iterator = j.values().iterator();
_L1:
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_314;
            }
            obj1 = (amp)iterator.next();
            if (((amp) (obj1)).f == null)
            {
                break MISSING_BLOCK_LABEL_228;
            }
            String s = String.valueOf("DIRTY ");
            obj1 = ((amp) (obj1)).a;
            ((Writer) (obj)).write((new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj1).length())).append(s).append(((String) (obj1))).append("\n").toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        String s1 = String.valueOf("CLEAN ");
        String s2 = ((amp) (obj1)).a;
        obj1 = String.valueOf(((amp) (obj1)).a());
        ((Writer) (obj)).write((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length() + String.valueOf(obj1).length())).append(s1).append(s2).append(((String) (obj1))).append("\n").toString());
          goto _L1
        ((Writer) (obj)).close();
        if (b.exists())
        {
            a(b, d, true);
        }
        a(c, b, false);
        d.delete();
        i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b, true), amt.a));
        this;
        JVM INSTR monitorexit ;
    }

    static boolean c(amm amm1)
    {
        return amm1.d();
    }

    static void d(amm amm1)
    {
        amm1.c();
    }

    private boolean d()
    {
        return k >= 2000 && k >= j.size();
    }

    static int e(amm amm1)
    {
        return amm1.g;
    }

    private void e()
    {
        if (i == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    static File f(amm amm1)
    {
        return amm1.a;
    }

    private void f()
    {
        while (h > f) 
        {
            b((String)((java.util.Map.Entry)j.entrySet().iterator().next()).getKey());
        }
    }

    public amo a(String s, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        amp amp1;
        e();
        amp1 = (amp)j.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (amp1 == null) goto _L4; else goto _L3
_L3:
        l1 = amp1.g;
        if (l1 == -1L) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (amp1 != null) goto _L6; else goto _L5
_L5:
        amp1 = new amp(this, s);
        j.put(s, amp1);
_L8:
        amo amo1;
        amo1 = new amo(this, amp1);
        amp1.f = amo1;
        i.append("DIRTY");
        i.append(' ');
        i.append(s);
        i.append('\n');
        i.flush();
        s = amo1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        amo1 = amp1.f;
        if (amo1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final amq a(String s)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        amp amp1;
        e();
        amp1 = (amp)j.get(s);
        if (amp1 != null) goto _L2; else goto _L1
_L1:
        amq amq1 = obj;
_L6:
        this;
        JVM INSTR monitorexit ;
        return amq1;
_L2:
        amq1 = obj;
        File afile[];
        int j1;
        if (!amp1.e)
        {
            continue; /* Loop/switch isn't completed */
        }
        afile = amp1.c;
        j1 = afile.length;
        int i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        amq1 = obj;
        if (!afile[i1].exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        k = k + 1;
        i.append("READ");
        i.append(' ');
        i.append(s);
        i.append('\n');
        if (d())
        {
            m.submit(n);
        }
        amq1 = new amq(this, s, amp1.g, amp1.c, amp1.b);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
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
            amp amp1 = (amp)iterator.next();
            if (amp1.f != null)
            {
                amp1.f.a();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        f();
        i.close();
        i = null;
          goto _L1
    }
}
