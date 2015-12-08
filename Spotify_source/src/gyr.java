// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class gyr
{

    public final hbd a;
    private final Context b;

    public gyr(Context context)
    {
        b = context.getApplicationContext();
        a = new hbe(context, "TwitterAdvertisingInfoPreferences");
    }

    public static boolean b(gyq gyq1)
    {
        return gyq1 != null && !TextUtils.isEmpty(gyq1.a);
    }

    public final gyq a()
    {
        gyq gyq1 = (new gys(b)).a();
        if (!b(gyq1))
        {
            gyq1 = (new gyt(b)).a();
            if (!b(gyq1))
            {
                gya.a().a("Fabric", "AdvertisingInfo not present");
                return gyq1;
            } else
            {
                gya.a().a("Fabric", "Using AdvertisingInfo from Service Provider");
                return gyq1;
            }
        } else
        {
            gya.a().a("Fabric", "Using AdvertisingInfo from Reflection Provider");
            return gyq1;
        }
    }

    public final void a(gyq gyq1)
    {
        if (b(gyq1))
        {
            a.a(a.b().putString("advertising_id", gyq1.a).putBoolean("limit_ad_tracking_enabled", gyq1.b));
            return;
        } else
        {
            a.a(a.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
            return;
        }
    }

    // Unreferenced inner class gyr$1

/* anonymous class */
    public final class _cls1 extends gyy
    {

        private gyq a;
        private gyr b;

        public final void a()
        {
            gyq gyq1 = b.a();
            if (!a.equals(gyq1))
            {
                gya.a().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                b.a(gyq1);
            }
        }

            public 
            {
                b = gyr.this;
                a = gyq1;
                super();
            }
    }

}
