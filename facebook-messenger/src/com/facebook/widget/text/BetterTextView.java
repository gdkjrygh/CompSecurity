// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.facebook.q;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.widget.text:
//            d, c, b

public class BetterTextView extends TextView
{

    private List a;
    private boolean b;
    private int c;

    public BetterTextView(Context context)
    {
        this(context, null, 0);
    }

    public BetterTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BetterTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, q.BetterTextView);
        b = context.getBoolean(q.BetterTextView_minimallyWide, false);
        c = context.getDimensionPixelOffset(q.BetterTextView_maximallyWideThreshold, -1);
        com.facebook.widget.text.c.a(this, d.fromIndex(context.getInt(q.BetterTextView_fontFamily, 0)), getTypeface());
        context.recycle();
    }

    private int getMaxLineWidth()
    {
        Layout layout = getLayout();
        int j = layout.getLineCount();
        float f = 0.0F;
        int i = 0;
        while (i < j) 
        {
            float f1;
            if (android.os.Build.VERSION.SDK_INT > 14)
            {
                f1 = layout.getLineMax(i);
            } else
            {
                f1 = layout.getLineWidth(i);
            }
            f = Math.max(f, f1);
            i++;
        }
        return (int)f;
    }

    public void a(b b1)
    {
        if (a == null)
        {
            a = hq.a();
        }
        a.add(b1);
    }

    public float getMaximallyWideThreshold()
    {
        return (float)c;
    }

    public boolean getMinimallyWide()
    {
        return b;
    }

    protected void onDraw(Canvas canvas)
    {
        if (a != null)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)iterator.next()).a(canvas)) { }
        }
        if ((getTransformationMethod() instanceof SingleLineTransformationMethod) && getMovementMethod() != null)
        {
            bringPointIntoView(0);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag;
        flag = true;
        super.onMeasure(i, j);
        if (getLineCount() <= 1) goto _L2; else goto _L1
_L1:
        int k = android.view.View.MeasureSpec.getMode(i);
        if (c <= 0 || k != 0x80000000) goto _L4; else goto _L3
_L3:
        int l;
        int i1;
        l = android.view.View.MeasureSpec.getSize(i);
        i1 = android.view.View.MeasureSpec.getSize(i);
        i = getMaxLineWidth();
        if (i >= l || l - i >= c) goto _L4; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (i1 < l)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000), j);
            i = ((flag) ? 1 : 0);
        }
_L7:
        if (b && (k == 0x40000000 || k == 0x80000000) && i == 0)
        {
            i = getMaxLineWidth();
            if (i < getMeasuredWidth())
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
            }
        }
_L2:
        return;
_L4:
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
label0:
        {
            flag = false;
            boolean flag1 = false;
            if (a == null)
            {
                break label0;
            }
            Iterator iterator = a.iterator();
            flag = flag1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                flag1 = ((b)iterator.next()).a(motionevent);
                flag = flag1;
            } while (!flag1);
            flag = flag1;
        }
        boolean flag2 = flag;
        if (!flag)
        {
            flag2 = super.onTouchEvent(motionevent);
        }
        return flag2;
    }

    public void setMaximallyWideThreshold(int i)
    {
        c = i;
    }

    public void setMinimallyWide(boolean flag)
    {
        b = flag;
        requestLayout();
    }
}
