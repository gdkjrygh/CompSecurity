// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.Scroller;
import oim;
import oix;
import oja;
import ojd;

public class DeprecatedExpandingScrollView extends ojd
{

    private int c;
    private int d;
    private Runnable e;
    private int f;
    private Boolean g;
    private int h;
    private int i;
    private boolean j;
    private int k;

    public DeprecatedExpandingScrollView(Context context)
    {
        super(context);
        d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public DeprecatedExpandingScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        a(context, attributeset);
    }

    public DeprecatedExpandingScrollView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, oim.a);
        h = context.getDimensionPixelOffset(oim.c, 0);
        i = context.getDimensionPixelOffset(oim.b, -1);
        context.recycle();
    }

    private int d(int l)
    {
        if (i < 0)
        {
            return l;
        } else
        {
            return Math.min(l, Math.max(h, i));
        }
    }

    protected final void a(int l)
    {
        boolean flag = false;
        boolean flag1;
        if (l >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g = Boolean.valueOf(flag1);
        if (l < 0)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = c;
        }
        c(l);
    }

    public final void a(int l, int i1)
    {
        super.a(l, i1);
    }

    protected void onDetachedFromWindow()
    {
        if (e != null)
        {
            removeCallbacks(e);
            e = null;
        }
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag2 = false;
        if (b.isFinished()) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L6:
        return flag1;
_L2:
        Object obj;
        int l;
        l = (int)motionevent.getY();
        int i1;
        switch (motionevent.getAction())
        {
        case 1: // '\001'
        default:
            return false;

        case 0: // '\0'
            a(motionevent);
            f = l;
            return false;

        case 2: // '\002'
            i1 = getScrollY();
            break;
        }
        boolean flag;
        int j1;
        if (i1 == c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g = Boolean.valueOf(flag1);
        j1 = l - f;
        if (j1 < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = findViewById(0x102000a);
        if (!(obj instanceof AbsListView)) goto _L4; else goto _L3
_L3:
        obj = (AbsListView)obj;
        if (((AbsListView) (obj)).getChildCount() == 0 || ((AbsListView) (obj)).getFirstVisiblePosition() == 0 && ((AbsListView) (obj)).getChildAt(0).getTop() == ((AbsListView) (obj)).getListPaddingTop() && ((AbsListView) (obj)).getScrollY() == 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
_L11:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (flag) goto _L6; else goto _L5
_L5:
        flag1 = flag2;
        if (!l) goto _L6; else goto _L7
_L7:
        flag1 = flag2;
        if (i1 != c) goto _L6; else goto _L8
_L8:
        super.onInterceptTouchEvent(motionevent);
        if (j1 > d)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (j1 >= -d) goto _L6; else goto _L9
_L9:
        return true;
_L4:
        flag1 = flag2;
        if (!(obj instanceof oja)) goto _L6; else goto _L10
_L10:
        obj = (oja)obj;
        if (((oja) (obj)).getChildCount() == 0 || ((oja) (obj)).a == 0 && ((oja) (obj)).getChildAt(0).getTop() == ((oja) (obj)).getPaddingTop() && ((oja) (obj)).getScrollY() == 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
          goto _L11
    }

    protected void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        i1 = c;
        k1 -= i1;
        k1 = i1 + (k1 - d(k1));
        for (i1 = 0; i1 < getChildCount();)
        {
            View view = getChildAt(i1);
            int l1 = view.getMeasuredHeight() + k1;
            view.layout(l, k1, j1, l1);
            i1++;
            k1 = l1;
        }

        l = c;
        super.a[0] = 0;
        super.a[1] = l;
        if (g != null && g.booleanValue())
        {
            b(Math.max(0, c));
        }
        j = false;
        k = i;
    }

    protected void onMeasure(int l, int i1)
    {
        boolean flag = false;
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = d(k1);
        c = i1 - h;
        int l1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        int j1 = 0;
        for (i1 = ((flag) ? 1 : 0); i1 < getChildCount(); i1++)
        {
            getChildAt(i1).measure(l, l1);
            j1 = Math.max(j1, getChildAt(i1).getMeasuredWidth());
        }

        setMeasuredDimension(j1, c + k1);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (oix)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        g = Boolean.valueOf(((oix) (parcelable)).a);
        h = ((oix) (parcelable)).b;
        i = ((oix) (parcelable)).c;
    }

    protected Parcelable onSaveInstanceState()
    {
        Parcelable parcelable = super.onSaveInstanceState();
        boolean flag;
        if (c != 0 && getScrollY() == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new oix(parcelable, flag, h, i);
    }
}
