// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.rest.WalletService;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.activity:
//            WalletActivity

class this._cls0 extends AsyncTask
{

    final WalletActivity this$0;

    protected transient Boolean doInBackground(Integer ainteger[])
    {
        if (Appconfig.isNetworkAvailable(getApplicationContext()))
        {
            ainteger = new WalletService(new WeakReference(getApplicationContext()));
            String s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletId();
            if (TextUtils.isEmpty(s))
            {
                ainteger = ainteger.getWalletbyEmail(null);
            } else
            {
                ainteger = ainteger.getWalletData(s);
            }
            if (ainteger != null && !ainteger.isSuccess())
            {
                return Boolean.valueOf(false);
            }
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setWalletId(ainteger.getWalletId());
            if (ainteger != null && ainteger.getWalletItems() != null && ainteger.getWalletItems().size() > 0)
            {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Integer[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        super.onPostExecute(boolean1);
        if (boolean1.booleanValue())
        {
            boolean1 = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            boolean1.putExtra("open_screen_key", "open_my_wallet");
            startActivity(boolean1);
            finish();
        }
        ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(8);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    ()
    {
        this$0 = WalletActivity.this;
        super();
    }
}
