// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.TelephonyManager;

public class gnw
    implements dmx
{

    public static final gip a = gip.a("tmw_device_legacy_id");
    private static gip d = gip.a("mccmnc_network_operator_override");
    private static gip e = gip.a("mccmnc_sim_operator_override");
    private static gip f = gip.a("imsi_override");
    public gin b;
    public TelephonyManager c;

    public gnw(gin gin1, TelephonyManager telephonymanager)
    {
        b = gin1;
        c = telephonymanager;
        if (!b.f(d) || !b.f(f) || !b.f(e))
        {
            b.b().a(d).a(e).a(f).a();
        }
    }

    public static dna a(Context context, giq giq)
    {
        return new dna(context, giq) {

            private Context a;
            private giq b;

            public final Object a()
            {
                TelephonyManager telephonymanager = (TelephonyManager)a.getSystemService("phone");
                return new gnw(b.a(a), telephonymanager);
            }

            
            {
                a = context;
                b = giq1;
                super();
            }
        };
    }

}
