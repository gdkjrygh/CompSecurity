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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ManualScanActivity

private class <init> extends AsyncTask
{

    ProgressDialog progressDialog;
    final ManualScanActivity this$0;
    List walletId;

    protected transient WalletResponse doInBackground(List alist[])
    {
        if (alist != null && alist.length > 0 && alist[0] != null)
        {
            walletId = alist[0];
            if (walletId.get(0) != null && ((WalletItemResponse)walletId.get(0)).getTypeCode().equalsIgnoreCase("giftcard") || walletId.get(0) != null && ((WalletItemResponse)walletId.get(0)).getTypeCode().equalsIgnoreCase("kmrc"))
            {
                return (new WalletService(new WeakReference(getApplicationContext()))).addWalletItems(walletId, false);
            }
            if (walletId != null)
            {
                alist = new HashSet(walletId);
                return (new WalletService(new WeakReference(getApplicationContext()))).addtoWallet(alist);
            }
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
        if (walletresponse != null && walletresponse.isSuccess())
        {
            Object obj = new Intent("signin_page");
            ((Intent) (obj)).putExtra("createwallet", "createwallet");
            if (walletresponse.getAddedItems() != null && walletresponse.getAddedItems().size() > 0 && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("offer"))
            {
                ((Intent) (obj)).putExtra("position", Constants.POSITION_OF_OFFERS_TAB_IN_WALLET);
            } else
            if (walletresponse.getAddedItems() != null && walletresponse.getAddedItems().size() > 0 && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("giftcard") || walletresponse.getAddedItems() != null && walletresponse.getAddedItems().size() > 0 && ((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode().equals("kmrc"))
            {
                ((Intent) (obj)).putExtra("position", Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET);
            } else
            {
                ((Intent) (obj)).putExtra("position", Constants.POSITION_OF_CASH_TAB_IN_WALLET);
            }
            LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(((Intent) (obj)));
            if (walletId != null)
            {
                obj = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                for (Iterator iterator = walletId.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(((WalletItemResponse)iterator.next()).getId())) { }
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(((ArrayList) (obj)));
            }
            dismissVirtualKeyboard();
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
            finish();
            return;
        } else
        {
            ManualScanActivity.access$100(ManualScanActivity.this, walletresponse);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((WalletResponse)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(ManualScanActivity.this, "Adding Items", "Please wait");
    }

    private ()
    {
        this$0 = ManualScanActivity.this;
        super();
        walletId = null;
    }

    walletId(walletId walletid)
    {
        this();
    }
}
