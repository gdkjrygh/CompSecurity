// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.onboarding;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.play.onboard.OnboardHostControl;
import com.google.android.play.onboard.OnboardNavFooterButtonInfo;
import com.google.android.play.onboard.OnboardPageInfo;

// Referenced classes of package com.google.android.gms.games.ui.destination.onboarding:
//            GamesOnboardHostFragment

public final class GamesTutorialPageInfo
    implements OnboardPageInfo
{

    protected final Context mContext;
    private final int mPageCount = 3;
    private final int mPageIndex;

    public GamesTutorialPageInfo(Context context, int i)
    {
        mContext = context;
        mPageIndex = i;
    }

    public final boolean allowSwipeToNext$5669347f()
    {
        return true;
    }

    public final boolean allowSwipeToPrevious$5669347f()
    {
        return mPageIndex != 0;
    }

    public final OnboardNavFooterButtonInfo getEndButtonInfo(final OnboardHostControl hostControl)
    {
        Resources resources = mContext.getResources();
        String s = resources.getString(0x7f100343);
        if (mPageIndex == 2)
        {
            s = resources.getString(0x7f100208);
        }
        return (new OnboardNavFooterButtonInfo()).setIconResId(0x7f02019c).setLabel(s).setClickRunnable(new Runnable() {

            final GamesTutorialPageInfo this$0;
            final OnboardHostControl val$hostControl;

            public final void run()
            {
                hostControl.goToNextPage();
            }

            
            {
                this$0 = GamesTutorialPageInfo.this;
                hostControl = onboardhostcontrol;
                super();
            }
        });
    }

    public final int getGroupPageCount$5669346e()
    {
        return 3;
    }

    public final int getGroupPageIndex$5669346e()
    {
        return mPageIndex;
    }

    public final OnboardNavFooterButtonInfo getStartButtonInfo(final OnboardHostControl hostControl)
    {
        return (new OnboardNavFooterButtonInfo()).setLabel(mContext, 0x7f100118).setClickRunnable(new Runnable() {

            final GamesTutorialPageInfo this$0;
            final OnboardHostControl val$hostControl;

            public final void run()
            {
                if (hostControl instanceof GamesOnboardHostFragment)
                {
                    ((GamesOnboardHostFragment)hostControl).skipOnboardFlow();
                    return;
                } else
                {
                    hostControl.finishOnboardFlow();
                    return;
                }
            }

            
            {
                this$0 = GamesTutorialPageInfo.this;
                hostControl = onboardhostcontrol;
                super();
            }
        });
    }

    public final boolean isNavFooterVisible$5669347f()
    {
        return true;
    }

    public final boolean shouldAdjustPagePaddingToFitNavFooter$5669347f()
    {
        return true;
    }
}
