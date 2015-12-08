// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.app.Activity;
import b.a.a.a.a.g.t;
import b.a.a.a.d;

// Referenced classes of package com.a.a.c:
//            g

final class m
    implements b.a.a.a.a.g.q.b
{

    final g a;

    m(g g1)
    {
        a = g1;
        super();
    }

    public final Object a(t t1)
    {
        boolean flag1 = true;
        Activity activity = a.w().a();
        boolean flag = flag1;
        if (activity != null)
        {
            flag = flag1;
            if (!activity.isFinishing())
            {
                flag = flag1;
                if (a.r())
                {
                    flag = g.a(a, activity, t1.c);
                }
            }
        }
        return Boolean.valueOf(flag);
    }
}
