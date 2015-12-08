// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class ShopRunnerLoginActivity extends BaseActivity
{

    private static final String TAG = com/dominos/activities/ShopRunnerLoginActivity.getName();
    DominosPrefs_ mPrefs;
    ShopRunnerRestClient mSrApi;
    private ShoprunnerManager mSrManager;
    String mUrl;
    WebView mWebView;

    public ShopRunnerLoginActivity()
    {
    }

    private void handleResult(int i)
    {
        i;
        JVM INSTR lookupswitch 2: default 28
    //                   32: 54
    //                   48: 70;
           goto _L1 _L2 _L3
_L1:
        mSrManager.setShopRunnerSession(false, mOrderManager.getOrder());
        mPrefs.shopRunnerMemberToken().d();
        return;
_L2:
        mSrManager.setShopRunnerSession(true, mOrderManager.getOrder());
        return;
_L3:
        LogUtil.d(TAG, "Shop runner sign in error", new Object[0]);
        showLongToast(getString(0x7f08019b));
        if (true) goto _L1; else goto _L4
_L4:
    }

    void init()
    {
        mWebView.getSettings().setJavaScriptEnabled(true);
        CookieManager.getInstance().removeAllCookie();
        mWebView.setWebViewClient(new _cls1());
        mWebView.loadUrl(mUrl);
    }

    public void onAfterInject()
    {
        mSrManager = (ShoprunnerManager)mMobileSession.getManager("shoprunner_manager");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onStart()
    {
        super.onStart();
    }





    private class _cls1 extends WebViewClient
    {

        final ShopRunnerLoginActivity this$0;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            hideLoading();
            String s1 = CookieManager.getInstance().getCookie(s);
            webview = "";
            s = "";
            Object obj = s;
            Object obj1 = webview;
            if (s1 != null)
            {
                String as[] = s1.split("[;]");
                int j = as.length;
                int i = 0;
                do
                {
                    obj = s;
                    obj1 = webview;
                    if (i >= j)
                    {
                        break;
                    }
                    obj1 = as[i];
                    if (((String) (obj1)).contains("member_token"))
                    {
                        obj = ((String) (obj1)).split("[=]")[1];
                    } else
                    {
                        obj = webview;
                        if (((String) (obj1)).contains("sr_token"))
                        {
                            s = ((String) (obj1)).split("[=]")[1];
                            obj = webview;
                        }
                    }
                    i++;
                    webview = ((WebView) (obj));
                } while (true);
            }
            if (!((String) (obj1)).isEmpty())
            {
                try
                {
                    mPrefs.shopRunnerMemberToken().b(URLDecoder.decode(((String) (obj1)), "UTF-8"));
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    LogUtil.e(ShopRunnerLoginActivity.TAG, webview.getMessage(), webview, new Object[0]);
                }
            }
            if (!((String) (obj)).isEmpty())
            {
                try
                {
                    mSrManager.setSrToken(URLDecoder.decode(((String) (obj)), "UTF-8"));
                    handleResult(32);
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    handleResult(48);
                }
                finish();
            }
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            showLoading();
        }

        _cls1()
        {
            this$0 = ShopRunnerLoginActivity.this;
            super();
        }
    }

}
