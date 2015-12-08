// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.browser;


// Referenced classes of package org.chromium.content_public.browser:
//            NavigationHistory, NavigationEntry, LoadUrlParams

public interface NavigationController
{

    public abstract boolean canGoBack();

    public abstract boolean canGoForward();

    public abstract boolean canGoToOffset(int i);

    public abstract void cancelPendingReload();

    public abstract void clearHistory();

    public abstract void clearSslPreferences();

    public abstract void continuePendingReload();

    public abstract NavigationHistory getDirectedNavigationHistory(boolean flag, int i);

    public abstract NavigationHistory getNavigationHistory();

    public abstract String getOriginalUrlForVisibleNavigationEntry();

    public abstract NavigationEntry getPendingEntry();

    public abstract boolean getUseDesktopUserAgent();

    public abstract void goBack();

    public abstract void goForward();

    public abstract void goToNavigationIndex(int i);

    public abstract void goToOffset(int i);

    public abstract void loadIfNecessary();

    public abstract void loadUrl(LoadUrlParams loadurlparams);

    public abstract void reload(boolean flag);

    public abstract void reloadIgnoringCache(boolean flag);

    public abstract void requestRestoreLoad();

    public abstract void setUseDesktopUserAgent(boolean flag, boolean flag1);
}
