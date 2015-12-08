// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.content.Context;
import android.os.SystemClock;

public class cwx extends cwo
{

    private nff a;

    public cwx()
    {
        super(cwx.getSimpleName());
    }

    public static void a(Context context, long l, boolean flag)
    {
        ((AlarmManager)context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + l, cwv.a(context, flag));
    }

    protected final cwu a()
    {
        getSystemService("power");
        bma bma1 = bpe.a(this).a;
        noj noj1 = (noj)olm.a(this, noj);
        bnl bnl1 = (bnl)olm.a(this, bnl);
        cwy cwy = cwv.a(bnl1);
        cwn cwn1 = (cwn)olm.a(this, cwn);
        com.google.android.apps.moviemaker.app.ApplicationEnabler applicationenabler = bma1.m();
        bin.a(this);
        return new cwv(this, cwn1, applicationenabler, (bju)olm.a(this, bju), cwy, a, (nnr)olm.a(this, nnr), bma1.i(), noj1, new bpg(bnl1));
    }

    public void onCreate()
    {
        bpe.a(this);
        a = ((cit)olm.a(this, cit)).a("PluggedInLog");
        super.onCreate();
    }

    public void onDestroy()
    {
        b.a(a);
        super.onDestroy();
    }
}
