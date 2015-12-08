// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.audiofx.Visualizer;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

public class VisualizerView extends View
{

    private final int ACCELERATION;
    private final int REFRESH_TIME;
    private final int TIMES_MAX;
    private boolean canDrawLines;
    private boolean error;
    private Paint errorPaint;
    private float linesArray[];
    private Paint linesPaint;
    private byte mBytes[];
    private Context mContext;
    private Handler mHandler;
    private Rect mRect;
    private int mSpectrumNum;
    private Visualizer mVisualizer;
    private float pointsArray[];
    private Paint pointsPaint;
    private Runnable runnable = new Runnable() {

        final VisualizerView this$0;

        public void run()
        {
            invalidate();
            if (times < 10)
            {
                if (times == 1)
                {
                    initByte();
                }
                mHandler.postDelayed(this, 100L);
            }
            VisualizerView visualizerview = VisualizerView.this;
            visualizerview.times = visualizerview.times + 1;
        }

            
            {
                this$0 = VisualizerView.this;
                super();
            }
    };
    private float tempArray[];
    private int times;

    public VisualizerView(Context context)
    {
        super(context);
        REFRESH_TIME = 100;
        TIMES_MAX = 10;
        ACCELERATION = 1;
        mVisualizer = null;
        mHandler = null;
        mSpectrumNum = 48;
        times = 0;
        error = false;
        canDrawLines = false;
        mBytes = null;
        linesArray = null;
        pointsArray = null;
        tempArray = null;
        mRect = null;
        linesPaint = null;
        pointsPaint = null;
        errorPaint = null;
        mContext = null;
        init();
        mContext = context;
    }

    public VisualizerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        REFRESH_TIME = 100;
        TIMES_MAX = 10;
        ACCELERATION = 1;
        mVisualizer = null;
        mHandler = null;
        mSpectrumNum = 48;
        times = 0;
        error = false;
        canDrawLines = false;
        mBytes = null;
        linesArray = null;
        pointsArray = null;
        tempArray = null;
        mRect = null;
        linesPaint = null;
        pointsPaint = null;
        errorPaint = null;
        mContext = null;
        init();
        mContext = context;
    }

    public VisualizerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        REFRESH_TIME = 100;
        TIMES_MAX = 10;
        ACCELERATION = 1;
        mVisualizer = null;
        mHandler = null;
        mSpectrumNum = 48;
        times = 0;
        error = false;
        canDrawLines = false;
        mBytes = null;
        linesArray = null;
        pointsArray = null;
        tempArray = null;
        mRect = null;
        linesPaint = null;
        pointsPaint = null;
        errorPaint = null;
        mContext = null;
        init();
        mContext = context;
    }

    private float freeFall(float f)
    {
        return (1.0F * f * f) / 2.0F;
    }

    private void init()
    {
        mRect = new Rect();
        mHandler = new Handler();
        linesPaint = new Paint();
        linesPaint.setStrokeWidth(5F);
        linesPaint.setAntiAlias(true);
        linesPaint.setColor(Color.argb(230, 255, 255, 255));
        pointsPaint = new Paint();
        pointsPaint.setStrokeWidth(5F);
        pointsPaint.setAntiAlias(true);
        pointsPaint.setColor(Color.argb(130, 255, 255, 255));
        initByte();
    }

    private void initByte()
    {
        mBytes = new byte[mSpectrumNum];
        int i = 0;
        do
        {
            if (i >= mSpectrumNum)
            {
                return;
            }
            mBytes[i] = 0;
            i++;
        } while (true);
    }

    private void updateVisualizer(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length / 2 + 1];
        abyte1[0] = (byte)Math.abs(abyte0[0]);
        int j = 2;
        int i = 1;
        do
        {
            if (i >= mSpectrumNum)
            {
                mBytes = abyte1;
                invalidate();
                return;
            }
            abyte1[i] = (byte)(int)Math.hypot(abyte0[j], abyte0[j + 1]);
            j += 2;
            i++;
        } while (true);
    }

    protected void onDetachedFromWindow()
    {
        try
        {
            mHandler.removeCallbacks(runnable);
            super.onDetachedFromWindow();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int k;
        super.onDraw(canvas);
        if (mBytes == null)
        {
            return;
        }
        if (error)
        {
            String s = mContext.getString(0x7f08009c);
            canvas.drawText(s, (float)(getWidth() / 2) - errorPaint.measureText(s) / 2.0F, getHeight() / 2, errorPaint);
            return;
        }
        int i = mSpectrumNum * 4;
        if (linesArray == null || linesArray.length < i)
        {
            linesArray = new float[i];
        }
        i = mSpectrumNum * 2;
        if (pointsArray == null || pointsArray.length < i)
        {
            pointsArray = new float[i];
        }
        k = mSpectrumNum * 3;
        if (tempArray != null && tempArray.length >= k) goto _L2; else goto _L1
_L1:
        int j;
        tempArray = new float[k];
        j = 0;
_L4:
        if (j < k) goto _L3; else goto _L2
_L2:
        int l;
        mRect.set(0, 0, getWidth(), getHeight());
        k = mRect.width() / mSpectrumNum;
        l = mRect.height();
        j = 0;
_L5:
        if (j >= mSpectrumNum)
        {
            if (canDrawLines)
            {
                canvas.drawLines(linesArray, linesPaint);
            }
            canvas.drawPoints(pointsArray, pointsPaint);
            return;
        }
        break MISSING_BLOCK_LABEL_289;
_L3:
        if (j % 3 != 0)
        {
            tempArray[j] = 1024F;
        }
        j++;
          goto _L4
        if (mBytes[j] < 0)
        {
            mBytes[j] = 127;
        }
        int i1 = k * j + k / 2;
        if (canDrawLines)
        {
            linesArray[j * 4] = i1;
            linesArray[j * 4 + 1] = l;
            linesArray[j * 4 + 2] = i1;
            linesArray[j * 4 + 3] = l - mBytes[j];
        }
        int j1 = l - mBytes[j] - 3;
        if (tempArray[j * 3 + 1] > (float)j1)
        {
            tempArray[j * 3] = i1;
            tempArray[j * 3 + 1] = j1;
            tempArray[j * 3 + 2] = 0.0F;
            pointsArray[j * 2] = i1;
            pointsArray[j * 2 + 1] = j1;
        } else
        {
            tempArray[j * 3] = i1;
            float f = tempArray[j * 3 + 2];
            float f1 = tempArray[j * 3 + 1] + freeFall(f);
            tempArray[j * 3 + 2] = f + 1.0F;
            f = f1;
            if (f1 > (float)j1)
            {
                f = j1;
            }
            tempArray[j * 3 + 1] = f;
            pointsArray[j * 2] = i1;
            pointsArray[j * 2 + 1] = tempArray[j * 3 + 1];
        }
        j++;
          goto _L5
    }

    public void releaseVisualizerFx()
    {
        if (mVisualizer == null)
        {
            return;
        } else
        {
            canDrawLines = false;
            mVisualizer.setEnabled(false);
            mHandler.postDelayed(runnable, 100L);
            return;
        }
    }

    public void setupVisualizerFx(int i)
    {
        mHandler.removeCallbacks(runnable);
        canDrawLines = true;
        error = false;
        times = 0;
        if (mVisualizer != null)
        {
            mVisualizer.setEnabled(false);
            mVisualizer.release();
            mVisualizer = null;
        }
        try
        {
            mVisualizer = new Visualizer(i);
            mVisualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[0]);
            mVisualizer.setDataCaptureListener(new android.media.audiofx.Visualizer.OnDataCaptureListener() {

                final VisualizerView this$0;

                public void onFftDataCapture(Visualizer visualizer, byte abyte0[], int j)
                {
                    updateVisualizer(abyte0);
                }

                public void onWaveFormDataCapture(Visualizer visualizer, byte abyte0[], int j)
                {
                    updateVisualizer(abyte0);
                }

            
            {
                this$0 = VisualizerView.this;
                super();
            }
            }, Visualizer.getMaxCaptureRate() / 2, false, true);
            mVisualizer.setEnabled(true);
            return;
        }
        catch (Exception exception)
        {
            errorPaint = new Paint();
            errorPaint.setColor(Color.argb(230, 255, 255, 255));
            errorPaint.setTextSize(20F);
            error = true;
            exception.printStackTrace();
            return;
        }
    }





}
