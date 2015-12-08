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

public final class jsj extends jsw
{

    boolean a;
    boolean b;
    private AlarmManager c;

    protected jsj(jrk jrk)
    {
        super(jrk);
        c = (AlarmManager)h().getSystemService("alarm");
    }

    private PendingIntent d()
    {
        Intent intent = new Intent(h(), jqf);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(h(), 0, intent, 0);
    }

    protected final void a()
    {
        ActivityInfo activityinfo;
        try
        {
            c.cancel(d());
            if (jsh.e() <= 0L)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            activityinfo = h().getPackageManager().getReceiverInfo(new ComponentName(h(), jqf), 2);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return;
        }
        if (activityinfo == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (activityinfo.enabled)
        {
            b("Receiver registered. Using alarm for local dispatch.");
            a = true;
        }
    }

    public final void b()
    {
        r();
        b.a(a, "Receiver not registered");
        long l = jsh.e();
        if (l > 0L)
        {
            c();
            long l1 = g().b();
            b = true;
            c.setInexactRepeating(2, l1 + l, 0L, d());
        }
    }

    public final void c()
    {
        r();
        b = false;
        c.cancel(d());
    }
}
