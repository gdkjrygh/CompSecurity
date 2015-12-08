// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;
import com.picksinit.ClickAdFinishListener;
import com.picksinit.goGp;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            n

final class p
    implements ClickAdFinishListener
{

    final n a;

    p(n n1)
    {
        a = n1;
        super();
    }

    public final void onClickFinish(goGp gogp)
    {
        b.a("CMPicksNativeAd", "stopLoading V");
        n.e(a);
        b.a("CMPicksNativeAd", (new StringBuilder("currentStatus=")).append(n.f(a)).toString());
        boolean flag;
        if (a.b == null)
        {
            if (a.k)
            {
                if (!a.b(a.i))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
        } else
        {
            com.cmcm.a.a.b b1 = a.b;
            a.p();
            flag = b1.a();
        }
        a.k = false;
        if (gogp != null && !flag)
        {
            b.a("CMPicksNativeAd", (new StringBuilder("is ignore view :")).append(a.l).append(",view has exist:").append(n.d(a)).toString());
            if (a.l || n.d(a))
            {
                gogp.goGp(a.i);
            }
        }
    }
}
