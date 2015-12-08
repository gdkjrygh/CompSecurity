// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.asynctask.BaseAsyncTask;
import com.kohls.mcommerce.opal.wallet.rest.ActivityHistoryService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ActivityHistoryResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.KohlsError;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            DisplayActivityList

protected class mContext extends BaseAsyncTask
{

    private Context mContext;
    final DisplayActivityList this$0;

    private void displayErrorDialog(String s)
    {
        Intent intent = (new Intent(mContext, com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog)).setFlags(0x10020000);
        intent.putExtra("ServerError", s);
        mContext.startActivity(intent);
    }

    protected transient ActivityHistoryResponse doInBackground(Void avoid[])
    {
        avoid = null;
        if (mContext == null)
        {
            return null;
        }
        if (canAccessNetwork())
        {
            Object obj = (new ActivityHistoryService(new WeakReference(mContext))).getActivityHistoryData(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref(), DisplayActivityList.access$1300(DisplayActivityList.this), DisplayActivityList.access$1400(DisplayActivityList.this));
            if (mContext == null)
            {
                return null;
            }
            if (obj == null)
            {
                return null;
            }
            if (((ActivityHistoryResponse) (obj)).getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.xt)
            {
                showSignInPage();
                return null;
            }
            if (((ActivityHistoryResponse) (obj)).getErrors() != null && ((ActivityHistoryResponse) (obj)).getErrors().size() > 0 && ((ErrorResponse)((ActivityHistoryResponse) (obj)).getErrors().get(0)).getErrorCode() == 4 && !Appconfig.isSignInShown)
            {
                showSignInPage();
                return null;
            }
            if (((ActivityHistoryResponse) (obj)).getHttpStatusCode() != -1 && ((ActivityHistoryResponse) (obj)).getHttpStatusCode() != 200)
            {
                obj = KohlsError.getInstance().getErrorMessage(((ActivityHistoryResponse) (obj)).getRequestType(), String.valueOf(((ActivityHistoryResponse) (obj)).getHttpStatusCode()));
                avoid = ((Void []) (obj));
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    avoid = KohlsError.getInstance().getErrorMessage(String.valueOf("defaultHttpErrorMessage"));
                }
                displayErrorDialog(avoid);
                return null;
            }
            avoid = ((Void []) (obj));
            if (obj != null)
            {
                avoid = ((Void []) (obj));
                if (!((ActivityHistoryResponse) (obj)).isSuccess())
                {
                    displayErrorDialog(KohlsError.getInstance().getErrorMessage(String.valueOf("defaultMessage")));
                    return null;
                }
            }
        }
        if (mContext == null)
        {
            return null;
        } else
        {
            return avoid;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(ActivityHistoryResponse activityhistoryresponse)
    {
        super.onPostExecute(activityhistoryresponse);
        if (mContext != null)
        {
            DisplayActivityList.access$1500(DisplayActivityList.this, activityhistoryresponse);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ActivityHistoryResponse)obj);
    }

    public Y(Context context)
    {
        this$0 = DisplayActivityList.this;
        super(context);
        mContext = context;
    }
}
