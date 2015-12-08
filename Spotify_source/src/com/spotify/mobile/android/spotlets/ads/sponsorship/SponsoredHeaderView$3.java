// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.sponsorship;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.sponsorship:
//            SponsoredHeaderView

final class e extends ViewPager
{

    private SponsoredHeaderView e;

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        super.onLayout(false, getLeft(), getTop(), getRight(), getBottom());
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!SponsoredHeaderView.g(e))
        {
            SponsoredHeaderView.a(e, SponsoredHeaderView.h(e).onTouchEvent(motionevent));
        }
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            SponsoredHeaderView.a(e, false);
        }
        e.requestDisallowInterceptTouchEvent(SponsoredHeaderView.g(e));
        return super.onTouchEvent(motionevent);
    }

    (SponsoredHeaderView sponsoredheaderview, Context context)
    {
        e = sponsoredheaderview;
        super(context);
    }
}
