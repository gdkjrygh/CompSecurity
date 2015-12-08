// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.http.AndroidHttpClient;
import com.android.volley.p;
import com.android.volley.toolbox.a;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;
import com.kik.cache.SimpleLruBitmapCache;
import com.kik.cache.ad;
import com.kik.cache.ak;
import com.kik.cache.ap;
import com.kik.cache.v;
import com.kik.cache.z;
import com.kik.g.i;
import com.kik.g.k;
import com.kik.g.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import kik.a.d.aa;
import kik.a.d.n;
import kik.android.util.ar;
import kik.android.util.cq;
import kik.android.util.d;

// Referenced classes of package com.kik.l:
//            k, g, h, i, 
//            j

public final class f
{

    private p a;
    private ap b;
    private com.android.volley.toolbox.d c;
    private ad d;
    private SimpleLruBitmapCache e;
    private com.kik.g.f f;
    private Runnable g;
    private File h;
    private k i;
    private i j;

    public f(File file)
    {
        f = new com.kik.g.f();
        h = null;
        i = new k(this);
        j = new com.kik.l.k(this);
        h = file;
    }

    static Runnable a(f f1)
    {
        return f1.g;
    }

    static void a(f f1, z z)
    {
        if (z != null)
        {
            if (z instanceof com.kik.cache.k)
            {
                f1.i.a(((com.kik.cache.k)z).u());
            } else
            if (z instanceof v)
            {
                f1.i.a(((v)z).u());
                return;
            }
        }
    }

    static byte[] a(File file)
    {
        int i1 = (int)file.length();
        file = new FileInputStream(file.getAbsolutePath());
        byte abyte0[] = new byte[i1];
        int l = 0;
        do
        {
            if (l >= i1)
            {
                break;
            }
            int j1 = file.read(abyte0, l, i1 - l);
            if (j1 == -1)
            {
                break;
            }
            l += j1;
        } while (true);
        if (l != i1)
        {
            throw new IOException((new StringBuilder("Expected ")).append(i1).append(" bytes, read ").append(l).append(" bytes").toString());
        } else
        {
            return abyte0;
        }
    }

    static p b(f f1)
    {
        return f1.a;
    }

    static ap c(f f1)
    {
        return f1.b;
    }

    static com.android.volley.toolbox.d d(f f1)
    {
        return f1.c;
    }

    static ad e(f f1)
    {
        return f1.d;
    }

    public final com.kik.g.e a()
    {
        return i.a();
    }

    public final void a(String s1, com.kik.g.e e1, File file)
    {
        File file1 = new File(h, s1);
        kik.android.util.d.a(new File(file, s1), file1);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            s1 = new h();
        } else
        {
            s1 = new e(AndroidHttpClient.newInstance("AN"));
        }
        s1 = new a(s1);
        c = new com.android.volley.toolbox.d(file1, 0x1400000);
        a = new p(c, s1);
        b = new ap(c, 1);
        e = com.kik.m.k.a();
        if (g != null)
        {
            s1 = s.a(new com.kik.g.p(), 5000L);
            (new Thread(new g(this, s1))).start();
            s1.a(new com.kik.l.h(this));
        } else
        {
            a.a();
            b.a();
        }
        d = new ad(a, e, b);
        f.a(d.a(), new com.kik.l.i(this));
        f.a(e1, j);
        d.b();
    }

    public final void a(Hashtable hashtable, Context context, ar ar1)
    {
        ar1.a("Kik.Storage.ContactImageCache.pref").edit().putBoolean("ContactImageCache.volley.migrated", true).commit();
        g = new j(this, hashtable, context);
    }

    public final void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); a((kik.a.d.k)list.next())) { }
    }

    public final void a(kik.a.d.k k1)
    {
        if (k1 != null)
        {
            boolean flag = false;
            Object obj;
            if ((k1 instanceof n) && k1.r() == null)
            {
                String s1 = v.a((n)k1);
                obj = v.b((n)k1);
                flag = true;
                k1 = s1;
            } else
            {
                obj = com.kik.cache.k.a(k1);
                com.kik.cache.SimpleLruBitmapCache.a a1 = com.kik.cache.k.b(k1);
                k1 = ((kik.a.d.k) (obj));
                obj = a1;
            }
            if (k1 != null)
            {
                c.a(k1, flag);
                e.a(((com.kik.cache.SimpleLruBitmapCache.a) (obj)));
                return;
            }
        }
    }

    public final void a(byte abyte0[], aa aa)
    {
        if (abyte0 == null)
        {
            c.b("myPicVolleyDiskKey");
            e.remove("myPicVolleyDiskKey");
            return;
        }
        com.android.volley.b.a a2 = c.a("myPicVolleyDiskKey");
        com.android.volley.b.a a1 = a2;
        if (a2 == null)
        {
            a1 = new com.android.volley.b.a();
            a1.d = 0x41353000L;
            a1.e = 0x41353000L;
        }
        a1.a = abyte0;
        c.a("myPicVolleyDiskKey", a1);
        e.a(ak.a(aa, false));
    }

    public final void a(byte abyte0[], n n1)
    {
        if (n1 == null)
        {
            return;
        }
        if (cq.c(n1.r()))
        {
            n1.c(v.a(n1));
        }
        String s1 = com.kik.cache.k.a(n1);
        com.kik.cache.SimpleLruBitmapCache.a a2 = com.kik.cache.k.b(n1);
        if (abyte0 == null)
        {
            c.b(s1);
            e.remove(s1);
            return;
        }
        com.android.volley.b.a a1 = c.a(s1);
        n1 = a1;
        if (a1 == null)
        {
            n1 = new com.android.volley.b.a();
            n1.d = 0x41353000L;
            n1.e = 0x41353000L;
        }
        n1.a = abyte0;
        c.a(s1, n1);
        e.a(a2);
    }

    public final ad b()
    {
        return d;
    }

    public final void b(byte abyte0[], aa aa)
    {
        if (abyte0 == null)
        {
            c.b("myPicVolleyDiskKey#FULLSIZE");
            e.remove("myPicVolleyDiskKey#FULLSIZE");
            return;
        }
        com.android.volley.b.a a2 = c.a("myPicVolleyDiskKey#FULLSIZE");
        com.android.volley.b.a a1 = a2;
        if (a2 == null)
        {
            a1 = new com.android.volley.b.a();
            a1.d = 0x41353000L;
            a1.e = 0x41353000L;
        }
        a1.a = abyte0;
        c.a("myPicVolleyDiskKey#FULLSIZE", a1);
        e.a(ak.a(aa, true));
    }

    public final void c()
    {
        c.b();
    }

    public final boolean d()
    {
        return c.c("myPicVolleyDiskKey") || c.c("myPicVolleyDiskKey#FULLSIZE");
    }
}
