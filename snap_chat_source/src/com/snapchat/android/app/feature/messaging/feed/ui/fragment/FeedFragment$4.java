// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.view.MotionEvent;
import pQ;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a extends android.view..SimpleOnGestureListener
{

    private FeedFragment a;

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (f1 <= -7500F && !FeedFragment.p(a).c())
        {
            FeedFragment.p(a).b();
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!FeedFragment.p(a).c())
        {
            int i = FeedFragment.j(a).s();
            int j = FeedFragment.j(a).z();
            if (i + FeedFragment.j(a).m() >= j - 5)
            {
                FeedFragment.p(a).b();
            }
        }
        return false;
    }

    (FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
