// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.app.Activity;
import b.a.a.a.a.g.s;
import b.a.a.a.a.g.v;
import b.a.a.a.f;

// Referenced classes of package com.a.a:
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
        Activity activity = a.x().a();
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
