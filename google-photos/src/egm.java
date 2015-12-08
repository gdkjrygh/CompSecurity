// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

final class egm extends ts
{

    private static final int c[] = {
        0x10100a0
    };
    private final int d;
    private final int e;
    private Drawable f;

    public egm(Context context, int i, int j)
    {
        super(context);
        int k = getContext().getResources().getDimensionPixelSize(b.lb);
        setPadding(k, getPaddingTop(), k, getPaddingBottom());
        d = i;
        e = j;
        a(ed.a(context, b.lc));
    }

    public final void a(Drawable drawable)
    {
        super.a(drawable);
        if (f != null)
        {
            f.setCallback(null);
            unscheduleDrawable(f);
        }
        f = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
        refreshDrawableState();
    }

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (f != null)
        {
            int ai[] = getDrawableState();
            f.setState(ai);
            invalidate();
        }
    }

    public final void jumpDrawablesToCurrentState()
    {
        if (getBackground() != null)
        {
            fa.a(getBackground());
        }
        if (f != null)
        {
            fa.a(f);
            Drawable drawable = ((StateListDrawable)f).getCurrent();
            if (drawable instanceof AnimationDrawable)
            {
                ((AnimationDrawable)drawable).start();
            }
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        if (f == null)
        {
            return;
        }
        int j1 = getPaddingLeft();
        int k1 = getWidth();
        int l1 = getPaddingRight();
        int k = getPaddingTop();
        int l = getHeight();
        int i1 = getPaddingBottom();
        int i = f.getIntrinsicWidth();
        int j = f.getIntrinsicHeight();
        j1 += (k1 - l1 - j1 - i) / 2;
        k = (l - i1 - k - j) / 2 + k;
        f.setBounds(j1, k, j1 + i, k + j);
        if (StateSet.stateSetMatches(c, getDrawableState()))
        {
            f.setColorFilter(e, android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else
        {
            f.setColorFilter(d, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        f.draw(canvas);
    }

    protected final void onMeasure(int i, int j)
    {
        int k;
        int l;
        l = android.view.View.MeasureSpec.getSize(i);
        k = android.view.View.MeasureSpec.getSize(j);
        int j1 = android.view.View.MeasureSpec.getMode(i);
        int i1 = android.view.View.MeasureSpec.getMode(j);
        if (f != null)
        {
            i = f.getIntrinsicWidth();
        } else
        {
            i = 0;
        }
        if (f != null)
        {
            j = f.getIntrinsicHeight();
        } else
        {
            j = 0;
        }
        j1;
        JVM INSTR lookupswitch 2: default 80
    //                   -2147483648: 155
    //                   1073741824: 149;
           goto _L1 _L2 _L3
_L1:
        i = i + getPaddingLeft() + getPaddingRight();
_L7:
        i1;
        JVM INSTR lookupswitch 2: default 120
    //                   -2147483648: 180
    //                   1073741824: 175;
           goto _L4 _L5 _L6
_L4:
        j = getPaddingTop() + j + getPaddingBottom();
_L8:
        setMeasuredDimension(i, j);
        return;
_L3:
        i = l;
          goto _L7
_L2:
        i = Math.min(l, i + getPaddingLeft() + getPaddingRight());
          goto _L7
_L6:
        j = k;
          goto _L8
_L5:
        j = Math.min(k, getPaddingTop() + j + getPaddingBottom());
          goto _L8
    }

    public final void setVisibility(int i)
    {
        super.setVisibility(i);
        if (f != null)
        {
            Drawable drawable = f;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    protected final boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == f;
    }

}
