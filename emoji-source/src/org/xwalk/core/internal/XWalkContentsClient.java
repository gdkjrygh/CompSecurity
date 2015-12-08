// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import org.chromium.content.browser.ContentViewClient;
import org.chromium.content.browser.WebContentsObserverAndroid;
import org.chromium.content_public.browser.WebContents;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientCallbackHelper, XWalkHttpAuthHandler, ErrorCodeConversionHelper

abstract class XWalkContentsClient extends ContentViewClient
{
    public class XWalkWebContentsObserver extends WebContentsObserverAndroid
    {

        final XWalkContentsClient this$0;

        public void didFailLoad(boolean flag, boolean flag1, int i, String s, String s1)
        {
            if (i == -3 || !flag1)
            {
                return;
            } else
            {
                onReceivedError(ErrorCodeConversionHelper.convertErrorCode(i), s, s1);
                return;
            }
        }

        public void didFinishLoad(long l, String s, boolean flag)
        {
        }

        public void didNavigateAnyFrame(String s, String s1, boolean flag)
        {
            doUpdateVisitedHistory(s, flag);
        }

        public void didStopLoading(String s)
        {
            onPageFinished(s);
        }

        public XWalkWebContentsObserver(WebContents webcontents)
        {
            this$0 = XWalkContentsClient.this;
            super(webcontents);
        }
    }


    private static final String TAG = "XWalkContentsClient";
    private final XWalkContentsClientCallbackHelper mCallbackHelper = new XWalkContentsClientCallbackHelper(this);
    private double mDIPScale;
    private XWalkWebContentsObserver mWebContentsObserver;

    XWalkContentsClient()
    {
    }

    public abstract void didFinishLoad(String s);

    public abstract void doUpdateVisitedHistory(String s, boolean flag);

    final XWalkContentsClientCallbackHelper getCallbackHelper()
    {
        return mCallbackHelper;
    }

    public abstract void getVisitedHistory(ValueCallback valuecallback);

    public abstract boolean hasEnteredFullscreen();

    void installWebContentsObserver(WebContents webcontents)
    {
        if (mWebContentsObserver != null)
        {
            mWebContentsObserver.detachFromWebContents();
        }
        mWebContentsObserver = new XWalkWebContentsObserver(webcontents);
    }

    protected abstract void onCloseWindow();

    public abstract boolean onConsoleMessage(ConsoleMessage consolemessage);

    protected abstract boolean onCreateWindow(boolean flag, boolean flag1);

    public abstract void onDownloadStart(String s, String s1, String s2, String s3, long l);

    public abstract void onFindResultReceived(int i, int j, boolean flag);

    public abstract void onFormResubmission(Message message, Message message1);

    public abstract void onGeolocationPermissionsHidePrompt();

    public abstract void onGeolocationPermissionsShowPrompt(String s, XWalkGeolocationPermissions.Callback callback);

    public abstract void onHideCustomView();

    public abstract void onLoadResource(String s);

    public abstract void onNewPicture(Picture picture);

    public abstract void onPageFinished(String s);

    public abstract void onPageStarted(String s);

    public abstract void onProgressChanged(int i);

    public abstract void onReceivedError(int i, String s, String s1);

    public abstract void onReceivedHttpAuthRequest(XWalkHttpAuthHandler xwalkhttpauthhandler, String s, String s1);

    public abstract void onReceivedIcon(Bitmap bitmap);

    public abstract void onReceivedLoginRequest(String s, String s1, String s2);

    public abstract void onReceivedSslError(ValueCallback valuecallback, SslError sslerror);

    public abstract void onRendererResponsive();

    public abstract void onRendererUnresponsive();

    protected abstract void onRequestFocus();

    public abstract void onResourceLoadFinished(String s);

    public abstract void onResourceLoadStarted(String s);

    public final void onScaleChanged(float f, float f1)
    {
        onScaleChangedScaled((float)((double)f * mDIPScale), (float)((double)f1 * mDIPScale));
    }

    public abstract void onScaleChangedScaled(float f, float f1);

    public void onShowCustomView(View view, int i, XWalkWebChromeClient.CustomViewCallback customviewcallback)
    {
    }

    public void onShowCustomView(View view, XWalkWebChromeClient.CustomViewCallback customviewcallback)
    {
        onShowCustomView(view, -1, customviewcallback);
    }

    protected abstract void onStopLoading();

    public abstract void onTitleChanged(String s);

    public abstract void onToggleFullscreen(boolean flag);

    public abstract void onUnhandledKeyEvent(KeyEvent keyevent);

    public final void onUpdateTitle(String s)
    {
        onTitleChanged(s);
    }

    void setDIPScale(double d)
    {
        mDIPScale = d;
    }

    public abstract WebResourceResponse shouldInterceptRequest(String s);

    public abstract boolean shouldOpenWithDefaultBrowser(String s);

    public boolean shouldOverrideKeyEvent(KeyEvent keyevent)
    {
        return super.shouldOverrideKeyEvent(keyevent);
    }

    public abstract boolean shouldOverrideRunFileChooser(int i, int j, int k, String s, boolean flag);

    public abstract boolean shouldOverrideUrlLoading(String s);
}
