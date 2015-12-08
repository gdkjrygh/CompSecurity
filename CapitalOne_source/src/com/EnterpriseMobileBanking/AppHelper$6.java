// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

static final class ger
    implements Runnable
{

    public void run()
    {
        WebView webview = AppHelper.getAppView();
        if (webview != null)
        {
            View view = webview.getFocusedChild();
            if (view != null && "android.webkit.WebTextView".equals(view.getClass().getCanonicalName()))
            {
                webview.removeView(view);
            }
        }
        InputMethodManager inputmethodmanager = (InputMethodManager)AppHelper.access$000().getSystemService("input_method");
        if (AppHelper.access$000().getCurrentFocus() == null)
        {
            if (webview != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(webview.getRootView().getWindowToken(), 0);
            }
            return;
        } else
        {
            inputmethodmanager.hideSoftInputFromWindow(AppHelper.access$000().getCurrentFocus().getWindowToken(), 0);
            return;
        }
    }

    ger()
    {
    }
}
