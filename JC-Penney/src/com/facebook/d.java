// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.a.f;
import com.facebook.b.al;
import com.facebook.b.ar;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//            GraphRequest, ao, s, b, 
//            AccessToken, j, i, ak, 
//            f, g, h, e, 
//            ad

final class d
{

    private static volatile d a;
    private final f b;
    private final b c;
    private AccessToken d;
    private AtomicBoolean e;
    private Date f;

    d(f f1, b b1)
    {
        e = new AtomicBoolean(false);
        f = new Date(0L);
        ar.a(f1, "localBroadcastManager");
        ar.a(b1, "accessTokenCache");
        b = f1;
        c = b1;
    }

    private static GraphRequest a(AccessToken accesstoken, ad ad)
    {
        return new GraphRequest(accesstoken, "me/permissions", new Bundle(), ao.a, ad);
    }

    static d a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/facebook/d;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new d(android.support.v4.a.f.a(com.facebook.s.f()), new b());
        }
        com/facebook/d;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/facebook/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(AccessToken accesstoken, AccessToken accesstoken1)
    {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accesstoken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accesstoken1);
        b.a(intent);
    }

    private void a(AccessToken accesstoken, boolean flag)
    {
        AccessToken accesstoken1 = d;
        d = accesstoken;
        e.set(false);
        f = new Date(0L);
        if (flag)
        {
            if (accesstoken != null)
            {
                c.a(accesstoken);
            } else
            {
                c.b();
                al.b(com.facebook.s.f());
            }
        }
        if (!al.a(accesstoken1, accesstoken))
        {
            a(accesstoken1, accesstoken);
        }
    }

    static void a(d d1)
    {
        d1.g();
    }

    private static GraphRequest b(AccessToken accesstoken, ad ad)
    {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        return new GraphRequest(accesstoken, "oauth/access_token", bundle, ao.a, ad);
    }

    static AtomicBoolean b(d d1)
    {
        return d1.e;
    }

    private boolean f()
    {
        if (d != null)
        {
            Long long1 = Long.valueOf((new Date()).getTime());
            if (d.f().a() && long1.longValue() - f.getTime() > 0x36ee80L && long1.longValue() - d.g().getTime() > 0x5265c00L)
            {
                return true;
            }
        }
        return false;
    }

    private void g()
    {
        AccessToken accesstoken;
        for (accesstoken = d; accesstoken == null || !e.compareAndSet(false, true);)
        {
            return;
        }

        ar.a();
        f = new Date();
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        AtomicBoolean atomicboolean = new AtomicBoolean(false);
        i k = new i(null);
        ak ak1 = new ak(new GraphRequest[] {
            a(accesstoken, new com.facebook.f(this, atomicboolean, hashset, hashset1)), b(accesstoken, new g(this, k))
        });
        ak1.a(new h(this, accesstoken, atomicboolean, k, hashset, hashset1));
        ak1.h();
    }

    void a(AccessToken accesstoken)
    {
        a(accesstoken, true);
    }

    AccessToken b()
    {
        return d;
    }

    boolean c()
    {
        boolean flag = false;
        AccessToken accesstoken = c.a();
        if (accesstoken != null)
        {
            a(accesstoken, false);
            flag = true;
        }
        return flag;
    }

    void d()
    {
        if (!f())
        {
            return;
        } else
        {
            e();
            return;
        }
    }

    void e()
    {
        if (Looper.getMainLooper().equals(Looper.myLooper()))
        {
            g();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new e(this));
            return;
        }
    }
}
