// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.SharedPreferences;
import android.net.http.AndroidHttpClient;
import com.android.volley.toolbox.d;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;
import com.kik.cache.SimpleLruBitmapCache;
import com.kik.cache.ad;
import com.kik.cache.ap;
import com.kik.cache.o;
import com.kik.cache.z;
import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kik.android.net.c;
import kik.android.util.ar;
import kik.android.util.bx;

// Referenced classes of package com.kik.l:
//            t, q, r, s

public final class p
{

    private com.android.volley.p a;
    private ap b;
    private d c;
    private ad d;
    private SimpleLruBitmapCache e;
    private f f;
    private Runnable g;
    private File h;
    private k i;

    public p(File file)
    {
        f = new f();
        h = null;
        i = new k(this);
        h = file;
    }

    static Runnable a(p p1)
    {
        return p1.g;
    }

    static void a(p p1, z z)
    {
        if (z != null && (z instanceof o))
        {
            p1.i.a(((o)z).u());
        }
    }

    static com.android.volley.p b(p p1)
    {
        return p1.a;
    }

    static byte[] b(File file)
    {
        return c(file);
    }

    static ap c(p p1)
    {
        return p1.b;
    }

    private static byte[] c(File file)
    {
        int l = (int)file.length();
        file = new FileInputStream(file.getAbsolutePath());
        byte abyte0[] = new byte[l];
        int j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            int i1 = file.read(abyte0, j, l - j);
            if (i1 == -1)
            {
                break;
            }
            j += i1;
        } while (true);
        if (j != l)
        {
            throw new IOException((new StringBuilder("Expected ")).append(l).append(" bytes, read ").append(j).append(" bytes").toString());
        } else
        {
            return abyte0;
        }
    }

    static d d(p p1)
    {
        return p1.c;
    }

    public final ad a()
    {
        return d;
    }

    public final void a(File file)
    {
        if (file == null)
        {
            return;
        }
        String s1 = file.getName();
        com.android.volley.b.a a2 = c.a(s1);
        com.android.volley.b.a a1 = a2;
        if (a2 == null)
        {
            a1 = new com.android.volley.b.a();
            a1.d = System.currentTimeMillis() + 0x41353000L;
            a1.e = System.currentTimeMillis() + 0x41353000L;
        }
        try
        {
            a1.a = c(file);
            c.a(s1, a1);
            e.remove(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            bx.a(file);
        }
    }

    public final void a(File file, ar ar1)
    {
        if (file == null)
        {
            return;
        } else
        {
            ar1.a("Kik.Storage.ContentImageCache.pref").edit().putBoolean("ContentImageCache.volley.migrated", true).commit();
            g = new t(this, file);
            return;
        }
    }

    public final void a(String s1, File file)
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
        s1 = new c(s1);
        c = new d(file1, 0x1400000);
        a = new com.android.volley.p(c, s1);
        b = new ap(c, 3);
        e = com.kik.m.k.a();
        if (g != null)
        {
            s1 = s.a(new com.kik.g.p(), 5000L);
            (new Thread(new q(this, s1))).start();
            s1.a(new r(this));
        } else
        {
            a.a();
            b.a();
        }
        d = new ad(a, e, b);
        f.a(d.a(), new com.kik.l.s(this));
        d.b();
    }

    public final void a(byte abyte0[], String s1)
    {
        if (abyte0 == null)
        {
            return;
        }
        String s2 = o.c(s1);
        com.android.volley.b.a a1 = c.a(s2);
        s1 = a1;
        if (a1 == null)
        {
            s1 = new com.android.volley.b.a();
            s1.d = System.currentTimeMillis() + 0x41353000L;
            s1.e = System.currentTimeMillis() + 0x41353000L;
        }
        try
        {
            s1.a = abyte0;
            c.a(s2, s1);
            e.remove(s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            bx.a(abyte0);
        }
    }
}
