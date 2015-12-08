// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            g

public class PostCommentsTextView extends View
{

    private Layout a;
    private g b;
    private Spannable c;
    private boolean d;

    public PostCommentsTextView(Context context)
    {
        super(context);
    }

    public PostCommentsTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PostCommentsTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a()
    {
        d = false;
        requestLayout();
    }

    public final void a(Layout layout)
    {
        d = true;
        a = layout;
        c = (Spannable)a.getText();
        requestLayout();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null && d)
        {
            canvas.save();
            a.draw(canvas);
            canvas.restore();
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (a != null && d)
        {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight() + a.getWidth(), getPaddingTop() + getPaddingBottom() + a.getHeight());
            return;
        } else
        {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a == null)
        {
            return false;
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 54
    //                   1 200
    //                   2 48
    //                   3 215;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        int k = (int)motionevent.getX();
        int i = (int)motionevent.getY();
        int l = getPaddingLeft();
        int j = getPaddingTop();
        k = (k - l) + getScrollX();
        l = getScrollY();
        i = a.getLineForVertical((i - j) + l);
        if (a.getLineLeft(i) <= (float)k && (float)k <= a.getLineRight(i))
        {
            i = a.getOffsetForHorizontal(i, k);
            g ag[] = (g[])c.getSpans(i, i, com/roidapp/cloudlib/sns/basepost/g);
            if (ag.length != 0)
            {
                b = ag[ag.length - 1];
                b.a(true);
                invalidate();
                return true;
            }
        }
          goto _L1
_L3:
        if (b != null)
        {
            b.onClick(this);
        }
_L4:
        if (b == null) goto _L1; else goto _L5
_L5:
        b.a(false);
        b = null;
        invalidate();
        return true;
    }
}
