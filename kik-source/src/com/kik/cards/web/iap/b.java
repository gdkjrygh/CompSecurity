// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.a.a.a;
import com.kik.g.ao;
import com.kik.g.ar;
import com.kik.g.f;
import com.kik.g.i;
import java.util.List;
import kik.a.e.v;

// Referenced classes of package com.kik.cards.web.iap:
//            c, d, f, e

public final class b
{

    private static b j;
    private a a;
    private Context b;
    private kik.a.e.f c;
    private ao d;
    private f e;
    private boolean f;
    private boolean g;
    private ar h;
    private v i;
    private ServiceConnection k;
    private final i l = new d(this);

    private b()
    {
        d = new ao();
        e = new f();
        f = false;
        g = false;
        k = new c(this);
    }

    static a a(b b1, a a1)
    {
        b1.a = a1;
        return a1;
    }

    public static b a()
    {
        if (j == null)
        {
            j = new b();
        }
        return j;
    }

    static void a(b b1)
    {
        (new com.kik.cards.web.iap.f(b1)).a(new Void[0]);
    }

    static Context b(b b1)
    {
        return b1.b;
    }

    static v c(b b1)
    {
        return b1.i;
    }

    static void d(b b1)
    {
        if (b1.h != null)
        {
            b1.h.c();
            b1.h = null;
        }
    }

    static boolean e(b b1)
    {
        b1.g = false;
        return false;
    }

    static a f(b b1)
    {
        return b1.a;
    }

    public final void a(Context context, kik.a.e.f f1, v v)
    {
        b = context;
        c = f1;
        i = v;
        h = b();
    }

    public final ar b()
    {
        if (g) goto _L2; else goto _L1
_L1:
        Context context;
        g = true;
        context = b;
        if (context != null && !f) goto _L4; else goto _L3
_L3:
        e.a();
        e.a(c.b(), l);
        e.a(d.d(), new e(this));
_L2:
        return d.f();
_L4:
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        Object obj = context.getPackageManager().queryIntentServices(intent, 0);
        if (obj != null && ((List) (obj)).size() == 1)
        {
            obj = new ComponentName(((ResolveInfo)((List) (obj)).get(0)).serviceInfo.packageName, ((ResolveInfo)((List) (obj)).get(0)).serviceInfo.name);
            intent.setPackage("com.android.vending");
            intent.setComponent(((ComponentName) (obj)));
            context.bindService(intent, k, 1);
            f = true;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final a c()
    {
        return a;
    }

    public final void d()
    {
        while (!f || a == null || k == null || b == null) 
        {
            return;
        }
        b.unbindService(k);
        f = false;
    }
}
