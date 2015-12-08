// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            TransactionDetailActivity

class this._cls0 extends BroadcastReceiver
{

    final TransactionDetailActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (this == null)
        {
            return;
        }
        if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref()) && !Appconfig.isSignInShown)
        {
            (new tTransactionDetailsTask(TransactionDetailActivity.this, TransactionDetailActivity.access$000(TransactionDetailActivity.this))).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            ((Activity)TransactionDetailActivity.access$000(TransactionDetailActivity.this)).finish();
            return;
        }
    }

    tTransactionDetailsTask()
    {
        this$0 = TransactionDetailActivity.this;
        super();
    }
}
