// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModel

public class PaymentCardModelEvent
{

    private final Exception mFailureCause;
    private final PaymentCardModel mModel;

    public PaymentCardModelEvent(PaymentCardModel paymentcardmodel, Exception exception)
    {
        mModel = paymentcardmodel;
        mFailureCause = exception;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PaymentCardModelEvent))
            {
                return false;
            }
            obj = (PaymentCardModelEvent)obj;
            if (!Objects.equal(mFailureCause, ((PaymentCardModelEvent) (obj)).mFailureCause) || !Objects.equal(mModel, ((PaymentCardModelEvent) (obj)).mModel))
            {
                return false;
            }
        }
        return true;
    }

    public final Exception getFailureCause()
    {
        return mFailureCause;
    }

    public final PaymentCardModel getModel()
    {
        return mModel;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            mModel, mFailureCause
        });
    }
}
