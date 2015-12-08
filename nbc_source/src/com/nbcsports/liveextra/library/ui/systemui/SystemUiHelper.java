// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;

// Referenced classes of package com.nbcsports.liveextra.library.ui.systemui:
//            SystemUiHelperImplKK, SystemUiHelperImplJB, SystemUiHelperImplICS, SystemUiHelperImplHC

public final class SystemUiHelper
{
    private class HideRunnable
        implements Runnable
    {

        final SystemUiHelper this$0;

        public void run()
        {
            hide();
        }

        private HideRunnable()
        {
            this$0 = SystemUiHelper.this;
            super();
        }

    }

    public static interface OnVisibilityChangeListener
    {

        public abstract void onVisibilityChange(boolean flag);
    }

    static abstract class SystemUiHelperImpl
    {

        final Activity mActivity;
        final int mFlags;
        boolean mIsShowing;
        int mLevel;
        final OnVisibilityChangeListener mOnVisibilityChangeListener;

        abstract void hide();

        boolean isShowing()
        {
            return mIsShowing;
        }

        void setIsShowing(boolean flag)
        {
            mIsShowing = flag;
            if (mOnVisibilityChangeListener != null)
            {
                mOnVisibilityChangeListener.onVisibilityChange(mIsShowing);
            }
        }

        abstract void show();

        public void updateLevel(int i)
        {
            mLevel = i;
        }

        SystemUiHelperImpl(Activity activity, int i, int j, OnVisibilityChangeListener onvisibilitychangelistener)
        {
            mIsShowing = true;
            mActivity = activity;
            mLevel = i;
            mFlags = j;
            mOnVisibilityChangeListener = onvisibilitychangelistener;
        }
    }

    static class SystemUiHelperImplBase extends SystemUiHelperImpl
    {

        void hide()
        {
            if (mLevel > 0)
            {
                mActivity.getWindow().addFlags(1024);
                setIsShowing(false);
            }
        }

        void show()
        {
            if (mLevel > 0)
            {
                mActivity.getWindow().clearFlags(1024);
                setIsShowing(true);
            }
        }

        SystemUiHelperImplBase(Activity activity, int i, int j, OnVisibilityChangeListener onvisibilitychangelistener)
        {
            super(activity, i, j, onvisibilitychangelistener);
            if ((mFlags & 1) != 0)
            {
                mActivity.getWindow().addFlags(768);
            }
        }
    }


    public static final int FLAG_IMMERSIVE_STICKY = 2;
    public static final int FLAG_LAYOUT_IN_SCREEN_OLDER_DEVICES = 1;
    public static final int LEVEL_HIDE_STATUS_BAR = 1;
    public static final int LEVEL_IMMERSIVE = 3;
    public static final int LEVEL_LEAN_BACK = 2;
    public static final int LEVEL_LOW_PROFILE = 0;
    private static final String LOG_TAG = com/nbcsports/liveextra/library/ui/systemui/SystemUiHelper.getSimpleName();
    private final Handler mHandler;
    private final Runnable mHideRunnable;
    private final SystemUiHelperImpl mImpl;

    public SystemUiHelper(Activity activity, int i, int j)
    {
        this(activity, i, j, null);
    }

    public SystemUiHelper(Activity activity, int i, int j, OnVisibilityChangeListener onvisibilitychangelistener)
    {
        mHandler = new Handler(Looper.getMainLooper());
        mHideRunnable = new HideRunnable();
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            mImpl = new SystemUiHelperImplKK(activity, i, j, onvisibilitychangelistener);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            mImpl = new SystemUiHelperImplJB(activity, i, j, onvisibilitychangelistener);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mImpl = new SystemUiHelperImplICS(activity, i, j, onvisibilitychangelistener);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mImpl = new SystemUiHelperImplHC(activity, i, j, onvisibilitychangelistener);
            return;
        } else
        {
            mImpl = new SystemUiHelperImplBase(activity, i, j, onvisibilitychangelistener);
            return;
        }
    }

    private void removeQueuedRunnables()
    {
        mHandler.removeCallbacks(mHideRunnable);
    }

    public void delayHide(long l)
    {
        removeQueuedRunnables();
        mHandler.postDelayed(mHideRunnable, l);
    }

    public void hide()
    {
        removeQueuedRunnables();
        mImpl.hide();
    }

    public boolean isShowing()
    {
        return mImpl.isShowing();
    }

    public void show()
    {
        removeQueuedRunnables();
        mImpl.show();
    }

    public void toggle()
    {
        if (mImpl.isShowing())
        {
            mImpl.hide();
            return;
        } else
        {
            mImpl.show();
            return;
        }
    }

    public void updateLevel(int i)
    {
        mImpl.updateLevel(i);
    }

}
