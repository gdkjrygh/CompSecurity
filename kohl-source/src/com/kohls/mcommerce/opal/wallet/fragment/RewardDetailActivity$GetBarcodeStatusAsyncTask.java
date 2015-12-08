// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.widget.ProgressBar;
import com.kohls.mcommerce.opal.wallet.asynctask.BaseAsyncTask;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.KohlsCash;
import com.kohls.mcommerce.opal.wallet.rest.containers.RewardInformation;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            RewardDetailActivity

public class mContext extends BaseAsyncTask
{

    private Context mContext;
    final RewardDetailActivity this$0;

    protected transient RewardInformation doInBackground(RewardInformation arewardinformation[])
    {
        arewardinformation = arewardinformation[0];
        WalletResponse walletresponse = (new WalletService(new WeakReference(mContext))).getWallentByLookup(arewardinformation.getKohlsCash().getKohlsCashNumber());
        if (arewardinformation.getKohlsCash() != null)
        {
            if (Long.parseLong(arewardinformation.getKohlsCash().getEffectiveEndDate()) + 0x5265c00L < System.currentTimeMillis())
            {
                arewardinformation.getKohlsCash().setBarcodeStatus(7);
            } else
            if (walletresponse != null && walletresponse.isSuccess() && walletresponse.getWalletItems().size() > 0)
            {
                if (Double.parseDouble(((WalletItemResponse)walletresponse.getWalletItems().get(0)).getValue()) <= 0.0D)
                {
                    arewardinformation.getKohlsCash().setBarcodeStatus(6);
                    return arewardinformation;
                } else
                {
                    arewardinformation.getKohlsCash().setBarcodeStatus(4);
                    return arewardinformation;
                }
            }
        }
        return arewardinformation;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((RewardInformation[])aobj);
    }

    protected void onPostExecute(RewardInformation rewardinformation)
    {
        super.onPostExecute(rewardinformation);
        setUpViewForPage(rewardinformation);
        ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(8);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((RewardInformation)obj);
    }

    protected void onPreExecute()
    {
        ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(0);
        super.onPreExecute();
    }

    public (Context context)
    {
        this$0 = RewardDetailActivity.this;
        super(context);
        mContext = context;
    }
}
