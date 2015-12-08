// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.spotify.android.paste.widget.carousel.CarouselView;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import euj;
import evc;
import evg;
import java.util.List;

public class MomentView extends CarouselView
{

    public euj t;
    public GestureDetector u;
    public Moment v;
    private evg w;
    private boolean x;

    public MomentView(Context context)
    {
        super(context);
        x();
    }

    public MomentView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        x();
    }

    private void x()
    {
        w = new evg(this, com.spotify.android.paste.widget.carousel.CarouselLayoutManager.MeasureMode.b);
        w.a(new evc(getContext()));
        a(w);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!x)
        {
            x = u.onTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 1)
        {
            x = false;
        }
        getParent().requestDisallowInterceptTouchEvent(x);
        return super.onTouchEvent(motionevent);
    }

    public final void v()
    {
        if (v.contexts.size() > 1)
        {
            evg evg1 = w;
            evg1.c(1);
            evg1.b.postDelayed(new evg._cls1(evg1), 400L);
        }
    }

    public final boolean w()
    {
        return v.contexts.size() > 0 && ((MomentContext)v.contexts.get(0)).type == com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type.e;
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/momentsstart/view/MomentView$1

/* anonymous class */
    public final class _cls1 extends android.view.GestureDetector.SimpleOnGestureListener
    {

        public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            return Math.abs(f) > Math.abs(f1);
        }

    }

}
