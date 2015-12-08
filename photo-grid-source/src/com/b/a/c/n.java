// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.g.s;
import a.a.a.a.a.g.v;
import a.a.a.a.f;
import android.app.Activity;

// Referenced classes of package com.b.a.c:
//            h

final class n
    implements s
{

    final h a;

    n(h h1)
    {
        a = h1;
        super();
    }

    public final Object a(v v1)
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
                    flag = h.a(a, activity, v1.c);
                }
            }
        }
        return Boolean.valueOf(flag);
    }
}
