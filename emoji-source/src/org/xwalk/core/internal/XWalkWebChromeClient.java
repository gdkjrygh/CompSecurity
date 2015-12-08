// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkViewInternal, XWalkContentsClient

public class XWalkWebChromeClient
{
    public static interface CustomViewCallback
    {

        public abstract void onCustomViewHidden();
    }


    private long XWALK_MAX_QUOTA;
    private XWalkContentsClient mContentsClient;
    private Context mContext;
    private CustomViewCallback mCustomViewCallback;
    private View mCustomXWalkView;
    private XWalkViewInternal mXWalkView;

    public XWalkWebChromeClient(XWalkViewInternal xwalkviewinternal)
    {
        mContentsClient = null;
        XWALK_MAX_QUOTA = 0x6400000L;
        mContext = xwalkviewinternal.getContext();
        mXWalkView = xwalkviewinternal;
    }

    public void getVisitedHistory(ValueCallback valuecallback)
    {
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        onConsoleMessage(consolemessage.message(), consolemessage.lineNumber(), consolemessage.sourceId());
        return false;
    }

    public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        quotaupdater.updateQuota(XWALK_MAX_QUOTA);
    }

    public void onGeolocationPermissionsHidePrompt()
    {
    }

    public void onGeolocationPermissionsShowPrompt(String s, XWalkGeolocationPermissions.Callback callback)
    {
        callback.invoke(s, true, false);
    }

    public void onHideCustomView()
    {
        Activity activity = mXWalkView.getActivity();
        if (mCustomXWalkView == null || activity == null)
        {
            return;
        }
        if (mContentsClient != null)
        {
            mContentsClient.onToggleFullscreen(false);
        }
        ((FrameLayout)activity.getWindow().getDecorView()).removeView(mCustomXWalkView);
        mCustomViewCallback.onCustomViewHidden();
        mCustomXWalkView = null;
        mCustomViewCallback = null;
    }

    public boolean onJsTimeout()
    {
        return true;
    }

    public void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        quotaupdater.updateQuota(XWALK_MAX_QUOTA);
    }

    public void onReceivedIcon(XWalkViewInternal xwalkviewinternal, Bitmap bitmap)
    {
    }

    public void onShowCustomView(View view, int i, CustomViewCallback customviewcallback)
    {
    }

    public void onShowCustomView(View view, CustomViewCallback customviewcallback)
    {
        Activity activity = mXWalkView.getActivity();
        if (mCustomXWalkView != null || activity == null)
        {
            customviewcallback.onCustomViewHidden();
            return;
        }
        mCustomXWalkView = view;
        mCustomViewCallback = customviewcallback;
        if (mContentsClient != null)
        {
            mContentsClient.onToggleFullscreen(true);
        }
        activity.getWindow().addContentView(view, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
    }

    void setContentsClient(XWalkContentsClient xwalkcontentsclient)
    {
        mContentsClient = xwalkcontentsclient;
    }

    public void setInstallableWebApp()
    {
    }

    public void setupAutoFill(Message message)
    {
    }
}
