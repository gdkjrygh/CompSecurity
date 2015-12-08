// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.asynctask.PointAdjustmentAsyncTask;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            SharePointsCompleteActivity

class this._cls0 extends BroadcastReceiver
{

    final SharePointsCompleteActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()) && !Appconfig.isSignInShown)
        {
            context = getIntent().getStringExtra("email_of_friend");
            (new PointAdjustmentAsyncTask(getApplicationContext())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                getIntent().getStringExtra("loyaltyid"), getIntent().getStringExtra("points_to_share"), getIntent().getStringExtra("message"), SharePointsCompleteActivity.access$000(SharePointsCompleteActivity.this), getIntent().getStringExtra("charityimg"), getIntent().getStringExtra("phone"), context
            });
            return;
        } else
        {
            finish();
            return;
        }
    }

    ask()
    {
        this$0 = SharePointsCompleteActivity.this;
        super();
    }
}
