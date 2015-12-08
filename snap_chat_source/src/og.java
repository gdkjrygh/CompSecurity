// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.api2.cash.square.data.CardBrand;
import com.snapchat.android.api2.cash.square.data.CashCustomer;

public final class og
    implements nh
{

    private final op mCardSummary;
    private final CashCustomer mCashCustomer;
    private final oq mCashCustomerStatus;

    public og(oq oq1)
    {
        mCashCustomerStatus = oq1;
        mCashCustomer = oq1.mCustomer;
        mCardSummary = oq1.mCardSummary;
    }

    public final boolean a()
    {
        return mCardSummary != null;
    }

    public final boolean b()
    {
        return mCashCustomerStatus.mPasswordConfirmationEnabled;
    }

    public final boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mCashCustomerStatus != null)
        {
            flag = flag1;
            if (mCashCustomerStatus.mNumberOfPayments > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final CardBrand d()
    {
        if (mCardSummary != null)
        {
            return mCardSummary.mBrand;
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        if (mCardSummary != null)
        {
            return mCardSummary.mPanSuffix;
        } else
        {
            return null;
        }
    }
}
