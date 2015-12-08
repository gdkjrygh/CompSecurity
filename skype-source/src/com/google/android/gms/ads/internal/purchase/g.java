// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.stats.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            i, b, h, f

public final class g extends com.google.android.gms.internal.eq.a
    implements ServiceConnection
{

    com.google.android.gms.ads.internal.purchase.b a;
    private boolean b;
    private Context c;
    private int d;
    private Intent e;
    private f f;
    private String g;

    public g(Context context, String s, boolean flag, int j, Intent intent, f f1)
    {
        b = false;
        g = s;
        d = j;
        e = intent;
        b = flag;
        c = context;
        f = f1;
    }

    public final boolean a()
    {
        return b;
    }

    public final String b()
    {
        return g;
    }

    public final Intent c()
    {
        return e;
    }

    public final int d()
    {
        return d;
    }

    public final void e()
    {
        p.o();
        int j = i.a(e);
        if (d != -1 || j != 0)
        {
            return;
        } else
        {
            a = new com.google.android.gms.ads.internal.purchase.b(c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.b.a().a(c, intent, this, 1);
            return;
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        com.google.android.gms.ads.internal.util.client.b.b("In-app billing service connected.");
        a.a(ibinder);
        p.o();
        componentname = com.google.android.gms.ads.internal.purchase.i.b(e);
        p.o();
        componentname = com.google.android.gms.ads.internal.purchase.i.b(componentname);
        if (componentname == null)
        {
            return;
        }
        if (a.a(c.getPackageName(), componentname) == 0)
        {
            h.a(c).a(f);
        }
        com.google.android.gms.common.stats.b.a().a(c, this);
        a.a = null;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.b.b("In-app billing service disconnected.");
        a.a = null;
    }
}
