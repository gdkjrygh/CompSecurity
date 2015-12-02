// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv.a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.NativeAd;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.adv.d;
import com.qihoo.security.appbox.core.c;
import de.greenrobot.event.EventBus;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.adv.a:
//            c

public class b
{
    private class a
        implements com.facebook.ads.d
    {

        final b a;
        private final NativeAd b;
        private final com.qihoo.security.adv.AdvDataManager.AdvType c;
        private final boolean d;
        private c e;
        private final String f;
        private final long g;

        public void onAdClicked(com.facebook.ads.a a1)
        {
            if (a1 != b || e == null || e.q)
            {
                return;
            } else
            {
                e.q = true;
                b.a(a, c, f);
                return;
            }
        }

        public void onAdLoaded(com.facebook.ads.a a1)
        {
            if (a1 != b)
            {
                return;
            }
            e = new c();
            a1 = b.f();
            com.facebook.ads.NativeAd.a a2 = b.e();
            com.facebook.ads.NativeAd.a a3 = b.d();
            String s = b.g();
            com.facebook.ads.NativeAd.b b1 = b.j();
            String s1 = b.h();
            if (a1 != null)
            {
                e.j = a1;
            }
            if (a2 != null)
            {
                e.e = a2.a();
            }
            if (a3 != null)
            {
                e.h = a3.a();
            }
            if (s != null)
            {
                e.b = s;
            }
            if (b1 != null)
            {
                e.m = (float)b1.a();
            }
            if (s1 != null)
            {
                e.s = s1;
            }
            e.o = b;
            e.r = System.currentTimeMillis();
            b.a(a).put(f, e);
            b.a(a, f);
            if (d && com.qihoo360.common.e.b.b(b.b(a)))
            {
                com.qihoo.security.appbox.c.a.b.a().a(e.e);
                com.qihoo.security.appbox.c.a.b.a().a(e.h);
            }
            com.qihoo.security.adv.a.c.a(c, f, 0, System.currentTimeMillis() - g);
            EventBus.getDefault().post(new com.qihoo.security.f.b(c, f, true));
        }

        public void onError(com.facebook.ads.a a1, com.facebook.ads.c c1)
        {
            EventBus.getDefault().post(new com.qihoo.security.f.b(c, f, false));
            com.qihoo.security.adv.a.c.a(c, f, c1.a(), System.currentTimeMillis() - g);
        }

        private a(NativeAd nativead, com.qihoo.security.adv.AdvDataManager.AdvType advtype, boolean flag, String s)
        {
            a = b.this;
            super();
            b = nativead;
            c = advtype;
            d = flag;
            f = s;
            g = System.currentTimeMillis();
        }

    }


    private static b a;
    private final Context b = SecurityApplication.a();
    private final HashSet c = new HashSet();
    private final HashMap d = new HashMap();

    private b()
    {
    }

    public static b a()
    {
        if (a == null)
        {
            a = new b();
        }
        return a;
    }

    static HashMap a(b b1)
    {
        return b1.d;
    }

    static void a(b b1, com.qihoo.security.adv.AdvDataManager.AdvType advtype, String s)
    {
        b1.b(advtype, s);
    }

    static void a(b b1, String s)
    {
        b1.c(s);
    }

    static Context b(b b1)
    {
        return b1.b;
    }

    private void b(com.qihoo.security.adv.AdvDataManager.AdvType advtype, String s)
    {
        com.qihoo.security.adv.a.c.a(advtype, s);
        NativeAd nativead = new NativeAd(b, s);
        nativead.a(new a(nativead, advtype, true, s));
        try
        {
            nativead.a();
            c.add(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.qihoo.security.adv.AdvDataManager.AdvType advtype)
        {
            return;
        }
    }

    private boolean b(d d1, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            d d2 = (d)list.next();
            if (d1.b() != null && d2.b() != null && d1.b().j.equals(d2.b().j))
            {
                return true;
            }
        }

        return false;
    }

    private void c(String s)
    {
        if (!TextUtils.isEmpty(s) && c.contains(s))
        {
            c.remove(s);
        }
    }

    public c a(String s)
    {
        return (c)d.get(s);
    }

    public void a(com.qihoo.security.adv.AdvDataManager.AdvType advtype, String s)
    {
        c c1 = (c)d.get(s);
        if (c1 != null)
        {
            if (com.qihoo.security.adv.a.c.a(c1, false))
            {
                d.remove(s);
                if (!c.contains(s))
                {
                    b(advtype, s);
                }
            }
        } else
        if (!c.contains(s))
        {
            b(advtype, s);
            return;
        }
    }

    public boolean a(d d1, List list)
    {
        for (Iterator iterator = d1.h().iterator(); iterator.hasNext();)
        {
            com.qihoo.security.adv.c c1 = (com.qihoo.security.adv.c)iterator.next();
            if (c1.a() == 1)
            {
                c c2 = a(c1.b());
                if (c2 != null)
                {
                    d1.a(c2);
                    if (!b(d1, list))
                    {
                        b(c1.b());
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void b(String s)
    {
        d.remove(s);
        c.remove(s);
    }
}
