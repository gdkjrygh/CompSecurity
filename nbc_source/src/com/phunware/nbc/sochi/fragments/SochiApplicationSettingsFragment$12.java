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

class this._cls0 extends AuthDelegate
{

    final SochiApplicationSettingsFragment this$0;

    public void displayProviderDialog(ArrayList arraylist)
    {
        super.displayProviderDialog(arraylist);
    }

    public void navigateToUrl(final String url)
    {
        super.navigateToUrl(url);
        final AuthenticationWebView webView = getView();
        if (webView == null)
        {
            return;
        } else
        {
            webView = (AuthenticationWebView)webView.findViewById(0x7f0f006f);
            webView.setCallback(new com.nbcsports.liveextra.ui.tve.AuthenticationWebView.Callback() {

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
            });
            SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(new Runnable() {

                final SochiApplicationSettingsFragment._cls12 this$1;
                final String val$url;
                final AuthenticationWebView val$webView;

                public void run()
                {
                    webView.loadUrl(url);
                }

            
            {
                this$1 = SochiApplicationSettingsFragment._cls12.this;
                webView = authenticationwebview;
                url = s;
                super();
            }
            });
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

    _cls2.val.url()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
