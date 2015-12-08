// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.browser;


// Referenced classes of package org.chromium.content_public.browser:
//            JavaScriptCallback, NavigationController, NavigationTransitionDelegate

public interface WebContents
{

    public abstract void addStyleSheetByURL(String s);

    public abstract void beginExitTransition(String s);

    public abstract void evaluateJavaScript(String s, JavaScriptCallback javascriptcallback);

    public abstract void exitFullscreen();

    public abstract int getBackgroundColor();

    public abstract NavigationController getNavigationController();

    public abstract String getTitle();

    public abstract String getUrl();

    public abstract String getVisibleUrl();

    public abstract void insertCSS(String s);

    public abstract boolean isIncognito();

    public abstract boolean isReady();

    public abstract boolean isShowingInterstitialPage();

    public abstract void onHide();

    public abstract void onShow();

    public abstract void releaseMediaPlayers();

    public abstract void resumeResponseDeferredAtStart();

    public abstract void scrollFocusedEditableNodeIntoView();

    public abstract void selectWordAroundCaret();

    public abstract void setHasPendingNavigationTransitionForTesting();

    public abstract void setNavigationTransitionDelegate(NavigationTransitionDelegate navigationtransitiondelegate);

    public abstract void setupTransitionView(String s);

    public abstract void showImeIfNeeded();

    public abstract void showInterstitialPage(String s, long l);

    public abstract void stop();

    public abstract void updateTopControlsState(boolean flag, boolean flag1, boolean flag2);
}
