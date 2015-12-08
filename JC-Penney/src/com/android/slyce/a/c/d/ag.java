// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;

// Referenced classes of package com.android.slyce.a.c.d:
//            ad, j

class ag
    implements e
{

    final ad a;

    ag(ad ad1)
    {
        a = ad1;
        super();
    }

    public void a(am am, aj aj1)
    {
        int i = Math.min(aj1.d(), a.d);
        am = aj1;
        if (i < aj1.d())
        {
            aj1.a(a.g, i);
            am = a.g;
        }
        aj1 = a;
        aj1.d = ((ad) (aj1)).d - i;
        aj1 = com.android.slyce.a.c.d.ad.e(a);
        boolean flag;
        if (a.d == 0 && a.f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aj1.a(flag, a.e, am);
        if (a.d == 0)
        {
            ad.f(a);
        }
    }
}
