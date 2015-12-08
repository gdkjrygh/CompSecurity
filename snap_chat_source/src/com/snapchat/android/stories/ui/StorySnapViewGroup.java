// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import Cf;
import Ch;
import EP;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.discover.ui.FadeFullScreenAnimationView;
import com.snapchat.android.ui.ClipCircleViewGroup;
import com.snapchat.android.ui.SnapTimerView;
import com.snapchat.android.ui.StoryTimerView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.gesturedetectors.TapToViewTouchListener;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StorySnapView, StoryThumbnailLayout

public class StorySnapViewGroup extends ClipCircleViewGroup
    implements com.snapchat.android.ui.ClipCircleViewGroup.c, com.snapchat.android.ui.gesturedetectors.TapToViewTouchListener.a
{
    public static interface a
    {
    }


    public final StorySnapView a;
    public final StoryTimerView b;
    public final EP c;
    public final Ch d = Ch.a();
    public Cf e;
    final List f = new ArrayList();
    public boolean g;
    private VerticalSwipeLayout p;
    private final FadeFullScreenAnimationView q = new FadeFullScreenAnimationView(getContext(), null);
    private final SnapTimerView r;
    private final StoryThumbnailLayout s;
    private final AudioManager t;
    private final TapToViewTouchListener u = new TapToViewTouchListener(SnapchatApplication.get(), this);
    private final int v = getResources().getDimensionPixelSize(0x7f0a0140);
    private final int w = getResources().getDimensionPixelSize(0x7f0a011e);
    private int x;
    private com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason y;

    public StorySnapViewGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        x = -1;
        e = null;
        g = false;
        p = new VerticalSwipeLayout(getContext(), null);
        a = new StorySnapView(context, this);
        b = new StoryTimerView(context);
        r = new SnapTimerView(context);
        s = new StoryThumbnailLayout(context, null);
        s.setStoryTimerView(b);
        t = (AudioManager)context.getSystemService("audio");
        addView(p);
        addView(b);
        addView(r);
        addView(s);
        a.setTimerViews(b, r);
        b.setVisibility(8);
        r.setVisibility(8);
        p.addView(a);
        q.setColorFilter(getResources().getColor(0x7f0c006a));
        q.setVisibility(8);
        a(this);
        c = new EP(context, p, this, new StoryTimerView(context), s);
        a.setExplorerSnapsPresenceListener(c);
        p.a(c);
    }

    public final void a()
    {
        if (a.h || !c.a())
        {
            return;
        } else
        {
            a(u.a, u.b, 0, u.a());
            return;
        }
    }

    public final void a(float f1, float f2)
    {
        if (a.h || !c.a())
        {
            return;
        }
        if (ClipCircleViewGroup.h && super.m == 2)
        {
            a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN);
            return;
        } else
        {
            b(f1, f2);
            return;
        }
    }

    public final void a(int i)
    {
        p.a(i, Math.abs(c.f - i));
    }

    public final void a(int i, float f1)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        t.setStreamVolume(3, x, 0);
        if (h)
        {
            q.setAlpha(0.0F);
        }
_L4:
        return;
_L2:
        if (i != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        t.setStreamVolume(3, (int)((float)x * (1.0F - f1)), 0);
        if (!h) goto _L4; else goto _L3
_L3:
        q.setVisibility(0);
        q.setAlpha(f1);
        return;
        if (i != 2 && i != 3 || !h) goto _L4; else goto _L5
_L5:
        q.setAlpha(1.0F);
        return;
    }

    public final void a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason endreason)
    {
        y = endreason;
        int i = c.f;
        if (endreason == com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.ENTER_BACKGROUND || i == 0)
        {
            g = false;
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
        } else
        {
            EP ep = c;
            ep.a(endreason, ep.f);
            p.a(i - 1, 1.0D);
            return;
        }
    }

    public final void a(com.snapchat.android.ui.gesturedetectors.TapToViewTouchListener.SwipeDirection swipedirection)
    {
        if (c.a())
        {
            if (swipedirection == com.snapchat.android.ui.gesturedetectors.TapToViewTouchListener.SwipeDirection.UP)
            {
                a.e();
                return;
            }
            if (swipedirection == com.snapchat.android.ui.gesturedetectors.TapToViewTouchListener.SwipeDirection.DOWN)
            {
                if (a.h)
                {
                    a.f();
                    return;
                } else
                {
                    a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN);
                    return;
                }
            }
        }
    }

    public final void b()
    {
        if (e())
        {
            a(com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason.SWIPED_DOWN);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public final Set c()
    {
        Object obj = new HashSet();
        List list = f;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((Set) (obj)).addAll((Set)iterator.next())) { }
        break MISSING_BLOCK_LABEL_58;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        return ((Set) (obj));
    }

    public final void l()
    {
        x = t.getStreamVolume(3);
    }

    public final void m()
    {
        if (x != -1)
        {
            t.setStreamVolume(3, x, 0);
        }
        x = -1;
        q.a();
        EP ep = c;
        Object obj = y;
        for (int i = ep.f; i >= 0; i--)
        {
            ep.a(((com.snapchat.android.analytics.SnapViewEventAnalytics.EndReason) (obj)), i);
        }

        u.b();
        d();
        a.g();
        b.setVisibility(8);
        r.setVisibility(8);
        p.d();
        obj = s;
        obj.e = 0;
        ((StoryThumbnailLayout) (obj)).removeAllViews();
        ((StoryThumbnailLayout) (obj)).a.setScaleFactor(1.0F);
        ((StoryThumbnailLayout) (obj)).a.setAlpha(1.0F);
        ((StoryThumbnailLayout) (obj)).c.clear();
        synchronized (((StoryThumbnailLayout) (obj)).d)
        {
            ((StoryThumbnailLayout) (obj)).d.clear();
            if (((StoryThumbnailLayout) (obj)).f)
            {
                ((StoryThumbnailLayout) (obj)).b.b(obj);
                obj.f = false;
            }
        }
        f.clear();
        if (e != null)
        {
            d.a(e);
            e = null;
        }
        setVisibility(8);
        if (h)
        {
            q.setAlpha(0.0F);
            q.setVisibility(8);
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return u.a(motionevent) || super.onInterceptTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int i1)
    {
        p.layout(0, 0, k - i, i1 - j);
        b.layout(k - i - v - b.getMeasuredWidth(), v, k - i - v, v + b.getMeasuredHeight());
        r.layout(k - i - w - r.getMeasuredWidth(), w, k - i - w, w + r.getMeasuredHeight());
        s.layout(0, 0, k - i, i1 - j);
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0x40000000;
        int i1 = android.view.View.MeasureSpec.getSize(i);
        int j1 = android.view.View.MeasureSpec.getSize(j);
        setMeasuredDimension(i1, j1);
        p.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000));
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(0x7f0a013f), 0x40000000);
        b.measure(i1, i1);
        i1 = r.getLayoutParams().height;
        if (i1 <= 0)
        {
            k = 0;
        }
        k = android.view.View.MeasureSpec.makeMeasureSpec(i1, k);
        r.measure(k, k);
        s.measure(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return u.b(motionevent);
    }

    public void setOnClipAnimationListener(a a1)
    {
    }
}
