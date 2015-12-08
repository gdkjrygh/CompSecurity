// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.adobe.mobile:
//            MessageFullScreen, StaticMethods

private static class message
    implements Runnable
{

    private MessageFullScreen message;

    public void run()
    {
        MessageFullScreen.access$002(message, new WebView(message.messageFullScreenActivity));
        MessageFullScreen.access$000(message).setVerticalScrollBarEnabled(false);
        MessageFullScreen.access$000(message).setHorizontalScrollBarEnabled(false);
        MessageFullScreen.access$000(message).setBackgroundColor(0);
        MessageFullScreen.access$000(message).setWebViewClient(new Client(message));
        WebSettings websettings = MessageFullScreen.access$000(message).getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setAllowFileAccess(true);
        websettings.setDefaultTextEncodingName("UTF-8");
        MessageFullScreen.access$000(message).loadDataWithBaseURL("file:///android_asset/", message.replacedHtml, "text/html", "UTF-8", null);
        if (message.rootViewGroup == null)
        {
            StaticMethods.logErrorFormat("Messages - unable to get root view group from os", new Object[0]);
            MessageFullScreen.access$100(message);
            return;
        }
        int i;
        int j;
        i = message.rootViewGroup.getMeasuredWidth();
        j = message.rootViewGroup.getMeasuredHeight();
        if (i == 0 || j == 0)
        {
            try
            {
                StaticMethods.logErrorFormat("Messages - root view hasn't been measured, cannot show message", new Object[0]);
                MessageFullScreen.access$100(message);
                return;
            }
            catch (Exception exception)
            {
                StaticMethods.logDebugFormat("Messages - Failed to show full screen message (%s)", new Object[] {
                    exception.getMessage()
                });
            }
            return;
        }
        if (!message.isVisible)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        message.rootViewGroup.addView(MessageFullScreen.access$000(message), i, j);
_L2:
        message.isVisible = true;
        return;
        TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, j, 0.0F);
        translateanimation.setDuration(300L);
        MessageFullScreen.access$000(message).setAnimation(translateanimation);
        message.rootViewGroup.addView(MessageFullScreen.access$000(message), i, j);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected Client(MessageFullScreen messagefullscreen)
    {
        message = messagefullscreen;
    }
}
