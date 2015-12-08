// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.snapview;

import Ch;
import Fm;
import MV;
import On;
import PG;
import PI;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.discover.ui.FadeFullScreenAnimationView;
import com.snapchat.android.ui.ClipCircleViewGroup;
import com.snapchat.android.ui.SnapTimerView;
import com.snapchat.android.ui.StoryTimerView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.gesturedetectors.TapToViewTouchListener;
import com.squareup.otto.Bus;
import java.util.Set;
import sJ;

// Referenced classes of package com.snapchat.android.ui.snapview:
//            SnapView

public class MultiLeveledSnapView extends ClipCircleViewGroup
    implements com.snapchat.android.ui.ClipCircleViewGroup.c
{
    public static interface a
    {

        public abstract void a(int i, float f1);
    }


    public final VerticalSwipeLayout a = new VerticalSwipeLayout(getContext(), null);
    public final SnapView b;
    public final StoryTimerView c;
    public final TapToViewTouchListener d;
    private final FadeFullScreenAnimationView e = new FadeFullScreenAnimationView(getContext(), null);
    private final SnapTimerView f;
    private final AudioManager g;
    private final Fm p = new Fm(this);
    private final int q = getResources().getDimensionPixelSize(0x7f0a0140);
    private final int r = getResources().getDimensionPixelSize(0x7f0a0140);
    private int s;
    private com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason t;
    private a u;

    public MultiLeveledSnapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        s = -1;
        b = a(context);
        c = new StoryTimerView(context);
        f = new SnapTimerView(context);
        g = (AudioManager)context.getSystemService("audio");
        d = new TapToViewTouchListener(SnapchatApplication.get(), p);
        addView(a);
        addView(c);
        addView(f);
        b.setTimerViews(c, f);
        c.setVisibility(8);
        f.setVisibility(8);
        a.addView(b);
        e.setColorFilter(getResources().getColor(0x7f0c006a));
        e.setVisibility(8);
        a(this);
    }

    protected SnapView a(Context context)
    {
        return new SnapView(context, this);
    }

    public final void a(int i, float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        g.setStreamVolume(3, s, 0);
        if (h)
        {
            e.setAlpha(0.0F);
        }
_L4:
        if (u != null)
        {
            u.a(i, f1);
        }
        return;
_L2:
        if (i == 1)
        {
            g.setStreamVolume(3, (int)((float)s * (1.0F - f1)), 0);
            if (h)
            {
                e.setVisibility(0);
                e.setAlpha(f1);
            }
        } else
        if ((i == 2 || i == 3) && h)
        {
            e.setAlpha(1.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason)
    {
        t = endreason;
        if (getVisibility() != 0 || endreason != com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN)
        {
            m();
            return;
        }
        if (super.m == 0)
        {
            f();
            return;
        } else
        {
            a(true);
            return;
        }
    }

    public final void a(sJ sj)
    {
        b.f.add(sj);
    }

    public final void b(sJ sj)
    {
        b.f.remove(sj);
    }

    public final void l()
    {
        s = g.getStreamVolume(3);
    }

    public final void m()
    {
        if (s != -1)
        {
            g.setStreamVolume(3, s, 0);
        }
        s = -1;
        e.a();
        SnapView snapview = b;
        com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason = t;
        PG.a();
        if (snapview.j != null)
        {
            snapview.e.a(snapview.j);
            snapview.j = null;
        }
        if (!snapview.a())
        {
            if (snapview.k.c())
            {
                snapview.k.a(8);
                snapview.c.a(new MV(null));
            }
        } else
        {
            snapview.a(endreason);
        }
        d.b();
        d();
        snapview = b;
        snapview.d.setVisibility(8);
        if (ClipCircleViewGroup.h)
        {
            snapview.c.a(new On());
        }
        c.setVisibility(8);
        f.setVisibility(8);
        a.d();
        setVisibility(8);
        if (h)
        {
            e.setAlpha(0.0F);
            e.setVisibility(8);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return d.a(motionevent) || super.onInterceptTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int i1)
    {
        a.layout(0, 0, k - i, i1 - j);
        c.layout(k - i - q - c.getMeasuredWidth(), q, k - i - q, q + c.getMeasuredHeight());
        f.layout(k - i - r - f.getMeasuredWidth(), r, k - i - r, r + f.getMeasuredHeight());
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0x40000000;
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        setMeasuredDimension(i, j);
        a.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
        i = android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(0x7f0a013f), 0x40000000);
        c.measure(i, i);
        j = f.getLayoutParams().height;
        if (j > 0)
        {
            i = k;
        } else
        {
            i = 0;
        }
        i = android.view.View.MeasureSpec.makeMeasureSpec(j, i);
        f.measure(i, i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return d.b(motionevent);
    }

    public void setOnClipAnimationListener(a a1)
    {
        u = a1;
    }
}
