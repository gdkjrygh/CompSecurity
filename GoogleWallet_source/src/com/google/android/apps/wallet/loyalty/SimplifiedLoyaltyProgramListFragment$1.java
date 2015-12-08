// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.common.collect.Ordering;
import java.text.Collator;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            SimplifiedLoyaltyProgramListFragment

final class this._cls0 extends Ordering
{

    final SimplifiedLoyaltyProgramListFragment this$0;

    private int compare(com.google.wallet.proto.api.ogram ogram, com.google.wallet.proto.api.ogram ogram1)
    {
        return SimplifiedLoyaltyProgramListFragment.access$000(SimplifiedLoyaltyProgramListFragment.this).compare(getMerchantName(ogram), getMerchantName(ogram1));
    }

    private static String getMerchantName(com.google.wallet.proto.api.ogram ogram)
    {
        if (ogram.nativeRenderingInfo != null && ogram.nativeRenderingInfo.merchantName != null)
        {
            return ogram.nativeRenderingInfo.merchantName;
        } else
        {
            return "";
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((com.google.wallet.proto.api.ogram)obj, (com.google.wallet.proto.api.ogram)obj1);
    }

    eRenderingInfo()
    {
        this$0 = SimplifiedLoyaltyProgramListFragment.this;
        super();
    }
}
