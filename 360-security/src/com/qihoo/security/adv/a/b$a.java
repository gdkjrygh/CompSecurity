// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv.a;

import com.facebook.ads.NativeAd;
import com.facebook.ads.a;
import com.facebook.ads.d;
import com.qihoo.security.appbox.core.c;
import com.qihoo360.common.e.b;
import de.greenrobot.event.EventBus;
import java.util.HashMap;

// Referenced classes of package com.qihoo.security.adv.a:
//            b, c

private class ager.AdvType
    implements d
{

    final com.qihoo.security.adv.a.b a;
    private final NativeAd b;
    private final com.qihoo.security.adv.ataManager.AdvType c;
    private final boolean d;
    private c e;
    private final String f;
    private final long g;

    public void onAdClicked(a a1)
    {
        if (a1 != b || e == null || e.q)
        {
            return;
        } else
        {
            e.q = true;
            com.qihoo.security.adv.a.b.a(a, c, f);
            return;
        }
    }

    public void onAdLoaded(a a1)
    {
        if (a1 != b)
        {
            return;
        }
        e = new c();
        a1 = b.f();
        com.facebook.ads.veAd.a a2 = b.e();
        com.facebook.ads.veAd.a a3 = b.d();
        String s = b.g();
        com.facebook.ads.veAd.b b1 = b.j();
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
        com.qihoo.security.adv.a.b.a(a).put(f, e);
        com.qihoo.security.adv.a.b.a(a, f);
        if (d && com.qihoo360.common.e.b.b(com.qihoo.security.adv.a.b.b(a)))
        {
            com.qihoo.security.appbox.c.a.b.a().a(e.e);
            com.qihoo.security.appbox.c.a.b.a().a(e.h);
        }
        com.qihoo.security.adv.a.c.a(c, f, 0, System.currentTimeMillis() - g);
        EventBus.getDefault().post(new com.qihoo.security.f.b(c, f, true));
    }

    public void onError(a a1, com.facebook.ads.c c1)
    {
        EventBus.getDefault().post(new com.qihoo.security.f.b(c, f, false));
        com.qihoo.security.adv.a.c.a(c, f, c1.a(), System.currentTimeMillis() - g);
    }

    private ager.AdvType(com.qihoo.security.adv.a.b b1, NativeAd nativead, com.qihoo.security.adv.ataManager.AdvType advtype, boolean flag, String s)
    {
        a = b1;
        super();
        b = nativead;
        c = advtype;
        d = flag;
        f = s;
        g = System.currentTimeMillis();
    }

    ager.AdvType(com.qihoo.security.adv.a.b b1, NativeAd nativead, com.qihoo.security.adv.ataManager.AdvType advtype, boolean flag, String s, ager.AdvType advtype1)
    {
        this(b1, nativead, advtype, flag, s);
    }
}
