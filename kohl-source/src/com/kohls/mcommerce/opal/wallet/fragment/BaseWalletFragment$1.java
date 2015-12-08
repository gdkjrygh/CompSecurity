// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.adapter.WalletAdapter;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseWalletFragment

class this._cls0 extends BroadcastReceiver
{

    final BaseWalletFragment this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (getActivity() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (Appconfig.map.get(context = intent.getStringExtra("notificationID")) != null) goto _L1; else goto _L3
_L3:
        Appconfig.map.put(context, context);
        if (TextUtils.isEmpty(intent.getStringExtra("createwallet")) || !intent.getStringExtra("createwallet").equalsIgnoreCase("createwallet")) goto _L5; else goto _L4
_L4:
        if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref()) || Appconfig.isSignInShown) goto _L1; else goto _L6
_L6:
        int i;
        if (BaseWalletFragment.access$000(BaseWalletFragment.this) != null && BaseWalletFragment.access$000(BaseWalletFragment.this).walletData != null && BaseWalletFragment.access$000(BaseWalletFragment.this).getCount() > 0)
        {
            BaseWalletFragment.access$000(BaseWalletFragment.this).walletData.clear();
            BaseWalletFragment.access$000(BaseWalletFragment.this).notifyDataSetChanged();
        }
        i = intent.getIntExtra("position", -1);
        if (i < 0) goto _L8; else goto _L7
_L7:
        if (i != Constants.POSITION_OF_CASH_TAB_IN_WALLET) goto _L10; else goto _L9
_L9:
    /* block-local class not found */
    class _cls1 {}

        (new Handler()).postDelayed(new _cls1(), 1000L);
_L8:
        loadWalletData(true);
        return;
_L10:
    /* block-local class not found */
    class _cls2 {}

    /* block-local class not found */
    class _cls3 {}

        if (i == Constants.POSITION_OF_OFFERS_TAB_IN_WALLET)
        {
            (new Handler()).postDelayed(new _cls2(), 1000L);
        } else
        if (i == Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET)
        {
            (new Handler()).postDelayed(new _cls3(), 1000L);
        }
        if (true) goto _L8; else goto _L5
_L5:
        context = getActivity().getApplicationContext();
        getActivity().finish();
        context = new Intent(context, com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        context.putExtra("open_screen_key", "open_my_wallet");
        startActivity(context);
        return;
    }

    _cls3()
    {
        this$0 = BaseWalletFragment.this;
        super();
    }
}
