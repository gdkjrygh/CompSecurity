// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.MathUtils;

public class SnappableSeekBar extends SeekBar
{
    public static interface OnSnappableSeekBarChangeListener
    {

        public abstract void onProgressChanged(SeekBar seekbar, int i, boolean flag);

        public abstract void onStartTrackingTouch(SeekBar seekbar);

        public abstract void onStopTrackingTouch(SeekBar seekbar, boolean flag);
    }

    private class SnappableSeekBarChangeListener
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        private com.netflix.mediaclient.util.MathUtils.Range progressSnapRegion;
        final SnappableSeekBar this$0;
        private final OnSnappableSeekBarChangeListener wrappedListener;

        private com.netflix.mediaclient.util.MathUtils.Range computeProgressSnapRegion()
        {
            int i = (int)((float)(AndroidUtils.dipToPixels(getContext(), 24) * getMax()) / (float)getWidth());
            int j = getProgress();
            com.netflix.mediaclient.util.MathUtils.Range range = new com.netflix.mediaclient.util.MathUtils.Range(j - i, j + i);
            if (Log.isLoggable("SnappableSeekBar", 2))
            {
                Log.v("SnappableSeekBar", (new StringBuilder()).append("snap region: ").append(range).append(", position: ").append(j).append(", max position: ").append(getMax()).toString());
            }
            return range;
        }

        private boolean isWithinInternalSnapRegion(int i)
        {
            return progressSnapRegion != null && progressSnapRegion.contains(i);
        }

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            Log.v("SnappableSeekBar", (new StringBuilder()).append("onProgressChanged, progress: ").append(i).append(", fromUser: ").append(flag).toString());
            int j = i;
            if (flag)
            {
                j = i;
                if (isWithinInternalSnapRegion(i))
                {
                    i = MathUtils.constrain(progressSnapRegion.getMidpoint(), 0, seekbar.getMax());
                    seekbar.setProgress(i);
                    j = i;
                    if (Log.isLoggable("SnappableSeekBar", 2))
                    {
                        Log.v("SnappableSeekBar", (new StringBuilder()).append("Progress is within snap region - snapping to: ").append(i).toString());
                        j = i;
                    }
                }
            }
            wrappedListener.onProgressChanged(seekbar, j, flag);
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            Log.v("SnappableSeekBar", "onStartTrackingTouch");
            wrappedListener.onStartTrackingTouch(seekbar);
            if (shouldSnapToTouchStartPosition)
            {
                seekbar = computeProgressSnapRegion();
            } else
            {
                seekbar = null;
            }
            progressSnapRegion = seekbar;
            startSnapping();
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
            Log.v("SnappableSeekBar", "onStopTrackingTouch");
            OnSnappableSeekBarChangeListener onsnappableseekbarchangelistener = wrappedListener;
            boolean flag;
            if (progressSnapRegion != null && progressSnapRegion.contains(getProgress()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onsnappableseekbarchangelistener.onStopTrackingTouch(seekbar, flag);
            progressSnapRegion = null;
            finishSnapping();
        }


        public SnappableSeekBarChangeListener(OnSnappableSeekBarChangeListener onsnappableseekbarchangelistener)
        {
            this$0 = SnappableSeekBar.this;
            super();
            wrappedListener = onsnappableseekbarchangelistener;
        }
    }


    private static final int SNAP_REGION_SIZE_DP = 48;
    private static final String TAG = "SnappableSeekBar";
    private Drawable cachedThumb;
    private Bitmap dent;
    private boolean dentVisible;
    private boolean disableTrackTouching;
    private Rect rectDent;
    private boolean shouldSnapToTouchStartPosition;
    private SnappableSeekBarChangeListener snapListener;
    private int snapPosition;

    public SnappableSeekBar(Context context)
    {
        super(context);
        snapPosition = -1;
    }

    public SnappableSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        snapPosition = -1;
    }

    public SnappableSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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
                int i = ((int)(computeXOffsetFromProgress(snapPosition) + 0.5F) + getPaddingLeft() + getThumbOffset() / 2) - dent.getWidth() / 2;
                int j = dent.getWidth();
                int k = getProgressDrawable().getBounds().centerY();
                int l = dent.getHeight() / 2;
                rectDent = new Rect(i, k - dent.getHeight() / 2, i + j, k + l);
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

    private void finishSnapping()
    {
        dentVisible = false;
        rectDent = null;
        snapPosition = -1;
        invalidate();
    }

    private void startSnapping()
    {
        dentVisible = true;
        snapPosition = getProgress();
        invalidate();
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

    public Drawable getCachedThumb()
    {
        return cachedThumb;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (dentVisible && dent != null)
        {
            drawDent(canvas);
            drawThumb(canvas);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1 = false;
        flag = flag1;
        if (disableTrackTouching)
        {
            Object obj = getCachedThumb();
            flag = flag1;
            if (obj != null)
            {
                obj = new Rect(((Drawable) (obj)).getBounds());
                obj.left = ((Rect) (obj)).left - getThumbOffset();
                obj.right = ((Rect) (obj)).right - getThumbOffset();
                flag = ((Rect) (obj)).contains((int)motionevent.getX(), (int)motionevent.getY());
            }
        }
        if (!disableTrackTouching || flag || motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        int i;
        boolean flag2;
        flag2 = super.onTouchEvent(motionevent);
        i = touchEventToProgress(motionevent);
        if (motionevent.getAction() == 2)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
        if (motionevent.getAction() != 1) goto _L4; else goto _L3
_L3:
        flag = flag2;
        if (snapListener != null)
        {
            flag = flag2;
            if (snapListener.isWithinInternalSnapRegion(i))
            {
                setProgress(snapPosition);
                return flag2;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void setDisableTrackTouching(boolean flag)
    {
        disableTrackTouching = flag;
    }

    public void setScrubberDentBitmap(int i)
    {
        dent = BitmapFactory.decodeResource(getResources(), i);
        Log.v("SnappableSeekBar", (new StringBuilder()).append("Dent: ").append(dent.getWidth()).append("x").append(dent.getHeight()).toString());
    }

    public void setShouldSnapToTouchStartPosition(boolean flag)
    {
        shouldSnapToTouchStartPosition = flag;
    }

    public void setSnappableOnSeekBarChangeListener(OnSnappableSeekBarChangeListener onsnappableseekbarchangelistener)
    {
        snapListener = new SnappableSeekBarChangeListener(onsnappableseekbarchangelistener);
        super.setOnSeekBarChangeListener(snapListener);
    }

    public void setThumb(Drawable drawable)
    {
        cachedThumb = drawable;
        super.setThumb(drawable);
    }



}
