// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            AdvertisingInfo, AdvertisingInfoStrategy, AdvertisingInfoReflectionStrategy, AdvertisingInfoServiceStrategy, 
//            BackgroundPriorityRunnable

class AdvertisingInfoProvider
{

    private final Context a;
    private final PreferenceStore b;

    public AdvertisingInfoProvider(Context context)
    {
        a = context.getApplicationContext();
        b = new PreferenceStoreImpl(context, "TwitterAdvertisingInfoPreferences");
    }

    static AdvertisingInfo a(AdvertisingInfoProvider advertisinginfoprovider)
    {
        return advertisinginfoprovider.e();
    }

    private void a(AdvertisingInfo advertisinginfo)
    {
        (new Thread(new BackgroundPriorityRunnable(advertisinginfo) {

            final AdvertisingInfo a;
            final AdvertisingInfoProvider b;

            public void a()
            {
                AdvertisingInfo advertisinginfo1 = AdvertisingInfoProvider.a(b);
                if (!a.equals(advertisinginfo1))
                {
                    Fabric.g().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    AdvertisingInfoProvider.a(b, advertisinginfo1);
                }
            }

            
            {
                b = AdvertisingInfoProvider.this;
                a = advertisinginfo;
                super();
            }
        })).start();
    }

    static void a(AdvertisingInfoProvider advertisinginfoprovider, AdvertisingInfo advertisinginfo)
    {
        advertisinginfoprovider.b(advertisinginfo);
    }

    private void b(AdvertisingInfo advertisinginfo)
    {
        if (c(advertisinginfo))
        {
            b.a(b.b().putString("advertising_id", advertisinginfo.a).putBoolean("limit_ad_tracking_enabled", advertisinginfo.b));
            return;
        } else
        {
            b.a(b.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
            return;
        }
    }

    private boolean c(AdvertisingInfo advertisinginfo)
    {
        return advertisinginfo != null && !TextUtils.isEmpty(advertisinginfo.a);
    }

    private AdvertisingInfo e()
    {
        AdvertisingInfo advertisinginfo = c().a();
        if (!c(advertisinginfo))
        {
            advertisinginfo = d().a();
            if (!c(advertisinginfo))
            {
                Fabric.g().a("Fabric", "AdvertisingInfo not present");
                return advertisinginfo;
            } else
            {
                Fabric.g().a("Fabric", "Using AdvertisingInfo from Service Provider");
                return advertisinginfo;
            }
        } else
        {
            Fabric.g().a("Fabric", "Using AdvertisingInfo from Reflection Provider");
            return advertisinginfo;
        }
    }

    public AdvertisingInfo a()
    {
        AdvertisingInfo advertisinginfo = b();
        if (c(advertisinginfo))
        {
            Fabric.g().a("Fabric", "Using AdvertisingInfo from Preference Store");
            a(advertisinginfo);
            return advertisinginfo;
        } else
        {
            AdvertisingInfo advertisinginfo1 = e();
            b(advertisinginfo1);
            return advertisinginfo1;
        }
    }

    protected AdvertisingInfo b()
    {
        return new AdvertisingInfo(b.a().getString("advertising_id", ""), b.a().getBoolean("limit_ad_tracking_enabled", false));
    }

    public AdvertisingInfoStrategy c()
    {
        return new AdvertisingInfoReflectionStrategy(a);
    }

    public AdvertisingInfoStrategy d()
    {
        return new AdvertisingInfoServiceStrategy(a);
    }
}
