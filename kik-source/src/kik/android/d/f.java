// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import android.content.Context;
import android.content.SharedPreferences;
import kik.android.util.DeviceUtils;
import kik.android.util.ar;

// Referenced classes of package kik.android.d:
//            b, d

final class f extends b
{

    final d a;

    f(d d1, Context context, String s, Boolean boolean1, Boolean aboolean[], ar ar1)
    {
        a = d1;
        super(context, s, boolean1, aboolean, null, ar1);
    }

    public final int a()
    {
        return b.a.b;
    }

    protected final void a(ar ar1)
    {
    }

    public final boolean a(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            obj = d.a(a).c().edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("kik.version.number.eula", DeviceUtils.c(c()));
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        } else
        {
            obj = d.a(a).c().edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("kik.version.number.eula", 0);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        return true;
    }

    public final Object b()
    {
        boolean flag = false;
        if (d.a(a).c().getInt("kik.version.number.eula", 0) >= 45)
        {
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    protected final volatile Object b(ar ar1)
    {
        return null;
    }
}
