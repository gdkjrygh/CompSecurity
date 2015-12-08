// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.content.LocalBroadcastManager;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ZxingScannerActivity

private class <init> extends AsyncTask
{

    ProgressDialog progressDialog;
    final ZxingScannerActivity this$0;
    List walletId;

    protected transient WalletResponse doInBackground(List alist[])
    {
        if (alist != null && alist.length > 0 && alist[0] != null)
        {
            walletId = alist[0];
            if (alist[0] != null)
            {
                return (new WalletService(new WeakReference(getApplicationContext()))).addWalletItems(alist[0], false);
            }
        } else
        if (ZxingScannerActivity.access$200(ZxingScannerActivity.this) != null)
        {
            return (new WalletService(new WeakReference(getApplicationContext()))).addWalletItems(ZxingScannerActivity.access$200(ZxingScannerActivity.this), false);
        }
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((List[])aobj);
    }

    protected void onPostExecute(WalletResponse walletresponse)
    {
        super.onPostExecute(walletresponse);
        progressDialog.dismiss();
        if (walletresponse == null || !walletresponse.isSuccess()) goto _L2; else goto _L1
_L1:
        Intent intent;
        intent = new Intent("signin_page");
        intent.putExtra("createwallet", "createwallet");
        if (ZxingScannerActivity.access$300(ZxingScannerActivity.this) || !((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("offer")) goto _L4; else goto _L3
_L3:
        intent.putExtra("position", Constants.POSITION_OF_OFFERS_TAB_IN_WALLET);
_L6:
        Iterator iterator;
        WalletItemResponse walletitemresponse;
        boolean flag;
        boolean flag1;
        if (walletId == null)
        {
            if (ZxingScannerActivity.access$400(ZxingScannerActivity.this) != null)
            {
                ArrayList arraylist = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                arraylist.addAll(ZxingScannerActivity.access$400(ZxingScannerActivity.this));
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(arraylist);
            }
        } else
        {
            ArrayList arraylist1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
            for (Iterator iterator1 = walletId.iterator(); iterator1.hasNext(); arraylist1.add(((WalletItemResponse)iterator1.next()).getId())) { }
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(arraylist1);
        }
        OmnitureMeasurement.getInstance().walletScan();
        if (walletresponse.getAddedItems() != null && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equalsIgnoreCase("kohlscash"))
        {
            AnalyticsHelper.sendAnalyticsOnWalletKohlsCashAdded();
        } else
        if (walletresponse.getAddedItems() != null && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equalsIgnoreCase("offers"))
        {
            AnalyticsHelper.sendAnalyticsOnWalletDiscountAdded();
        } else
        {
            AnalyticsHelper.sendAnalyticsOnGiftCardAdded();
        }
        intent.putExtra("notificationId", System.currentTimeMillis());
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        ZxingScannerActivity.access$500(ZxingScannerActivity.this);
        return;
_L4:
        if (!ZxingScannerActivity.access$300(ZxingScannerActivity.this) && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("giftcard") || !ZxingScannerActivity.access$300(ZxingScannerActivity.this) && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("kmrc"))
        {
            intent.putExtra("position", Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET);
        } else
        if (!ZxingScannerActivity.access$300(ZxingScannerActivity.this))
        {
            intent.putExtra("position", Constants.POSITION_OF_CASH_TAB_IN_WALLET);
        } else
        {
            flag = false;
            flag1 = false;
            iterator = walletresponse.getAddedItems().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                walletitemresponse = (WalletItemResponse)iterator.next();
                if (walletitemresponse.getTypeCode().equals("kohlscash"))
                {
                    flag = true;
                } else
                if (walletitemresponse.getTypeCode().equals("giftcard") || walletitemresponse.getTypeCode().equals("kmrc"))
                {
                    flag1 = true;
                }
            } while (true);
            if (flag)
            {
                intent.putExtra("position", Constants.POSITION_OF_CASH_TAB_IN_WALLET);
            } else
            if (flag1)
            {
                intent.putExtra("position", Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        ZxingScannerActivity.access$600(ZxingScannerActivity.this, walletresponse);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((WalletResponse)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(ZxingScannerActivity.this, "Adding Items", "Please wait");
    }

    private ()
    {
        this$0 = ZxingScannerActivity.this;
        super();
        walletId = null;
    }

    walletId(walletId walletid)
    {
        this();
    }
}
