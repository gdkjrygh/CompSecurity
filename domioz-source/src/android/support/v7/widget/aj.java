// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ay;
import android.support.v4.view.cy;
import android.support.v4.widget.s;
import android.support.v7.a.b;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.MotionEvent;

final class aj extends ListViewCompat
{

    private boolean f;
    private boolean g;
    private boolean h;
    private cy i;
    private s j;

    public aj(Context context, boolean flag)
    {
        super(context, null, b.y);
        g = flag;
        setCacheColorHint(0);
    }

    static boolean a(aj aj1, boolean flag)
    {
        aj1.f = flag;
        return flag;
    }

    protected final boolean a()
    {
        return h || super.a();
    }

    public final boolean a(MotionEvent motionevent, int k)
    {
        int l = ay.a(motionevent);
        l;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 137
    //                   2 301
    //                   3 129;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_301;
_L1:
        boolean flag;
        k = 0;
        flag = true;
_L7:
        if (!flag || k != 0)
        {
            h = false;
            setPressed(false);
            drawableStateChanged();
            if (i != null)
            {
                i.b();
                i = null;
            }
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (j == null)
        {
            j = new s(this);
        }
        j.a(true);
        j.onTouch(this, motionevent);
_L9:
        return flag;
_L4:
        k = 0;
        flag = false;
          goto _L7
_L2:
        flag = false;
_L10:
        int i1;
        int j1;
        i1 = motionevent.findPointerIndex(k);
        if (i1 < 0)
        {
            k = 0;
            flag = false;
        } else
        {
label0:
            {
                k = (int)motionevent.getX(i1);
                i1 = (int)motionevent.getY(i1);
                j1 = pointToPosition(k, i1);
                if (j1 != -1)
                {
                    break label0;
                }
                k = 1;
            }
        }
          goto _L7
        android.view.View view = getChildAt(j1 - getFirstVisiblePosition());
        float f1 = k;
        float f2 = i1;
        h = true;
        setPressed(true);
        layoutChildren();
        setSelection(j1);
        a(j1, view, f1, f2);
        a(false);
        refreshDrawableState();
        if (l == 1)
        {
            performItemClick(view, j1, getItemIdAtPosition(j1));
        }
          goto _L1
_L6:
        if (j == null) goto _L9; else goto _L8
_L8:
        j.a(false);
        return flag;
        flag = true;
          goto _L10
    }

    public final boolean hasFocus()
    {
        return g || super.hasFocus();
    }

    public final boolean hasWindowFocus()
    {
        return g || super.hasWindowFocus();
    }

    public final boolean isFocused()
    {
        return g || super.isFocused();
    }

    public final boolean isInTouchMode()
    {
        return g && f || super.isInTouchMode();
    }
}
