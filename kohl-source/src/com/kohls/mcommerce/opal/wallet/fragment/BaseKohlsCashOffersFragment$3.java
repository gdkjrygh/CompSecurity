// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import java.util.Comparator;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseKohlsCashOffersFragment

class this._cls0
    implements Comparator
{

    final BaseKohlsCashOffersFragment this$0;

    public int compare(WalletItemResponse walletitemresponse, WalletItemResponse walletitemresponse1)
    {
        if (walletitemresponse.getEffectiveEndDate().compareTo(walletitemresponse1.getEffectiveEndDate()) != 0)
        {
            return walletitemresponse.getEffectiveEndDate().compareTo(walletitemresponse1.getEffectiveEndDate());
        }
        return Double.valueOf(walletitemresponse.getValue()).doubleValue() < Double.valueOf(walletitemresponse1.getValue()).doubleValue() ? 1 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((WalletItemResponse)obj, (WalletItemResponse)obj1);
    }

    ()
    {
        this$0 = BaseKohlsCashOffersFragment.this;
        super();
    }
}
