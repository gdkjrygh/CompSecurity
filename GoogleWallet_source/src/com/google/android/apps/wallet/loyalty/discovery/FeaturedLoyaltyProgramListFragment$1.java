// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import com.google.common.collect.Ordering;
import java.text.Collator;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            FeaturedLoyaltyProgramListFragment

final class this._cls0 extends Ordering
{

    final FeaturedLoyaltyProgramListFragment this$0;

    private int compare(com.google.wallet.proto.api.Program program, com.google.wallet.proto.api.Program program1)
    {
        return FeaturedLoyaltyProgramListFragment.access$000(FeaturedLoyaltyProgramListFragment.this).compare(getMerchantName(program), getMerchantName(program1));
    }

    private static String getMerchantName(com.google.wallet.proto.api.Program program)
    {
        if (program.nativeRenderingInfo != null && program.nativeRenderingInfo.merchantName != null)
        {
            return program.nativeRenderingInfo.merchantName;
        } else
        {
            return "";
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((com.google.wallet.proto.api.Program)obj, (com.google.wallet.proto.api.Program)obj1);
    }

    ngInfo()
    {
        this$0 = FeaturedLoyaltyProgramListFragment.this;
        super();
    }
}
