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
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.bumptech.glide.a:
//            b, h, f, d, 
//            c, e

public final class a
    implements Closeable
{

    final ThreadPoolExecutor a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final int f = 1;
    private long g;
    private final int h = 1;
    private long i;
    private Writer j;
    private final LinkedHashMap k = new LinkedHashMap(0, 0.75F, true);
    private int l;
    private long m;
    private final Callable n = new b(this);

    private a(File file, long l1)
    {
        i = 0L;
        m = 0L;
        a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        b = file;
        c = new File(file, "journal");
        d = new File(file, "journal.tmp");
        e = new File(file, "journal.bkp");
        g = l1;
    }

    public static a a(File file, long l1)
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
        obj = new a(file, l1);
        if (!((a) (obj)).c.exists())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        ((a) (obj)).a();
        ((a) (obj)).b();
        return ((a) (obj));
        IOException ioexception;
        ioexception;
        System.out.println((new StringBuilder("DiskLruCache ")).append(file).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
        ((a) (obj)).close();
        com.bumptech.glide.a.h.a(((a) (obj)).b);
        file.mkdirs();
        file = new a(file, l1);
        file.c();
        return file;
    }

    static Writer a(a a1)
    {
        return a1.j;
    }

    private void a()
    {
        f f1 = new f(new FileInputStream(c), h.a);
        Exception exception;
        String s = f1.a();
        String s2 = f1.a();
        String s3 = f1.a();
        String s4 = f1.a();
        String s6 = f1.a();
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s2) || !Integer.toString(f).equals(s3) || !Integer.toString(h).equals(s4) || !"".equals(s6))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s2).append(", ").append(s4).append(", ").append(s6).append("]").toString());
        }
        int i1 = 0;
_L8:
        String s5;
        int j1;
        s5 = f1.a();
        j1 = s5.indexOf(' ');
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        try
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
        }
        catch (EOFException eofexception) { }
        finally
        {
            com.bumptech.glide.a.h.a(f1);
            throw exception;
        }
        l = i1 - k.size();
        if (!f1.b()) goto _L4; else goto _L3
_L3:
        c();
_L6:
        com.bumptech.glide.a.h.a(f1);
        return;
_L2:
        int k1 = j1 + 1;
        int l1 = s5.indexOf(' ', k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        String s1 = s5.substring(k1);
        if (j1 != 6)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        if (s5.startsWith("REMOVE"))
        {
            k.remove(s1);
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_331;
        s1 = s5.substring(k1, l1);
        d d2 = (d)k.get(s1);
        d d1;
        d1 = d2;
        if (d2 != null)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        d1 = new d(this, s1, (byte)0);
        k.put(s1, d1);
        if (l1 == -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        if (s5.startsWith("CLEAN"))
        {
            String as[] = s5.substring(l1 + 1).split(" ");
            com.bumptech.glide.a.d.a(d1);
            com.bumptech.glide.a.d.a(d1, null);
            com.bumptech.glide.a.d.a(d1, as);
            break; /* Loop/switch isn't completed */
        }
        if (l1 != -1 || j1 != 5)
        {
            break MISSING_BLOCK_LABEL_469;
        }
        if (s5.startsWith("DIRTY"))
        {
            com.bumptech.glide.a.d.a(d1, new c(this, d1, (byte)0));
            break; /* Loop/switch isn't completed */
        }
        if (l1 != -1 || j1 != 4)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        if (s5.startsWith("READ"))
        {
            break; /* Loop/switch isn't completed */
        }
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(s5).toString());
_L4:
        j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c, true), h.a));
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(a a1, c c1, boolean flag)
    {
        a1.a(c1, flag);
    }

    private void a(c c1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        d d1;
        d1 = com.bumptech.glide.a.c.a(c1);
        if (com.bumptech.glide.a.d.b(d1) != c1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (com.bumptech.glide.a.d.e(d1)) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L7:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= h) goto _L2; else goto _L4
_L4:
        if (!com.bumptech.glide.a.c.b(c1)[i1])
        {
            c1.c();
            throw new IllegalStateException((new StringBuilder("Newly created entry didn't create value for index ")).append(i1).toString());
        }
        if (d1.b[i1].exists()) goto _L6; else goto _L5
_L5:
        c1.c();
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
            break MISSING_BLOCK_LABEL_228;
        }

        c1 = d1.b[j1];
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        if (c1.exists())
        {
            file = d1.a[j1];
            c1.renameTo(file);
            l1 = com.bumptech.glide.a.d.c(d1)[j1];
            l2 = file.length();
            com.bumptech.glide.a.d.c(d1)[j1] = l2;
            i = (i - l1) + l2;
        }
        break MISSING_BLOCK_LABEL_436;
        a(((File) (c1)));
        break MISSING_BLOCK_LABEL_436;
        l = l + 1;
        com.bumptech.glide.a.d.a(d1, null);
        if (!(com.bumptech.glide.a.d.e(d1) | flag))
        {
            break MISSING_BLOCK_LABEL_379;
        }
        com.bumptech.glide.a.d.a(d1);
        j.append("CLEAN");
        j.append(' ');
        j.append(com.bumptech.glide.a.d.d(d1));
        j.append(d1.a());
        j.append('\n');
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        l1 = m;
        m = 1L + l1;
        com.bumptech.glide.a.d.a(d1, l1);
_L9:
        j.flush();
        if (i > g || d())
        {
            a.submit(n);
        }
          goto _L8
        k.remove(com.bumptech.glide.a.d.d(d1));
        j.append("REMOVE");
        j.append(' ');
        j.append(com.bumptech.glide.a.d.d(d1));
        j.append('\n');
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
        a(d);
        for (Iterator iterator = k.values().iterator(); iterator.hasNext();)
        {
            d d1 = (d)iterator.next();
            if (com.bumptech.glide.a.d.b(d1) == null)
            {
                int i1 = 0;
                while (i1 < h) 
                {
                    i = i + com.bumptech.glide.a.d.c(d1)[i1];
                    i1++;
                }
            } else
            {
                com.bumptech.glide.a.d.a(d1, null);
                for (int j1 = 0; j1 < h; j1++)
                {
                    a(d1.a[j1]);
                    a(d1.b[j1]);
                }

                iterator.remove();
            }
        }

    }

    static void b(a a1)
    {
        a1.f();
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (j != null)
        {
            j.close();
        }
        obj = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d), h.a));
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
        d d1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_236;
            }
            d1 = (d)iterator.next();
            if (com.bumptech.glide.a.d.b(d1) == null)
            {
                break MISSING_BLOCK_LABEL_197;
            }
            ((Writer) (obj)).write((new StringBuilder("DIRTY ")).append(com.bumptech.glide.a.d.d(d1)).append('\n').toString());
        } while (true);
        Exception exception;
        exception;
        ((Writer) (obj)).close();
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder("CLEAN ")).append(com.bumptech.glide.a.d.d(d1)).append(d1.a()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        if (c.exists())
        {
            a(c, e, true);
        }
        a(d, c, false);
        e.delete();
        j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c, true), h.a));
        this;
        JVM INSTR monitorexit ;
    }

    static boolean c(a a1)
    {
        return a1.d();
    }

    private c d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        d d1;
        e();
        d1 = (d)k.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (d1 == null) goto _L4; else goto _L3
_L3:
        long l1 = com.bumptech.glide.a.d.f(d1);
        if (l1 == -1L) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (d1 != null) goto _L6; else goto _L5
_L5:
        d1 = new d(this, s, (byte)0);
        k.put(s, d1);
_L8:
        c c1;
        c1 = new c(this, d1, (byte)0);
        com.bumptech.glide.a.d.a(d1, c1);
        j.append("DIRTY");
        j.append(' ');
        j.append(s);
        j.append('\n');
        j.flush();
        s = c1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        c1 = com.bumptech.glide.a.d.b(d1);
        if (c1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void d(a a1)
    {
        a1.c();
    }

    private boolean d()
    {
        return l >= 2000 && l >= k.size();
    }

    static int e(a a1)
    {
        a1.l = 0;
        return 0;
    }

    private void e()
    {
        if (j == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    static int f(a a1)
    {
        return a1.h;
    }

    private void f()
    {
        while (i > g) 
        {
            c((String)((java.util.Map.Entry)k.entrySet().iterator().next()).getKey());
        }
    }

    static File g(a a1)
    {
        return a1.b;
    }

    public final e a(String s)
    {
        int i1 = 0;
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        d d1;
        e();
        d1 = (d)k.get(s);
        if (d1 != null) goto _L2; else goto _L1
_L1:
        e e1 = obj;
_L6:
        this;
        JVM INSTR monitorexit ;
        return e1;
_L2:
        e1 = obj;
        File afile[];
        int j1;
        if (!com.bumptech.glide.a.d.e(d1))
        {
            continue; /* Loop/switch isn't completed */
        }
        afile = d1.a;
        j1 = afile.length;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = obj;
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
        if (d())
        {
            a.submit(n);
        }
        e1 = new e(this, s, com.bumptech.glide.a.d.f(d1), d1.a, com.bumptech.glide.a.d.c(d1), (byte)0);
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    public final c b(String s)
    {
        return d(s);
    }

    public final boolean c(String s)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        d d1;
        e();
        d1 = (d)k.get(s);
        if (d1 == null) goto _L2; else goto _L1
_L1:
        Object obj = com.bumptech.glide.a.d.b(d1);
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        i = i - com.bumptech.glide.a.d.c(d1)[i1];
        com.bumptech.glide.a.d.c(d1)[i1] = 0L;
        i1++;
_L3:
        if (i1 >= h)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        obj = d1.a[i1];
        if (!((File) (obj)).exists() || ((File) (obj)).delete()) goto _L5; else goto _L4
_L4:
        throw new IOException((new StringBuilder("failed to delete ")).append(obj).toString());
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
        if (d())
        {
            a.submit(n);
        }
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void close()
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
            d d1 = (d)iterator.next();
            if (com.bumptech.glide.a.d.b(d1) != null)
            {
                com.bumptech.glide.a.d.b(d1).c();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        f();
        j.close();
        j = null;
          goto _L1
    }
}
