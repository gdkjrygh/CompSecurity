// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.api.ApiResponse;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            PurchaseStatus

final class _cls9
    implements f
{

    public final PurchaseStatus call(ApiResponse apiresponse)
    {
        if (apiresponse.isSuccess())
        {
            return PurchaseStatus.PENDING;
        } else
        {
            return PurchaseStatus.UPDATE_FAIL;
        }
    }

    public final volatile Object call(Object obj)
    {
        return call((ApiResponse)obj);
    }

    _cls9()
    {
    }
}
