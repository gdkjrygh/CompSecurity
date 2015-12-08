// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.measurement.AppMeasurementService;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, ac, u, c, 
//            h, ab, w, z, 
//            j

public final class e extends af
{

    private boolean a;
    private final AlarmManager b = (AlarmManager)super.i().getSystemService("alarm");

    protected e(ac ac)
    {
        super(ac);
    }

    private PendingIntent o()
    {
        Intent intent = new Intent(super.i(), com/google/android/gms/measurement/AppMeasurementReceiver);
        intent.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(super.i(), 0, intent, 0);
    }

    protected final void a()
    {
        b.cancel(o());
    }

    public final void a(long l1)
    {
        t();
        long l2;
        boolean flag;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag);
        u.a(AppMeasurementReceiver.a(super.i()), "Receiver not registered/enabled");
        u.a(AppMeasurementService.a(super.i()), "Service not registered/enabled");
        b();
        l2 = super.h().b();
        a = true;
        b.setInexactRepeating(2, l2 + l1, 0x5265c00L, o());
    }

    public final void b()
    {
        t();
        a = false;
        b.cancel(o());
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile com.google.android.gms.measurement.internal.u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }
}
