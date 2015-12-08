// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.soundcloud.android.util.AnimUtils;
import com.soundcloud.android.utils.images.ImageUtils;

public class TourLayout extends FrameLayout
{

    public static final int IMAGE_ERROR = 2;
    public static final int IMAGE_LOADED = 1;
    private final ImageView bgImageView = (ImageView)findViewById(0x7f0f0268);
    private final int bgResId;
    private final int bitmapSize[] = {
        -1, -1
    };
    private Handler loadHandler;

    public TourLayout(Context context, int i, int j)
    {
        super(context);
        View.inflate(context, i, this);
        bgResId = j;
        bgImageView.setVisibility(8);
        getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
    }

    private Point getDisplaySize()
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        return new Point(display.getWidth(), display.getHeight());
    }

    public static transient void load(Context context, TourLayout atourlayout[])
    {
        if (atourlayout == null || atourlayout.length == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            loadAsync(context, atourlayout);
            return;
        }
    }

    private static transient AsyncTask loadAsync(final Context context, TourLayout atourlayout[])
    {
        return (new _cls2()).executeOnThreadPool(atourlayout);
    }

    private void onBitmapLoaded(Bitmap bitmap)
    {
        byte byte0 = 1;
        if (bitmap != null)
        {
            bitmapSize[0] = bitmap.getWidth();
            bitmapSize[1] = bitmap.getHeight();
            bgImageView.setImageBitmap(bitmap);
        }
        AnimUtils.showView(bgImageView, true);
        if (loadHandler != null)
        {
            Handler handler = loadHandler;
            if (bitmap == null)
            {
                byte0 = 2;
            }
            handler.sendEmptyMessage(byte0);
        }
    }

    public void recycle()
    {
        ImageUtils.recycleImageViewBitmap(bgImageView);
    }

    public void setLoadHandler(Handler handler)
    {
        loadHandler = handler;
    }






    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        private int lastHeight;
        private int lastWidth;
        final TourLayout this$0;

        public void onGlobalLayout()
        {
            if (bitmapSize[0] < 0 || bitmapSize[1] < 0 || lastWidth == getWidth() && lastHeight == getHeight())
            {
                return;
            } else
            {
                int i = bitmapSize[0];
                int j = bitmapSize[1];
                lastHeight = getHeight();
                lastWidth = getWidth();
                Point point = getDisplaySize();
                float f = Math.max((float)point.y / (float)j, (float)point.x / (float)i);
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                matrix.postTranslate(((float)point.x - (float)i * f) / 2.0F, ((float)point.y - (float)j * f) / 2.0F);
                bgImageView.setImageMatrix(matrix);
                return;
            }
        }

        _cls1()
        {
            this$0 = TourLayout.this;
            super();
            lastHeight = -1;
            lastWidth = -1;
        }
    }


    private class _cls2 extends ParallelAsyncTask
    {

        final Context val$context;

        protected final volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((TourLayout[])aobj);
        }

        protected final transient Void doInBackground(TourLayout atourlayout[])
        {
            int i;
            int j;
            j = atourlayout.length;
            i = 0;
_L2:
            Object obj;
            TourLayout tourlayout;
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            tourlayout = atourlayout[i];
            obj = tourlayout.getDisplaySize();
            obj = ImageUtils.decodeSampledBitmapFromResource(context.getResources(), tourlayout.bgResId, ((Point) (obj)).x, ((Point) (obj)).y);
_L3:
            publishProgress(new Pair[] {
                Pair.create(tourlayout, obj)
            });
            i++;
            if (true) goto _L2; else goto _L1
            obj;
_L4:
            Error error;
            String s = SoundCloudApplication.TAG;
            ErrorUtils.handleSilentException(error);
            error = null;
              goto _L3
_L1:
            return null;
            error;
              goto _L4
        }

        protected final transient void onProgressUpdate(Pair apair[])
        {
            ((TourLayout)apair[0].first).onBitmapLoaded((Bitmap)apair[0].second);
        }

        protected final volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Pair[])aobj);
        }

        _cls2()
        {
            context = context1;
            super();
        }
    }

}
