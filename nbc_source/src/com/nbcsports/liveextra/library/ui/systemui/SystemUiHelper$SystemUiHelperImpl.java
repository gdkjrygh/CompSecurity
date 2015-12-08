// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.Activity;

// Referenced classes of package com.nbcsports.liveextra.library.ui.systemui:
//            SystemUiHelper

static abstract class mOnVisibilityChangeListener
{

    final Activity mActivity;
    final int mFlags;
    boolean mIsShowing;
    int mLevel;
    final istener mOnVisibilityChangeListener;

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

    istener(Activity activity, int i, int j, istener istener)
    {
        mIsShowing = true;
        mActivity = activity;
        mLevel = i;
        mFlags = j;
        mOnVisibilityChangeListener = istener;
    }
}
