// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;

// Referenced classes of package com.mopub.common:
//            c, Preconditions

public class CloseableLayout extends FrameLayout
{

    private final int a;
    private OnCloseListener b;
    private final StateListDrawable c = new StateListDrawable();
    private ClosePosition d;
    private final int e;
    private final int f;
    private final int g;
    private boolean h;
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private final Rect l = new Rect();
    private c m;

    public CloseableLayout(Context context)
    {
        super(context);
        d = ClosePosition.TOP_RIGHT;
        c.addState(SELECTED_STATE_SET, Drawables.INTERSTITIAL_CLOSE_BUTTON_PRESSED.createDrawable(context));
        c.addState(EMPTY_STATE_SET, Drawables.INTERSTITIAL_CLOSE_BUTTON_NORMAL.createDrawable(context));
        c.setState(EMPTY_STATE_SET);
        c.setCallback(this);
        a = ViewConfiguration.get(context).getScaledTouchSlop();
        e = Dips.asIntPixels(50F, context);
        f = Dips.asIntPixels(30F, context);
        g = Dips.asIntPixels(8F, context);
        setWillNotDraw(false);
    }

    private static void a(ClosePosition closeposition, int i1, Rect rect, Rect rect1)
    {
        Gravity.apply(closeposition.a(), i1, i1, rect, rect1);
    }

    static void a(CloseableLayout closeablelayout)
    {
        closeablelayout.a(false);
    }

    private void a(boolean flag)
    {
        if (flag == a())
        {
            return;
        }
        StateListDrawable statelistdrawable = c;
        int ai[];
        if (flag)
        {
            ai = SELECTED_STATE_SET;
        } else
        {
            ai = EMPTY_STATE_SET;
        }
        statelistdrawable.setState(ai);
        invalidate(j);
    }

    private boolean a()
    {
        return c.getState() == SELECTED_STATE_SET;
    }

    private boolean a(int i1, int j1, int k1)
    {
        return i1 >= j.left - k1 && j1 >= j.top - k1 && i1 < j.right + k1 && j1 < j.bottom + k1;
    }

    public void applyCloseRegionBounds(ClosePosition closeposition, Rect rect, Rect rect1)
    {
        a(closeposition, e, rect, rect1);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (h)
        {
            h = false;
            i.set(0, 0, getWidth(), getHeight());
            applyCloseRegionBounds(d, i, j);
            l.set(j);
            l.inset(g, g);
            ClosePosition closeposition = d;
            Rect rect = l;
            Rect rect1 = k;
            a(closeposition, f, rect, rect1);
            c.setBounds(k);
        }
        if (c.isVisible())
        {
            c.draw(canvas);
        }
    }

    public boolean isCloseVisible()
    {
        return c.isVisible();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0)
        {
            return false;
        } else
        {
            return a((int)motionevent.getX(), (int)motionevent.getY(), 0);
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        h = true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!a((int)motionevent.getX(), (int)motionevent.getY(), a))
        {
            a(false);
            super.onTouchEvent(motionevent);
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 68
    //                   0 70
    //                   1 86
    //                   2 68
    //                   3 78;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        a(true);
        continue; /* Loop/switch isn't completed */
_L4:
        a(false);
        continue; /* Loop/switch isn't completed */
_L3:
        if (a())
        {
            if (m == null)
            {
                m = new c(this, (byte)0);
            }
            postDelayed(m, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            if (b != null)
            {
                b.onClose();
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setClosePosition(ClosePosition closeposition)
    {
        Preconditions.checkNotNull(closeposition);
        d = closeposition;
        h = true;
        invalidate();
    }

    public void setCloseVisible(boolean flag)
    {
        if (c.setVisible(flag, false))
        {
            invalidate(j);
        }
    }

    public void setOnCloseListener(OnCloseListener oncloselistener)
    {
        b = oncloselistener;
    }

    private class ClosePosition extends Enum
    {

        public static final ClosePosition BOTTOM_CENTER;
        public static final ClosePosition BOTTOM_LEFT;
        public static final ClosePosition BOTTOM_RIGHT;
        public static final ClosePosition CENTER;
        public static final ClosePosition TOP_CENTER;
        public static final ClosePosition TOP_LEFT;
        public static final ClosePosition TOP_RIGHT;
        private static final ClosePosition b[];
        private final int a;

        public static ClosePosition valueOf(String s)
        {
            return (ClosePosition)Enum.valueOf(com/mopub/common/CloseableLayout$ClosePosition, s);
        }

        public static ClosePosition[] values()
        {
            return (ClosePosition[])b.clone();
        }

        final int a()
        {
            return a;
        }

        static 
        {
            TOP_LEFT = new ClosePosition("TOP_LEFT", 0, 51);
            TOP_CENTER = new ClosePosition("TOP_CENTER", 1, 49);
            TOP_RIGHT = new ClosePosition("TOP_RIGHT", 2, 53);
            CENTER = new ClosePosition("CENTER", 3, 17);
            BOTTOM_LEFT = new ClosePosition("BOTTOM_LEFT", 4, 83);
            BOTTOM_CENTER = new ClosePosition("BOTTOM_CENTER", 5, 81);
            BOTTOM_RIGHT = new ClosePosition("BOTTOM_RIGHT", 6, 85);
            b = (new ClosePosition[] {
                TOP_LEFT, TOP_CENTER, TOP_RIGHT, CENTER, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
            });
        }

        private ClosePosition(String s, int i1, int j1)
        {
            super(s, i1);
            a = j1;
        }
    }


    private class OnCloseListener
    {

        public abstract void onClose();
    }

}
