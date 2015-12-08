// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.appboy.Constants;
import com.appboy.ui.inappmessage.IInAppMessageView;
import com.appboy.ui.inappmessage.InAppMessageWebViewClient;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            InAppMessageViewUtils

public abstract class AppboyInAppMessageHtmlBaseView extends RelativeLayout
    implements IInAppMessageView
{

    private static final String HTML_ENCODING = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private static final String TAG;

    public AppboyInAppMessageHtmlBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public View getMessageClickableView()
    {
        return this;
    }

    public abstract WebView getMessageWebView();

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inappmessagewebviewclient)
    {
        getMessageWebView().setWebViewClient(inappmessagewebviewclient);
    }

    public void setWebViewContent(String s, String s1)
    {
        getMessageWebView().loadDataWithBaseURL(s1, s, "text/html", "utf-8", null);
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/inappmessage/views/AppboyInAppMessageHtmlBaseView.getName()
        });
    }
}
