// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.Context;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            AbstractCache, Appconfig

public class RewardCache extends AbstractCache
{

    private RewardCache()
    {
    }

    public static void clear(Context context)
    {
        clear(context, Appconfig.WALLET_LOYALTY_REWARD_CACHE);
    }

    public static void commit(Context context, Object obj)
    {
        commit(context, Appconfig.WALLET_LOYALTY_REWARD_CACHE, obj);
    }

    public static LoyaltyProfileResponse get(Context context)
    {
        return (LoyaltyProfileResponse)get(context, Appconfig.WALLET_LOYALTY_REWARD_CACHE, com/kohls/mcommerce/opal/wallet/rest/containers/LoyaltyProfileResponse);
    }
}
