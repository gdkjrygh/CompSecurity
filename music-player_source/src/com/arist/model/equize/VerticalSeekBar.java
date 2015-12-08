// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

// Referenced classes of package com.arist.model.equize:
//            m

public class VerticalSeekBar extends SeekBar
{

    private android.widget.SeekBar.OnSeekBarChangeListener a;
    private m b;

    public VerticalSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a(boolean flag)
    {
        super.setPressed(flag);
        m m;
        if (b != null)
        {
            m = b;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.rotate(-90F);
        canvas.translate(-getHeight(), 0.0F);
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        super.onMeasure(j, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(j, i, l, k);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 46
    //                   1 154
    //                   2 111
    //                   3 219;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        setProgress(getMax() - (int)(((float)getMax() * motionevent.getY()) / (float)getHeight()));
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        a(true);
        if (a != null)
        {
            a.onStartTrackingTouch(this);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        setProgress(getMax() - (int)(((float)getMax() * motionevent.getY()) / (float)getHeight()));
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        continue; /* Loop/switch isn't completed */
_L3:
        setProgress(getMax() - (int)(((float)getMax() * motionevent.getY()) / (float)getHeight()));
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        if (a != null)
        {
            a.onStopTrackingTouch(this);
        }
        a(false);
        continue; /* Loop/switch isn't completed */
_L5:
        if (a != null)
        {
            a.onStopTrackingTouch(this);
        }
        a(false);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        super.setOnSeekBarChangeListener(onseekbarchangelistener);
        a = onseekbarchangelistener;
    }

    public void setProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        super.setProgress(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
