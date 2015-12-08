// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.ao;
import java.nio.ByteOrder;

// Referenced classes of package com.android.slyce.a.c.d:
//            ad

class af
    implements e
{

    final ad a;

    af(ad ad1)
    {
        a = ad1;
        super();
    }

    public void a(am am1, aj aj1)
    {
        boolean flag1 = true;
        aj1.a(ByteOrder.BIG_ENDIAN);
        a.a = aj1.f();
        a.b = aj1.f();
        boolean flag;
        if ((a.a & 0x80000000) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.c = (a.b & 0xff000000) >>> 24;
        a.d = a.b & 0xffffff;
        if (!flag)
        {
            a.e = a.a & 0x7fffffff;
            aj1 = a;
            if ((a.c & 1) == 0)
            {
                flag1 = false;
            }
            aj1.f = flag1;
            am1.a(ad.a(a));
            if (a.d == 0)
            {
                ad.a(a).a(am1, ad.b(a));
            }
            return;
        } else
        {
            ad.d(a).a(a.d, ad.c(a));
            return;
        }
    }
}
