// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;

// Referenced classes of package android.support.wearable.view:
//            CircledImageView

public class DelayedConfirmationView extends CircledImageView
{
    public static interface DelayedConfirmationListener
    {

        public abstract void onTimerFinished(View view);

        public abstract void onTimerSelected(View view);
    }


    private long mCurrentTimeMs;
    private DelayedConfirmationListener mListener;
    private long mStartTimeMs;
    private Handler mTimerHandler = new Handler() {

        final DelayedConfirmationView this$0;

        public void handleMessage(Message message)
        {
            mCurrentTimeMs = Calendar.getInstance().getTimeInMillis();
            invalidate();
            if (mCurrentTimeMs - mStartTimeMs < mTotalTimeMs)
            {
                mTimerHandler.sendEmptyMessageDelayed(0, mUpdateIntervalMs);
            } else
            if (mListener != null)
            {
                mListener.onTimerFinished(DelayedConfirmationView.this);
                return;
            }
        }

            
            {
                this$0 = DelayedConfirmationView.this;
                super();
            }
    };
    private long mTotalTimeMs;
    private long mUpdateIntervalMs;

    public DelayedConfirmationView(Context context)
    {
        this(context, null);
    }

    public DelayedConfirmationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DelayedConfirmationView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mUpdateIntervalMs = 0L;
        context = context.obtainStyledAttributes(attributeset, android.support.wearable.R.styleable.DelayedConfirmationView, i, 0);
        mUpdateIntervalMs = context.getInteger(0, 100);
        context.recycle();
    }

    protected void onDraw(Canvas canvas)
    {
        if (mStartTimeMs > 0L)
        {
            mProgress = (float)(mCurrentTimeMs - mStartTimeMs) / (float)mTotalTimeMs;
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 32
    //                   2 34;
           goto _L1 _L2 _L1 _L2
_L1:
        return false;
_L2:
        if (mListener != null)
        {
            mListener.onTimerSelected(this);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setListener(DelayedConfirmationListener delayedconfirmationlistener)
    {
        mListener = delayedconfirmationlistener;
    }

    public void setTotalTimeMs(long l)
    {
        mTotalTimeMs = l;
    }

    public void start()
    {
        mStartTimeMs = Calendar.getInstance().getTimeInMillis();
        mTimerHandler.sendEmptyMessageDelayed(0, mUpdateIntervalMs);
    }



/*
    static long access$002(DelayedConfirmationView delayedconfirmationview, long l)
    {
        delayedconfirmationview.mCurrentTimeMs = l;
        return l;
    }

*/





}
