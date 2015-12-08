// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.roidapp.baselib.b:
//            c, d, f, g

public final class b
    implements Closeable
{

    private static final Charset a = Charset.forName("UTF-8");
    private final File b;
    private final File c;
    private final File d;
    private final int e = 1;
    private final long f = 0xa00000L;
    private final int g = 1;
    private long h;
    private Writer i;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75F, true);
    private int k;
    private long l;
    private final ExecutorService m;
    private final Callable n = new c(this);

    private b(File file)
    {
        h = 0L;
        l = 0L;
        m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        b = file;
        c = new File(file, "journal");
        d = new File(file, "journal.tmp");
    }

    public static b a(File file)
    {
        b b1;
        if (0xa00000L <= 0L)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        b1 = new b(file);
        if (!b1.c.exists())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        b1.c();
        b1.d();
        b1.i = new BufferedWriter(new FileWriter(b1.c, true), 8192);
        return b1;
        IOException ioexception;
        ioexception;
        b1.close();
        b(b1.b);
        file.mkdirs();
        file = new b(file);
        file.e();
        return file;
    }

    static Writer a(b b1)
    {
        return b1.i;
    }

    private static String a(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder(80);
        do
        {
            int i1 = inputstream.read();
            if (i1 == -1)
            {
                throw new EOFException();
            }
            if (i1 == 10)
            {
                break;
            }
            stringbuilder.append((char)i1);
        } while (true);
        int j1 = stringbuilder.length();
        if (j1 > 0 && stringbuilder.charAt(j1 - 1) == '\r')
        {
            stringbuilder.setLength(j1 - 1);
        }
        return stringbuilder.toString();
    }

    static void a(b b1, d d1, boolean flag)
    {
        b1.a(d1, flag);
    }

    private void a(d d1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        f f1;
        f1 = com.roidapp.baselib.b.d.a(d1);
        if (com.roidapp.baselib.b.f.b(f1) != d1)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        int j1 = ((flag1) ? 1 : 0);
        if (!flag) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if (com.roidapp.baselib.b.f.e(f1)) goto _L2; else goto _L3
_L3:
        int i1 = 0;
_L9:
        j1 = ((flag1) ? 1 : 0);
        if (i1 >= g) goto _L2; else goto _L4
_L4:
        if (!f1.b(i1).exists())
        {
            d1.c();
            throw new IllegalStateException((new StringBuilder("edit didn't create file ")).append(i1).toString());
        }
          goto _L5
_L2:
        if (j1 >= g) goto _L7; else goto _L6
_L6:
        d1 = f1.b(j1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (d1.exists())
        {
            File file = f1.a(j1);
            d1.renameTo(file);
            long l1 = com.roidapp.baselib.b.f.c(f1)[j1];
            long l3 = file.length();
            com.roidapp.baselib.b.f.c(f1)[j1] = l3;
            h = (h - l1) + l3;
        }
        break MISSING_BLOCK_LABEL_383;
        c(d1);
        break MISSING_BLOCK_LABEL_383;
_L7:
        k = k + 1;
        com.roidapp.baselib.b.f.a(f1, null);
        if (!(com.roidapp.baselib.b.f.e(f1) | flag))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        com.roidapp.baselib.b.f.a(f1);
        i.write((new StringBuilder("CLEAN ")).append(com.roidapp.baselib.b.f.d(f1)).append(f1.a()).append('\n').toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        long l2 = l;
        l = 1L + l2;
        com.roidapp.baselib.b.f.a(f1, l2);
_L8:
        if (h > f || f())
        {
            m.submit(n);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        j.remove(com.roidapp.baselib.b.f.d(f1));
        i.write((new StringBuilder("REMOVE ")).append(com.roidapp.baselib.b.f.d(f1)).append('\n').toString());
          goto _L8
_L5:
        i1++;
          goto _L9
        j1++;
          goto _L2
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        throw closeable;
        closeable;
    }

    static void b(b b1)
    {
        b1.h();
    }

    private static void b(File file)
    {
        file = file.listFiles();
        if (file != null)
        {
            int j1 = file.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                File file1 = file[i1];
                if (file1.isDirectory())
                {
                    b(file1);
                }
                if (!file1.delete())
                {
                    throw new IOException((new StringBuilder("failed to delete file: ")).append(file1).toString());
                }
                i1++;
            }
        }
    }

    private void c()
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(c), 8192);
        Object obj;
        String s = a(bufferedinputstream);
        String s1 = a(bufferedinputstream);
        String s2 = a(bufferedinputstream);
        String s3 = a(bufferedinputstream);
        String s5 = a(bufferedinputstream);
        if (!"libcore.io.DiskLruCache".equals(s) || !"1".equals(s1) || !Integer.toString(e).equals(s2) || !Integer.toString(g).equals(s3) || !"".equals(s5))
        {
            throw new IOException((new StringBuilder("unexpected journal header: [")).append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s5).append("]").toString());
        }
          goto _L1
_L3:
        String as[];
        String s4 = as[1];
        if (!as[0].equals("REMOVE") || as.length != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        j.remove(s4);
_L1:
        Object obj1;
        obj1 = a(bufferedinputstream);
        as = ((String) (obj1)).split(" ");
        if (as.length < 2)
        {
            throw new IOException((new StringBuilder("unexpected journal line: ")).append(((String) (obj1))).toString());
        }
        if (true) goto _L3; else goto _L2
_L2:
        f f1;
        try
        {
            f1 = (f)j.get(s4);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(bufferedinputstream);
            return;
        }
        finally
        {
            a(bufferedinputstream);
            throw obj;
        }
        if (f1 != null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        f1 = new f(this, s4, (byte)0);
        j.put(s4, f1);
        int i1;
        int j1;
        if (!as[0].equals("CLEAN") || as.length != g + 2)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        com.roidapp.baselib.b.f.a(f1);
        com.roidapp.baselib.b.f.a(f1, null);
        j1 = as.length;
        i1 = as.length;
        if (2 <= j1)
        {
            break MISSING_BLOCK_LABEL_363;
        }
        throw new IllegalArgumentException();
        if (2 <= i1)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        throw new ArrayIndexOutOfBoundsException();
        j1 -= 2;
        i1 = Math.min(j1, i1 - 2);
        obj1 = ((Object) ((Object[])Array.newInstance(as.getClass().getComponentType(), j1)));
        System.arraycopy(as, 2, obj1, 0, i1);
        com.roidapp.baselib.b.f.a(f1, (String[])obj1);
          goto _L1
        if (!as[0].equals("DIRTY") || as.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.roidapp.baselib.b.f.a(f1, new d(this, f1, (byte)0));
          goto _L1
        if (as[0].equals("READ") && as.length == 2) goto _L1; else goto _L4
_L4:
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(((String) (obj1))).toString());
    }

    private static void c(File file)
    {
        if (file.exists() && !file.delete())
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    static boolean c(b b1)
    {
        return b1.f();
    }

    private d d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        f f1;
        g();
        e(s);
        f1 = (f)j.get(s);
        if (-1L == -1L) goto _L2; else goto _L1
_L1:
        if (f1 == null) goto _L4; else goto _L3
_L3:
        long l1 = com.roidapp.baselib.b.f.f(f1);
        if (l1 == -1L) goto _L2; else goto _L4
_L4:
        s = null;
_L10:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (f1 != null) goto _L6; else goto _L5
_L5:
        f1 = new f(this, s, (byte)0);
        j.put(s, f1);
_L8:
        d d1;
        d1 = new d(this, f1, (byte)0);
        com.roidapp.baselib.b.f.a(f1, d1);
        i.write((new StringBuilder("DIRTY ")).append(s).append('\n').toString());
        i.flush();
        s = d1;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
_L6:
        d1 = com.roidapp.baselib.b.f.b(f1);
        if (d1 == null) goto _L8; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void d()
    {
        c(d);
        for (Iterator iterator = j.values().iterator(); iterator.hasNext();)
        {
            f f1 = (f)iterator.next();
            if (com.roidapp.baselib.b.f.b(f1) == null)
            {
                int i1 = 0;
                while (i1 < g) 
                {
                    h = h + com.roidapp.baselib.b.f.c(f1)[i1];
                    i1++;
                }
            } else
            {
                com.roidapp.baselib.b.f.a(f1, null);
                for (int j1 = 0; j1 < g; j1++)
                {
                    c(f1.a(j1));
                    c(f1.b(j1));
                }

                iterator.remove();
            }
        }

    }

    static void d(b b1)
    {
        b1.e();
    }

    static int e(b b1)
    {
        b1.k = 0;
        return 0;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        if (i != null)
        {
            i.close();
        }
        obj = new BufferedWriter(new FileWriter(d), 8192);
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
        f f1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_223;
            }
            f1 = (f)iterator.next();
            if (com.roidapp.baselib.b.f.b(f1) == null)
            {
                break MISSING_BLOCK_LABEL_185;
            }
            ((Writer) (obj)).write((new StringBuilder("DIRTY ")).append(com.roidapp.baselib.b.f.d(f1)).append('\n').toString());
        } while (true);
        obj;
        throw obj;
        ((Writer) (obj)).write((new StringBuilder("CLEAN ")).append(com.roidapp.baselib.b.f.d(f1)).append(f1.a()).append('\n').toString());
          goto _L1
        ((Writer) (obj)).close();
        d.renameTo(c);
        i = new BufferedWriter(new FileWriter(c, true), 8192);
        this;
        JVM INSTR monitorexit ;
    }

    private static void e(String s)
    {
        if (s.contains(" ") || s.contains("\n") || s.contains("\r"))
        {
            throw new IllegalArgumentException((new StringBuilder("keys must not contain spaces or newlines: \"")).append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    static int f(b b1)
    {
        return b1.g;
    }

    private boolean f()
    {
        return k >= 2000 && k >= j.size();
    }

    static File g(b b1)
    {
        return b1.b;
    }

    private void g()
    {
        if (i == null)
        {
            throw new IllegalStateException("cache is closed");
        } else
        {
            return;
        }
    }

    private void h()
    {
        while (h > f) 
        {
            c((String)((java.util.Map.Entry)j.entrySet().iterator().next()).getKey());
        }
    }

    public final g a(String s)
    {
        int i1 = 0;
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        f f1;
        g();
        e(s);
        f1 = (f)j.get(s);
        if (f1 != null) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((g) (obj));
_L2:
        obj = obj1;
        if (!com.roidapp.baselib.b.f.e(f1))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new InputStream[g];
_L4:
        if (i1 >= g)
        {
            break; /* Loop/switch isn't completed */
        }
        obj[i1] = new FileInputStream(f1.a(i1));
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        k = k + 1;
        i.append((new StringBuilder("READ ")).append(s).append('\n').toString());
        if (f())
        {
            m.submit(n);
        }
        obj = new g(this, s, com.roidapp.baselib.b.f.f(f1), ((InputStream []) (obj)), (byte)0);
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        s;
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a()
    {
        return i == null;
    }

    public final d b(String s)
    {
        return d(s);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        g();
        h();
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
        f f1;
        g();
        e(s);
        f1 = (f)j.get(s);
        if (f1 == null) goto _L2; else goto _L1
_L1:
        Object obj = com.roidapp.baselib.b.f.b(f1);
        if (obj == null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        h = h - com.roidapp.baselib.b.f.c(f1)[i1];
        com.roidapp.baselib.b.f.c(f1)[i1] = 0L;
        i1++;
_L3:
        if (i1 >= g)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = f1.a(i1);
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
        if (f())
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
            f f1 = (f)iterator.next();
            if (com.roidapp.baselib.b.f.b(f1) != null)
            {
                com.roidapp.baselib.b.f.b(f1).c();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        h();
        i.close();
        i = null;
          goto _L1
    }

}
