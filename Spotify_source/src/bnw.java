// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

public final class bnw extends bnd
{

    boolean a;
    boolean b;
    private AlarmManager c;

    protected bnw(bnf bnf1)
    {
        super(bnf1);
        c = (AlarmManager)super.f.a.getSystemService("alarm");
    }

    private PendingIntent d()
    {
        Intent intent = new Intent(super.f.a, blo);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(super.f.a, 0, intent, 0);
    }

    protected final void a()
    {
        ActivityInfo activityinfo;
        try
        {
            c.cancel(d());
            if (bns.e() <= 0L)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            activityinfo = super.f.a.getPackageManager().getReceiverInfo(new ComponentName(super.f.a, blo), 2);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return;
        }
        if (activityinfo == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (activityinfo.enabled)
        {
            b("Receiver registered. Using alarm for local dispatch.");
            a = true;
        }
    }

    public final void b()
    {
        m();
        btl.a(a, "Receiver not registered");
        long l = bns.e();
        if (l > 0L)
        {
            c();
            long l1 = super.f.c.b();
            b = true;
            c.setInexactRepeating(2, l1 + l, 0L, d());
        }
    }

    public final void c()
    {
        m();
        b = false;
        c.cancel(d());
    }
}
