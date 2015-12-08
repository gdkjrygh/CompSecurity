// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import android.content.Context;
import android.content.SharedPreferences;
import kik.android.util.DeviceUtils;
import kik.android.util.ar;

// Referenced classes of package kik.android.d:
//            b

public class l extends b
{

    boolean c;

    public l(Context context, String s, String s1, String as[], Runnable runnable, ar ar1)
    {
        super(context, s, s1, as, runnable, ar1);
        c = true;
    }

    public final int a()
    {
        return b.a.a;
    }

    public final void a(ar ar1)
    {
        if (c && !DeviceUtils.d(c()))
        {
            return;
        } else
        {
            ar1 = ar1.a("KikConfigurations").edit();
            ar1.putString(d(), (String)b());
            ar1.commit();
            return;
        }
    }

    protected final Object b(ar ar1)
    {
        if (c && !DeviceUtils.d(c()))
        {
            return (String)e();
        } else
        {
            return ar1.a("KikConfigurations").getString(d(), (String)e());
        }
    }
}
