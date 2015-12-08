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

public final class k extends b
{

    boolean a;

    public k(Context context, String s, Long long1, Long along[], Runnable runnable, ar ar1)
    {
        super(context, s, long1, along, runnable, ar1);
        a = true;
    }

    public final int a()
    {
        return b.a.c;
    }

    public final void a(ar ar1)
    {
        if (a && !DeviceUtils.d(c()))
        {
            return;
        } else
        {
            ar1 = ar1.a("KikConfigurations").edit();
            ar1.putLong(d(), ((Long)b()).longValue());
            ar1.commit();
            return;
        }
    }

    protected final Object b(ar ar1)
    {
        if (a && !DeviceUtils.d(c()))
        {
            return (Long)e();
        } else
        {
            return Long.valueOf(ar1.a("KikConfigurations").getLong(d(), ((Long)e()).longValue()));
        }
    }
}
