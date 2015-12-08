// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.widget.FrameLayout;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content.browser.ContentView;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.content.browser.ContentViewRenderView;
import org.chromium.content.browser.ContentViewStatics;
import org.chromium.content.common.CleanupReference;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHistory;
import org.chromium.content_public.browser.WebContents;
import org.chromium.media.MediaPlayerBridge;
import org.chromium.ui.base.ActivityWindowAndroid;
import org.chromium.ui.gfx.DeviceDisplayInfo;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge, XWalkWebContentsDelegateAdapter, XWalkViewInternal, XWalkGeolocationPermissions, 
//            InMemorySharedPreferences, XWalkMediaPlayerResourceLoadingFilter, XWalkPreferencesInternal, XWalkSettings, 
//            XWalkLaunchScreenManager, XWalkDevToolsServer, XWalkNavigationHistoryInternal, XWalkContentsClient, 
//            AndroidProtocolHandler, XWalkContentsIoThreadClient, XWalkWebChromeClient, DownloadListener, 
//            XWalkNavigationHandler, XWalkNotificationService, XWalkResourceClientInternal, XWalkUIClientInternal, 
//            XWalkClient, XWalkContentsClientCallbackHelper, InterceptedRequestData

class XWalkContent extends FrameLayout
    implements XWalkPreferencesInternal.KeyValueChangeListener
{
    private static final class DestroyRunnable
        implements Runnable
    {

        private final long mNativeContent;

        public void run()
        {
            XWalkContent.nativeDestroy(mNativeContent);
        }

        private DestroyRunnable(long l)
        {
            mNativeContent = l;
        }

        DestroyRunnable(long l, _cls1 _pcls1)
        {
            this(l);
        }
    }

    private class XWalkGeolocationCallback
        implements XWalkGeolocationPermissions.Callback
    {

        final XWalkContent this$0;

        public void invoke(String s, final boolean allow, final boolean retain)
        {
            ThreadUtils.runOnUiThread(s. new Runnable() {

                final XWalkGeolocationCallback this$1;
                final boolean val$allow;
                final String val$origin;
                final boolean val$retain;

                public void run()
                {
                    if (retain)
                    {
                        if (allow)
                        {
                            mGeolocationPermissions.allow(origin);
                        } else
                        {
                            mGeolocationPermissions.deny(origin);
                        }
                    }
                    nativeInvokeGeolocationCallback(mNativeContent, allow, origin);
                }

            
            {
                this$1 = final_xwalkgeolocationcallback;
                retain = flag;
                allow = flag1;
                origin = String.this;
                super();
            }
            });
        }

        private XWalkGeolocationCallback()
        {
            this$0 = XWalkContent.this;
            super();
        }

    }

    private class XWalkIoThreadClientImpl
        implements XWalkContentsIoThreadClient
    {

        final XWalkContent this$0;

        public int getCacheMode()
        {
            return mSettings.getCacheMode();
        }

        public void newLoginRequest(String s, String s1, String s2)
        {
            mContentsClientBridge.getCallbackHelper().postOnReceivedLoginRequest(s, s1, s2);
        }

        public void onDownloadStart(String s, String s1, String s2, String s3, long l)
        {
            mContentsClientBridge.getCallbackHelper().postOnDownloadStart(s, s1, s2, s3, l);
        }

        public boolean shouldBlockContentUrls()
        {
            return !mSettings.getAllowContentAccess();
        }

        public boolean shouldBlockFileUrls()
        {
            return !mSettings.getAllowFileAccess();
        }

        public boolean shouldBlockNetworkLoads()
        {
            return mSettings.getBlockNetworkLoads();
        }

        public InterceptedRequestData shouldInterceptRequest(String s, boolean flag)
        {
            mContentsClientBridge.getCallbackHelper().postOnResourceLoadStarted(s);
            WebResourceResponse webresourceresponse = mContentsClientBridge.shouldInterceptRequest(s);
            if (webresourceresponse == null)
            {
                mContentsClientBridge.getCallbackHelper().postOnLoadResource(s);
                return null;
            }
            if (flag && webresourceresponse.getData() == null)
            {
                mContentsClientBridge.getCallbackHelper().postOnReceivedError(-1, null, s);
            }
            return new InterceptedRequestData(webresourceresponse.getMimeType(), webresourceresponse.getEncoding(), webresourceresponse.getData());
        }

        private XWalkIoThreadClientImpl()
        {
            this$0 = XWalkContent.this;
            super();
        }

    }


    static final boolean $assertionsDisabled;
    public static final String SAVE_RESTORE_STATE_KEY = "XWALKVIEW_STATE";
    private static String TAG = "XWalkContent";
    private static Class javascriptInterfaceClass = null;
    private static boolean timerPaused = false;
    private CleanupReference mCleanupReference;
    private ContentView mContentView;
    private ContentViewCore mContentViewCore;
    private ContentViewRenderView mContentViewRenderView;
    private XWalkContentsClientBridge mContentsClientBridge;
    private XWalkDevToolsServer mDevToolsServer;
    private XWalkGeolocationPermissions mGeolocationPermissions;
    private XWalkContentsIoThreadClient mIoThreadClient;
    private XWalkLaunchScreenManager mLaunchScreenManager;
    long mNativeContent;
    long mNativeWebContents;
    private NavigationController mNavigationController;
    private XWalkSettings mSettings;
    private WebContents mWebContents;
    private ActivityWindowAndroid mWindow;
    private XWalkWebContentsDelegateAdapter mXWalkContentsDelegateAdapter;
    private XWalkViewInternal mXWalkView;

    public XWalkContent(Context context, AttributeSet attributeset, XWalkViewInternal xwalkviewinternal)
    {
        super(context, attributeset);
        mXWalkView = xwalkviewinternal;
        mContentsClientBridge = new XWalkContentsClientBridge(mXWalkView);
        mXWalkContentsDelegateAdapter = new XWalkWebContentsDelegateAdapter(mContentsClientBridge);
        mIoThreadClient = new XWalkIoThreadClientImpl();
        mWindow = new ActivityWindowAndroid(xwalkviewinternal.getActivity());
        mGeolocationPermissions = new XWalkGeolocationPermissions(new InMemorySharedPreferences());
        MediaPlayerBridge.setResourceLoadingFilter(new XWalkMediaPlayerResourceLoadingFilter());
        setNativeContent(nativeInit());
        XWalkPreferencesInternal.load(this);
    }

    private native void nativeClearCache(long l, boolean flag);

    private static native void nativeDestroy(long l);

    private native String nativeDevToolsAgentId(long l);

    private native int nativeGetRoutingID(long l);

    private native byte[] nativeGetState(long l);

    private native String nativeGetVersion(long l);

    private native long nativeGetWebContents(long l);

    private native long nativeInit();

    private native void nativeInvokeGeolocationCallback(long l, boolean flag, String s);

    private native long nativeReleasePopupXWalkContent(long l);

    private native void nativeSetJavaPeers(long l, XWalkContent xwalkcontent, XWalkWebContentsDelegateAdapter xwalkwebcontentsdelegateadapter, XWalkContentsClientBridge xwalkcontentsclientbridge, XWalkContentsIoThreadClient xwalkcontentsiothreadclient, InterceptNavigationDelegate interceptnavigationdelegate);

    private native void nativeSetJsOnlineProperty(long l, boolean flag);

    private native boolean nativeSetManifest(long l, String s, String s1);

    private native boolean nativeSetState(long l, byte abyte0[]);

    private void onGeolocationPermissionsShowPrompt(String s)
    {
        if (mNativeContent == 0L)
        {
            return;
        }
        if (!mSettings.getGeolocationEnabled())
        {
            nativeInvokeGeolocationCallback(mNativeContent, false, s);
            return;
        }
        if (mGeolocationPermissions.hasOrigin(s))
        {
            nativeInvokeGeolocationCallback(mNativeContent, mGeolocationPermissions.isOriginAllowed(s), s);
            return;
        } else
        {
            mContentsClientBridge.onGeolocationPermissionsShowPrompt(s, new XWalkGeolocationCallback());
            return;
        }
    }

    private void receivePopupContents(long l)
    {
        setNativeContent(l);
        mContentViewCore.onShow();
    }

    static void setJavascriptInterfaceClass(Class class1)
    {
        if (!$assertionsDisabled && javascriptInterfaceClass != null)
        {
            throw new AssertionError();
        } else
        {
            javascriptInterfaceClass = class1;
            return;
        }
    }

    private void setNativeContent(long l)
    {
        if (mNativeContent != 0L)
        {
            destroy();
            mContentViewCore = null;
        }
        if (!$assertionsDisabled && (mNativeContent != 0L || mCleanupReference != null || mContentViewCore != null))
        {
            throw new AssertionError();
        }
        org.chromium.content.browser.ContentViewRenderView.CompositingSurfaceType compositingsurfacetype;
        if (XWalkPreferencesInternal.getValue("animatable-xwalk-view"))
        {
            compositingsurfacetype = org.chromium.content.browser.ContentViewRenderView.CompositingSurfaceType.TEXTURE_VIEW;
        } else
        {
            compositingsurfacetype = org.chromium.content.browser.ContentViewRenderView.CompositingSurfaceType.SURFACE_VIEW;
        }
        mContentViewRenderView = new ContentViewRenderView(getContext(), compositingsurfacetype) {

            final XWalkContent this$0;

            protected void onReadyToRender()
            {
            }

            
            {
                this$0 = XWalkContent.this;
                super(context, compositingsurfacetype);
            }
        };
        mContentViewRenderView.onNativeLibraryLoaded(mWindow);
        mLaunchScreenManager = new XWalkLaunchScreenManager(getContext(), mXWalkView);
        mContentViewRenderView.registerFirstRenderedFrameListener(mLaunchScreenManager);
        addView(mContentViewRenderView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        mNativeContent = l;
        mCleanupReference = new CleanupReference(this, new DestroyRunnable(mNativeContent));
        mNativeWebContents = nativeGetWebContents(mNativeContent);
        mContentViewCore = new ContentViewCore(getContext());
        mContentView = ContentView.newInstance(getContext(), mContentViewCore);
        mContentViewCore.initialize(mContentView, mContentView, mNativeWebContents, mWindow);
        mWebContents = mContentViewCore.getWebContents();
        mNavigationController = mWebContents.getNavigationController();
        addView(mContentView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        mContentViewCore.setContentViewClient(mContentsClientBridge);
        mContentViewRenderView.setCurrentContentViewCore(mContentViewCore);
        mContentsClientBridge.installWebContentsObserver(mWebContents);
        mContentsClientBridge.setDIPScale(DeviceDisplayInfo.create(getContext()).getDIPScale());
        mContentViewCore.setDownloadDelegate(mContentsClientBridge);
        mSettings = new XWalkSettings(getContext(), mNativeWebContents, false);
        mSettings.setAllowFileAccessFromFileURLs(true);
        mSettings.setSupportMultipleWindows(true);
        nativeSetJavaPeers(mNativeContent, this, mXWalkContentsDelegateAdapter, mContentsClientBridge, mIoThreadClient, mContentsClientBridge.getInterceptNavigationDelegate());
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentViewCore.addPossiblyUnsafeJavascriptInterface(obj, s, javascriptInterfaceClass);
            return;
        }
    }

    public boolean canGoBack()
    {
        if (mNativeContent == 0L)
        {
            return false;
        } else
        {
            return mNavigationController.canGoBack();
        }
    }

    public boolean canGoForward()
    {
        if (mNativeContent == 0L)
        {
            return false;
        } else
        {
            return mNavigationController.canGoForward();
        }
    }

    public void clearCache(boolean flag)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            nativeClearCache(mNativeContent, flag);
            return;
        }
    }

    public void clearHistory()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mNavigationController.clearHistory();
            return;
        }
    }

    public void destroy()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            XWalkPreferencesInternal.unload(this);
            setNotificationService(null);
            removeView(mContentView);
            removeView(mContentViewRenderView);
            mContentViewRenderView.setCurrentContentViewCore(null);
            mContentViewRenderView.destroy();
            mContentViewCore.destroy();
            mCleanupReference.cleanupNow();
            mCleanupReference = null;
            mNativeContent = 0L;
            return;
        }
    }

    public String devToolsAgentId()
    {
        if (mNativeContent == 0L)
        {
            return "";
        } else
        {
            return nativeDevToolsAgentId(mNativeContent);
        }
    }

    void disableRemoteDebugging()
    {
        if (mDevToolsServer == null)
        {
            return;
        }
        if (mDevToolsServer.isRemoteDebuggingEnabled())
        {
            mDevToolsServer.setRemoteDebuggingEnabled(false);
        }
        mDevToolsServer.destroy();
        mDevToolsServer = null;
    }

    void doLoadUrl(String s, String s1)
    {
        if (s != null && !s.isEmpty() && TextUtils.equals(s, mWebContents.getUrl()))
        {
            mNavigationController.reload(true);
        } else
        {
            if (s1 == null || s1.isEmpty())
            {
                s = new LoadUrlParams(s);
            } else
            {
                s = LoadUrlParams.createLoadDataParamsWithBaseUrl(s1, "text/html", false, s, null);
            }
            s.setOverrideUserAgent(2);
            mNavigationController.loadUrl(s);
        }
        mContentView.requestFocus();
    }

    public void enableRemoteDebugging()
    {
        String s = (new StringBuilder()).append(getContext().getApplicationContext().getPackageName()).append("_devtools_remote").toString();
        if (mDevToolsServer == null)
        {
            mDevToolsServer = new XWalkDevToolsServer(s);
            mDevToolsServer.setRemoteDebuggingEnabled(true, XWalkDevToolsServer.Security.ALLOW_SOCKET_ACCESS);
        }
    }

    public void evaluateJavascript(String s, final ValueCallback fCallback)
    {
        if (mNativeContent == 0L)
        {
            return;
        }
        JavaScriptCallback javascriptcallback = null;
        if (fCallback != null)
        {
            javascriptcallback = new JavaScriptCallback() {

                final XWalkContent this$0;
                final ValueCallback val$fCallback;

                public void handleJavaScriptResult(String s1)
                {
                    fCallback.onReceiveValue(s1);
                }

            
            {
                this$0 = XWalkContent.this;
                fCallback = valuecallback;
                super();
            }
            };
        }
        mContentViewCore.evaluateJavaScript(s, javascriptcallback);
    }

    void exitFullscreen()
    {
        if (hasEnteredFullscreen())
        {
            mContentsClientBridge.exitFullscreen(mNativeWebContents);
        }
    }

    public ContentViewCore getContentViewCoreForTest()
    {
        return mContentViewCore;
    }

    public XWalkNavigationHistoryInternal getNavigationHistory()
    {
        if (mNativeContent == 0L)
        {
            return null;
        } else
        {
            return new XWalkNavigationHistoryInternal(mXWalkView, mNavigationController.getNavigationHistory());
        }
    }

    public String getOriginalUrl()
    {
        if (mNativeContent != 0L)
        {
            NavigationHistory navigationhistory = mNavigationController.getNavigationHistory();
            int i = navigationhistory.getCurrentEntryIndex();
            if (i >= 0 && i < navigationhistory.getEntryCount())
            {
                return navigationhistory.getEntryAtIndex(i).getOriginalUrl();
            }
        }
        return null;
    }

    public String getRemoteDebuggingUrl()
    {
        if (mDevToolsServer == null)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append("ws://").append(mDevToolsServer.getSocketName()).append("/devtools/page/").append(devToolsAgentId()).toString();
        }
    }

    public int getRoutingID()
    {
        return nativeGetRoutingID(mNativeContent);
    }

    public XWalkSettings getSettings()
    {
        return mSettings;
    }

    public String getTitle()
    {
        String s;
        if (mNativeContent == 0L)
        {
            s = null;
        } else
        {
            String s1 = mWebContents.getTitle().trim();
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        }
        return s;
    }

    public String getUrl()
    {
        if (mNativeContent != 0L) goto _L2; else goto _L1
_L1:
        String s = null;
_L4:
        return s;
_L2:
        String s1;
        s1 = mWebContents.getUrl();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        if (!s1.trim().isEmpty()) goto _L4; else goto _L3
_L3:
        return null;
    }

    public String getXWalkVersion()
    {
        if (mNativeContent == 0L)
        {
            return "";
        } else
        {
            return nativeGetVersion(mNativeContent);
        }
    }

    public XWalkWebChromeClient getXWalkWebChromeClient()
    {
        if (mNativeContent == 0L)
        {
            return null;
        } else
        {
            return mContentsClientBridge.getXWalkWebChromeClient();
        }
    }

    public void goBack()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mNavigationController.goBack();
            return;
        }
    }

    public void goForward()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mNavigationController.goForward();
            return;
        }
    }

    boolean hasEnteredFullscreen()
    {
        return mContentsClientBridge.hasEnteredFullscreen();
    }

    public void installWebContentsObserverForTest(XWalkContentsClient xwalkcontentsclient)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            xwalkcontentsclient.installWebContentsObserver(mContentViewCore.getWebContents());
            return;
        }
    }

    public void loadAppFromManifest(String s, String s1)
    {
        if (mNativeContent != 0L && (s != null && !s.isEmpty() || s1 != null && !s1.isEmpty()))
        {
            String s2 = s1;
            int i;
            if (s1 == null || s1.isEmpty())
            {
                try
                {
                    s2 = AndroidProtocolHandler.getUrlContent(mXWalkView.getActivity(), s);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    throw new RuntimeException((new StringBuilder()).append("Failed to read the manifest: ").append(s).toString());
                }
            }
            s1 = s;
            i = s.lastIndexOf("/");
            if (i != -1)
            {
                s1 = s.substring(0, i + 1);
            } else
            {
                Log.w(TAG, "The url of manifest.json is probably not set correctly.");
            }
            if (!nativeSetManifest(mNativeContent, s1, s2))
            {
                throw new RuntimeException((new StringBuilder()).append("Failed to parse the manifest file: ").append(s).toString());
            }
        }
    }

    public void loadUrl(String s, String s1)
    {
        while (mNativeContent == 0L || (s == null || s.isEmpty()) && (s1 == null || s1.isEmpty())) 
        {
            return;
        }
        doLoadUrl(s, s1);
    }

    void navigateTo(int i)
    {
        mNavigationController.goToOffset(i);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mWindow.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onGeolocationPermissionsHidePrompt()
    {
        mContentsClientBridge.onGeolocationPermissionsHidePrompt();
    }

    public void onGetFullscreenFlagFromManifest(boolean flag)
    {
label0:
        {
            if (flag)
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    break label0;
                }
                mXWalkView.getActivity().getWindow().getDecorView().setSystemUiVisibility(5894);
            }
            return;
        }
        mXWalkView.getActivity().getWindow().addFlags(1024);
    }

    public void onGetUrlAndLaunchScreenFromManifest(String s, String s1, String s2)
    {
        if (s == null || s.isEmpty())
        {
            return;
        } else
        {
            mLaunchScreenManager.displayLaunchScreen(s1, s2);
            mContentsClientBridge.registerPageLoadListener(mLaunchScreenManager);
            loadUrl(s, null);
            return;
        }
    }

    public void onGetUrlFromManifest(String s)
    {
        if (s != null && !s.isEmpty())
        {
            loadUrl(s, null);
        }
    }

    public void onKeyValueChanged(String s, XWalkPreferencesInternal.PreferenceValue preferencevalue)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (s.equals("remote-debugging"))
        {
            if (preferencevalue.getBooleanValue())
            {
                enableRemoteDebugging();
                return;
            } else
            {
                disableRemoteDebugging();
                return;
            }
        }
        if (!s.equals("enable-javascript"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (mSettings != null)
        {
            mSettings.setJavaScriptEnabled(preferencevalue.getBooleanValue());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!s.equals("javascript-can-open-window"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (mSettings != null)
        {
            mSettings.setJavaScriptCanOpenWindowsAutomatically(preferencevalue.getBooleanValue());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!s.equals("allow-universal-access-from-file"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mSettings == null) goto _L1; else goto _L5
_L5:
        mSettings.setAllowUniversalAccessFromFileURLs(preferencevalue.getBooleanValue());
        return;
        if (!s.equals("support-multiple-windows") || mSettings == null) goto _L1; else goto _L6
_L6:
        mSettings.setSupportMultipleWindows(preferencevalue.getBooleanValue());
        return;
    }

    public boolean onNewIntent(Intent intent)
    {
        if (mNativeContent == 0L)
        {
            return false;
        } else
        {
            return mContentsClientBridge.onNewIntent(intent);
        }
    }

    public void onPause()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentViewCore.onHide();
            return;
        }
    }

    public void onResume()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentViewCore.onShow();
            return;
        }
    }

    public void pauseTimers()
    {
        if (timerPaused || mNativeContent == 0L)
        {
            return;
        } else
        {
            ContentViewStatics.setWebKitSharedTimersSuspended(true);
            timerPaused = true;
            return;
        }
    }

    public void reload(int i)
    {
        if (mNativeContent == 0L)
        {
            return;
        }
        switch (i)
        {
        default:
            mNavigationController.reload(true);
            return;

        case 1: // '\001'
            mNavigationController.reloadIgnoringCache(true);
            break;
        }
    }

    public XWalkNavigationHistoryInternal restoreState(Bundle bundle)
    {
        if (mNativeContent != 0L && bundle != null)
        {
            if ((bundle = bundle.getByteArray("XWALKVIEW_STATE")) != null)
            {
                boolean flag = nativeSetState(mNativeContent, bundle);
                if (flag)
                {
                    mContentsClientBridge.onUpdateTitle(mWebContents.getTitle());
                }
                if (flag)
                {
                    return getNavigationHistory();
                }
            }
        }
        return null;
    }

    public void resumeTimers()
    {
        if (!timerPaused || mNativeContent == 0L)
        {
            return;
        } else
        {
            ContentViewStatics.setWebKitSharedTimersSuspended(false);
            timerPaused = false;
            return;
        }
    }

    public XWalkNavigationHistoryInternal saveState(Bundle bundle)
    {
        byte abyte0[];
        if (mNativeContent != 0L && bundle != null)
        {
            if ((abyte0 = nativeGetState(mNativeContent)) != null)
            {
                bundle.putByteArray("XWALKVIEW_STATE", abyte0);
                return getNavigationHistory();
            }
        }
        return null;
    }

    public void setDownloadListener(DownloadListener downloadlistener)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setDownloadListener(downloadlistener);
            return;
        }
    }

    public void setNavigationHandler(XWalkNavigationHandler xwalknavigationhandler)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setNavigationHandler(xwalknavigationhandler);
            return;
        }
    }

    public void setNetworkAvailable(boolean flag)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            nativeSetJsOnlineProperty(mNativeContent, flag);
            return;
        }
    }

    public void setNotificationService(XWalkNotificationService xwalknotificationservice)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setNotificationService(xwalknotificationservice);
            return;
        }
    }

    public void setOverlayVideoMode(boolean flag)
    {
        if (mContentViewRenderView != null)
        {
            mContentViewRenderView.setOverlayVideoMode(flag);
        }
    }

    public void setResourceClient(XWalkResourceClientInternal xwalkresourceclientinternal)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setResourceClient(xwalkresourceclientinternal);
            return;
        }
    }

    public void setUIClient(XWalkUIClientInternal xwalkuiclientinternal)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setUIClient(xwalkuiclientinternal);
            return;
        }
    }

    public void setXWalkClient(XWalkClient xwalkclient)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setXWalkClient(xwalkclient);
            return;
        }
    }

    public void setXWalkWebChromeClient(XWalkWebChromeClient xwalkwebchromeclient)
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mContentsClientBridge.setXWalkWebChromeClient(xwalkwebchromeclient);
            return;
        }
    }

    public void stopLoading()
    {
        if (mNativeContent == 0L)
        {
            return;
        } else
        {
            mWebContents.stop();
            mContentsClientBridge.onStopLoading();
            return;
        }
    }

    public void supplyContentsForPopup(XWalkContent xwalkcontent)
    {
        if (mNativeContent != 0L)
        {
            long l = nativeReleasePopupXWalkContent(mNativeContent);
            if (l == 0L)
            {
                Log.w(TAG, "Popup XWalkView bind failed: no pending content.");
                if (xwalkcontent != null)
                {
                    xwalkcontent.destroy();
                    return;
                }
            } else
            if (xwalkcontent == null)
            {
                nativeDestroy(l);
                return;
            } else
            {
                xwalkcontent.receivePopupContents(l);
                return;
            }
        }
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/XWalkContent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }





}
