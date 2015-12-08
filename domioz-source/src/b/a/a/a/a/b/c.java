// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import b.a.a.a.a.f.b;
import b.a.a.a.f;
import b.a.a.a.q;

// Referenced classes of package b.a.a.a.a.b:
//            b, e, i, f, 
//            d

final class c
{

    private final Context a;
    private final b b;

    public c(Context context)
    {
        a = context.getApplicationContext();
        b = new b.a.a.a.a.f.c(context, "TwitterAdvertisingInfoPreferences");
    }

    static b.a.a.a.a.b.b a(c c1)
    {
        return c1.b();
    }

    private void a(b.a.a.a.a.b.b b1)
    {
        if (b(b1))
        {
            b.a(b.b().putString("advertising_id", b1.a).putBoolean("limit_ad_tracking_enabled", b1.b));
            return;
        } else
        {
            b.a(b.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
            return;
        }
    }

    static void a(c c1, b.a.a.a.a.b.b b1)
    {
        c1.a(b1);
    }

    private b.a.a.a.a.b.b b()
    {
        b.a.a.a.a.b.b b1 = (new e(a)).a();
        if (!b(b1))
        {
            b1 = (new b.a.a.a.a.b.f(a)).a();
            if (!b(b1))
            {
                f.c().a("Fabric", "AdvertisingInfo not present");
                return b1;
            } else
            {
                f.c().a("Fabric", "Using AdvertisingInfo from Service Provider");
                return b1;
            }
        } else
        {
            f.c().a("Fabric", "Using AdvertisingInfo from Reflection Provider");
            return b1;
        }
    }

    private static boolean b(b.a.a.a.a.b.b b1)
    {
        return b1 != null && !TextUtils.isEmpty(b1.a);
    }

    public final b.a.a.a.a.b.b a()
    {
        b.a.a.a.a.b.b b1 = new b.a.a.a.a.b.b(b.a().getString("advertising_id", ""), b.a().getBoolean("limit_ad_tracking_enabled", false));
        if (b(b1))
        {
            f.c().a("Fabric", "Using AdvertisingInfo from Preference Store");
            (new Thread(new d(this, b1))).start();
            return b1;
        } else
        {
            b.a.a.a.a.b.b b2 = b();
            a(b2);
            return b2;
        }
    }
}
