// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class BitmapLoader
{
    private class RequestListenerWrapper
    {

        List handlers;
        Request request;
        Bitmap responseBitmap;
        final BitmapLoader this$0;

        public final boolean removeHandlerAndCancelIfNecessary(BitmapContainer bitmapcontainer)
        {
            handlers.remove(bitmapcontainer);
            if (handlers.size() == 0)
            {
                request.cancel();
                return true;
            } else
            {
                return false;
            }
        }

        public RequestListenerWrapper(Request request1, BitmapContainer bitmapcontainer)
        {
            this$0 = BitmapLoader.this;
            super();
            handlers = new ArrayList();
            request = request1;
            handlers.add(bitmapcontainer);
        }
    }

    public final class BitmapContainer
    {

        Bitmap mBitmap;
        BitmapLoadedHandler mBitmapLoaded;
        private final String mModifiedUrl;
        final int mRequestHeight;
        final String mRequestUrl;
        final int mRequestWidth;
        final BitmapLoader this$0;

        public final void cancelRequest()
        {
            if (mBitmapLoaded != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            RequestListenerWrapper requestlistenerwrapper = (RequestListenerWrapper)mInFlightRequests.get(mModifiedUrl);
            if (requestlistenerwrapper == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (requestlistenerwrapper.removeHandlerAndCancelIfNecessary(this))
            {
                mInFlightRequests.remove(mModifiedUrl);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            RequestListenerWrapper requestlistenerwrapper1 = (RequestListenerWrapper)mBatchedResponses.get(mModifiedUrl);
            if (requestlistenerwrapper1 != null)
            {
                requestlistenerwrapper1.removeHandlerAndCancelIfNecessary(this);
                if (requestlistenerwrapper1.handlers.size() == 0)
                {
                    mBatchedResponses.remove(mModifiedUrl);
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public BitmapContainer(Bitmap bitmap, String s, String s1, int i, int j, BitmapLoadedHandler bitmaploadedhandler)
        {
            this$0 = BitmapLoader.this;
            super();
            mBitmap = bitmap;
            mRequestUrl = s;
            mModifiedUrl = s1;
            mRequestWidth = i;
            mRequestHeight = j;
            mBitmapLoaded = bitmaploadedhandler;
        }
    }

    public static interface BitmapLoadedHandler
        extends com.android.volley.Response.Listener
    {

        public abstract void onResponse(BitmapContainer bitmapcontainer);
    }

    public static final class DebugImageRequest extends ImageRequest
    {

        private static final Matrix IDENTITY = new Matrix();
        private boolean mResponseDelivered;

        protected final void deliverResponse(Bitmap bitmap)
        {
            if (mResponseDelivered)
            {
                return;
            } else
            {
                mResponseDelivered = true;
                super.deliverResponse(bitmap);
                return;
            }
        }

        protected final volatile void deliverResponse(Object obj)
        {
            deliverResponse((Bitmap)obj);
        }

        protected final Response parseNetworkResponse(NetworkResponse networkresponse)
        {
            Response response = super.parseNetworkResponse(networkresponse);
            if (!response.isSuccess() || !((Boolean)PlayG.debugImageSizes.get()).booleanValue())
            {
                return response;
            }
            Bitmap bitmap = (Bitmap)response.result;
            int j = networkresponse.data.length / 1024;
            networkresponse = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            Canvas canvas = new Canvas(networkresponse);
            canvas.drawBitmap(bitmap, IDENTITY, null);
            Paint paint = new Paint(8);
            float f;
            String s;
            String s1;
            String s2;
            int i;
            if (getUrl().contains("ggpht.com"))
            {
                i = 0xff00ffff;
            } else
            {
                i = -65281;
            }
            paint.setColor(i);
            paint.setStrokeWidth(3F);
            paint.setTextAlign(android.graphics.Paint.Align.LEFT);
            s = String.format("%dk", new Object[] {
                Integer.valueOf(j)
            });
            s1 = String.format("%dh", new Object[] {
                Integer.valueOf(bitmap.getHeight())
            });
            s2 = String.format("%dw", new Object[] {
                Integer.valueOf(bitmap.getWidth())
            });
            f = 40F;
            do
            {
                paint.setTextSize(f);
                if ((double)f * 3.1000000000000001D > (double)canvas.getHeight() || (double)Math.max(Math.max(paint.measureText(s1), paint.measureText(s2)), paint.measureText(s)) * 1.1000000000000001D >= (double)canvas.getWidth())
                {
                    f = (float)(0.80000000000000004D * (double)f);
                } else
                {
                    float f1 = (float)(canvas.getHeight() / 2) - f;
                    canvas.drawText(s, 4F, f1, paint);
                    f1 = 5F + f + f1;
                    canvas.drawText(s1, 4F, f1, paint);
                    canvas.drawText(s2, 4F, f + 5F + f1, paint);
                    bitmap.recycle();
                    return Response.success(networkresponse, response.cacheEntry);
                }
            } while (true);
        }


        public DebugImageRequest(String s, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
        {
            super(s, listener, i, j, android.widget.ImageView.ScaleType.CENTER_INSIDE, config, errorlistener);
        }
    }

    private static interface RemoteRequestCreator
    {

        public abstract Request create();
    }


    private static int MIN_CACHE_SIZE_BYTES = 0x300000;
    private static int MIN_NUM_IMAGES_IN_CACHE = 6;
    private final HashMap mBatchedResponses;
    private final Handler mHandler;
    final HashMap mInFlightRequests;
    private final int mMaxImageSizeToCacheInBytes;
    final RequestQueue mRequestQueue;
    private Runnable mRunnable;

    private void batchResponse(String s, RequestListenerWrapper requestlistenerwrapper)
    {
        mBatchedResponses.put(s, requestlistenerwrapper);
        if (mRunnable == null)
        {
            mRunnable = new Runnable() {

                final BitmapLoader this$0;

                public final void run()
                {
                    for (Iterator iterator = mBatchedResponses.values().iterator(); iterator.hasNext();)
                    {
                        RequestListenerWrapper requestlistenerwrapper1 = (RequestListenerWrapper)iterator.next();
                        List list = requestlistenerwrapper1.handlers;
                        int j = list.size();
                        int i = 0;
                        while (i < j) 
                        {
                            BitmapContainer bitmapcontainer = (BitmapContainer)list.get(i);
                            bitmapcontainer.mBitmap = requestlistenerwrapper1.responseBitmap;
                            bitmapcontainer.mBitmapLoaded.onResponse(bitmapcontainer);
                            i++;
                        }
                    }

                    mBatchedResponses.clear();
                    mRunnable;
                }

            
            {
                this$0 = BitmapLoader.this;
                super();
            }
            };
            mHandler.postDelayed(mRunnable, 100L);
        }
    }

    protected static DebugImageRequest createImageRequest(String s, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
    {
        return new DebugImageRequest(s, i, j, config, listener, errorlistener);
    }



/*
    static Runnable access$1002$2c88b07b(BitmapLoader bitmaploader)
    {
        bitmaploader.mRunnable = null;
        return null;
    }

*/


/*
    static void access$200(BitmapLoader bitmaploader, String s, String s1, int i, int j, Bitmap bitmap, boolean flag)
    {
_L2:
        s1 = (RequestListenerWrapper)bitmaploader.mInFlightRequests.remove(s);
        if (s1 != null)
        {
            s1.responseBitmap = bitmap;
            bitmaploader.batchResponse(s, s1);
            PlayCommonLog.logTiming("Loaded bitmap %s", new Object[] {
                ((RequestListenerWrapper) (s1)).request.getUrl()
            });
        }
        return;
        if (!flag && bitmap.getHeight() * bitmap.getRowBytes() <= bitmaploader.mMaxImageSizeToCacheInBytes)
        {
            throw new NullPointerException();
        }
        PlayCommonLog.d("%s is not cached", new Object[] {
            s
        });
        if (true) goto _L2; else goto _L1
_L1:
        return;
    }

*/


/*
    static void access$300(BitmapLoader bitmaploader, String s)
    {
        RequestListenerWrapper requestlistenerwrapper = (RequestListenerWrapper)bitmaploader.mInFlightRequests.remove(s);
        if (requestlistenerwrapper != null)
        {
            bitmaploader.batchResponse(s, requestlistenerwrapper);
            if (requestlistenerwrapper.request != null)
            {
                bitmaploader = requestlistenerwrapper.request.getUrl();
            } else
            {
                bitmaploader = "<null request>";
            }
            PlayCommonLog.logTiming("Bitmap error %s", new Object[] {
                bitmaploader
            });
        }
        return;
    }

*/



    // Unreferenced inner class com/google/android/play/image/BitmapLoader$1

/* anonymous class */
    final class _cls1
        implements RemoteRequestCreator
    {

        final BitmapLoader this$0;
        final String val$cacheKey;
        final String val$finalModifiedUrl;
        final int val$requestHeight;
        final int val$requestWidth;
        final boolean val$skipImageCache = false;

        public final Request create()
        {
            return BitmapLoader.createImageRequest(finalModifiedUrl, requestWidth, requestHeight, android.graphics.Bitmap.Config.RGB_565, new com.android.volley.Response.Listener() {

                final _cls1 this$1;

                public final volatile void onResponse(Object obj)
                {
                    obj = (Bitmap)obj;
    final class _cls1
        implements RemoteRequestCreator
    {
                    BitmapLoader.access$200(_fld0, finalModifiedUrl, cacheKey, requestWidth, requestHeight, ((Bitmap) (obj)), skipImageCache);
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            }, new com.android.volley.Response.ErrorListener() );
        }

            
            {
                this$0 = BitmapLoader.this;
                requestWidth = i;
                requestHeight = j;
                finalModifiedUrl = s;
                cacheKey = s1;
                super();
            }
    }

}
