// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.webkit.WebView;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class this._cls0 extends ApiResponseHandler
{

    final WebViewFragment this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        if (WebViewFragment.access$100(WebViewFragment.this) == null)
        {
            return;
        }
        if (pinterestjsonobject != null)
        {
            pinterestjsonobject = pinterestjsonobject.c("data");
            if (pinterestjsonobject != null)
            {
                String s = pinterestjsonobject.a("sso_url", null);
                pinterestjsonobject = s;
                if (s == null)
                {
                    pinterestjsonobject = WebViewFragment.access$200(WebViewFragment.this);
                }
                WebViewFragment.access$100(WebViewFragment.this).loadUrl(pinterestjsonobject);
                return;
            }
        }
        WebViewFragment.access$100(WebViewFragment.this).loadUrl(WebViewFragment.access$200(WebViewFragment.this));
    }

    ()
    {
        this$0 = WebViewFragment.this;
        super();
    }
}
