// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.netflix.mediaclient.Log;

public class NetflixSeekBar extends SeekBar
{

    public static final int DENT_DELTA = 2;
    public static final int DENT_DELTA_MEASURE = 100;
    private static final String TAG = "nf_seekbar";
    private Drawable cachedThumb;
    private Bitmap dent;
    private int dentPosition;
    private boolean dentVisible;
    private int progressBarPadding;
    private Rect rectDent;
    private boolean snapInProgress;
    private int snapPosition;

    public NetflixSeekBar(Context context)
    {
        super(context);
        dentPosition = -1;
        snapPosition = -1;
    }

    public NetflixSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        dentPosition = -1;
        snapPosition = -1;
    }

    public NetflixSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dentPosition = -1;
        snapPosition = -1;
    }

    private float computeXOffsetFromProgress(int i)
    {
        return (float)(((getWidth() - getPaddingLeft() - getPaddingRight()) * i) / getMax());
    }

    private void drawDent(Canvas canvas)
    {
        if (dent != null)
        {
            if (rectDent == null)
            {
                rectDent = new Rect();
                Rect rect = cachedThumb.getBounds();
                float f = computeXOffsetFromProgress(getProgress() - snapPosition);
                int i = (int)((float)rect.centerX() - f);
                int j = dent.getWidth();
                rect = getProgressDrawable().getBounds();
                int k = rect.bottom;
                int l = progressBarPadding;
                int i1 = rect.top;
                int j1 = progressBarPadding;
                rectDent.set(i, i1 + j1, i + j, k - l);
                dentPosition = rectDent.centerX();
            }
            canvas.save();
            canvas.translate(getPaddingLeft() - getThumbOffset(), getPaddingTop());
            canvas.drawBitmap(dent, null, rectDent, null);
            canvas.restore();
        }
    }

    private void drawThumb(Canvas canvas)
    {
        if (cachedThumb != null)
        {
            canvas.save();
            canvas.translate(getPaddingLeft() - getThumbOffset(), getPaddingTop());
            cachedThumb.draw(canvas);
            canvas.restore();
        }
    }

    private int getDentDelta()
    {
        return (getMax() * 2) / 100;
    }

    private boolean inSnapZone(int i)
    {
        int j = getDentDelta();
        return i >= snapPosition - j && i <= snapPosition + j;
    }

    private int touchEventToProgress(MotionEvent motionevent)
    {
        int i = getWidth();
        int j = getPaddingLeft();
        int k = getPaddingRight();
        int l = (int)motionevent.getX();
        float f;
        if (l < getPaddingLeft())
        {
            f = 0.0F;
        } else
        if (l > i - getPaddingRight())
        {
            f = 1.0F;
        } else
        {
            f = (float)(l - getPaddingLeft()) / (float)(i - j - k);
        }
        return (int)(0.0F + (float)getMax() * f);
    }

    private boolean validateSnap(int i)
    {
        if (inSnapZone(i))
        {
            Log.d("nf_seekbar", "validateSnap:: snap in progress. Still in snap zone Ignore.");
            return false;
        } else
        {
            Log.d("nf_seekbar", "validateSnap:: snap in progress. Not in snap zone anymore.");
            snapInProgress = false;
            return true;
        }
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        return onTrackballEvent(motionevent);
    }

    public int getDentMiddleX()
    {
        return dentPosition;
    }

    public Drawable getNetflixThumb()
    {
        return cachedThumb;
    }

    public int getSnapPosition()
    {
        return snapPosition;
    }

    public boolean inSnapPosition()
    {
        return getProgress() == snapPosition;
    }

    public boolean isDentVisible()
    {
        return dentVisible;
    }

    public boolean isSnapInProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = snapInProgress;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        super.onDraw(canvas);
        if (dentVisible && dent != null)
        {
            drawDent(canvas);
            drawThumb(canvas);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    void onKeyChange()
    {
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = true;
        if (i != 21 && i != 22 || !snapInProgress) goto _L2; else goto _L1
_L1:
        int j = getProgress();
        i;
        JVM INSTR tableswitch 21 22: default 52
    //                   21 58
    //                   22 82;
           goto _L3 _L4 _L5
_L3:
        flag = false;
_L8:
        return flag;
_L4:
        if (j <= 0) goto _L3; else goto _L6
_L6:
        if (!validateSnap(j - getKeyProgressIncrement())) goto _L8; else goto _L7
_L7:
        return super.onKeyDown(i, keyevent);
_L5:
        if (j >= getMax()) goto _L3; else goto _L9
_L9:
        if (!validateSnap(getKeyProgressIncrement() + j)) goto _L8; else goto _L10
_L10:
        return super.onKeyDown(i, keyevent);
_L2:
        return super.onKeyDown(i, keyevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = touchEventToProgress(motionevent);
        if (motionevent.getAction() == 2 && snapInProgress)
        {
            if (inSnapZone(i))
            {
                Log.d("nf_seekbar", "onTouchEvent snap in progress. Still in snap zone Ignore.");
                return false;
            }
            Log.d("nf_seekbar", "onTouchEvent snap in progress. Not in snap zone anymore.");
            snapInProgress = false;
        }
        return super.onTouchEvent(motionevent);
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle)
    {
        if (i != 8192 && i != 4096 || !snapInProgress) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        j = getProgress();
        k = Math.max(1, Math.round((float)getMax() / 5F));
        i;
        JVM INSTR lookupswitch 2: default 72
    //                   4096: 98
    //                   8192: 74;
           goto _L3 _L4 _L5
_L3:
        return false;
_L5:
        if (j <= 0) goto _L3; else goto _L6
_L6:
        if (validateSnap(j - k))
        {
            return super.performAccessibilityAction(i, bundle);
        } else
        {
            return true;
        }
_L4:
        if (j >= getMax()) goto _L3; else goto _L7
_L7:
        if (validateSnap(j + k))
        {
            return super.performAccessibilityAction(i, bundle);
        } else
        {
            return true;
        }
_L2:
        return super.performAccessibilityAction(i, bundle);
    }

    public int setDentVisible(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i = -1;
        dentVisible = flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        rectDent = null;
        snapPosition = -1;
_L1:
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return i;
        dentPosition = -1;
        i = getProgress();
        snapPosition = i;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        super.setProgress(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgressBarPadding(int i)
    {
        progressBarPadding = i;
    }

    public void setScrubberDent(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        dent = bitmap;
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    public void setThumb(Drawable drawable)
    {
        cachedThumb = drawable;
        super.setThumb(drawable);
    }

    public void snapToLastTime()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("nf_seekbar", "Snap!!!");
        snapInProgress = true;
        super.setProgress(snapPosition);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
