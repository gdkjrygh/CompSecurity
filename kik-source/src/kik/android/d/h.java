// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.d;

import android.content.Context;
import android.content.SharedPreferences;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.util.ar;

// Referenced classes of package kik.android.d:
//            b, d

final class h extends kik.android.d.b
{

    final d a;

    h(d d1, Context context, String s, Boolean boolean1, Boolean aboolean[], ar ar1)
    {
        a = d1;
        super(context, s, boolean1, aboolean, null, ar1);
    }

    public final int a()
    {
        return kik.android.d.b.a.b;
    }

    protected final void a(ar ar1)
    {
    }

    public final boolean a(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            KikApplication.i().d();
        } else
        {
            KikApplication.i().e();
        }
        return true;
    }

    public final Object b()
    {
        return Boolean.valueOf(KikApplication.i().f());
    }

    protected final Object b(ar ar1)
    {
        boolean flag = true;
        if (d.a(a).c().getInt("BatchModifiableTracker.batchSizeToUse", 0) != 1)
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }
}
