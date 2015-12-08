// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardPageInfo, OnboardTutorialPage, OnboardNavFooterButtonInfo, OnboardHostControl

public static final class mPageCount
    implements OnboardPageInfo
{

    protected final Context mContext;
    private final int mPageCount;
    private final int mPageIndex;

    public final boolean allowSwipeToNext$5669347f()
    {
        return true;
    }

    public final boolean allowSwipeToPrevious$5669347f()
    {
        return true;
    }

    public final OnboardNavFooterButtonInfo getEndButtonInfo(final OnboardHostControl hostControl)
    {
        return (new OnboardNavFooterButtonInfo()).setIconResId(0x7f02019c).setLabel(mContext, 0x7f100343).setClickRunnable(new Runnable() {

            final OnboardTutorialPage.DefaultTutorialPageInfo this$0;
            final OnboardHostControl val$hostControl;

            public final void run()
            {
                hostControl.goToNextPage();
            }

            
            {
                this$0 = OnboardTutorialPage.DefaultTutorialPageInfo.this;
                hostControl = onboardhostcontrol;
                super();
            }
        });
    }

    public final int getGroupPageCount$5669346e()
    {
        return mPageCount;
    }

    public final int getGroupPageIndex$5669346e()
    {
        return mPageIndex;
    }

    public final OnboardNavFooterButtonInfo getStartButtonInfo(OnboardHostControl onboardhostcontrol)
    {
        return (new OnboardNavFooterButtonInfo()).setVisible$1466a8b4();
    }

    public final boolean isNavFooterVisible$5669347f()
    {
        return true;
    }

    public final boolean shouldAdjustPagePaddingToFitNavFooter$5669347f()
    {
        return true;
    }

    public _cls1.val.hostControl(Context context, int i, int j)
    {
        mContext = context;
        mPageIndex = i;
        mPageCount = j;
    }
}
