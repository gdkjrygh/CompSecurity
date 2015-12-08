// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.google.android.libraries.memorymonitor:
//            HeapInflater, AndroidMemorySnapshot, MemoryMonitor

public class MemoryMonitorView extends View
{
    final class MemoryMonitorOnGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        private float heapUsageOnFingerDown;
        private float heapUsageOnFingerUp;
        private float heapUsageWithoutPadding;
        final MemoryMonitorView this$0;
        private Toast toast;

        private void displayExplanatoryToast()
        {
            AndroidMemorySnapshot androidmemorysnapshot = latestSnapshot;
            String s = String.valueOf("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: ");
            long l = MemoryMonitorView.bToMb(androidmemorysnapshot.dalvikHeapSizeB);
            long l1 = MemoryMonitorView.bToMb(androidmemorysnapshot.dalvikMaxHeapSizeB);
            long l2 = MemoryMonitorView.bToMb(maxHeapSizeBytes);
            long l3 = defaultMemoryClassHeapSizeMb;
            long l4 = largeMemoryClassHeapSizeMb;
            displayToast((new StringBuilder(String.valueOf(s).length() + 255)).append(s).append(l).append("MB\nRed line: Max Dalvik heap memory: ").append(l1).append("MB\nGrey background bounds: large heap size: ").append(l2).append("MB (should be the same as the red line)\n").append("Default heap: ").append(l3).append(" MB; large heap: ").append(l4).append(" MB").toString(), new Object[0]);
        }

        private transient void displayToast(String s, Object aobj[])
        {
            if (toast != null)
            {
                toast.cancel();
            }
            toast = Toast.makeText(getContext(), String.format(s, aobj), 1);
            toast.show();
        }

        private boolean onUp()
        {
            if (heapUsageOnFingerUp != heapUsageOnFingerDown)
            {
                displayToast("Inflating heap utilization to %.2f%% (%.2f MB)", new Object[] {
                    Float.valueOf(heapUsageOnFingerUp * 100F), Float.valueOf(heapUsageOnFingerUp * MemoryMonitorView.MAX_HEAP_SIZE_MB)
                });
                heapInflater.setHeapUtilization(heapUsageOnFingerUp);
                return true;
            } else
            {
                displayExplanatoryToast();
                return true;
            }
        }

        public final boolean onDown(MotionEvent motionevent)
        {
            heapUsageOnFingerDown = HeapInflater.getCurrentHeapUtilization();
            heapUsageOnFingerUp = heapUsageOnFingerDown;
            heapUsageWithoutPadding = heapUsageOnFingerDown - (float)MemoryMonitorView.bToMb(heapInflater.getBytesPadded()) / MemoryMonitorView.MAX_HEAP_SIZE_MB;
            return true;
        }

        public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            heapUsageOnFingerUp = heapUsageOnFingerUp + f1 / halfScreenHeightPx;
            heapUsageOnFingerUp = Math.max(heapUsageWithoutPadding, Math.min(heapUsageOnFingerUp, 1.0F));
            displayToast("Target heap usage: %.2f%% (%.2f MB)", new Object[] {
                Float.valueOf(heapUsageOnFingerUp * 100F), Float.valueOf(heapUsageOnFingerUp * MemoryMonitorView.MAX_HEAP_SIZE_MB)
            });
            return true;
        }


        private MemoryMonitorOnGestureListener()
        {
            this$0 = MemoryMonitorView.this;
            super();
        }

    }


    private static final float MAX_HEAP_SIZE_MB;
    private static final Runtime RUNTIME;
    private Paint barPaint;
    private float constrainedHeight;
    private final long defaultMemoryClassHeapSizeMb;
    private int desiredHeight;
    private int desiredWidth;
    private final GestureDetector gestureDetector;
    private final MemoryMonitorOnGestureListener gestureListener = new MemoryMonitorOnGestureListener();
    private final float halfScreenHeightPx;
    private final HeapInflater heapInflater = new HeapInflater();
    private final long largeMemoryClassHeapSizeMb;
    private volatile AndroidMemorySnapshot latestSnapshot;
    private Paint linePaint;
    private final long maxHeapSizeBytes;
    private MemoryMonitor memoryMonitor;
    private MemoryMonitor.AndroidMemoryListener memoryMonitorListener;
    private float rectangleRoundingRadius;
    private Resources resources;
    private Paint textPaint;
    private float textSize;

    public MemoryMonitorView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        latestSnapshot = new AndroidMemorySnapshot(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
        resources = context.getResources();
        desiredWidth = convertDpToPx(context, 45);
        desiredHeight = convertDpToPx(context, 140);
        barPaint = new Paint();
        linePaint = new Paint();
        linePaint.setStrokeWidth(convertDpToPx(context, 1));
        rectangleRoundingRadius = convertDpToPx(context, 2);
        textSize = convertDpToPx(context, 7);
        textPaint = new Paint();
        textPaint.setColor(0xff000000);
        textPaint.setTextSize(textSize);
        attributeset = (ActivityManager)getContext().getSystemService("activity");
        defaultMemoryClassHeapSizeMb = attributeset.getMemoryClass();
        largeMemoryClassHeapSizeMb = attributeset.getLargeMemoryClass();
        maxHeapSizeBytes = RUNTIME.maxMemory();
        halfScreenHeightPx = resources.getDisplayMetrics().heightPixels / 2;
        gestureDetector = new GestureDetector(context, gestureListener);
    }

    private static long bToMb(double d)
    {
        return Math.round(d / 1048576D);
    }

    private float computeBarHeight(long l)
    {
        if (maxHeapSizeBytes == 0L)
        {
            return 0.0F;
        } else
        {
            return ((float)l / (float)maxHeapSizeBytes) * constrainedHeight;
        }
    }

    private static int convertDpToPx(Context context, float f)
    {
        return Math.round(context.getResources().getDisplayMetrics().density * f);
    }

    private static int convertDpToPx(Context context, int i)
    {
        return convertDpToPx(context, i);
    }

    private void drawBackground(Canvas canvas)
    {
        barPaint.setColor(0xff888888);
        constrainedHeight = 0.5F * (float)getHeight();
        canvas.drawRoundRect(new RectF(0.0F, (float)getHeight() - constrainedHeight, getWidth(), getHeight()), rectangleRoundingRadius, rectangleRoundingRadius, barPaint);
    }

    private float drawBar(long l, int i, Canvas canvas, int j)
    {
        return drawBarAtHeight(l, 0, i, canvas, j);
    }

    private float drawBarAtHeight(long l, int i, int j, Canvas canvas, int k)
    {
        barPaint.setColor(k);
        float f = computeBarHeight(l);
        canvas.drawRoundRect(newBarAtHeight(j, i, f), rectangleRoundingRadius, rectangleRoundingRadius, barPaint);
        float f1 = getHeight() - i;
        float f2 = f / 2.0F;
        float f3 = textSize / 2.0F;
        l = bToMb(l);
        canvas.drawText((new StringBuilder(21)).append(l).append("M").toString(), (float)(getWidth() * j) / 3F, (f1 - f) + f2 + f3, textPaint);
        return f;
    }

    private void drawBars(Canvas canvas)
    {
        AndroidMemorySnapshot androidmemorysnapshot = latestSnapshot;
        long l = heapInflater.getBytesPadded();
        int i = (int)(drawBarAtHeight(androidmemorysnapshot.dalvikHeapAllocatedB - l, 0, 0, canvas, 0xff00ff00) + 0.0F);
        if (l > 0L)
        {
            drawBarAtHeight(l, i, 0, canvas, 0xffd2401d);
        }
        drawBar(androidmemorysnapshot.nativeHeapAllocatedB, 1, canvas, -256);
        drawBar(androidmemorysnapshot.otherPrivateDirtyB, 2, canvas, 0xff3897fc);
        float f = (float)getHeight() - computeBarHeight(androidmemorysnapshot.dalvikHeapSizeB);
        linePaint.setColor(0xff000000);
        canvas.drawLine(0.0F, f, (float)getWidth() / 3F, f, linePaint);
        f = (float)getHeight() - computeBarHeight(androidmemorysnapshot.dalvikMaxHeapSizeB);
        linePaint.setColor(0xffd2401d);
        canvas.drawLine(0.0F, f, (float)getWidth() / 3F, f, linePaint);
    }

    private RectF newBarAtHeight(int i, float f, float f1)
    {
        float f2 = (float)(getWidth() * i) / 3F;
        f = (float)getHeight() - f - f1;
        return new RectF(f2, f, (float)getWidth() / 3F + f2, f + f1);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        desiredWidth = convertDpToPx(getContext(), 45);
        desiredHeight = convertDpToPx(getContext(), 140);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        turnMemoryMonitorOff();
    }

    public void onDraw(Canvas canvas)
    {
        drawBackground(canvas);
        drawBars(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        int k = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (l != 0x40000000)
        {
            if (l == 0x80000000)
            {
                i = Math.min(desiredWidth, i);
            } else
            {
                i = desiredWidth;
            }
        }
        if (k != 0x40000000)
        {
            if (k == 0x80000000)
            {
                j = Math.min(desiredHeight, j);
            } else
            {
                j = desiredHeight;
            }
        }
        setMeasuredDimension(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            gestureListener.onUp();
        }
        return gestureDetector.onTouchEvent(motionevent);
    }

    public void setMemoryMonitor(MemoryMonitor memorymonitor)
    {
        memoryMonitor = memorymonitor;
    }

    public final void turnMemoryMonitorOff()
    {
        setVisibility(8);
        if (memoryMonitorListener != null)
        {
            memoryMonitor.removeListener(memoryMonitorListener);
            memoryMonitorListener = null;
        }
    }

    public final void turnMemoryMonitorOn()
    {
        setVisibility(0);
        setAlpha(0.6F);
        latestSnapshot = new AndroidMemorySnapshot();
        if (memoryMonitorListener == null)
        {
            memoryMonitorListener = new MemoryMonitor.AndroidMemoryListener() {

                final MemoryMonitorView this$0;

                public final void onSnapshot(AndroidMemorySnapshot androidmemorysnapshot)
                {
                    latestSnapshot = androidmemorysnapshot;
                    postInvalidate();
                }

            
            {
                this$0 = MemoryMonitorView.this;
                super();
            }
            };
            memoryMonitor.addListener(memoryMonitorListener);
        }
    }

    static 
    {
        Runtime runtime = Runtime.getRuntime();
        RUNTIME = runtime;
        MAX_HEAP_SIZE_MB = bToMb(runtime.maxMemory());
    }



/*
    static AndroidMemorySnapshot access$102(MemoryMonitorView memorymonitorview, AndroidMemorySnapshot androidmemorysnapshot)
    {
        memorymonitorview.latestSnapshot = androidmemorysnapshot;
        return androidmemorysnapshot;
    }

*/







}
