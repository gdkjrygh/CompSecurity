// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.webkit.WebSettings;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.VersionCode;

// Referenced classes of package com.mopub.mobileads:
//            BaseWebView, ViewGestureDetector, k

public class BaseHtmlWebView extends BaseWebView
    implements ViewGestureDetector.UserClickListener
{

    private final ViewGestureDetector b;
    private boolean c;

    public BaseHtmlWebView(Context context, AdReport adreport)
    {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        getSettings().setJavaScriptEnabled(true);
        b = new ViewGestureDetector(context, this, adreport);
        b.setUserClickListener(this);
        if (VersionCode.currentApiLevel().isAtLeast(VersionCode.ICE_CREAM_SANDWICH))
        {
            a(true);
        }
        setBackgroundColor(0);
    }

    static ViewGestureDetector a(BaseHtmlWebView basehtmlwebview)
    {
        return basehtmlwebview.b;
    }

    final void a(String s)
    {
        loadDataWithBaseURL("http://ads.mopub.com/", s, "text/html", "utf-8", null);
    }

    public void init(boolean flag)
    {
        setOnTouchListener(new k(this, flag));
    }

    public void loadUrl(String s)
    {
        if (s != null)
        {
            MoPubLog.d((new StringBuilder("Loading url: ")).append(s).toString());
            if (s.startsWith("javascript:"))
            {
                super.loadUrl(s);
                return;
            }
        }
    }

    public void onResetUserClick()
    {
        c = false;
    }

    public void onUserClick()
    {
        c = true;
    }

    public boolean wasClicked()
    {
        return c;
    }
}
