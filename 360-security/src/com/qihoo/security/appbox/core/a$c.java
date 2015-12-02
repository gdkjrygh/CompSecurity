// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.a;
import com.facebook.ads.c;
import com.facebook.ads.d;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.common.e.b;
import java.util.Map;

// Referenced classes of package com.qihoo.security.appbox.core:
//            a, c

private class <init>
    implements d
{

    NativeAd a;
    boolean b;
    com.qihoo.security.appbox.core.c c;
    String d;
    String e;
    final com.qihoo.security.appbox.core.a f;

    public void onAdClicked(a a1)
    {
        if (a1 != a || c == null || c.q)
        {
            return;
        }
        c.q = true;
        a1 = new NativeAd(SecurityApplication.a(), d);
        a1.a(new <init>(f, a1, e, false, d));
        try
        {
            a1.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return;
        }
    }

    public void onAdLoaded(a a1)
    {
        if (a1 == a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c = new com.qihoo.security.appbox.core.c();
        a1 = a.f();
        com.facebook.ads.veAd.a a2 = a.e();
        com.facebook.ads.veAd.a a3 = a.d();
        String s = a.g();
        com.facebook.ads.veAd.b b1 = a.j();
        String s1 = a.h();
        if (a1 != null)
        {
            c.j = a1;
        }
        if (a2 != null)
        {
            c.e = a2.a();
        }
        if (a3 != null)
        {
            c.h = a3.a();
        }
        if (s != null)
        {
            c.b = s;
        }
        if (b1 != null)
        {
            c.m = (float)b1.a();
        }
        if (s1 != null)
        {
            c.s = s1;
        }
        c.o = a;
        c.r = System.currentTimeMillis();
        synchronized (f)
        {
            com.qihoo.security.appbox.core.a.a(f, e).put(d, c);
        }
        if (!b || !com.qihoo360.common.e.b.b(SecurityApplication.a())) goto _L1; else goto _L3
_L3:
        com.qihoo.security.appbox.c.a.b.a().a(c.e);
        com.qihoo.security.appbox.c.a.b.a().a(c.h);
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(a a1, c c1)
    {
    }

    private ion(com.qihoo.security.appbox.core.a a1, NativeAd nativead, String s, boolean flag, String s1)
    {
        f = a1;
        super();
        a = nativead;
        b = flag;
        d = s1;
        e = s;
    }

    e(com.qihoo.security.appbox.core.a a1, NativeAd nativead, String s, boolean flag, String s1, e e1)
    {
        this(a1, nativead, s, flag, s1);
    }
}
