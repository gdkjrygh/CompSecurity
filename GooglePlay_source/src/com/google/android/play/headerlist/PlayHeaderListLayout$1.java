// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

final class this._cls0
    implements android.support.v4.view.istener
{

    final PlayHeaderListLayout this$0;

    public final void onPageScrollStateChanged(int i)
    {
        if (PlayHeaderListLayout.access$000(PlayHeaderListLayout.this) != null)
        {
            PlayHeaderListLayout.access$000(PlayHeaderListLayout.this).onPageScrollStateChanged(i);
        }
        if (i != 0 && (PlayHeaderListLayout.access$100(PlayHeaderListLayout.this) == 0 || PlayHeaderListLayout.access$100(PlayHeaderListLayout.this) == 2))
        {
            PlayHeaderListLayout.access$200$1350701e(PlayHeaderListLayout.this, true, true);
        }
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        if (mPullToRefreshProvider != null)
        {
            llToRefreshProvider lltorefreshprovider1;
            int k;
            boolean flag;
            if (f > 0.5F)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            k += i;
            flag = PlayHeaderListLayout.access$400(PlayHeaderListLayout.this).mRefreshing;
            if (k != PlayHeaderListLayout.access$500(PlayHeaderListLayout.this))
            {
                PlayHeaderListLayout.access$502(PlayHeaderListLayout.this, k);
                llToRefreshProvider lltorefreshprovider = mPullToRefreshProvider;
                int _tmp = PlayHeaderListLayout.access$500(PlayHeaderListLayout.this);
                boolean flag1 = lltorefreshprovider._mth134632();
                PlayHeaderListLayout.access$400(PlayHeaderListLayout.this).setRefreshing(flag1);
                lltorefreshprovider = mPullToRefreshProvider;
                SwipeRefreshLayout _tmp1 = PlayHeaderListLayout.access$400(PlayHeaderListLayout.this);
            }
            lltorefreshprovider1 = mPullToRefreshProvider;
        }
        if (PlayHeaderListLayout.access$000(PlayHeaderListLayout.this) != null)
        {
            PlayHeaderListLayout.access$000(PlayHeaderListLayout.this).onPageScrolled(i, f, j);
        }
    }

    public final void onPageSelected(int i)
    {
        PlayHeaderListLayout.access$300(PlayHeaderListLayout.this);
        if (PlayHeaderListLayout.access$000(PlayHeaderListLayout.this) != null)
        {
            PlayHeaderListLayout.access$000(PlayHeaderListLayout.this).onPageSelected(i);
        }
    }

    llToRefreshProvider()
    {
        this$0 = PlayHeaderListLayout.this;
        super();
    }
}
