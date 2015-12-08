// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.content.Context;
import android.text.TextUtils;
import b.a.a.a.a.f.d;

// Referenced classes of package b.a.a.a.a.b:
//            b, e, g, f

final class c
{

    final b.a.a.a.a.f.c a;
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
        b b1 = (new e(b)).a();
        if (!b(b1))
        {
            b1 = (new f(b)).a();
            if (!b(b1))
            {
                b.a.a.a.d.a();
                return b1;
            } else
            {
                b.a.a.a.d.a();
                return b1;
            }
        } else
        {
            b.a.a.a.d.a();
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
}
