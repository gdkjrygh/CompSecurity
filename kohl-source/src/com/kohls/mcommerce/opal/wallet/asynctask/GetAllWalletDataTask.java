// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.asynctask;

import android.content.Context;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.asynctask:
//            GetDataFromServerTask

public class GetAllWalletDataTask extends GetDataFromServerTask
{

    public GetAllWalletDataTask(Context context)
    {
        super(context);
    }

    public GetAllWalletDataTask(Context context, boolean flag)
    {
        super(context, flag);
    }

    private boolean hasLoyaltyKohlsCash(LoyaltyProfileResponse loyaltyprofileresponse)
    {
        return loyaltyprofileresponse != null && loyaltyprofileresponse.getProfile() != null && loyaltyprofileresponse.getProfile().getKohlsCashCoupons() != null && loyaltyprofileresponse.getProfile().getKohlsCashCoupons().size() > 0;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref();
        if (canAccessNetwork(true))
        {
            if (TextUtils.isEmpty(avoid))
            {
                getWalletData();
            } else
            {
                avoid = retrieveLoyaltyResponse(true, true);
                if (!hasLoyaltyKohlsCash(avoid))
                {
                    getWalletData();
                    return null;
                }
                addRewardsCashToWallet(avoid.getProfile().getKohlsCashCoupons());
                avoid = WalletCache.get(mContext.getApplicationContext(), "rpwallet");
                if (avoid == null || !avoid.isSuccess())
                {
                    getWalletData();
                    return null;
                }
            }
        }
        return null;
    }

    protected void doOnPostExecute()
    {
        ListenerManager.getInstance().broadcastListener("allwallet");
    }
}
