// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class bij extends chf
    implements ServiceConnection
{

    private boolean a;
    private Context b;
    private int c;
    private Intent d;
    private bii e;
    private String f;
    private bie g;

    public bij(Context context, String s, boolean flag, int i, Intent intent, bii bii)
    {
        a = false;
        f = s;
        c = i;
        d = intent;
        a = flag;
        b = context;
        e = bii;
    }

    public final boolean a()
    {
        return a;
    }

    public final String b()
    {
        return f;
    }

    public final Intent c()
    {
        return d;
    }

    public final int d()
    {
        return c;
    }

    public final void e()
    {
        bkv.o();
        int i = bim.a(d);
        if (c != -1 || i != 0)
        {
            return;
        } else
        {
            g = new bie(b);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            bto.a();
            bto.b(b, intent, this, 1);
            return;
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        bka.c("In-app billing service connected.");
        g.a(ibinder);
        bkv.o();
        componentname = bim.b(d);
        bkv.o();
        componentname = bim.b(componentname);
        if (componentname == null)
        {
            return;
        }
        if (g.a(b.getPackageName(), componentname) == 0)
        {
            bik.a(b).a(e);
        }
        bto.a();
        bto.a(b, this);
        g.a = null;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        bka.c("In-app billing service disconnected.");
        g.a = null;
    }
}
