// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.d;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            b, d, f, e, 
//            h

final class c
{

    final io.fabric.sdk.android.services.c.c a;
    private final Context b;

    public c(Context context)
    {
        b = context.getApplicationContext();
        a = new d(context, "TwitterAdvertisingInfoPreferences");
    }

    static boolean b(b b1)
    {
        return b1 != null && !TextUtils.isEmpty(b1.a);
    }

    final b a()
    {
        b b1 = (new io.fabric.sdk.android.services.common.d(b)).a();
        if (!b(b1))
        {
            b1 = (new e(b)).a();
            if (!b(b1))
            {
                io.fabric.sdk.android.c.a().a("Fabric", "AdvertisingInfo not present");
                return b1;
            } else
            {
                io.fabric.sdk.android.c.a().a("Fabric", "Using AdvertisingInfo from Service Provider");
                return b1;
            }
        } else
        {
            io.fabric.sdk.android.c.a().a("Fabric", "Using AdvertisingInfo from Reflection Provider");
            return b1;
        }
    }

    final void a(b b1)
    {
        if (b(b1))
        {
            a.a(a.b().putString("advertising_id", b1.a).putBoolean("limit_ad_tracking_enabled", b1.b));
            return;
        } else
        {
            a.a(a.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
            return;
        }
    }

    // Unreferenced inner class io/fabric/sdk/android/services/common/c$1

/* anonymous class */
    final class _cls1 extends h
    {

        final b a;
        final c b;

        public final void a()
        {
            b b1 = b.a();
            if (!a.equals(b1))
            {
                io.fabric.sdk.android.c.a().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                b.a(b1);
            }
        }

            
            {
                b = c.this;
                a = b1;
                super();
            }
    }

}
