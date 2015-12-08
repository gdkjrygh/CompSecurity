// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

// Referenced classes of package com.soundcloud.android.crop:
//            RotateBitmap

abstract class ImageViewTouchBase extends ImageView
{
    public static interface Recycler
    {

        public abstract void recycle(Bitmap bitmap);
    }


    private static final float SCALE_RATE = 1.25F;
    protected Matrix baseMatrix;
    protected final RotateBitmap bitmapDisplayed;
    private final Matrix displayMatrix;
    protected Handler handler;
    private final float matrixValues[];
    float maxZoom;
    private Runnable onLayoutRunnable;
    private Recycler recycler;
    protected Matrix suppMatrix;
    int thisHeight;
    int thisWidth;

    public ImageViewTouchBase(Context context)
    {
        super(context);
        baseMatrix = new Matrix();
        suppMatrix = new Matrix();
        displayMatrix = new Matrix();
        matrixValues = new float[9];
        bitmapDisplayed = new RotateBitmap(null, 0);
        thisWidth = -1;
        thisHeight = -1;
        handler = new Handler();
        init();
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        baseMatrix = new Matrix();
        suppMatrix = new Matrix();
        displayMatrix = new Matrix();
        matrixValues = new float[9];
        bitmapDisplayed = new RotateBitmap(null, 0);
        thisWidth = -1;
        thisHeight = -1;
        handler = new Handler();
        init();
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        baseMatrix = new Matrix();
        suppMatrix = new Matrix();
        displayMatrix = new Matrix();
        matrixValues = new float[9];
        bitmapDisplayed = new RotateBitmap(null, 0);
        thisWidth = -1;
        thisHeight = -1;
        handler = new Handler();
        init();
    }

    private float centerHorizontal(RectF rectf, float f, float f1)
    {
        int i = getWidth();
        if (f < (float)i)
        {
            f1 = ((float)i - f) / 2.0F - rectf.left;
        } else
        {
            if (rectf.left > 0.0F)
            {
                return -rectf.left;
            }
            if (rectf.right < (float)i)
            {
                return (float)i - rectf.right;
            }
        }
        return f1;
    }

    private float centerVertical(RectF rectf, float f, float f1)
    {
        int i = getHeight();
        if (f < (float)i)
        {
            f1 = ((float)i - f) / 2.0F - rectf.top;
        } else
        {
            if (rectf.top > 0.0F)
            {
                return -rectf.top;
            }
            if (rectf.bottom < (float)i)
            {
                return (float)getHeight() - rectf.bottom;
            }
        }
        return f1;
    }

    private void getProperBaseMatrix(RotateBitmap rotatebitmap, Matrix matrix, boolean flag)
    {
        float f = getWidth();
        float f1 = getHeight();
        float f2 = rotatebitmap.getWidth();
        float f3 = rotatebitmap.getHeight();
        matrix.reset();
        float f4 = Math.min(Math.min(f / f2, 3F), Math.min(f1 / f3, 3F));
        if (flag)
        {
            matrix.postConcat(rotatebitmap.getRotateMatrix());
        }
        matrix.postScale(f4, f4);
        matrix.postTranslate((f - f2 * f4) / 2.0F, (f1 - f3 * f4) / 2.0F);
    }

    private void init()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    private void setImageBitmap(Bitmap bitmap, int i)
    {
        super.setImageBitmap(bitmap);
        Object obj = getDrawable();
        if (obj != null)
        {
            ((Drawable) (obj)).setDither(true);
        }
        obj = bitmapDisplayed.getBitmap();
        bitmapDisplayed.setBitmap(bitmap);
        bitmapDisplayed.setRotation(i);
        if (obj != null && obj != bitmap && recycler != null)
        {
            recycler.recycle(((Bitmap) (obj)));
        }
    }

    protected float calculateMaxZoom()
    {
        if (bitmapDisplayed.getBitmap() == null)
        {
            return 1.0F;
        } else
        {
            return Math.max((float)bitmapDisplayed.getWidth() / (float)thisWidth, (float)bitmapDisplayed.getHeight() / (float)thisHeight) * 4F;
        }
    }

    protected void center()
    {
        Object obj = bitmapDisplayed.getBitmap();
        if (obj == null)
        {
            return;
        } else
        {
            Matrix matrix = getImageViewMatrix();
            obj = new RectF(0.0F, 0.0F, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
            matrix.mapRect(((RectF) (obj)));
            float f1 = ((RectF) (obj)).height();
            float f = ((RectF) (obj)).width();
            f1 = centerVertical(((RectF) (obj)), f1, 0.0F);
            postTranslate(centerHorizontal(((RectF) (obj)), f, 0.0F), f1);
            setImageMatrix(getImageViewMatrix());
            return;
        }
    }

    public void clear()
    {
        setImageBitmapResetBase(null, true);
    }

    protected Matrix getImageViewMatrix()
    {
        displayMatrix.set(baseMatrix);
        displayMatrix.postConcat(suppMatrix);
        return displayMatrix;
    }

    protected float getScale()
    {
        return getScale(suppMatrix);
    }

    protected float getScale(Matrix matrix)
    {
        return getValue(matrix, 0);
    }

    public Matrix getUnrotatedMatrix()
    {
        Matrix matrix = new Matrix();
        getProperBaseMatrix(bitmapDisplayed, matrix, false);
        matrix.postConcat(suppMatrix);
        return matrix;
    }

    protected float getValue(Matrix matrix, int i)
    {
        matrix.getValues(matrixValues);
        return matrixValues[i];
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getRepeatCount() == 0)
        {
            keyevent.startTracking();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.isTracking() && !keyevent.isCanceled() && getScale() > 1.0F)
        {
            zoomTo(1.0F);
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        thisWidth = k - i;
        thisHeight = l - j;
        Runnable runnable = onLayoutRunnable;
        if (runnable != null)
        {
            onLayoutRunnable = null;
            runnable.run();
        }
        if (bitmapDisplayed.getBitmap() != null)
        {
            getProperBaseMatrix(bitmapDisplayed, baseMatrix, true);
            setImageMatrix(getImageViewMatrix());
        }
    }

    protected void panBy(float f, float f1)
    {
        postTranslate(f, f1);
        setImageMatrix(getImageViewMatrix());
    }

    protected void postTranslate(float f, float f1)
    {
        suppMatrix.postTranslate(f, f1);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        setImageBitmap(bitmap, 0);
    }

    public void setImageBitmapResetBase(Bitmap bitmap, boolean flag)
    {
        setImageRotateBitmapResetBase(new RotateBitmap(bitmap, 0), flag);
    }

    public void setImageRotateBitmapResetBase(final RotateBitmap bitmap, final boolean resetSupp)
    {
        if (getWidth() <= 0)
        {
            onLayoutRunnable = new _cls1();
            return;
        }
        if (bitmap.getBitmap() != null)
        {
            getProperBaseMatrix(bitmap, baseMatrix, true);
            setImageBitmap(bitmap.getBitmap(), bitmap.getRotation());
        } else
        {
            baseMatrix.reset();
            setImageBitmap(null);
        }
        if (resetSupp)
        {
            suppMatrix.reset();
        }
        setImageMatrix(getImageViewMatrix());
        maxZoom = calculateMaxZoom();
    }

    public void setRecycler(Recycler recycler1)
    {
        recycler = recycler1;
    }

    protected void zoomIn()
    {
        zoomIn(1.25F);
    }

    protected void zoomIn(float f)
    {
        while (getScale() >= maxZoom || bitmapDisplayed.getBitmap() == null) 
        {
            return;
        }
        float f1 = (float)getWidth() / 2.0F;
        float f2 = (float)getHeight() / 2.0F;
        suppMatrix.postScale(f, f, f1, f2);
        setImageMatrix(getImageViewMatrix());
    }

    protected void zoomOut()
    {
        zoomOut(1.25F);
    }

    protected void zoomOut(float f)
    {
        if (bitmapDisplayed.getBitmap() == null)
        {
            return;
        }
        float f1 = (float)getWidth() / 2.0F;
        float f2 = (float)getHeight() / 2.0F;
        Matrix matrix = new Matrix(suppMatrix);
        matrix.postScale(1.0F / f, 1.0F / f, f1, f2);
        if (getScale(matrix) < 1.0F)
        {
            suppMatrix.setScale(1.0F, 1.0F, f1, f2);
        } else
        {
            suppMatrix.postScale(1.0F / f, 1.0F / f, f1, f2);
        }
        setImageMatrix(getImageViewMatrix());
        center();
    }

    protected void zoomTo(float f)
    {
        zoomTo(f, (float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
    }

    protected void zoomTo(float f, float f1, float f2)
    {
        float f3 = f;
        if (f > maxZoom)
        {
            f3 = maxZoom;
        }
        f = f3 / getScale();
        suppMatrix.postScale(f, f, f1, f2);
        setImageMatrix(getImageViewMatrix());
        center();
    }

    protected void zoomTo(final float incrementPerMs, final float centerX, final float centerY, final float durationMs)
    {
        incrementPerMs = (incrementPerMs - getScale()) / durationMs;
        final float oldScale = getScale();
        final long startTime = System.currentTimeMillis();
        handler.post(new _cls2());
    }

    private class _cls1
        implements Runnable
    {

        final ImageViewTouchBase this$0;
        final RotateBitmap val$bitmap;
        final boolean val$resetSupp;

        public void run()
        {
            setImageRotateBitmapResetBase(bitmap, resetSupp);
        }

        _cls1()
        {
            this$0 = ImageViewTouchBase.this;
            bitmap = rotatebitmap;
            resetSupp = flag;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ImageViewTouchBase this$0;
        final float val$centerX;
        final float val$centerY;
        final float val$durationMs;
        final float val$incrementPerMs;
        final float val$oldScale;
        final long val$startTime;

        public void run()
        {
            long l = System.currentTimeMillis();
            float f = Math.min(durationMs, l - startTime);
            float f1 = oldScale;
            float f2 = incrementPerMs;
            zoomTo(f1 + f2 * f, centerX, centerY);
            if (f < durationMs)
            {
                handler.post(this);
            }
        }

        _cls2()
        {
            this$0 = ImageViewTouchBase.this;
            durationMs = f;
            startTime = l;
            oldScale = f1;
            incrementPerMs = f2;
            centerX = f3;
            centerY = f4;
            super();
        }
    }

}
