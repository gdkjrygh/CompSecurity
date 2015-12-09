// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.MotionEvent;

// Referenced classes of package com.spotify.android.paste.widget:
//            HeaderView

final class e extends ViewPager
{

    private HeaderView e;

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        super.onLayout(false, getLeft(), getTop(), getRight(), getBottom());
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!HeaderView.c(e))
        {
            HeaderView.a(e, HeaderView.d(e).onTouchEvent(motionevent));
        }
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            HeaderView.a(e, false);
        }
        e.requestDisallowInterceptTouchEvent(HeaderView.c(e));
        return super.onTouchEvent(motionevent);
    }

    (HeaderView headerview, Context context)
    {
        e = headerview;
        super(context);
    }
}
