// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kik.g.e;
import com.kik.g.k;

public class VelocityControlledViewPager extends ViewPager
    implements android.view.GestureDetector.OnGestureListener
{

    private boolean a;
    private final GestureDetectorCompat b;
    private final k c;

    public VelocityControlledViewPager(Context context)
    {
        this(context, null);
    }

    public VelocityControlledViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new k(this);
        b = new GestureDetectorCompat(context, this);
    }

    public final e a()
    {
        return c.a();
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Math.abs(f) <= 2000F) goto _L2; else goto _L1
_L1:
        if (f <= 0.0F || getCurrentItem() == 0) goto _L4; else goto _L3
_L3:
        setCurrentItem(getCurrentItem() - 1);
_L6:
        return false;
_L4:
        if (f < 0.0F && getCurrentItem() != getAdapter().getCount() - 1)
        {
            setCurrentItem(getCurrentItem() + 1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (f1 < -2000F)
        {
            c.a(null);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        onTouchEvent(motionevent);
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a)
        {
            return true;
        } else
        {
            b.onTouchEvent(motionevent);
            return true;
        }
    }
}
