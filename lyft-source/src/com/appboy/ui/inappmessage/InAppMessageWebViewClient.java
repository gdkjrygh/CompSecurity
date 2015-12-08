// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.Constants;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.support.StringUtils;
import com.appboy.ui.support.UriUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InAppMessageWebViewClient extends WebViewClient
{

    private static final String APPBOY_INAPP_MESSAGE_SCHEME = "appboy";
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_NEWSFEED = "feed";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private static final String TAG;
    private final IInAppMessage mInAppMessage;
    private IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;

    public InAppMessageWebViewClient(IInAppMessage iinappmessage, IInAppMessageWebViewClientListener iinappmessagewebviewclientlistener)
    {
        mInAppMessageWebViewClientListener = iinappmessagewebviewclientlistener;
        mInAppMessage = iinappmessage;
    }

    static Bundle getBundleFromUrl(String s)
    {
        Bundle bundle = new Bundle();
        if (StringUtils.isNullOrBlank(s))
        {
            return bundle;
        }
        s = UriUtils.getQueryParameters(Uri.parse(s));
        String s1;
        for (Iterator iterator = s.keySet().iterator(); iterator.hasNext(); bundle.putString(s1, (String)s.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        return bundle;
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (mInAppMessageWebViewClientListener == null)
        {
            AppboyLogger.i(TAG, "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.");
        } else
        {
            if (StringUtils.isNullOrBlank(s))
            {
                AppboyLogger.i(TAG, "InAppMessageWebViewClient.shouldOverrideUrlLoading was given null or blank url. Returning true.");
                return true;
            }
            Object obj = Uri.parse(s);
            webview = getBundleFromUrl(s);
            if (((Uri) (obj)).getScheme().equals("appboy"))
            {
                obj = ((Uri) (obj)).getAuthority();
                if (((String) (obj)).equals("close"))
                {
                    mInAppMessageWebViewClientListener.onCloseAction(mInAppMessage, s, webview);
                    return true;
                }
                if (((String) (obj)).equals("feed"))
                {
                    mInAppMessageWebViewClientListener.onNewsfeedAction(mInAppMessage, s, webview);
                    return true;
                }
            } else
            {
                mInAppMessageWebViewClientListener.onOtherUrlAction(mInAppMessage, s, webview);
                return true;
            }
        }
        return true;
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/inappmessage/InAppMessageWebViewClient.getName()
        });
    }
}
