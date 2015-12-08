// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            AvailableProducts

final class oduct
    implements f
{

    public final oduct call(AvailableProducts availableproducts)
    {
        for (availableproducts = availableproducts.products.iterator(); availableproducts.hasNext();)
        {
            oduct oduct = (oduct)availableproducts.next();
            if (oduct.planId.equals("mid_tier"))
            {
                return oduct;
            }
        }

        return com.soundcloud.android.payments.oduct.empty();
    }

    public final volatile Object call(Object obj)
    {
        return call((AvailableProducts)obj);
    }

    oduct()
    {
    }
}
