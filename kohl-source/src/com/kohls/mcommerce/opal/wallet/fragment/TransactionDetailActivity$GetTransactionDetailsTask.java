// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.ProgressBar;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.asynctask.BaseAsyncTask;
import com.kohls.mcommerce.opal.wallet.rest.TransactionDetailService;
import com.kohls.mcommerce.opal.wallet.rest.containers.ActivityDetailResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ErrorResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            TransactionDetailActivity

class mContext extends BaseAsyncTask
{

    private Context mContext;
    final TransactionDetailActivity this$0;

    protected transient ActivityDetailResponse doInBackground(Void avoid[])
    {
        avoid = null;
        if (mContext == null)
        {
            return null;
        }
        if (canAccessNetwork())
        {
            ActivityDetailResponse activitydetailresponse = (new TransactionDetailService(new WeakReference(mContext))).getActivityData(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref(), TransactionDetailActivity.access$200(TransactionDetailActivity.this));
            if (mContext == null)
            {
                return null;
            }
            if (activitydetailresponse == null)
            {
                return null;
            }
            if (activitydetailresponse.getErrorType() == com.kohls.mcommerce.opal.wallet.rest.responses.xt)
            {
                showSignInPage();
                return null;
            }
            avoid = activitydetailresponse;
            if (activitydetailresponse.getErrors() != null)
            {
                avoid = activitydetailresponse;
                if (activitydetailresponse.getErrors().size() > 0)
                {
                    int i = ((ErrorResponse)activitydetailresponse.getErrors().get(0)).getErrorCode();
                    if (i == 5)
                    {
                        avoid = activitydetailresponse;
                        if (activitydetailresponse != null)
                        {
                            avoid = activitydetailresponse;
                            if (activitydetailresponse.isSuccess())
                            {
                                LocalBroadcastManager.getInstance(mContext).sendBroadcast(new Intent("signin_page"));
                                return null;
                            }
                        }
                    } else
                    {
                        avoid = activitydetailresponse;
                        if (i == 4)
                        {
                            avoid = activitydetailresponse;
                            if (!Appconfig.isSignInShown)
                            {
                                showSignInPage();
                                return null;
                            }
                        }
                    }
                }
            }
        }
        if (avoid != null && !avoid.isSuccess())
        {
            return null;
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

    protected void onPostExecute(ActivityDetailResponse activitydetailresponse)
    {
        super.onPostExecute(activitydetailresponse);
        if (mContext != null && activitydetailresponse != null)
        {
            setUpViewForPage(activitydetailresponse);
        }
        ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(8);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ActivityDetailResponse)obj);
    }

    protected void onPreExecute()
    {
        if (mContext == null)
        {
            return;
        } else
        {
            ((ProgressBar)((Activity)mContext).findViewById(0x7f0d0118)).setVisibility(0);
            super.onPreExecute();
            return;
        }
    }

    public (Context context)
    {
        this$0 = TransactionDetailActivity.this;
        super(context);
        mContext = context;
    }
}
