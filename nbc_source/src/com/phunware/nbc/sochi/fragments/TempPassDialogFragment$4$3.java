// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Dialog;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.tve.AuthenticationWebView;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            TempPassDialogFragment

class val.url
    implements Runnable
{

    final val.url this$1;
    final String val$url;
    final AuthenticationWebView val$webView;

    public void run()
    {
        val$webView.loadUrl(val$url);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$webView = authenticationwebview;
        val$url = String.this;
        super();
    }

    // Unreferenced inner class com/phunware/nbc/sochi/fragments/TempPassDialogFragment$4

/* anonymous class */
    class TempPassDialogFragment._cls4 extends AuthDelegate
    {

        final TempPassDialogFragment this$0;

        public void navigateToUrl(String s)
        {
            super.navigateToUrl(s);
            final AuthenticationWebView webView = getView();
            if (webView == null)
            {
                return;
            } else
            {
                webView = (AuthenticationWebView)webView.findViewById(0x7f0f006f);
                webView.setCallback(new TempPassDialogFragment._cls4._cls2());
                TempPassDialogFragment.access$200(TempPassDialogFragment.this).post(s. new TempPassDialogFragment._cls4._cls3());
                return;
            }
        }

        public void setMetadataStatus(final MetadataKey authNResult, MetadataStatus metadatastatus)
        {
            super.setMetadataStatus(authNResult, metadatastatus);
            if (authNResult == null) goto _L2; else goto _L1
_L1:
            authNResult.getKey();
            JVM INSTR tableswitch 0 0: default 32
        //                       0 33;
               goto _L2 _L3
_L2:
            return;
_L3:
            authNResult = metadatastatus.getSimpleResult();
            if (!TextUtils.isEmpty(authNResult))
            {
                Timber.d((new StringBuilder()).append("TempPass Dialog Expiration: ").append(authNResult).toString(), new Object[0]);
                TempPassDialogFragment.access$200(TempPassDialogFragment.this).post(new TempPassDialogFragment._cls4._cls1());
                return;
            } else
            {
                pass.getInstance().logout();
                return;
            }
        }

            
            {
                this$0 = TempPassDialogFragment.this;
                super();
            }

        // Unreferenced inner class com/phunware/nbc/sochi/fragments/TempPassDialogFragment$4$1

/* anonymous class */
        class TempPassDialogFragment._cls4._cls1
            implements Runnable
        {

            final TempPassDialogFragment._cls4 this$1;
            final String val$authNResult;

            public void run()
            {
                TempPassDialogFragment.access$100(this$0, authNResult);
            }

                    
                    {
                        this$1 = TempPassDialogFragment._cls4.this;
                        authNResult = s;
                        super();
                    }
        }


        // Unreferenced inner class com/phunware/nbc/sochi/fragments/TempPassDialogFragment$4$2

/* anonymous class */
        class TempPassDialogFragment._cls4._cls2
            implements com.nbcsports.liveextra.ui.tve.AuthenticationWebView.Callback
        {

            final TempPassDialogFragment._cls4 this$1;

            public void onComplete()
            {
                CookieManager cookiemanager = CookieManager.getInstance();
                if (cookiemanager != null)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 21)
                    {
                        cookiemanager.removeAllCookies(null);
                    } else
                    {
                        cookiemanager.removeAllCookie();
                    }
                }
                if (getActivity() == null || getActivity().isFinishing())
                {
                    return;
                } else
                {
                    TempPassDialogFragment.access$300(this$0).stop();
                    getDialog().dismiss();
                    return;
                }
            }

                    
                    {
                        this$1 = TempPassDialogFragment._cls4.this;
                        super();
                    }
        }

    }

}
