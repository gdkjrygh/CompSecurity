// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.digby;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.digby:
//            LPMessageDetailActivity

private class <init> extends AsyncTask
{

    ProgressDialog progressDialog;
    final LPMessageDetailActivity this$0;
    Set walletId;

    protected transient WalletResponse doInBackground(Set aset[])
    {
        if (canAccessNetwork() && aset != null && aset.length > 0 && aset[0] != null)
        {
            return (new WalletService(new WeakReference(getApplicationContext()))).addtoWallet(aset[0]);
        } else
        {
            return null;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Set[])aobj);
    }

    protected void onPostExecute(WalletResponse walletresponse)
    {
        super.onPostExecute(walletresponse);
        progressDialog.dismiss();
        if (walletresponse != null && walletresponse.isSuccess())
        {
            Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            intent.setFlags(0x400000);
            intent.putExtra("open_screen_key", "open_my_wallet");
            startActivity(intent);
    /* block-local class not found */
    class _cls1 {}

            (new Handler()).postDelayed(new _cls1(walletresponse), 1000L);
            if (walletId != null)
            {
                ArrayList arraylist = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
                arraylist.addAll(walletId);
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setPreferenceId(arraylist);
            }
            OmnitureMeasurement.getInstance().walletManualScan(((WalletItemResponse)walletresponse.getAddedItems().get(0)).getTypeCode());
            finish();
            return;
        } else
        {
            LPMessageDetailActivity.access$300(LPMessageDetailActivity.this, walletresponse);
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
        progressDialog = ProgressDialog.show(LPMessageDetailActivity.this, "Adding Items", "Please wait");
    }

    private _cls1()
    {
        this$0 = LPMessageDetailActivity.this;
        super();
        walletId = null;
    }

    walletId(walletId walletid)
    {
        this();
    }
}
