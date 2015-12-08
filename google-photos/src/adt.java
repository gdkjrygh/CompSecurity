// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;

final class adt extends xt
{

    private boolean a;
    private boolean b;
    private boolean c;
    private rd d;

    public adt(Context context, boolean flag)
    {
        super(context, null, b.I);
        b = flag;
        setCacheColorHint(0);
    }

    static boolean a(adt adt1, boolean flag)
    {
        adt1.a = flag;
        return flag;
    }

    protected final boolean a()
    {
        return c || super.a();
    }

    public final boolean a(MotionEvent motionevent, int i)
    {
        int j = lt.a(motionevent);
        j;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 118
    //                   2 282
    //                   3 110;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_282;
_L1:
        boolean flag;
        i = 0;
        flag = true;
_L7:
        if (!flag || i != 0)
        {
            c = false;
            setPressed(false);
            drawableStateChanged();
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        if (d == null)
        {
            d = new rd(this);
        }
        d.a(true);
        d.onTouch(this, motionevent);
_L9:
        return flag;
_L4:
        i = 0;
        flag = false;
          goto _L7
_L2:
        flag = false;
_L10:
        int k;
        int l;
        k = motionevent.findPointerIndex(i);
        if (k < 0)
        {
            i = 0;
            flag = false;
        } else
        {
label0:
            {
                i = (int)motionevent.getX(k);
                k = (int)motionevent.getY(k);
                l = pointToPosition(i, k);
                if (l != -1)
                {
                    break label0;
                }
                i = 1;
            }
        }
          goto _L7
        android.view.View view = getChildAt(l - getFirstVisiblePosition());
        float f = i;
        float f1 = k;
        c = true;
        setPressed(true);
        layoutChildren();
        setSelection(l);
        a(l, view, f, f1);
        a(false);
        refreshDrawableState();
        if (j == 1)
        {
            performItemClick(view, l, getItemIdAtPosition(l));
        }
          goto _L1
_L6:
        if (d == null) goto _L9; else goto _L8
_L8:
        d.a(false);
        return flag;
        flag = true;
          goto _L10
    }

    public final boolean hasFocus()
    {
        return b || super.hasFocus();
    }

    public final boolean hasWindowFocus()
    {
        return b || super.hasWindowFocus();
    }

    public final boolean isFocused()
    {
        return b || super.isFocused();
    }

    public final boolean isInTouchMode()
    {
        return b && a || super.isInTouchMode();
    }
}
