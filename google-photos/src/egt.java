// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;

final class egt extends zc
    implements egp, lyn, nuc
{

    final lyl a;
    private final Context b;
    private final lyo c;
    private final nud d = new ntz(this);
    private boolean e;

    egt(Context context, lyl lyl1, lyo lyo1)
    {
        e = false;
        b = context;
        a = lyl1;
        c = lyo1;
    }

    public final nud a()
    {
        return d;
    }

    public final boolean b()
    {
        return e;
    }

    public final void c()
    {
        e = true;
        d.b();
    }

    public final void c(zb zb, zk zk1)
    {
        super.c(zb, zk1);
        zb = a.a(zk1.n);
        zk1 = b.getPackageName();
        zk1 = b.getPackageManager().getLaunchIntentForPackage(zk1);
        zk1 = PendingIntent.getActivity(b, 0, zk1, 0);
        a.a(b, "96084372", zb, c.a(zk1).a(), this);
    }

    public final void d()
    {
        e = false;
        d.b();
    }

    public final void d(zb zb, zk zk1)
    {
        super.d(zb, zk1);
        e = false;
        d.b();
    }
}
