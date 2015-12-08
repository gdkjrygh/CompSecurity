// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.framehost;

import android.graphics.Bitmap;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHistory;
import org.chromium.content_public.common.Referrer;

class NavigationControllerImpl
    implements NavigationController
{

    private long mNativeNavigationControllerAndroid;

    private NavigationControllerImpl(long l)
    {
        mNativeNavigationControllerAndroid = l;
    }

    private static void addToNavigationHistory(Object obj, Object obj1)
    {
        ((NavigationHistory)obj).addEntry((NavigationEntry)obj1);
    }

    private static NavigationControllerImpl create(long l)
    {
        return new NavigationControllerImpl(l);
    }

    private static NavigationEntry createNavigationEntry(int i, String s, String s1, String s2, String s3, Bitmap bitmap)
    {
        return new NavigationEntry(i, s, s1, s2, s3, bitmap);
    }

    private void destroy()
    {
        mNativeNavigationControllerAndroid = 0L;
    }

    private native boolean nativeCanGoBack(long l);

    private native boolean nativeCanGoForward(long l);

    private native boolean nativeCanGoToOffset(long l, int i);

    private native void nativeCancelPendingReload(long l);

    private native void nativeClearHistory(long l);

    private native void nativeClearSslPreferences(long l);

    private native void nativeContinuePendingReload(long l);

    private native void nativeGetDirectedNavigationHistory(long l, NavigationHistory navigationhistory, boolean flag, int i);

    private native int nativeGetNavigationHistory(long l, Object obj);

    private native String nativeGetOriginalUrlForVisibleNavigationEntry(long l);

    private native NavigationEntry nativeGetPendingEntry(long l);

    private native boolean nativeGetUseDesktopUserAgent(long l);

    private native void nativeGoBack(long l);

    private native void nativeGoForward(long l);

    private native void nativeGoToNavigationIndex(long l, int i);

    private native void nativeGoToOffset(long l, int i);

    private native void nativeLoadIfNecessary(long l);

    private native void nativeLoadUrl(long l, String s, int i, int j, String s1, int k, 
            int i1, String s2, byte abyte0[], String s3, String s4, boolean flag, boolean flag1);

    private native void nativeReload(long l, boolean flag);

    private native void nativeReloadIgnoringCache(long l, boolean flag);

    private native void nativeRequestRestoreLoad(long l);

    private native void nativeSetUseDesktopUserAgent(long l, boolean flag, boolean flag1);

    public boolean canGoBack()
    {
        return mNativeNavigationControllerAndroid != 0L && nativeCanGoBack(mNativeNavigationControllerAndroid);
    }

    public boolean canGoForward()
    {
        return mNativeNavigationControllerAndroid != 0L && nativeCanGoForward(mNativeNavigationControllerAndroid);
    }

    public boolean canGoToOffset(int i)
    {
        return mNativeNavigationControllerAndroid != 0L && nativeCanGoToOffset(mNativeNavigationControllerAndroid, i);
    }

    public void cancelPendingReload()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeCancelPendingReload(mNativeNavigationControllerAndroid);
        }
    }

    public void clearHistory()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeClearHistory(mNativeNavigationControllerAndroid);
        }
    }

    public void clearSslPreferences()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeClearSslPreferences(mNativeNavigationControllerAndroid);
        }
    }

    public void continuePendingReload()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeContinuePendingReload(mNativeNavigationControllerAndroid);
        }
    }

    public NavigationHistory getDirectedNavigationHistory(boolean flag, int i)
    {
        if (mNativeNavigationControllerAndroid == 0L)
        {
            return null;
        } else
        {
            NavigationHistory navigationhistory = new NavigationHistory();
            nativeGetDirectedNavigationHistory(mNativeNavigationControllerAndroid, navigationhistory, flag, i);
            return navigationhistory;
        }
    }

    public NavigationHistory getNavigationHistory()
    {
        if (mNativeNavigationControllerAndroid == 0L)
        {
            return null;
        } else
        {
            NavigationHistory navigationhistory = new NavigationHistory();
            navigationhistory.setCurrentEntryIndex(nativeGetNavigationHistory(mNativeNavigationControllerAndroid, navigationhistory));
            return navigationhistory;
        }
    }

    public String getOriginalUrlForVisibleNavigationEntry()
    {
        if (mNativeNavigationControllerAndroid == 0L)
        {
            return null;
        } else
        {
            return nativeGetOriginalUrlForVisibleNavigationEntry(mNativeNavigationControllerAndroid);
        }
    }

    public NavigationEntry getPendingEntry()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            return nativeGetPendingEntry(mNativeNavigationControllerAndroid);
        } else
        {
            return null;
        }
    }

    public boolean getUseDesktopUserAgent()
    {
        if (mNativeNavigationControllerAndroid == 0L)
        {
            return false;
        } else
        {
            return nativeGetUseDesktopUserAgent(mNativeNavigationControllerAndroid);
        }
    }

    public void goBack()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeGoBack(mNativeNavigationControllerAndroid);
        }
    }

    public void goForward()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeGoForward(mNativeNavigationControllerAndroid);
        }
    }

    public void goToNavigationIndex(int i)
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeGoToNavigationIndex(mNativeNavigationControllerAndroid, i);
        }
    }

    public void goToOffset(int i)
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeGoToOffset(mNativeNavigationControllerAndroid, i);
        }
    }

    public void loadIfNecessary()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeLoadIfNecessary(mNativeNavigationControllerAndroid);
        }
    }

    public void loadUrl(LoadUrlParams loadurlparams)
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            long l = mNativeNavigationControllerAndroid;
            String s1 = loadurlparams.getUrl();
            int j = loadurlparams.getLoadUrlType();
            int k = loadurlparams.getTransitionType();
            String s;
            int i;
            if (loadurlparams.getReferrer() != null)
            {
                s = loadurlparams.getReferrer().getUrl();
            } else
            {
                s = null;
            }
            if (loadurlparams.getReferrer() != null)
            {
                i = loadurlparams.getReferrer().getPolicy();
            } else
            {
                i = 0;
            }
            nativeLoadUrl(l, s1, j, k, s, i, loadurlparams.getUserAgentOverrideOption(), loadurlparams.getExtraHeadersString(), loadurlparams.getPostData(), loadurlparams.getBaseUrl(), loadurlparams.getVirtualUrlForDataUrl(), loadurlparams.getCanLoadLocalResources(), loadurlparams.getIsRendererInitiated());
        }
    }

    public void reload(boolean flag)
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeReload(mNativeNavigationControllerAndroid, flag);
        }
    }

    public void reloadIgnoringCache(boolean flag)
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeReloadIgnoringCache(mNativeNavigationControllerAndroid, flag);
        }
    }

    public void requestRestoreLoad()
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeRequestRestoreLoad(mNativeNavigationControllerAndroid);
        }
    }

    public void setUseDesktopUserAgent(boolean flag, boolean flag1)
    {
        if (mNativeNavigationControllerAndroid != 0L)
        {
            nativeSetUseDesktopUserAgent(mNativeNavigationControllerAndroid, flag, flag1);
        }
    }
}
