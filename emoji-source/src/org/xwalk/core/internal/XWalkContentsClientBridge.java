// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.components.navigation_interception.NavigationParams;
import org.chromium.content.browser.ContentVideoViewClient;
import org.chromium.content.browser.ContentViewDownloadDelegate;
import org.chromium.content.browser.DownloadInfo;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClient, SslUtil, XWalkNotificationService, XWalkJavascriptResultHandlerInternal, 
//            XWalkUIClientInternal, XWalkViewInternal, XWalkContentVideoViewClient, XWalkWebChromeClient, 
//            XWalkClient, PageLoadListener, XWalkResourceClientInternal, DownloadListener, 
//            XWalkNavigationHandler, XWalkHttpAuthHandler, XWalkContentsClientCallbackHelper, XWalkNavigationHistoryInternal

class XWalkContentsClientBridge extends XWalkContentsClient
    implements ContentViewDownloadDelegate
{
    abstract class _cls1UriCallback
        implements ValueCallback
    {

        boolean syncCallFinished;
        boolean syncNullReceived;
        final XWalkContentsClientBridge this$0;

        protected String resolveFileName(Uri uri, ContentResolver contentresolver)
        {
            if (contentresolver != null && uri != null) goto _L2; else goto _L1
_L1:
            uri = "";
_L4:
            return uri;
_L2:
            Object obj;
            ContentResolver contentresolver1;
            contentresolver1 = null;
            obj = null;
            contentresolver = contentresolver.query(uri, null, null, null, null);
            if (contentresolver == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = contentresolver;
            contentresolver1 = contentresolver;
            if (contentresolver.getCount() < 1)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = contentresolver;
            contentresolver1 = contentresolver;
            contentresolver.moveToFirst();
            obj = contentresolver;
            contentresolver1 = contentresolver;
            int i = contentresolver.getColumnIndex("_display_name");
            if (i <= -1)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = contentresolver;
            contentresolver1 = contentresolver;
            uri = contentresolver.getString(i);
            obj = uri;
            uri = ((Uri) (obj));
            if (contentresolver != null)
            {
                contentresolver.close();
                return ((String) (obj));
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (contentresolver != null)
            {
                contentresolver.close();
            }
            return "";
            uri;
            uri = "";
            if (obj == null) goto _L4; else goto _L5
_L5:
            ((Cursor) (obj)).close();
            return "";
            uri;
            if (contentresolver1 != null)
            {
                contentresolver1.close();
            }
            throw uri;
        }

        _cls1UriCallback()
        {
            this$0 = XWalkContentsClientBridge.this;
            super();
            syncNullReceived = false;
            syncCallFinished = false;
        }
    }

    private class InterceptNavigationDelegateImpl
        implements InterceptNavigationDelegate
    {

        private XWalkContentsClient mContentsClient;
        final XWalkContentsClientBridge this$0;

        public boolean shouldIgnoreNavigation(NavigationParams navigationparams)
        {
            String s = navigationparams.url;
            boolean flag;
            if (shouldOverrideUrlLoading(s) || mNavigationHandler != null && mNavigationHandler.handleNavigation(navigationparams))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                mContentsClient.getCallbackHelper().postOnPageStarted(s);
            }
            return flag;
        }

        public InterceptNavigationDelegateImpl(XWalkContentsClient xwalkcontentsclient)
        {
            this$0 = XWalkContentsClientBridge.this;
            super();
            mContentsClient = xwalkcontentsclient;
        }
    }


    private static final int NEW_ICON_DOWNLOAD = 101;
    private static final int NEW_XWALKVIEW_CREATED = 100;
    private static final String TAG = org/xwalk/core/internal/XWalkContentsClientBridge.getName();
    private DownloadListener mDownloadListener;
    private Bitmap mFavicon;
    private InterceptNavigationDelegate mInterceptNavigationDelegate;
    private boolean mIsFullscreen;
    private XWalkUIClientInternal.LoadStatusInternal mLoadStatus;
    private String mLoadingUrl;
    private long mNativeContentsClientBridge;
    private XWalkNavigationHandler mNavigationHandler;
    private XWalkNotificationService mNotificationService;
    private PageLoadListener mPageLoadListener;
    private float mPageScaleFactor;
    private Handler mUiThreadHandler;
    private XWalkClient mXWalkClient;
    private XWalkResourceClientInternal mXWalkResourceClient;
    private XWalkUIClientInternal mXWalkUIClient;
    private XWalkViewInternal mXWalkView;
    private XWalkWebChromeClient mXWalkWebChromeClient;

    public XWalkContentsClientBridge(XWalkViewInternal xwalkviewinternal)
    {
        mIsFullscreen = false;
        mLoadStatus = XWalkUIClientInternal.LoadStatusInternal.FINISHED;
        mLoadingUrl = null;
        mXWalkView = xwalkviewinternal;
        mInterceptNavigationDelegate = new InterceptNavigationDelegateImpl(this);
        mUiThreadHandler = new Handler() {

            final XWalkContentsClientBridge this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    throw new IllegalStateException();

                case 100: // 'd'
                    message = (XWalkViewInternal)message.obj;
                    if (message == mXWalkView)
                    {
                        throw new IllegalArgumentException("Parent XWalkView cannot host it's own popup window");
                    }
                    if (message != null && message.getNavigationHistory().size() != 0)
                    {
                        throw new IllegalArgumentException("New WebView for popup window must not have been previously navigated.");
                    } else
                    {
                        mXWalkView.completeWindowCreation(message);
                        return;
                    }

                case 101: // 'e'
                    message = (String)message.obj;
                    nativeDownloadIcon(mNativeContentsClientBridge, message);
                    return;
                }
            }

            
            {
                this$0 = XWalkContentsClientBridge.this;
                super();
            }
        };
    }

    private boolean allowCertificateError(int i, byte abyte0[], String s, final int id)
    {
        abyte0 = SslUtil.getCertificateFromDerBytes(abyte0);
        if (abyte0 == null)
        {
            return false;
        } else
        {
            abyte0 = SslUtil.sslErrorFromNetErrorCode(i, abyte0, s);
            onReceivedSslError(new ValueCallback() {

                final XWalkContentsClientBridge this$0;
                final int val$id;

                public void onReceiveValue(Boolean boolean1)
                {
                    proceedSslError(boolean1.booleanValue(), id);
                }

                public volatile void onReceiveValue(Object obj)
                {
                    onReceiveValue((Boolean)obj);
                }

            
            {
                this$0 = XWalkContentsClientBridge.this;
                id = i;
                super();
            }
            }, abyte0);
            return true;
        }
    }

    private void cancelNotification(int i)
    {
        mNotificationService.cancelNotification(i);
    }

    private void handleJsAlert(String s, String s1, int i)
    {
        if (isOwnerActivityRunning())
        {
            XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal = new XWalkJavascriptResultHandlerInternal(this, i);
            mXWalkUIClient.onJavascriptModalDialog(mXWalkView, XWalkUIClientInternal.JavascriptMessageTypeInternal.JAVASCRIPT_ALERT, s, s1, "", xwalkjavascriptresulthandlerinternal);
        }
    }

    private void handleJsBeforeUnload(String s, String s1, int i)
    {
        if (isOwnerActivityRunning())
        {
            XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal = new XWalkJavascriptResultHandlerInternal(this, i);
            mXWalkUIClient.onJavascriptModalDialog(mXWalkView, XWalkUIClientInternal.JavascriptMessageTypeInternal.JAVASCRIPT_BEFOREUNLOAD, s, s1, "", xwalkjavascriptresulthandlerinternal);
        }
    }

    private void handleJsConfirm(String s, String s1, int i)
    {
        if (isOwnerActivityRunning())
        {
            XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal = new XWalkJavascriptResultHandlerInternal(this, i);
            mXWalkUIClient.onJavascriptModalDialog(mXWalkView, XWalkUIClientInternal.JavascriptMessageTypeInternal.JAVASCRIPT_CONFIRM, s, s1, "", xwalkjavascriptresulthandlerinternal);
        }
    }

    private void handleJsPrompt(String s, String s1, String s2, int i)
    {
        if (isOwnerActivityRunning())
        {
            XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal = new XWalkJavascriptResultHandlerInternal(this, i);
            mXWalkUIClient.onJavascriptModalDialog(mXWalkView, XWalkUIClientInternal.JavascriptMessageTypeInternal.JAVASCRIPT_PROMPT, s, s1, s2, xwalkjavascriptresulthandlerinternal);
        }
    }

    private boolean isOwnerActivityRunning()
    {
        return mXWalkView != null && mXWalkView.isOwnerActivityRunning();
    }

    private native void nativeCancelJsResult(long l, int i);

    private native void nativeConfirmJsResult(long l, int i, String s);

    private native void nativeDownloadIcon(long l, String s);

    private native void nativeExitFullscreen(long l, long l1);

    private native void nativeNotificationClicked(long l, int i);

    private native void nativeNotificationClosed(long l, int i, boolean flag);

    private native void nativeNotificationDisplayed(long l, int i);

    private native void nativeNotificationError(long l, int i);

    private native void nativeOnFilesNotSelected(long l, int i, int j, int k);

    private native void nativeOnFilesSelected(long l, int i, int j, int k, String s, String s1);

    private native void nativeProceedSslError(long l, boolean flag, int i);

    private void proceedSslError(boolean flag, int i)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeProceedSslError(mNativeContentsClientBridge, flag, i);
            return;
        }
    }

    private void setNativeContentsClientBridge(long l)
    {
        mNativeContentsClientBridge = l;
    }

    private void showNotification(String s, String s1, String s2, int i)
    {
        mNotificationService.showNotification(s, s1, s2, i);
    }

    private void updateNotificationIcon(int i, Bitmap bitmap)
    {
        mNotificationService.updateNotificationIcon(i, bitmap);
    }

    void cancelJsResult(int i)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeCancelJsResult(mNativeContentsClientBridge, i);
            return;
        }
    }

    void confirmJsResult(int i, String s)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeConfirmJsResult(mNativeContentsClientBridge, i, s);
            return;
        }
    }

    public void didFinishLoad(String s)
    {
    }

    public void doUpdateVisitedHistory(String s, boolean flag)
    {
    }

    void exitFullscreen(long l)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeExitFullscreen(mNativeContentsClientBridge, l);
            return;
        }
    }

    public ContentVideoViewClient getContentVideoViewClient()
    {
        return new XWalkContentVideoViewClient(this, mXWalkView.getActivity(), mXWalkView);
    }

    public InterceptNavigationDelegate getInterceptNavigationDelegate()
    {
        return mInterceptNavigationDelegate;
    }

    public void getVisitedHistory(ValueCallback valuecallback)
    {
    }

    public XWalkWebChromeClient getXWalkWebChromeClient()
    {
        return mXWalkWebChromeClient;
    }

    public boolean hasEnteredFullscreen()
    {
        return mIsFullscreen;
    }

    public void notificationClicked(int i)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeNotificationClicked(mNativeContentsClientBridge, i);
            return;
        }
    }

    public void notificationClosed(int i, boolean flag)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeNotificationClosed(mNativeContentsClientBridge, i, flag);
            return;
        }
    }

    public void notificationDisplayed(int i)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeNotificationDisplayed(mNativeContentsClientBridge, i);
            return;
        }
    }

    public void notificationError(int i)
    {
        if (mNativeContentsClientBridge == 0L)
        {
            return;
        } else
        {
            nativeNotificationError(mNativeContentsClientBridge, i);
            return;
        }
    }

    public void onCloseWindow()
    {
        if (isOwnerActivityRunning())
        {
            mXWalkUIClient.onJavascriptCloseWindow(mXWalkView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        return false;
    }

    public boolean onCreateWindow(boolean flag, boolean flag1)
    {
        if (flag)
        {
            return false;
        }
        XWalkUIClientInternal.InitiateByInternal initiatebyinternal = XWalkUIClientInternal.InitiateByInternal.BY_JAVASCRIPT;
        if (flag1)
        {
            initiatebyinternal = XWalkUIClientInternal.InitiateByInternal.BY_USER_GESTURE;
        }
        ValueCallback valuecallback = new ValueCallback() {

            final XWalkContentsClientBridge this$0;

            public volatile void onReceiveValue(Object obj)
            {
                onReceiveValue((XWalkViewInternal)obj);
            }

            public void onReceiveValue(XWalkViewInternal xwalkviewinternal)
            {
                mUiThreadHandler.obtainMessage(100, xwalkviewinternal).sendToTarget();
            }

            
            {
                this$0 = XWalkContentsClientBridge.this;
                super();
            }
        };
        return mXWalkUIClient.onCreateWindowRequested(mXWalkView, initiatebyinternal, valuecallback);
    }

    public void onDangerousDownload(String s, int i)
    {
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
    }

    public void onDownloadStarted(String s, String s1)
    {
    }

    public void onFindResultReceived(int i, int j, boolean flag)
    {
    }

    public void onFormResubmission(Message message, Message message1)
    {
        message.sendToTarget();
    }

    public void onGeolocationPermissionsHidePrompt()
    {
        if (mXWalkWebChromeClient != null && isOwnerActivityRunning())
        {
            mXWalkWebChromeClient.onGeolocationPermissionsHidePrompt();
        }
    }

    public void onGeolocationPermissionsShowPrompt(String s, XWalkGeolocationPermissions.Callback callback)
    {
        if (mXWalkWebChromeClient != null && isOwnerActivityRunning())
        {
            mXWalkWebChromeClient.onGeolocationPermissionsShowPrompt(s, callback);
        }
    }

    public void onHideCustomView()
    {
        if (mXWalkWebChromeClient != null && isOwnerActivityRunning())
        {
            mXWalkWebChromeClient.onHideCustomView();
        }
    }

    public void onIconAvailable(String s)
    {
        Message message = mUiThreadHandler.obtainMessage(101, s);
        mXWalkUIClient.onIconAvailable(mXWalkView, s, message);
    }

    public void onLoadResource(String s)
    {
        if (mXWalkClient != null && isOwnerActivityRunning())
        {
            mXWalkClient.onLoadResource(mXWalkView, s);
        }
    }

    public boolean onNewIntent(Intent intent)
    {
        return mNotificationService.maybeHandleIntent(intent);
    }

    public void onNewPicture(Picture picture)
    {
    }

    public void onPageFinished(String s)
    {
        if (!isOwnerActivityRunning())
        {
            return;
        }
        if (mPageLoadListener != null)
        {
            mPageLoadListener.onPageFinished(s);
        }
        if (mXWalkUIClient != null)
        {
            if (mLoadStatus == XWalkUIClientInternal.LoadStatusInternal.CANCELLED && mLoadingUrl != null)
            {
                mXWalkUIClient.onPageLoadStopped(mXWalkView, mLoadingUrl, mLoadStatus);
            } else
            {
                mXWalkUIClient.onPageLoadStopped(mXWalkView, s, mLoadStatus);
            }
            mLoadingUrl = null;
        }
        onResourceLoadFinished(s);
    }

    public void onPageStarted(String s)
    {
        if (mXWalkUIClient != null && isOwnerActivityRunning())
        {
            mLoadingUrl = s;
            mLoadStatus = XWalkUIClientInternal.LoadStatusInternal.FINISHED;
            mXWalkUIClient.onPageLoadStarted(mXWalkView, s);
        }
    }

    public void onProgressChanged(int i)
    {
        if (isOwnerActivityRunning())
        {
            mXWalkResourceClient.onProgressChanged(mXWalkView, i);
        }
    }

    public void onReceivedError(int i, String s, String s1)
    {
        if (isOwnerActivityRunning())
        {
            if (mLoadingUrl != null && mLoadingUrl.equals(s1))
            {
                mLoadStatus = XWalkUIClientInternal.LoadStatusInternal.FAILED;
            }
            mXWalkResourceClient.onReceivedLoadError(mXWalkView, i, s, s1);
        }
    }

    public void onReceivedHttpAuthRequest(XWalkHttpAuthHandler xwalkhttpauthhandler, String s, String s1)
    {
        if (mXWalkClient != null && isOwnerActivityRunning())
        {
            mXWalkClient.onReceivedHttpAuthRequest(mXWalkView, xwalkhttpauthhandler, s, s1);
        }
    }

    public void onReceivedIcon(Bitmap bitmap)
    {
        if (mXWalkWebChromeClient != null && mXWalkView != null)
        {
            mXWalkWebChromeClient.onReceivedIcon(mXWalkView, bitmap);
        }
        mFavicon = bitmap;
    }

    public void onReceivedIcon(String s, Bitmap bitmap)
    {
        mXWalkUIClient.onReceivedIcon(mXWalkView, s, bitmap);
    }

    public void onReceivedLoginRequest(String s, String s1, String s2)
    {
    }

    public void onReceivedSslError(ValueCallback valuecallback, SslError sslerror)
    {
        if (mXWalkResourceClient != null && isOwnerActivityRunning())
        {
            mXWalkResourceClient.onReceivedSslError(mXWalkView, valuecallback, sslerror);
        }
    }

    public void onRendererResponsive()
    {
        if (mXWalkClient != null && isOwnerActivityRunning())
        {
            mXWalkClient.onRendererResponsive(mXWalkView);
        }
    }

    public void onRendererUnresponsive()
    {
        if (mXWalkClient != null && isOwnerActivityRunning())
        {
            mXWalkClient.onRendererUnresponsive(mXWalkView);
        }
    }

    public void onRequestFocus()
    {
        if (isOwnerActivityRunning())
        {
            mXWalkUIClient.onRequestFocus(mXWalkView);
        }
    }

    public void onResourceLoadFinished(String s)
    {
        if (isOwnerActivityRunning())
        {
            mXWalkResourceClient.onLoadFinished(mXWalkView, s);
        }
    }

    public void onResourceLoadStarted(String s)
    {
        if (isOwnerActivityRunning())
        {
            mXWalkResourceClient.onLoadStarted(mXWalkView, s);
        }
    }

    public void onScaleChangedScaled(float f, float f1)
    {
        if (isOwnerActivityRunning())
        {
            mXWalkUIClient.onScaleChanged(mXWalkView, f, f1);
        }
    }

    public void onShowCustomView(View view, XWalkWebChromeClient.CustomViewCallback customviewcallback)
    {
        if (mXWalkWebChromeClient != null && isOwnerActivityRunning())
        {
            mXWalkWebChromeClient.onShowCustomView(view, customviewcallback);
        }
    }

    protected void onStopLoading()
    {
        mLoadStatus = XWalkUIClientInternal.LoadStatusInternal.CANCELLED;
    }

    public void onTitleChanged(String s)
    {
        if (mXWalkUIClient != null && isOwnerActivityRunning())
        {
            mXWalkUIClient.onReceivedTitle(mXWalkView, s);
        }
    }

    public void onToggleFullscreen(boolean flag)
    {
        if (isOwnerActivityRunning())
        {
            mIsFullscreen = flag;
            mXWalkUIClient.onFullscreenToggled(mXWalkView, flag);
        }
    }

    public void onUnhandledKeyEvent(KeyEvent keyevent)
    {
        if (mXWalkUIClient != null && mXWalkView != null)
        {
            mXWalkUIClient.onUnhandledKeyEvent(mXWalkView, keyevent);
        }
    }

    public void onWebLayoutPageScaleFactorChanged(float f)
    {
        if (mPageScaleFactor == f)
        {
            return;
        } else
        {
            float f1 = mPageScaleFactor;
            mPageScaleFactor = f;
            onScaleChanged(f1, mPageScaleFactor);
            return;
        }
    }

    void registerPageLoadListener(PageLoadListener pageloadlistener)
    {
        mPageLoadListener = pageloadlistener;
    }

    public void requestHttpGetDownload(DownloadInfo downloadinfo)
    {
        if (mDownloadListener != null)
        {
            mDownloadListener.onDownloadStart(downloadinfo.getUrl(), downloadinfo.getUserAgent(), downloadinfo.getContentDisposition(), downloadinfo.getMimeType(), downloadinfo.getContentLength());
        }
    }

    void setDownloadListener(DownloadListener downloadlistener)
    {
        mDownloadListener = downloadlistener;
    }

    public void setNavigationHandler(XWalkNavigationHandler xwalknavigationhandler)
    {
        mNavigationHandler = xwalknavigationhandler;
    }

    public void setNotificationService(XWalkNotificationService xwalknotificationservice)
    {
        if (mNotificationService != null)
        {
            mNotificationService.shutdown();
        }
        mNotificationService = xwalknotificationservice;
        if (mNotificationService != null)
        {
            mNotificationService.setBridge(this);
        }
    }

    public void setResourceClient(XWalkResourceClientInternal xwalkresourceclientinternal)
    {
        if (xwalkresourceclientinternal != null)
        {
            mXWalkResourceClient = xwalkresourceclientinternal;
            return;
        } else
        {
            mXWalkResourceClient = new XWalkResourceClientInternal(mXWalkView);
            return;
        }
    }

    public void setUIClient(XWalkUIClientInternal xwalkuiclientinternal)
    {
        if (xwalkuiclientinternal != null)
        {
            mXWalkUIClient = xwalkuiclientinternal;
            return;
        } else
        {
            mXWalkUIClient = new XWalkUIClientInternal(mXWalkView);
            return;
        }
    }

    public void setXWalkClient(XWalkClient xwalkclient)
    {
        mXWalkClient = xwalkclient;
    }

    public void setXWalkWebChromeClient(XWalkWebChromeClient xwalkwebchromeclient)
    {
        if (xwalkwebchromeclient == null)
        {
            return;
        } else
        {
            xwalkwebchromeclient.setContentsClient(this);
            mXWalkWebChromeClient = xwalkwebchromeclient;
            return;
        }
    }

    public WebResourceResponse shouldInterceptRequest(String s)
    {
        if (isOwnerActivityRunning())
        {
            return mXWalkResourceClient.shouldInterceptLoadRequest(mXWalkView, s);
        } else
        {
            return null;
        }
    }

    public boolean shouldOpenWithDefaultBrowser(String s)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        try
        {
            mXWalkView.getActivity().startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(TAG, "Activity not found for Intent:");
            return false;
        }
        return true;
    }

    public boolean shouldOverrideKeyEvent(KeyEvent keyevent)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mXWalkUIClient != null)
        {
            flag = flag1;
            if (mXWalkView != null)
            {
                flag = mXWalkUIClient.shouldOverrideKeyEvent(mXWalkView, keyevent);
            }
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = super.shouldOverrideKeyEvent(keyevent);
        }
        return flag1;
    }

    public boolean shouldOverrideRunFileChooser(final int processId, final int renderId, final int modeFlags, String s, boolean flag)
    {
        boolean flag1 = true;
        if (!isOwnerActivityRunning())
        {
            return false;
        }
        _cls1UriCallback _lcls1uricallback = new _cls1UriCallback() {

            boolean completed;
            final XWalkContentsClientBridge this$0;
            final int val$modeFlags;
            final int val$processId;
            final int val$renderId;

            public void onReceiveValue(Uri uri)
            {
label0:
                {
                    if (completed)
                    {
                        throw new IllegalStateException("Duplicate openFileChooser result");
                    }
                    if (uri == null && !syncCallFinished)
                    {
                        syncNullReceived = true;
                        return;
                    }
                    completed = true;
                    if (uri == null)
                    {
                        nativeOnFilesNotSelected(mNativeContentsClientBridge, processId, renderId, modeFlags);
                        return;
                    }
                    String s1;
                    Object obj;
                    if ("file".equals(uri.getScheme()))
                    {
                        String s2 = uri.getSchemeSpecificPart();
                        s1 = uri.getLastPathSegment();
                        uri = s2;
                    } else
                    if ("content".equals(uri.getScheme()))
                    {
                        s1 = uri.toString();
                        String s3 = resolveFileName(uri, mXWalkView.getActivity().getContentResolver());
                        uri = s1;
                        s1 = s3;
                    } else
                    {
                        s1 = uri.getPath();
                        String s4 = uri.getLastPathSegment();
                        uri = s1;
                        s1 = s4;
                    }
                    if (s1 != null)
                    {
                        obj = s1;
                        if (!s1.isEmpty())
                        {
                            break label0;
                        }
                    }
                    obj = uri;
                }
                nativeOnFilesSelected(mNativeContentsClientBridge, processId, renderId, modeFlags, uri, ((String) (obj)));
            }

            public volatile void onReceiveValue(Object obj)
            {
                onReceiveValue((Uri)obj);
            }

            
            {
                this$0 = XWalkContentsClientBridge.this;
                processId = i;
                renderId = j;
                modeFlags = k;
                super();
                completed = false;
            }
        };
        mXWalkUIClient.openFileChooser(mXWalkView, _lcls1uricallback, s, Boolean.toString(flag));
        _lcls1uricallback.syncCallFinished = true;
        if (((_cls1UriCallback) (_lcls1uricallback)).syncNullReceived)
        {
            return mXWalkView.showFileChooser(_lcls1uricallback, s, Boolean.toString(flag));
        }
        if (!((_cls1UriCallback) (_lcls1uricallback)).syncNullReceived)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public boolean shouldOverrideUrlLoading(String s)
    {
        if (mXWalkResourceClient != null && mXWalkView != null)
        {
            return mXWalkResourceClient.shouldOverrideUrlLoading(mXWalkView, s);
        } else
        {
            return false;
        }
    }









}
