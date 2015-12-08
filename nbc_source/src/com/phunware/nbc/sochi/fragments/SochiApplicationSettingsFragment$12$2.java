// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.Handler;
import android.view.View;
import android.webkit.CookieManager;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.tve.AuthenticationWebView;
import java.util.ArrayList;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

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

    // Unreferenced inner class com/phunware/nbc/sochi/fragments/SochiApplicationSettingsFragment$12

/* anonymous class */
    class SochiApplicationSettingsFragment._cls12 extends AuthDelegate
    {

        final SochiApplicationSettingsFragment this$0;

        public void displayProviderDialog(ArrayList arraylist)
        {
            super.displayProviderDialog(arraylist);
        }

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
                webView.setCallback(new SochiApplicationSettingsFragment._cls12._cls1());
                SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(s. new SochiApplicationSettingsFragment._cls12._cls2());
                return;
            }
        }

        public void selectedProvider(Mvpd mvpd)
        {
            super.selectedProvider(mvpd);
            SochiApplicationSettingsFragment.access$1000(SochiApplicationSettingsFragment.this, mvpd);
        }

        public void setAuthenticationStatus(int i, String s)
        {
            super.setAuthenticationStatus(i, s);
            if (i == 1)
            {
                SochiApplicationSettingsFragment.access$602(SochiApplicationSettingsFragment.this, true);
                pass.getInstance().getSelectedProvider();
                return;
            } else
            {
                SochiApplicationSettingsFragment.access$602(SochiApplicationSettingsFragment.this, false);
                SochiApplicationSettingsFragment.access$1000(SochiApplicationSettingsFragment.this, null);
                return;
            }
        }

        public void setRequestorComplete(int i)
        {
            super.setRequestorComplete(i);
            if (SochiApplicationSettingsFragment.access$900(SochiApplicationSettingsFragment.this))
            {
                pass.getInstance().getAuthentication();
                SochiApplicationSettingsFragment.access$902(SochiApplicationSettingsFragment.this, false);
            }
        }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }

        // Unreferenced inner class com/phunware/nbc/sochi/fragments/SochiApplicationSettingsFragment$12$1

/* anonymous class */
        class SochiApplicationSettingsFragment._cls12._cls1
            implements com.nbcsports.liveextra.ui.tve.AuthenticationWebView.Callback
        {

            final SochiApplicationSettingsFragment._cls12 this$1;

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
                if (isActivityDead())
                {
                    return;
                } else
                {
                    pass.getInstance().checkAuthentication();
                    pass.getInstance().getSelectedProvider();
                    return;
                }
            }

                    
                    {
                        this$1 = SochiApplicationSettingsFragment._cls12.this;
                        super();
                    }
        }

    }

}
