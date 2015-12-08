// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.digby;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.Dialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.digby:
//            LPMessageDetailActivity

public class response extends AsyncTask
{

    ProgressDialog progressDialog;
    String response;
    final LPMessageDetailActivity this$0;

    protected transient WalletResponse doInBackground(String as[])
    {
        if (as[0] != null && as[0].length() > 15 && as[1] != null)
        {
            return (new WalletService(new WeakReference(getApplicationContext()))).getWallentByGiftCard(as[0], as[1]);
        } else
        {
            return (new WalletService(new WeakReference(getApplicationContext()))).getWallentByLookup(as[0]);
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(WalletResponse walletresponse)
    {
        super.onPostExecute(walletresponse);
        try
        {
            progressDialog.dismiss();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (walletresponse != null)
        {
            if (walletresponse.isSuccess())
            {
                Object obj = (WalletItemResponse)walletresponse.getWalletItems().get(0);
                if (Long.valueOf(((WalletItemResponse) (obj)).getEffectiveEndDate()).longValue() + 0xa4cb800L < System.currentTimeMillis())
                {
                    Dialog.showDialog(null, "The Item you entered is invalid.Please try again", LPMessageDetailActivity.this, "OK", null, false, true);
                    return;
                }
                findViewById(0x7f0d0044).setTag(obj);
                findViewById(0x7f0d0044).setOnClickListener(LPMessageDetailActivity.this);
                if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()))
                {
                    LPMessageDetailActivity.access$000(LPMessageDetailActivity.this).setText((new StringBuilder()).append("Hi ").append(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()).append("!").toString());
                } else
                {
                    LPMessageDetailActivity.access$000(LPMessageDetailActivity.this).setVisibility(8);
                }
                LPMessageDetailActivity.access$100(LPMessageDetailActivity.this, (WalletItemResponse)walletresponse.getWalletItems().get(0));
                return;
            }
            if (walletresponse == null || walletresponse != null && walletresponse.getErrors() == null || walletresponse != null && walletresponse.getErrors() != null && walletresponse.getErrors().size() <= 0)
            {
                Dialog.showDialog("Kohl's", "Please try again later", LPMessageDetailActivity.this, "OK", null, false, false);
                return;
            }
            ErrorResponse errorresponse = (ErrorResponse)walletresponse.getErrors().get(0);
            if (walletresponse != null && walletresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.ialog || walletresponse != null && errorresponse.getErrorCode() == 4)
            {
                UtilityMethods.openAccountActivity(LPMessageDetailActivity.this, true, false);
                return;
            }
            if (errorresponse.getErrorCode() == 2 || errorresponse.getErrorCode() == 12)
            {
                walletresponse = new Intent(LPMessageDetailActivity.this, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
                setResult(7005, walletresponse);
            }
            Dialog.showDialog("Kohl's", getResources().getString(0x7f08024a), LPMessageDetailActivity.this, "OK", null, false, true);
            OmnitureMeasurement.getInstance().walletScanError();
            return;
        } else
        {
            Dialog.showDialog("No Network Connection", Constants.NETWORK_CONNECTION_MESSAGE, LPMessageDetailActivity.this, "OK", null, false, true);
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
        progressDialog = ProgressDialog.show(LPMessageDetailActivity.this, "Please wait", "Verifying...");
    }

    public ()
    {
        this$0 = LPMessageDetailActivity.this;
        super();
        response = "false";
    }
}
