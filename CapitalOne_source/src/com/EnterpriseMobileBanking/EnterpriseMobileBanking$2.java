// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class this._cls0 extends CordovaChromeClient
{

    final EnterpriseMobileBanking this$0;

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        String s3 = s;
        if (TextUtils.equals(s2, "gap_poll:"))
        {
            s3 = s;
            if (TextUtils.isEmpty(s))
            {
                s3 = "file:///";
                Log.w(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("URL FIX APPLIED in onJsPrompt with defaultValue:  ").append(s2).append(" and url:  ").append("file:///").append(" and message:  ").append(s1).toString());
            }
        }
        return super.onJsPrompt(webview, s3, s1, s2, jspromptresult);
    }

    (CordovaInterface cordovainterface)
    {
        this$0 = EnterpriseMobileBanking.this;
        super(cordovainterface);
    }
}
