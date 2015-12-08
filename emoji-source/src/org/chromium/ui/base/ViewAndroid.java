// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.view.View;

// Referenced classes of package org.chromium.ui.base:
//            WindowAndroid, ViewAndroidDelegate

public class ViewAndroid
{

    static final boolean $assertionsDisabled;
    private int mKeepScreenOnCount;
    private View mKeepScreenOnView;
    private long mNativeViewAndroid;
    private final ViewAndroidDelegate mViewAndroidDelegate;
    private final WindowAndroid mWindowAndroid;

    public ViewAndroid(WindowAndroid windowandroid, ViewAndroidDelegate viewandroiddelegate)
    {
        mNativeViewAndroid = 0L;
        mWindowAndroid = windowandroid;
        mViewAndroidDelegate = viewandroiddelegate;
        mNativeViewAndroid = nativeInit(mWindowAndroid.getNativePointer());
    }

    private native void nativeDestroy(long l);

    private native long nativeInit(long l);

    public void decrementKeepScreenOnCount()
    {
        if (!$assertionsDisabled && mKeepScreenOnCount <= 0)
        {
            throw new AssertionError();
        }
        mKeepScreenOnCount = mKeepScreenOnCount - 1;
        if (mKeepScreenOnCount == 0)
        {
            mViewAndroidDelegate.releaseAnchorView(mKeepScreenOnView);
            mKeepScreenOnView = null;
        }
    }

    public void destroy()
    {
        if (mNativeViewAndroid != 0L)
        {
            nativeDestroy(mNativeViewAndroid);
            mNativeViewAndroid = 0L;
        }
    }

    public long getNativePointer()
    {
        return mNativeViewAndroid;
    }

    public ViewAndroidDelegate getViewAndroidDelegate()
    {
        return mViewAndroidDelegate;
    }

    public void incrementKeepScreenOnCount()
    {
        mKeepScreenOnCount = mKeepScreenOnCount + 1;
        if (mKeepScreenOnCount == 1)
        {
            mKeepScreenOnView = mViewAndroidDelegate.acquireAnchorView();
            mViewAndroidDelegate.setAnchorViewPosition(mKeepScreenOnView, 0.0F, 0.0F, 0.0F, 0.0F);
            mKeepScreenOnView.setKeepScreenOn(true);
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/base/ViewAndroid.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
