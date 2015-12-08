// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.tinder.utils.v;

public class BlurredDrawable extends Drawable
{
    class BitmapWorkerTask extends AsyncTask
    {

        private final Bitmap mManipulatedBitmap;
        final BlurredDrawable this$0;

        protected transient Bitmap doInBackground(Void avoid[])
        {
            if (mManipulatedBitmap.isRecycled())
            {
                v.b("Bitmap was recycled before blurring");
                return null;
            } else
            {
                BlurredDrawable.applyBlur(mManipulatedBitmap, mBlurRadius);
                return mManipulatedBitmap;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            if (bitmap == null)
            {
                v.b("Final bitmap was null after processing..must have been recycled.");
                return;
            } else
            {
                mBmpToDraw = bitmap;
                invalidateSelf();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        protected BitmapWorkerTask(Bitmap bitmap)
        {
            this$0 = BlurredDrawable.this;
            super();
            mManipulatedBitmap = bitmap;
        }
    }


    private static final int ALPHA_MAX = 255;
    private static final int HORIZ_EDGE_OFFSET = 12;
    public static final int MEDIUM_BLUR = 9;
    public static final int SLIGHT_BLUR = 5;
    public static final int SUCH_BLUR = 24;
    private static final int VERT_EDGE_OFFSET = 24;
    private int mAlpha;
    private BitmapWorkerTask mBitmapWorkerTask;
    private int mBlurRadius;
    private Bitmap mBmpToDraw;
    private final Rect mCanvasRect = new Rect();
    private final Rect mImageRect = new Rect();
    private final Paint mPaint = new Paint();

    public BlurredDrawable(Context context)
    {
        mAlpha = 255;
    }

    public static void applyBlur(Bitmap bitmap, int i)
    {
        int l = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        int ai[] = new int[l * i1];
        bitmap.getPixels(ai, 0, l, 0, 0, l, i1);
        for (; i > 0; i /= 2)
        {
            for (int j = i; j < i1 - i; j++)
            {
                for (int k = i; k < l - i; k++)
                {
                    int j1 = ai[((j - i) * l + k) - i];
                    int k1 = ai[(j - i) * l + k + i];
                    int l1 = ai[(j - i) * l + k];
                    int i2 = ai[((j + i) * l + k) - i];
                    int j2 = ai[(j + i) * l + k + i];
                    int k2 = ai[(j + i) * l + k];
                    int l2 = ai[(j * l + k) - i];
                    int i3 = ai[j * l + k + i];
                    ai[j * l + k] = (j1 & 0xff0000) + (k1 & 0xff0000) + (0xff0000 & l1) + (0xff0000 & i2) + (0xff0000 & j2) + (0xff0000 & k2) + (0xff0000 & l2) + (0xff0000 & i3) >> 3 & 0xff0000 | (0xff000000 | (j1 & 0xff) + (k1 & 0xff) + (l1 & 0xff) + (i2 & 0xff) + (j2 & 0xff) + (k2 & 0xff) + (l2 & 0xff) + (i3 & 0xff) >> 3 & 0xff | (0xff00 & j1) + (0xff00 & k1) + (0xff00 & l1) + (0xff00 & i2) + (0xff00 & j2) + (0xff00 & k2) + (0xff00 & l2) + (0xff00 & i3) >> 3 & 0xff00);
                }

            }

        }

        bitmap.setPixels(ai, 0, l, 0, 0, l, i1);
    }

    private void make(Bitmap bitmap)
    {
        if (mBitmapWorkerTask != null)
        {
            mBitmapWorkerTask.cancel(true);
        }
        mBitmapWorkerTask = new BitmapWorkerTask(bitmap);
        mBitmapWorkerTask.execute(new Void[0]);
    }

    public void blurBitmap(Bitmap bitmap, int i)
    {
        mBlurRadius = i;
        make(bitmap);
    }

    public void draw(Canvas canvas)
    {
        if (mBmpToDraw == null || mBmpToDraw.isRecycled())
        {
            return;
        } else
        {
            mPaint.setFilterBitmap(true);
            canvas.saveLayerAlpha(null, mAlpha, 31);
            mCanvasRect.set(0, 0, canvas.getWidth(), canvas.getHeight());
            mImageRect.set(12, 24, mBmpToDraw.getWidth() - 12, mBmpToDraw.getHeight() - 24);
            canvas.drawBitmap(mBmpToDraw, mImageRect, mCanvasRect, mPaint);
            return;
        }
    }

    public int getOpacity()
    {
        return mAlpha;
    }

    public void setAlpha(int i)
    {
        mAlpha = Math.min(255, i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }



/*
    static Bitmap access$102(BlurredDrawable blurreddrawable, Bitmap bitmap)
    {
        blurreddrawable.mBmpToDraw = bitmap;
        return bitmap;
    }

*/
}
