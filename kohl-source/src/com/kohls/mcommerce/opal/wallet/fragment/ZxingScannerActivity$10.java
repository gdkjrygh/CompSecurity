// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.util.QRMessageDialog;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            ZxingScannerActivity

class this._cls0 extends BroadcastReceiver
{

    final ZxingScannerActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (!TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()))
        {
            context = new Intent(context.getApplicationContext(), com/kohls/mcommerce/opal/wallet/util/QRMessageDialog);
            context.putExtra("ServerError", "Hi! It looks like you've already enrolled in Yes2You Rewards. Just shop and you can earn points!");
            startActivity(context);
        }
        try
        {
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    ()
    {
        this$0 = ZxingScannerActivity.this;
        super();
    }
}
