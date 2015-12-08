// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.UriUtil;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageRequest

public class ImageLoader
    implements com.netflix.mediaclient.util.gfx.ImageLoader
{
    private class BatchedImageRequest
    {

        private final LinkedList mContainers = new LinkedList();
        private VolleyError mError;
        private final Request mRequest;
        private Bitmap mResponseBitmap;
        final ImageLoader this$0;

        public void addContainer(ImageContainer imagecontainer)
        {
            mContainers.add(imagecontainer);
        }

        public VolleyError getError()
        {
            return mError;
        }

        public boolean removeContainerAndCancelIfNecessary(ImageContainer imagecontainer)
        {
            mContainers.remove(imagecontainer);
            if (mContainers.size() == 0)
            {
                mRequest.cancel();
                return true;
            } else
            {
                return false;
            }
        }

        public void setError(VolleyError volleyerror)
        {
            mError = volleyerror;
        }



/*
        static Bitmap access$602(BatchedImageRequest batchedimagerequest, Bitmap bitmap)
        {
            batchedimagerequest.mResponseBitmap = bitmap;
            return bitmap;
        }

*/


        public BatchedImageRequest(Request request, ImageContainer imagecontainer)
        {
            this$0 = ImageLoader.this;
            super();
            mRequest = request;
            mContainers.add(imagecontainer);
        }
    }

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
                if (batchedimagerequest1.mContainers.size() == 0)
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


/*
        static Bitmap access$1002(ImageContainer imagecontainer, Bitmap bitmap)
        {
            imagecontainer.mBitmap = bitmap;
            return bitmap;
        }

*/


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

    private class ValidatingListener
        implements ImageListener
    {

        protected final String imgUrl;
        final ImageLoader this$0;
        protected final AdvancedImageView view;

        private boolean responseIsOutdated()
        {
            boolean flag;
            if (!StringUtils.safeEquals(view.getUrlTag(), imgUrl))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag);
            return flag;
        }

        public void onErrorResponse(VolleyError volleyerror)
        {
            if (responseIsOutdated())
            {
                return;
            } else
            {
                Log.w("ImageLoader", (new StringBuilder()).append("Error loading bitmap for url: ").append(imgUrl).toString());
                setDrawableResource(view, 0x7f020062);
                return;
            }
        }

        public void onResponse(ImageContainer imagecontainer, boolean flag)
        {
            if (responseIsOutdated())
            {
                return;
            }
            imagecontainer = imagecontainer.getBitmap();
            if (imagecontainer != null && flag)
            {
                setDrawableBitmap(view, imagecontainer);
                return;
            } else
            {
                updateView(view, imagecontainer);
                return;
            }
        }

        protected void updateView(ImageView imageview, Bitmap bitmap)
        {
            if (bitmap == null)
            {
                setDrawableToNull(imageview);
                return;
            } else
            {
                setDrawableBitmap(imageview, bitmap);
                return;
            }
        }

        public ValidatingListener(AdvancedImageView advancedimageview, String s)
        {
            this$0 = ImageLoader.this;
            super();
            view = advancedimageview;
            imgUrl = s;
        }
    }

    private class ValidatingListenerWithAnimation extends ValidatingListener
    {

        final ImageLoader this$0;

        protected void updateView(ImageView imageview, Bitmap bitmap)
        {
            if (bitmap == null)
            {
                setDrawableToNull(imageview);
                return;
            } else
            {
                AnimationUtils.setImageBitmapWithPropertyFade(imageview, bitmap);
                return;
            }
        }

        public ValidatingListenerWithAnimation(AdvancedImageView advancedimageview, String s)
        {
            this$0 = ImageLoader.this;
            super(advancedimageview, s);
        }
    }

    private class ValidatingListenerWithPlaceholder extends ValidatingListener
    {

        final ImageLoader this$0;

        protected void updateView(ImageView imageview, Bitmap bitmap)
        {
            if (bitmap == null)
            {
                setDrawableResource(imageview, 0x7f020062);
                return;
            } else
            {
                AnimationUtils.setImageBitmapWithPropertyFade(imageview, bitmap);
                return;
            }
        }

        public ValidatingListenerWithPlaceholder(AdvancedImageView advancedimageview, String s)
        {
            this$0 = ImageLoader.this;
            super(advancedimageview, s);
        }
    }


    private static final boolean LOG_VERBOSE = false;
    private static final String TAG = "ImageLoader";
    private final ApplicationPerformanceMetricsLogging mApmLogger;
    private final int mBatchResponseDelayMs;
    private final HashMap mBatchedResponses;
    private final ImageCache mCache;
    private final Handler mHandler;
    private final HashMap mInFlightRequests;
    private long mMinimumCacheTtl;
    private final RequestQueue mRequestQueue;
    private int mRequestSocketTimeout;
    private final Object mRequestTag;
    private Runnable mRunnable;

    public ImageLoader(RequestQueue requestqueue, ImageCache imagecache, int i, long l, ApplicationPerformanceMetricsLogging applicationperformancemetricslogging, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        this(requestqueue, imagecache, i, applicationperformancemetricslogging, configurationagentinterface);
        mMinimumCacheTtl = l;
    }

    private ImageLoader(RequestQueue requestqueue, ImageCache imagecache, int i, ApplicationPerformanceMetricsLogging applicationperformancemetricslogging, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        this(requestqueue, imagecache, applicationperformancemetricslogging, configurationagentinterface);
        mRequestSocketTimeout = i;
    }

    private ImageLoader(RequestQueue requestqueue, ImageCache imagecache, ApplicationPerformanceMetricsLogging applicationperformancemetricslogging, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        mRequestTag = new Object();
        mRequestSocketTimeout = -1;
        mBatchResponseDelayMs = 100;
        mMinimumCacheTtl = -1L;
        mInFlightRequests = new HashMap();
        mBatchedResponses = new HashMap();
        mHandler = new Handler(Looper.getMainLooper());
        mRequestQueue = requestqueue;
        mCache = imagecache;
        mApmLogger = applicationperformancemetricslogging;
    }

    private void batchResponse(String s, BatchedImageRequest batchedimagerequest)
    {
        mBatchedResponses.put(s, batchedimagerequest);
        if (mRunnable == null)
        {
            mRunnable = new Runnable() {

                final ImageLoader this$0;

                public void run()
                {
                    for (Iterator iterator = mBatchedResponses.values().iterator(); iterator.hasNext();)
                    {
                        BatchedImageRequest batchedimagerequest1 = (BatchedImageRequest)iterator.next();
                        Iterator iterator1 = batchedimagerequest1.mContainers.iterator();
                        while (iterator1.hasNext()) 
                        {
                            ImageContainer imagecontainer = (ImageContainer)iterator1.next();
                            if (imagecontainer.mListener != null)
                            {
                                if (batchedimagerequest1.getError() == null)
                                {
                                    imagecontainer.mBitmap = batchedimagerequest1.mResponseBitmap;
                                    imagecontainer.mListener.onResponse(imagecontainer, false);
                                } else
                                {
                                    imagecontainer.mListener.onErrorResponse(batchedimagerequest1.getError());
                                }
                            }
                        }
                    }

                    mBatchedResponses.clear();
                    mRunnable = null;
                }

            
            {
                this$0 = ImageLoader.this;
                super();
            }
            };
            mHandler.postDelayed(mRunnable, 100L);
        }
    }

    private ImageContainer get(final String requestUrl, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, ImageListener imagelistener, int i, int j, com.android.volley.Request.Priority priority)
    {
        throwIfNotOnMainThread();
        if (!UriUtil.isValidUri(requestUrl))
        {
            assettype = (new StringBuilder()).append("Request URL is NOT valid, unable to load ").append(requestUrl).toString();
            Log.v("ImageLoader", assettype);
            requestUrl = new ImageContainer(null, requestUrl, "ERROR", imagelistener);
            if (imagelistener != null)
            {
                imagelistener.onErrorResponse(new VolleyError(assettype));
                return requestUrl;
            } else
            {
                Log.e("ImageLoader", "Unable to report an error, missing listener");
                return requestUrl;
            }
        }
        final String cacheKey = getCacheKey(requestUrl);
        Bitmap bitmap = mCache.getBitmap(cacheKey);
        if (bitmap != null)
        {
            priority = new ImageContainer(bitmap, requestUrl, null, null);
            imagelistener.onResponse(priority, true);
            LogUtils.reportAssetRequest(requestUrl, assettype, mApmLogger);
            LogUtils.reportAssetRequestResult(requestUrl, 0, mApmLogger);
            return priority;
        }
        assettype = new ImageContainer(null, requestUrl, cacheKey, imagelistener);
        imagelistener.onResponse(assettype, true);
        imagelistener = (BatchedImageRequest)mInFlightRequests.get(cacheKey);
        if (imagelistener != null)
        {
            imagelistener.addContainer(assettype);
            return assettype;
        } else
        {
            imagelistener = new ImageRequest(requestUrl, new com.android.volley.Response.Listener() {

                final ImageLoader this$0;
                final String val$cacheKey;
                final String val$requestUrl;

                public void onResponse(Bitmap bitmap1)
                {
                    LogUtils.reportAssetRequestResult(requestUrl, 0, mApmLogger);
                    onGetImageSuccess(cacheKey, bitmap1);
                }

                public volatile void onResponse(Object obj)
                {
                    onResponse((Bitmap)obj);
                }

            
            {
                this$0 = ImageLoader.this;
                requestUrl = s;
                cacheKey = s1;
                super();
            }
            }, i, j, android.graphics.Bitmap.Config.RGB_565, new com.android.volley.Response.ErrorListener() {

                final ImageLoader this$0;
                final String val$cacheKey;
                final String val$requestUrl;

                public void onErrorResponse(VolleyError volleyerror)
                {
                    LogUtils.reportAssetRequestFailure(requestUrl, volleyerror, mApmLogger);
                    onGetImageError(cacheKey, volleyerror);
                }

            
            {
                this$0 = ImageLoader.this;
                requestUrl = s;
                cacheKey = s1;
                super();
            }
            }, priority, mRequestSocketTimeout, mMinimumCacheTtl);
            imagelistener.setTag(mRequestTag);
            LogUtils.reportAssetRequest(requestUrl, null, mApmLogger);
            mRequestQueue.add(imagelistener);
            mInFlightRequests.put(cacheKey, new BatchedImageRequest(imagelistener, assettype));
            return assettype;
        }
    }

    static String getCacheKey(String s)
    {
        return StringUtils.getPathFromUri(s);
    }

    private void onGetImageError(String s, VolleyError volleyerror)
    {
        throwIfNotOnMainThread();
        BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.remove(s);
        batchedimagerequest.setError(volleyerror);
        if (batchedimagerequest != null)
        {
            batchResponse(s, batchedimagerequest);
        }
    }

    private void onGetImageSuccess(String s, Bitmap bitmap)
    {
        throwIfNotOnMainThread();
        mCache.putBitmap(s, bitmap);
        BatchedImageRequest batchedimagerequest = (BatchedImageRequest)mInFlightRequests.remove(s);
        if (batchedimagerequest != null)
        {
            batchedimagerequest.mResponseBitmap = bitmap;
            batchResponse(s, batchedimagerequest);
        }
    }

    private void setDrawableBitmap(ImageView imageview, Bitmap bitmap)
    {
        imageview.setImageBitmap(bitmap);
    }

    private void setDrawableResource(ImageView imageview, int i)
    {
        imageview.setImageResource(i);
    }

    private void setDrawableToNull(ImageView imageview)
    {
        imageview.setImageDrawable(null);
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

    private ImageListener wrapPrivateListener(final com.netflix.mediaclient.util.gfx.ImageLoaderListener listener)
    {
        return new ImageListener() {

            final ImageLoader this$0;
            final com.netflix.mediaclient.util.gfx.ImageLoaderListener val$listener;

            public void onErrorResponse(VolleyError volleyerror)
            {
                com.netflix.mediaclient.util.gfx.ImageLoaderListener imageloaderlistener = listener;
                if (volleyerror == null)
                {
                    volleyerror = null;
                } else
                {
                    volleyerror = volleyerror.getMessage();
                }
                imageloaderlistener.onErrorResponse(volleyerror);
            }

            public void onResponse(ImageContainer imagecontainer, boolean flag)
            {
                if (imagecontainer == null)
                {
                    listener.onResponse(null, null);
                    return;
                } else
                {
                    listener.onResponse(imagecontainer.getBitmap(), imagecontainer.getRequestUrl());
                    return;
                }
            }

            
            {
                this$0 = ImageLoader.this;
                listener = imageloaderlistener;
                super();
            }
        };
    }

    public void cancelAllRequests()
    {
        mRequestQueue.cancelAll(mRequestTag);
        mInFlightRequests.clear();
    }

    public void getImg(String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, int i, int j, com.netflix.mediaclient.util.gfx.ImageLoaderListener imageloaderlistener)
    {
        get(s, assettype, wrapPrivateListener(imageloaderlistener), i, j, com.android.volley.Request.Priority.LOW);
    }

    public boolean isCached(String s)
    {
        throwIfNotOnMainThread();
        s = getCacheKey(s);
        return mCache.getBitmap(s) != null;
    }

    public void refreshImgIfNecessary(AdvancedImageView advancedimageview, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype)
    {
        Log.v("ImageLoader", (new StringBuilder()).append("refreshImgIfNecessary: ").append(advancedimageview).toString());
        if (advancedimageview == null)
        {
            Log.v("ImageLoader", "refreshImgIfNecessary: null imageView");
            return;
        }
        String s = advancedimageview.getUrlTag();
        if (StringUtils.isEmpty(s))
        {
            Log.v("ImageLoader", "refreshImgIfNecessary: empty url");
            return;
        } else
        {
            showImgInternal(advancedimageview, s, assettype, false, false, 1);
            return;
        }
    }

    public void showImg(AdvancedImageView advancedimageview, String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, String s1, boolean flag, boolean flag1)
    {
        showImg(advancedimageview, s, assettype, s1, flag, flag1, 0);
    }

    public void showImg(AdvancedImageView advancedimageview, String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, String s1, boolean flag, boolean flag1, int i)
    {
        if (s1 != null)
        {
            advancedimageview.setContentDescription(s1);
        }
        s1 = advancedimageview.getUrlTag();
        advancedimageview.setUrlTag(s);
        if (s == null)
        {
            setDrawableToNull(advancedimageview);
        } else
        if (!s.equals(s1))
        {
            showImgInternal(advancedimageview, s, assettype, flag, flag1, i);
            return;
        }
    }

    public void showImgInternal(AdvancedImageView advancedimageview, String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, boolean flag, boolean flag1, int i)
    {
        com.android.volley.Request.Priority priority;
        if (flag)
        {
            advancedimageview = new ValidatingListenerWithPlaceholder(advancedimageview, s);
        } else
        if (flag1)
        {
            advancedimageview = new ValidatingListenerWithAnimation(advancedimageview, s);
        } else
        {
            advancedimageview = new ValidatingListener(advancedimageview, s);
        }
        if (i > 0)
        {
            priority = com.android.volley.Request.Priority.NORMAL;
        } else
        {
            priority = com.android.volley.Request.Priority.LOW;
        }
        get(s, assettype, advancedimageview, 0, 0, priority);
    }




/*
    static Runnable access$1102(ImageLoader imageloader, Runnable runnable)
    {
        imageloader.mRunnable = runnable;
        return runnable;
    }

*/






}
