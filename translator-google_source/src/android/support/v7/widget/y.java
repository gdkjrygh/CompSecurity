// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.view.at;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow, z, aa

public abstract class y
    implements android.view.View.OnTouchListener
{

    private final float a;
    private final int b = ViewConfiguration.getTapTimeout();
    private final int c;
    private final View d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private boolean h;
    private int i;
    private final int j[] = new int[2];

    public y(View view)
    {
        d = view;
        a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        c = (b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    static View a(y y1)
    {
        return y1.d;
    }

    private boolean a(MotionEvent motionevent)
    {
        boolean flag1 = true;
        View view = d;
        Object obj = a();
        if (obj == null || !((ListPopupWindow) (obj)).c.isShowing())
        {
            flag1 = false;
        } else
        {
            obj = ListPopupWindow.a(((ListPopupWindow) (obj)));
            if (obj == null || !((ListPopupWindow.DropDownListView) (obj)).isShown())
            {
                return false;
            }
            MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
            int ai1[] = j;
            view.getLocationOnScreen(ai1);
            motionevent1.offsetLocation(ai1[0], ai1[1]);
            int ai[] = j;
            ((View) (obj)).getLocationOnScreen(ai);
            motionevent1.offsetLocation(-ai[0], -ai[1]);
            boolean flag2 = ((ListPopupWindow.DropDownListView) (obj)).a(motionevent1, i);
            motionevent1.recycle();
            int k = at.a(motionevent);
            boolean flag;
            if (k != 1 && k != 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag2 || !flag)
            {
                return false;
            }
        }
        return flag1;
    }

    static void b(y y1)
    {
        y1.d();
        View view;
        for (view = y1.d; !view.isEnabled() || view.isLongClickable() || !y1.b();)
        {
            return;
        }

        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionevent);
        motionevent.recycle();
        y1.g = true;
        y1.h = true;
    }

    private void d()
    {
        if (f != null)
        {
            d.removeCallbacks(f);
        }
        if (e != null)
        {
            d.removeCallbacks(e);
        }
    }

    public abstract ListPopupWindow a();

    public boolean b()
    {
        ListPopupWindow listpopupwindow = a();
        if (listpopupwindow != null && !listpopupwindow.c.isShowing())
        {
            listpopupwindow.b();
        }
        return true;
    }

    public boolean c()
    {
        ListPopupWindow listpopupwindow = a();
        if (listpopupwindow != null && listpopupwindow.c.isShowing())
        {
            listpopupwindow.d();
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = g;
        if (!flag2) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (h)
        {
            flag = a(motionevent);
        } else
        if (a(motionevent) || !c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L9:
label0:
        {
            g = flag;
            if (!flag)
            {
                flag = flag1;
                if (!flag2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
_L2:
        view = d;
        if (!view.isEnabled()) goto _L4; else goto _L3
_L3:
        at.a(motionevent);
        JVM INSTR tableswitch 0 3: default 128
    //                   0 184
    //                   1 391
    //                   2 267
    //                   3 391;
           goto _L5 _L6 _L7 _L8 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_391;
_L4:
        int k = 0;
_L12:
        float f1;
        float f2;
        float f3;
        if (k != 0 && b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            long l = SystemClock.uptimeMillis();
            view = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            d.onTouchEvent(view);
            view.recycle();
        }
          goto _L9
_L6:
        i = motionevent.getPointerId(0);
        h = false;
        if (e == null)
        {
            e = new z(this);
        }
        view.postDelayed(e, b);
        if (f == null)
        {
            f = new aa(this);
        }
        view.postDelayed(f, c);
          goto _L4
_L8:
        k = motionevent.findPointerIndex(i);
        if (k < 0) goto _L4; else goto _L10
_L10:
        f1 = motionevent.getX(k);
        f2 = motionevent.getY(k);
        f3 = a;
        if (f1 >= -f3 && f2 >= -f3 && f1 < (float)(view.getRight() - view.getLeft()) + f3 && f2 < (float)(view.getBottom() - view.getTop()) + f3)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0) goto _L4; else goto _L11
_L11:
        d();
        view.getParent().requestDisallowInterceptTouchEvent(true);
        k = 1;
          goto _L12
        d();
          goto _L4
    }
}
