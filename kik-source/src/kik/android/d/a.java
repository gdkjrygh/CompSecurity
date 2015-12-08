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

public final class a extends b
{

    boolean a;

    public a(Context context, String s, boolean flag, Runnable runnable, ar ar1)
    {
        super(context, s, Boolean.valueOf(flag), new Boolean[] {
            Boolean.valueOf(true), Boolean.valueOf(false)
        }, runnable, ar1);
        a = true;
    }

    public final int a()
    {
        return b.a.b;
    }

    public final void a(ar ar1)
    {
        if (a && !DeviceUtils.d(c()))
        {
            return;
        } else
        {
            ar1 = ar1.a("KikConfigurations").edit();
            ar1.putBoolean(d(), ((Boolean)b()).booleanValue());
            ar1.commit();
            return;
        }
    }

    protected final Object b(ar ar1)
    {
        if (a && !DeviceUtils.d(c()))
        {
            return (Boolean)e();
        } else
        {
            return Boolean.valueOf(ar1.a("KikConfigurations").getBoolean(d(), ((Boolean)e()).booleanValue()));
        }
    }
}
