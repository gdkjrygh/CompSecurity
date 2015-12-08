// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.graphics.Bitmap;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.activities:
//            ShopRunnerLoginActivity

class this._cls0 extends WebViewClient
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
                LogUtil.e(ShopRunnerLoginActivity.access$000(), webview.getMessage(), webview, new Object[0]);
            }
        }
        if (!((String) (obj)).isEmpty())
        {
            try
            {
                ShopRunnerLoginActivity.access$100(ShopRunnerLoginActivity.this).setSrToken(URLDecoder.decode(((String) (obj)), "UTF-8"));
                ShopRunnerLoginActivity.access$200(ShopRunnerLoginActivity.this, 32);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                ShopRunnerLoginActivity.access$200(ShopRunnerLoginActivity.this, 48);
            }
            finish();
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        showLoading();
    }

    runnerManager()
    {
        this$0 = ShopRunnerLoginActivity.this;
        super();
    }
}
