// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.math.BigDecimal;
import java.util.HashMap;

// Referenced classes of package com.adobe.mobile:
//            MessageFullScreen, StaticMethods, AnalyticsTrackLifetimeValueIncrease

private static class message extends WebViewClient
{

    private MessageFullScreen message;

    private void dismissMessage(WebView webview)
    {
        if (message.rootViewGroup == null)
        {
            StaticMethods.logErrorFormat("Messages - unable to get root view group from os", new Object[0]);
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, message.rootViewGroup.getMeasuredHeight());
            translateanimation.setDuration(300L);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final MessageFullScreen.MessageFullScreenWebViewClient this$0;

                public void onAnimationEnd(Animation animation)
                {
                    MessageFullScreen.access$100(message);
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = MessageFullScreen.MessageFullScreenWebViewClient.this;
                super();
            }
            });
            webview.setAnimation(translateanimation);
            message.rootViewGroup.removeView(webview);
            return;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("adbinapp"))
        {
            if (s.contains("cancel"))
            {
                message.viewed();
                dismissMessage(webview);
                return true;
            }
            if (s.contains("confirm"))
            {
                message.clickedThrough();
                dismissMessage(webview);
                int i = s.indexOf("url=");
                if (i >= 0)
                {
                    s = s.substring(i + 4);
                    HashMap hashmap = new HashMap();
                    if (StaticMethods.getVisitorID() == null)
                    {
                        webview = "";
                    } else
                    {
                        webview = StaticMethods.getVisitorID();
                    }
                    hashmap.put("{userId}", webview);
                    if (StaticMethods.getAID() == null)
                    {
                        webview = "";
                    } else
                    {
                        webview = StaticMethods.getAID();
                    }
                    hashmap.put("{trackingId}", webview);
                    hashmap.put("{messageId}", message.messageId);
                    hashmap.put("{lifetimeValue}", AnalyticsTrackLifetimeValueIncrease.getLifetimeValue().toString());
                    webview = StaticMethods.expandTokens(s, hashmap);
                    try
                    {
                        s = new Intent("android.intent.action.VIEW");
                        s.setData(Uri.parse(webview));
                        message.messageFullScreenActivity.startActivity(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (WebView webview)
                    {
                        StaticMethods.logDebugFormat("Messages - unable to launch intent from full screen message (%s)", new Object[] {
                            webview.getMessage()
                        });
                        return true;
                    }
                    return true;
                }
            }
        }
        return true;
    }


    protected _cls1.this._cls0(MessageFullScreen messagefullscreen)
    {
        message = messagefullscreen;
    }
}
