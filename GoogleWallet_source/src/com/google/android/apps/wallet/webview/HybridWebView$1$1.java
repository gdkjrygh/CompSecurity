// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import android.os.Handler;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import java.io.IOException;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView, ServiceAuthInfo

final class val.tokenToPass
    implements Runnable
{

    final val.tokenToPass this$1;
    final String val$tokenToPass;

    public final void run()
    {
        WLog.d(HybridWebView.access$000(_fld0), "Processing token form acct mgr");
        HybridWebView.access$100(_fld0, authInfo, val$tokenToPass);
    }

    l.handlerForUiThread()
    {
        this$1 = final_handlerforuithread;
        val$tokenToPass = String.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/webview/HybridWebView$1

/* anonymous class */
    final class HybridWebView._cls1
        implements Runnable
    {

        final HybridWebView this$0;
        final Account val$account;
        final ServiceAuthInfo val$authInfo;
        final Handler val$handlerForUiThread;

        public final void run()
        {
            String s;
            try
            {
                s = authUtil.getToken(account.name, authInfo.getAccountManagerServiceString());
            }
            catch (Exception exception)
            {
                String s1 = HybridWebView.access$000(HybridWebView.this);
                exception = String.valueOf(authInfo.getAccountManagerServiceString());
                if (exception.length() != 0)
                {
                    exception = "Could not get token for: ".concat(exception);
                } else
                {
                    exception = new String("Could not get token for: ");
                }
                WLog.w(s1, exception);
                exception = null;
            }
            WLog.d(HybridWebView.access$000(HybridWebView.this), "Got token from acct mgr");
            handlerForUiThread.post(s. new HybridWebView._cls1._cls1());
            try
            {
                authUtil.clearToken(s);
                return;
            }
            catch (GooglePlayServicesAvailabilityException googleplayservicesavailabilityexception)
            {
                WLog.e(HybridWebView.access$000(HybridWebView.this), "Unexpected error clearing token", googleplayservicesavailabilityexception);
                return;
            }
            catch (GoogleAuthException googleauthexception)
            {
                WLog.e(HybridWebView.access$000(HybridWebView.this), "Unexpected error clearing token", googleauthexception);
                return;
            }
            catch (IOException ioexception)
            {
                WLog.e(HybridWebView.access$000(HybridWebView.this), "Unexpected error clearing token", ioexception);
            }
        }

            
            {
                this$0 = final_hybridwebview;
                account = account1;
                authInfo = serviceauthinfo;
                handlerForUiThread = Handler.this;
                super();
            }
    }

}
