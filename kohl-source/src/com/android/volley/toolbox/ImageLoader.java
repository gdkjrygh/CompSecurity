// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            ImageRequest

public class ImageLoader
{
    public static interface ImageCache
    {

        public abstract Bitmap getBitmap(String s);

        public abstract void putBitmap(String s, Bitmap bitmap);
    }

    public class ImageContainer
    {

        private Bitmap mBitmap;
        private final String mCacheKey;
        private final ImageListener mListener;
        private final String mRequestUrl;
        final ImageLoader this$0;

        public void cancelRequest()
        {
            if (mListener != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
        /* block-local class not found */
        class BatchedImageRequest {}

            BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.get(mCacheKey);
            if (batchedimagerequest == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (batchedimagerequest.removeContainerAndCancelIfNecessary(this))
            {
                mInFlightRequests.remove(mCacheKey);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            BatchedImageRequest batchedimagerequest1 = (BatchedImageRequest)mBatchedResponses.get(mCacheKey);
            if (batchedimagerequest1 != null)
            {
                batchedimagerequest1.removeContainerAndCancelIfNecessary(this);
                if (BatchedImageRequest.access._mth0(batchedimagerequest1).size() == 0)
                {
                    mBatchedResponses.remove(mCacheKey);
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public Bitmap getBitmap()
        {
            return mBitmap;
        }

        public String getRequestUrl()
        {
            return mRequestUrl;
        }



        public ImageContainer(Bitmap bitmap, String s, String s1, ImageListener imagelistener)
        {
            this$0 = ImageLoader.this;
            super();
            mBitmap = bitmap;
            mRequestUrl = s;
            mCacheKey = s1;
            mListener = imagelistener;
        }
    }

    public static interface ImageListener
        extends com.android.volley.Response.ErrorListener
    {

        public abstract void onResponse(ImageContainer imagecontainer, boolean flag);
    }


    private int mBatchResponseDelayMs;
    private final HashMap mBatchedResponses = new HashMap();
    private final ImageCache mCache;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final HashMap mInFlightRequests = new HashMap();
    private final RequestQueue mRequestQueue;
    private Runnable mRunnable;

    public ImageLoader(RequestQueue requestqueue, ImageCache imagecache)
    {
        mBatchResponseDelayMs = 100;
        mRequestQueue = requestqueue;
        mCache = imagecache;
    }

    private void batchResponse(String s, BatchedImageRequest batchedimagerequest)
    {
        mBatchedResponses.put(s, batchedimagerequest);
        if (mRunnable == null)
        {
            mRunnable = new _cls4();
            mHandler.postDelayed(mRunnable, mBatchResponseDelayMs);
        }
    }

    private static String getCacheKey(String s, int i, int j)
    {
        return (new StringBuilder(s.length() + 12)).append("#W").append(i).append("#H").append(j).append(s).toString();
    }

    public static ImageListener getImageListener(ImageView imageview, int i, int j)
    {
        return new _cls1(j, imageview, i);
    }

    private void onGetImageError(String s, VolleyError volleyerror)
    {
        BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.remove(s);
        batchedimagerequest.setError(volleyerror);
        if (batchedimagerequest != null)
        {
            batchResponse(s, batchedimagerequest);
        }
    }

    private void onGetImageSuccess(String s, Bitmap bitmap)
    {
        mCache.putBitmap(s, bitmap);
        BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.remove(s);
        if (batchedimagerequest != null)
        {
            BatchedImageRequest.access._mth1(batchedimagerequest, bitmap);
            batchResponse(s, batchedimagerequest);
        }
    }

    private void throwIfNotOnMainThread()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        } else
        {
            return;
        }
    }

    public ImageContainer get(String s, ImageListener imagelistener)
    {
        return get(s, imagelistener, 0, 0);
    }

    public ImageContainer get(String s, ImageListener imagelistener, int i, int j)
    {
        throwIfNotOnMainThread();
        String s1 = getCacheKey(s, i, j);
        Object obj = mCache.getBitmap(s1);
        if (obj != null)
        {
            s = new ImageContainer(((Bitmap) (obj)), s, null, null);
            imagelistener.onResponse(s, true);
            return s;
        }
        obj = new ImageContainer(null, s, s1, imagelistener);
        imagelistener.onResponse(((ImageContainer) (obj)), true);
        imagelistener = (BatchedImageRequest)mInFlightRequests.get(s1);
        if (imagelistener != null)
        {
            imagelistener.addContainer(((ImageContainer) (obj)));
            return ((ImageContainer) (obj));
        } else
        {
            s = new ImageRequest(s, new _cls2(s1), i, j, android.graphics.Bitmap.Config.RGB_565, new _cls3(s1));
            mRequestQueue.add(s);
            mInFlightRequests.put(s1, new BatchedImageRequest(s, ((ImageContainer) (obj))));
            return ((ImageContainer) (obj));
        }
    }

    public boolean isCached(String s, int i, int j)
    {
        throwIfNotOnMainThread();
        s = getCacheKey(s, i, j);
        return mCache.getBitmap(s) != null;
    }

    public void setBatchedResponseDelay(int i)
    {
        mBatchResponseDelayMs = i;
    }






    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
