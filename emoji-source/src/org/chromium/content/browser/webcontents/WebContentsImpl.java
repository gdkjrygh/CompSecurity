// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.webcontents;

import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationTransitionDelegate;
import org.chromium.content_public.browser.WebContents;

class WebContentsImpl
    implements WebContents
{

    private long mNativeWebContentsAndroid;
    private NavigationController mNavigationController;
    private NavigationTransitionDelegate mNavigationTransitionDelegate;

    private WebContentsImpl(long l, NavigationController navigationcontroller)
    {
        mNavigationTransitionDelegate = null;
        mNativeWebContentsAndroid = l;
        mNavigationController = navigationcontroller;
    }

    private void addEnteringStylesheetToTransition(String s)
    {
        if (mNavigationTransitionDelegate != null)
        {
            mNavigationTransitionDelegate.addEnteringStylesheetToTransition(s);
        }
    }

    private static WebContentsImpl create(long l, NavigationController navigationcontroller)
    {
        return new WebContentsImpl(l, navigationcontroller);
    }

    private void destroy()
    {
        mNativeWebContentsAndroid = 0L;
        mNavigationController = null;
    }

    private void didDeferAfterResponseStarted(String s, String s1, String s2)
    {
        if (mNavigationTransitionDelegate != null)
        {
            mNavigationTransitionDelegate.didDeferAfterResponseStarted(s, s1, s2);
        }
    }

    private void didStartNavigationTransitionForFrame(long l)
    {
        if (mNavigationTransitionDelegate != null)
        {
            mNavigationTransitionDelegate.didStartNavigationTransitionForFrame(l);
        }
    }

    private long getNativePointer()
    {
        return mNativeWebContentsAndroid;
    }

    private native void nativeAddStyleSheetByURL(long l, String s);

    private native void nativeBeginExitTransition(long l, String s);

    private native void nativeEvaluateJavaScript(long l, String s, JavaScriptCallback javascriptcallback);

    private native void nativeExitFullscreen(long l);

    private native int nativeGetBackgroundColor(long l);

    private native String nativeGetTitle(long l);

    private native String nativeGetURL(long l);

    private native String nativeGetVisibleURL(long l);

    private native void nativeInsertCSS(long l, String s);

    private native boolean nativeIsIncognito(long l);

    private native boolean nativeIsRenderWidgetHostViewReady(long l);

    private native boolean nativeIsShowingInterstitialPage(long l);

    private native void nativeOnHide(long l);

    private native void nativeOnShow(long l);

    private native void nativeReleaseMediaPlayers(long l);

    private native void nativeResumeResponseDeferredAtStart(long l);

    private native void nativeScrollFocusedEditableNodeIntoView(long l);

    private native void nativeSelectWordAroundCaret(long l);

    private native void nativeSetHasPendingNavigationTransitionForTesting(long l);

    private native void nativeSetupTransitionView(long l, String s);

    private native void nativeShowImeIfNeeded(long l);

    private native void nativeShowInterstitialPage(long l, String s, long l1);

    private native void nativeStop(long l);

    private native void nativeUpdateTopControlsState(long l, boolean flag, boolean flag1, boolean flag2);

    private static void onEvaluateJavaScriptResult(String s, JavaScriptCallback javascriptcallback)
    {
        javascriptcallback.handleJavaScriptResult(s);
    }

    private boolean willHandleDeferAfterResponseStarted()
    {
        if (mNavigationTransitionDelegate == null)
        {
            return false;
        } else
        {
            return mNavigationTransitionDelegate.willHandleDeferAfterResponseStarted();
        }
    }

    public void addStyleSheetByURL(String s)
    {
        nativeAddStyleSheetByURL(mNativeWebContentsAndroid, s);
    }

    public void beginExitTransition(String s)
    {
        nativeBeginExitTransition(mNativeWebContentsAndroid, s);
    }

    public void evaluateJavaScript(String s, JavaScriptCallback javascriptcallback)
    {
        nativeEvaluateJavaScript(mNativeWebContentsAndroid, s, javascriptcallback);
    }

    public void exitFullscreen()
    {
        nativeExitFullscreen(mNativeWebContentsAndroid);
    }

    public int getBackgroundColor()
    {
        return nativeGetBackgroundColor(mNativeWebContentsAndroid);
    }

    public NavigationController getNavigationController()
    {
        return mNavigationController;
    }

    public String getTitle()
    {
        return nativeGetTitle(mNativeWebContentsAndroid);
    }

    public String getUrl()
    {
        return nativeGetURL(mNativeWebContentsAndroid);
    }

    public String getVisibleUrl()
    {
        return nativeGetVisibleURL(mNativeWebContentsAndroid);
    }

    public void insertCSS(String s)
    {
        if (mNativeWebContentsAndroid == 0L)
        {
            return;
        } else
        {
            nativeInsertCSS(mNativeWebContentsAndroid, s);
            return;
        }
    }

    public boolean isIncognito()
    {
        return nativeIsIncognito(mNativeWebContentsAndroid);
    }

    public boolean isReady()
    {
        return nativeIsRenderWidgetHostViewReady(mNativeWebContentsAndroid);
    }

    public boolean isShowingInterstitialPage()
    {
        return nativeIsShowingInterstitialPage(mNativeWebContentsAndroid);
    }

    public void onHide()
    {
        nativeOnHide(mNativeWebContentsAndroid);
    }

    public void onShow()
    {
        nativeOnShow(mNativeWebContentsAndroid);
    }

    public void releaseMediaPlayers()
    {
        nativeReleaseMediaPlayers(mNativeWebContentsAndroid);
    }

    public void resumeResponseDeferredAtStart()
    {
        nativeResumeResponseDeferredAtStart(mNativeWebContentsAndroid);
    }

    public void scrollFocusedEditableNodeIntoView()
    {
        nativeScrollFocusedEditableNodeIntoView(mNativeWebContentsAndroid);
    }

    public void selectWordAroundCaret()
    {
        nativeSelectWordAroundCaret(mNativeWebContentsAndroid);
    }

    public void setHasPendingNavigationTransitionForTesting()
    {
        nativeSetHasPendingNavigationTransitionForTesting(mNativeWebContentsAndroid);
    }

    public void setNavigationTransitionDelegate(NavigationTransitionDelegate navigationtransitiondelegate)
    {
        mNavigationTransitionDelegate = navigationtransitiondelegate;
    }

    public void setupTransitionView(String s)
    {
        nativeSetupTransitionView(mNativeWebContentsAndroid, s);
    }

    public void showImeIfNeeded()
    {
        nativeShowImeIfNeeded(mNativeWebContentsAndroid);
    }

    public void showInterstitialPage(String s, long l)
    {
        nativeShowInterstitialPage(mNativeWebContentsAndroid, s, l);
    }

    public void stop()
    {
        nativeStop(mNativeWebContentsAndroid);
    }

    public void updateTopControlsState(boolean flag, boolean flag1, boolean flag2)
    {
        nativeUpdateTopControlsState(mNativeWebContentsAndroid, flag, flag1, flag2);
    }
}
