// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.SeekBar;

public class MySeekBar extends SeekBar
{
    public static interface OnSeekBarChangeListener
    {

        public abstract void onProgressChanged(MySeekBar myseekbar, int i, boolean flag);

        public abstract void onStartTrackingTouch(MySeekBar myseekbar);

        public abstract void onStopTrackingTouch(MySeekBar myseekbar);
    }


    private OnSeekBarChangeListener mOnSeekBarChangeListener;
    private Drawable mThumb;

    public MySeekBar(Context context)
    {
        this(context, null);
    }

    public MySeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101007b);
    }

    public MySeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void attemptClaimDrag()
    {
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private void setThumbPos(int i, Drawable drawable, float f, int j)
    {
        int l = getPaddingLeft();
        int j1 = getPaddingRight();
        int k = drawable.getIntrinsicWidth();
        int i1 = drawable.getIntrinsicHeight();
        l = (int)((float)(((l + i) - j1 - k) + getThumbOffset() * 2) * f);
        if (j == 0x80000000)
        {
            Rect rect = drawable.getBounds();
            i = rect.top;
            j = rect.bottom;
        } else
        {
            i = j;
            j += i1;
        }
        drawable.setBounds(l, i, l + k, j);
    }

    private void trackTouchEvent(MotionEvent motionevent)
    {
        int i = getHeight();
        int j = getPaddingBottom();
        int k = getPaddingTop();
        int l = (int)motionevent.getY();
        float f;
        if (l > i - getPaddingBottom())
        {
            f = 0.0F;
        } else
        if (l < getPaddingTop())
        {
            f = 1.0F;
        } else
        {
            f = (float)(i - getPaddingBottom() - l) / (float)(i - j - k);
        }
        setProgress((int)(f * (float)getMax()));
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

    void onProgressRefresh(float f, boolean flag)
    {
        Drawable drawable = mThumb;
        if (drawable != null)
        {
            setThumbPos(getHeight(), drawable, f, 0x80000000);
            invalidate();
        }
        if (mOnSeekBarChangeListener != null)
        {
            mOnSeekBarChangeListener.onProgressChanged(this, getProgress(), flag);
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(j, i, k, l);
    }

    void onStartTrackingTouch()
    {
        if (mOnSeekBarChangeListener != null)
        {
            mOnSeekBarChangeListener.onStartTrackingTouch(this);
        }
    }

    void onStopTrackingTouch()
    {
        if (mOnSeekBarChangeListener != null)
        {
            mOnSeekBarChangeListener.onStopTrackingTouch(this);
        }
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
    //                   1 103
    //                   2 77
    //                   3 134;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        setPressed(true);
        onStartTrackingTouch();
        trackTouchEvent(motionevent);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        continue; /* Loop/switch isn't completed */
_L4:
        trackTouchEvent(motionevent);
        attemptClaimDrag();
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        continue; /* Loop/switch isn't completed */
_L3:
        trackTouchEvent(motionevent);
        onStopTrackingTouch();
        setPressed(false);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        continue; /* Loop/switch isn't completed */
_L5:
        onStopTrackingTouch();
        setPressed(false);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onseekbarchangelistener)
    {
        mOnSeekBarChangeListener = onseekbarchangelistener;
    }

    public void setThumb(Drawable drawable)
    {
        mThumb = drawable;
        super.setThumb(drawable);
    }
}
