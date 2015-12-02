// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import android.content.Context;
import com.facebook.analytics.cache.c;
import com.facebook.analytics.cache.e;
import com.facebook.analytics.cache.g;
import com.facebook.analytics.cache.h;
import com.facebook.analytics.cb;
import com.facebook.cache.j;
import com.facebook.common.w.i;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.ui.c.d;
import com.google.common.b.f;
import com.google.common.base.Stopwatch;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// Referenced classes of package com.facebook.ui.media.cache:
//            m, f, b, c, 
//            l, d, e

public abstract class a
{

    private static Class a = com/facebook/ui/media/cache/a;
    private long b;
    private final int c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private long h;
    private final Object i = new Object();
    private final e j;
    private final FilenameFilter k = new com.facebook.ui.media.cache.b(this);
    private final FilenameFilter l = new com.facebook.ui.media.cache.c(this);
    private final com.facebook.ui.media.cache.f m = new com.facebook.ui.media.cache.f(this);
    private final Stopwatch n = new Stopwatch();
    private final com.facebook.common.e.h o;
    private final Context p;
    private final com.facebook.common.time.a q;
    private final String r;
    private volatile File s;
    private d t;

    public a(Context context, com.facebook.common.e.h h1, d d1, h h2, com.facebook.common.time.a a1, m m1)
    {
        b = -1L;
        q = a1;
        r = m1.a();
        f = m1.j();
        g = m1.i();
        h = g;
        t = d1;
        c = m1.d();
        p = context;
        o = h1;
        if (c == 1)
        {
            d = m1.b();
            e = ".lru";
        } else
        {
            d = (new StringBuilder()).append(m1.b()).append("_").append(Integer.toString(c)).toString();
            e = (new StringBuilder()).append(".lru_").append(Integer.toString(c)).toString();
        }
        j = h2.a((new StringBuilder()).append(r).append("_file").toString());
    }

    static long a(a a1, long l1)
    {
        a1.b = l1;
        return l1;
    }

    private long a(File file)
    {
        if (file.getName().endsWith(e))
        {
            File file1 = a(file, d);
            if (!file1.exists())
            {
                file.delete();
                return 0L;
            }
            long l1 = file1.length();
            if (file1.delete())
            {
                file.delete();
                return l1;
            } else
            {
                return -1L;
            }
        } else
        {
            file.delete();
            return -2L;
        }
    }

    private File a(l l1, String s1)
    {
        l1 = com.facebook.common.w.i.b(l1.b().getBytes("utf-8"));
        return new File(c(), (new StringBuilder()).append(l1).append(s1).toString());
    }

    private File a(File file, String s1)
    {
        String s2 = file.getName();
        s2 = s2.substring(0, s2.lastIndexOf('.'));
        return new File(file.getParent(), (new StringBuilder()).append(s2).append(s1).toString());
    }

    static String a(a a1)
    {
        return a1.d;
    }

    private void a(long l1)
    {
        int k1 = 0;
        File afile[] = g();
        Arrays.sort(afile, new com.facebook.ui.media.cache.d(this));
        long l2 = 0L;
        int j1 = 0;
        int i1 = 0;
        while (b > l1 && i1 < afile.length) 
        {
            long l4 = a(afile[i1]);
            int i2;
            int j2;
            long l3;
            if (l4 > 0L)
            {
                b = b - l4;
                j2 = j1 + 1;
                l3 = l2 + l4;
                i2 = k1;
            } else
            {
                i2 = k1;
                l3 = l2;
                j2 = j1;
                if (l4 < 0L)
                {
                    i2 = k1 + 1;
                    l3 = l2;
                    j2 = j1;
                }
            }
            i1++;
            k1 = i2;
            l2 = l3;
            j1 = j2;
        }
        j.a(g.CACHE_FULL, j1, l2);
        if (k1 > 0 && o != null)
        {
            o.a((new StringBuilder()).append(a.getName()).append(" (unexpected files)").toString(), (new StringBuilder()).append("Found and deleted ").append(k1).append(" ").append("non-cache non-lru files in cache").toString());
        }
        k();
    }

    private File[] a(FilenameFilter filenamefilter)
    {
        return c().listFiles(filenamefilter);
    }

    private long b(File file)
    {
        long l6 = q.a();
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        file = file.listFiles(k);
        int i1;
        boolean flag;
        int j1;
        int k1;
        boolean flag1;
        long l2;
        long l4;
        l2 = -1L;
        j1 = 0;
        k1 = 0;
        flag1 = false;
        flag = false;
        l4 = 0L;
        i1 = 0;
_L2:
        long l5;
        if (i1 >= file.length)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        if (!file[i1].isFile())
        {
            break; /* Loop/switch isn't completed */
        }
        l5 = l4 + file[i1].length();
        int l1;
        int i2;
        boolean flag2;
        long l3;
        l3 = l2;
        l1 = j1;
        i2 = k1;
        flag2 = flag;
        l4 = l5;
        if (file[i1].lastModified() <= 0x6ddd00L + l6)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        flag1 = true;
        i2 = k1 + 1;
        l1 = (int)((long)j1 + l5);
        l3 = Math.max(file[i1].lastModified() - l6, l2);
        flag2 = flag;
        l4 = l5;
        break MISSING_BLOCK_LABEL_321;
        obj;
        JVM INSTR monitorexit ;
        if (flag && o != null)
        {
            o.a((new StringBuilder()).append(a.getName()).append(" (sub-directory found)").toString(), "Sub-directory found within cache directory during cache size calculation.");
        }
        if (flag1 && o != null)
        {
            o.a((new StringBuilder()).append(a.getName()).append(" (future timestamp)").toString(), (new StringBuilder()).append("Future timestamp found in ").append(k1).append(" files , with a total size of ").append(j1).append(" bytes, and a maximum time delta of ").append(l2).append("ms").toString());
        }
        n.reset().start();
        return l4;
        file;
        obj;
        JVM INSTR monitorexit ;
        throw file;
_L4:
        i1++;
        l2 = l3;
        j1 = l1;
        k1 = i2;
        flag = flag2;
        if (true) goto _L2; else goto _L1
_L1:
        flag2 = true;
        l3 = l2;
        l1 = j1;
        i2 = k1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L2; else goto _L5
_L5:
    }

    static com.facebook.common.time.a b(a a1)
    {
        return a1.q;
    }

    private void b(long l1)
    {
        if (b == -1L)
        {
            b = b(c());
        } else
        {
            b = b + l1;
        }
        j.e(l1);
        k();
    }

    static void b(a a1, long l1)
    {
        a1.a(l1);
    }

    static long c(a a1)
    {
        return a1.b;
    }

    static File[] d(a a1)
    {
        return a1.f();
    }

    static Object e(a a1)
    {
        return a1.i;
    }

    private void e()
    {
        File afile[];
        int i1;
        afile = f();
        i1 = 0;
_L3:
        if (i1 >= afile.length)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        File file;
        boolean flag;
        file = a(afile[i1], e);
        flag = file.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        file.createNewFile();
_L1:
        obj;
        JVM INSTR monitorexit ;
        i1++;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        com.facebook.debug.log.b.c(a, "IOException creating lru file", ioexception);
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        return;
        if (true) goto _L3; else goto _L2
_L2:
    }

    static void f(a a1)
    {
        a1.j();
    }

    private File[] f()
    {
        return a(k);
    }

    private File[] g()
    {
        e();
        return a(l);
    }

    private void h()
    {
        i();
        if (b > h)
        {
            b = -1L;
        }
        j();
        if (b > h)
        {
            a((9L * h) / 10L);
        }
    }

    private void i()
    {
        if (!t.a(g - b, false))
        {
            h = g;
            return;
        } else
        {
            h = f;
            t.a(f - b, true);
            return;
        }
    }

    private void j()
    {
        if (b == -1L || !n.isRunning() || n.elapsedMillis() > 0x1b7740L)
        {
            long l1 = b(c());
            if (b != -1L && Math.abs(l1 - b) > 0x80000L && o != null)
            {
                o.a((new StringBuilder()).append(a.getName()).append(" (mFileCacheSize drift)").toString(), (new StringBuilder()).append("mFileCacheSize mValue of ").append(b).append(" bytes has drifted from the ground truth ").append(l1).append(" bytes by ").append(l1 - b).append(" bytes").toString());
            }
            b = l1;
        }
        k();
    }

    private void k()
    {
        if (b > 0L)
        {
            o.c(j.a(c.BYTES_COUNT), Long.toString(b));
            return;
        } else
        {
            o.a(j.a(c.BYTES_COUNT));
            return;
        }
    }

    public File a(l l1, InputStream inputstream)
    {
        File file2;
        Object obj;
        obj = null;
        file2 = null;
        Object obj1 = i;
        obj1;
        JVM INSTR monitorenter ;
        File file;
        File file1;
        file1 = file2;
        file = obj;
        h();
        file1 = file2;
        file = obj;
        file2 = d(l1);
        file1 = file2;
        file = file2;
        file2.createNewFile();
        file1 = file2;
        file = file2;
        com.google.common.b.f.a(new com.facebook.ui.media.cache.e(inputstream, null), file2);
        file1 = file2;
        file = file2;
        c(l1);
        b(file2.length());
        obj1;
        JVM INSTR monitorexit ;
        return file2;
        l1;
        file = file1;
        throw new RuntimeException(l1);
        l1;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        file.delete();
        throw l1;
        l1;
        obj1;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public File a(l l1, Object obj)
    {
        File file;
        Object obj1;
        file = null;
        obj1 = null;
        Object obj2 = i;
        obj2;
        JVM INSTR monitorenter ;
        l l2 = file;
        h();
        l2 = file;
        file = d(l1);
        file.createNewFile();
        a(l1, obj, file);
        c(l1);
        b(file.length());
        obj2;
        JVM INSTR monitorexit ;
        return file;
        l1;
        l2 = obj1;
_L4:
        throw new RuntimeException(l1);
        l1;
_L1:
        if (l2 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        l2.delete();
        throw l1;
        l1;
        obj2;
        JVM INSTR monitorexit ;
        throw l1;
        obj;
        l1 = null;
_L2:
        com.facebook.debug.log.b.c(a, "IOException", ((Throwable) (obj)));
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        l1.delete();
        obj2;
        JVM INSTR monitorexit ;
        return null;
        l1;
        l2 = file;
          goto _L1
        obj;
        l2 = l1;
        l1 = ((l) (obj));
          goto _L1
        obj;
        l1 = file;
          goto _L2
        l1;
        l2 = file;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object a(l l1)
    {
        File file = d(l1);
        synchronized (i)
        {
            if (file.exists())
            {
                c(l1);
            }
        }
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l1 = ((l) (a(l1, file)));
        if (l1 != null)
        {
            try
            {
                j.b();
            }
            // Misplaced declaration of an exception variable
            catch (l l1)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (l l1)
            {
                return null;
            }
            return l1;
        }
        break MISSING_BLOCK_LABEL_60;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
        j.c();
        return null;
    }

    protected abstract Object a(l l1, File file);

    public void a()
    {
        File afile[];
        int i1;
        int j1;
        int k1;
        int l1;
        int l2;
        long l3;
        long l5;
        l5 = q.a();
        afile = g();
        l2 = afile.length;
        l3 = 0L;
        l1 = 0;
        k1 = 0;
        j1 = 0;
        i1 = 0;
_L3:
        if (i1 >= l2) goto _L2; else goto _L1
_L1:
        File file = afile[i1];
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        int i2;
        int j2;
        int k2;
        long l4;
        l4 = l3;
        i2 = l1;
        j2 = k1;
        k2 = j1;
        long l6;
        if (Math.abs(l5 - file.lastModified()) <= 0x19bfcc00L)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        l6 = a(file);
        if (l6 <= 0L)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        b = b - l6;
        i2 = l1 + 1;
        l4 = l3 + l6;
        k2 = j1;
        j2 = k1;
_L4:
        obj;
        JVM INSTR monitorexit ;
        i1++;
        l3 = l4;
        l1 = i2;
        k1 = j2;
        j1 = k2;
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (j1 > 0 && o != null)
        {
            o.a((new StringBuilder()).append(a.getName()).append(" (unable to delete files)").toString(), (new StringBuilder()).append("Could not delete ").append(j1).append(" ").append("cache files in the cache").toString());
        }
        if (k1 > 0 && o != null)
        {
            o.a((new StringBuilder()).append(a.getName()).append(" (unexpected files)").toString(), (new StringBuilder()).append("Found and deleted ").append(k1).append(" ").append("non-cache non-lru files in cache").toString());
        }
        j.a(g.CONTENT_STALE, l1, l3);
        k();
        return;
        if (l6 == -1L)
        {
            k2 = j1 + 1;
            l4 = l3;
            i2 = l1;
            j2 = k1;
        } else
        {
            l4 = l3;
            i2 = l1;
            j2 = k1;
            k2 = j1;
            if (l6 == -2L)
            {
                j2 = k1 + 1;
                l4 = l3;
                i2 = l1;
                k2 = j1;
            }
        }
          goto _L4
    }

    void a(j j1)
    {
        j1.a(m);
    }

    protected abstract void a(l l1, Object obj, File file);

    public void a(String s1, cb cb1)
    {
        if (b != -1L)
        {
            cb1.a((new StringBuilder()).append(s1).append("_file_cache_size").toString(), b());
        }
    }

    protected long b()
    {
        return b;
    }

    public File b(l l1)
    {
        File file = d(l1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        c(l1);
        return file;
        obj;
        JVM INSTR monitorexit ;
        return null;
        l1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw l1;
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            return null;
        }
    }

    protected File c()
    {
        boolean flag2 = false;
        boolean flag = true;
        File file = s;
        boolean flag1;
        if (file == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag = flag2;
            if (!file.exists())
            {
                flag = true;
            }
            if (flag)
            {
                com.facebook.common.e.h h1 = (com.facebook.common.e.h)com.facebook.inject.t.a(p).a(com/facebook/common/e/h);
                if (h1 != null)
                {
                    h1.a((new StringBuilder()).append(a.getName()).append(" (cache directory)").toString(), "Cache directory initialized but later moved.");
                }
            }
        }
        if (flag1 || flag)
        {
            File file1 = new File(p.getCacheDir(), r);
            if (file1.exists() && !file1.isDirectory())
            {
                file1.delete();
            }
            if (!file1.exists())
            {
                file1.mkdirs();
            }
            synchronized (i)
            {
                b = -1L;
            }
            s = file1;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean c(l l1)
    {
        boolean flag;
        l1 = e(l1);
        long l2 = q.a();
        if (l1.exists())
        {
            if (l2 - l1.lastModified() > 0x1b7740L)
            {
                return l1.setLastModified(l2);
            }
            break MISSING_BLOCK_LABEL_70;
        }
        l1.createNewFile();
        if (q instanceof com.facebook.common.time.c)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = l1.setLastModified(l2);
        return flag;
        return true;
        l1;
        return false;
    }

    File d(l l1)
    {
        return a(l1, d);
    }

    public void d()
    {
        File afile[] = c().listFiles();
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (afile == null) goto _L2; else goto _L1
_L1:
        int j1 = afile.length;
        int i1 = 0;
_L3:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        afile[i1].delete();
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        b = -1L;
        obj;
        JVM INSTR monitorexit ;
        k();
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    File e(l l1)
    {
        return a(l1, e);
    }

    public boolean f(l l1)
    {
        return d(l1).exists();
    }

}
