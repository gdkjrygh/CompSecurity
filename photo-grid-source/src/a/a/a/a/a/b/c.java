// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.a.f.d;
import a.a.a.a.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

// Referenced classes of package a.a.a.a.a.b:
//            b, e, i, f, 
//            d

final class c
{

    private final Context a;
    private final a.a.a.a.a.f.c b;

    public c(Context context)
    {
        a = context.getApplicationContext();
        b = new d(context, "TwitterAdvertisingInfoPreferences");
    }

    static b a(c c1)
    {
        return c1.b();
    }

    private void a(b b1)
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

    static void a(c c1, b b1)
    {
        c1.a(b1);
    }

    private b b()
    {
        b b1 = (new e(a)).a();
        if (!b(b1))
        {
            b1 = (new a.a.a.a.a.b.f(a)).a();
            if (!b(b1))
            {
                f.d();
                return b1;
            } else
            {
                f.d();
                return b1;
            }
        } else
        {
            f.d();
            return b1;
        }
    }

    private static boolean b(b b1)
    {
        return b1 != null && !TextUtils.isEmpty(b1.a);
    }

    public final b a()
    {
        b b1 = new b(b.a().getString("advertising_id", ""), b.a().getBoolean("limit_ad_tracking_enabled", false));
        if (b(b1))
        {
            f.d();
            (new Thread(new a.a.a.a.a.b.d(this, b1))).start();
            return b1;
        } else
        {
            b b2 = b();
            a(b2);
            return b2;
        }
    }
}
