// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import android.util.Log;
import com.google.android.gms.common.images.internal.PostProcessedResourceCache;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageRequest

public final class ImageManager
{
    private class BitmapMemoryCache extends LruCache
    {

        protected final volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            super.entryRemoved(flag, (ImageRequest.ImageData)obj, (Bitmap)obj1, (Bitmap)obj2);
        }

        protected final volatile int sizeOf$2838e5a0(Object obj)
        {
            obj = (Bitmap)obj;
            return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
        }

        public BitmapMemoryCache(Context context)
        {
            ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
            int i;
            if ((context.getApplicationInfo().flags & 0x100000) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && PlatformVersion.checkVersion(11))
            {
                i = activitymanager.getLargeMemoryClass();
            } else
            {
                i = activitymanager.getMemoryClass();
            }
            super((int)((float)(i * 0x100000) * 0.33F));
        }
    }

    private final class ImageReceiver extends ResultReceiver
    {

        final ArrayList mImageRequestList = new ArrayList();
        final Uri mUri;
        final ImageManager this$0;

        public final void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            mLoadBitmapFromDiskThreadPool.execute(new LoadBitmapFromDiskRunnable(mUri, bundle));
        }


        ImageReceiver(Uri uri)
        {
            this$0 = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            mUri = uri;
        }
    }

    private final class LoadBitmapFromDiskRunnable
        implements Runnable
    {

        private final ParcelFileDescriptor mParcelFileDescriptor;
        private final Uri mUri;
        final ImageManager this$0;

        public final void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (mParcelFileDescriptor == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(mParcelFileDescriptor.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                mParcelFileDescriptor.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            mHandler.post(new OnBitmapLoadedRunnable(mUri, ((Bitmap) (obj)), flag, countdownlatch));
            try
            {
                countdownlatch.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w("ImageManager", (new StringBuilder("Latch interrupted while posting ")).append(mUri).toString());
            }
            break MISSING_BLOCK_LABEL_158;
            outofmemoryerror;
            Log.e("ImageManager", (new StringBuilder("OOM while loading bitmap for uri: ")).append(mUri).toString(), outofmemoryerror);
            flag = true;
            outofmemoryerror = countdownlatch;
              goto _L3
        }

        public LoadBitmapFromDiskRunnable(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
        {
            this$0 = ImageManager.this;
            super();
            mUri = uri;
            mParcelFileDescriptor = parcelfiledescriptor;
        }
    }

    private final class LoadImageRunnable
        implements Runnable
    {

        private final ImageRequest mImageRequest;
        final ImageManager this$0;

        public final void run()
        {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)mImageRequestImageReceiverMap.get(mImageRequest);
            if (obj != null)
            {
                mImageRequestImageReceiverMap.remove(mImageRequest);
                ImageRequest imagerequest = mImageRequest;
                Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
                ((ImageReceiver) (obj)).mImageRequestList.remove(imagerequest);
            }
            Object obj3 = mImageRequest.mImageData;
            if (((ImageRequest.ImageData) (obj3)).uri == null)
            {
                mImageRequest.loadNoDataPlaceholder(mContext, mPostProcessedResourceCache, true);
                return;
            }
            obj = ImageManager.access$300(ImageManager.this, ((ImageRequest.ImageData) (obj3)));
            if (obj != null)
            {
                mImageRequest.onImageLoaded(mContext, ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)mBlacklistUriMap.get(((ImageRequest.ImageData) (obj3)).uri);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    mImageRequest.loadNoDataPlaceholder(mContext, mPostProcessedResourceCache, true);
                    return;
                }
                mBlacklistUriMap.remove(((ImageRequest.ImageData) (obj3)).uri);
            }
            obj = mImageRequest;
            mContext;
            mPostProcessedResourceCache;
            if (((ImageRequest) (obj)).mUseLoadingPlaceholder)
            {
                ((ImageRequest) (obj)).loadImage(null, false, true, false);
            }
            Object obj1 = (ImageReceiver)mUriImageReceiverMap.get(((ImageRequest.ImageData) (obj3)).uri);
            obj = obj1;
            if (obj1 == null)
            {
                obj = new ImageReceiver(((ImageRequest.ImageData) (obj3)).uri);
                mUriImageReceiverMap.put(((ImageRequest.ImageData) (obj3)).uri, obj);
            }
            obj1 = mImageRequest;
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            ((ImageReceiver) (obj)).mImageRequestList.add(obj1);
            if (!(mImageRequest instanceof ImageRequest.ListenerImageRequest))
            {
                mImageRequestImageReceiverMap.put(mImageRequest, obj);
            }
            synchronized (ImageManager.IN_FLIGHT_LOCK)
            {
                if (!ImageManager.sInFlightImages.contains(((ImageRequest.ImageData) (obj3)).uri))
                {
                    ImageManager.sInFlightImages.add(((ImageRequest.ImageData) (obj3)).uri);
                    obj3 = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
                    ((Intent) (obj3)).putExtra("com.google.android.gms.extras.uri", ((ImageReceiver) (obj)).mUri);
                    ((Intent) (obj3)).putExtra("com.google.android.gms.extras.resultReceiver", ((android.os.Parcelable) (obj)));
                    ((Intent) (obj3)).putExtra("com.google.android.gms.extras.priority", 3);
                    ((ImageReceiver) (obj))._fld0.mContext.sendBroadcast(((Intent) (obj3)));
                }
            }
            return;
            exception;
            obj2;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public LoadImageRunnable(ImageRequest imagerequest)
        {
            this$0 = ImageManager.this;
            super();
            mImageRequest = imagerequest;
        }
    }

    private static final class LowMemoryListener
        implements ComponentCallbacks2
    {

        private final BitmapMemoryCache mBitmapMemoryCache;

        public final void onConfigurationChanged(Configuration configuration)
        {
        }

        public final void onLowMemory()
        {
            mBitmapMemoryCache.trimToSize(-1);
        }

        public final void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                mBitmapMemoryCache.trimToSize(-1);
            } else
            if (i >= 20)
            {
                mBitmapMemoryCache.trimToSize(mBitmapMemoryCache.size() / 2);
                return;
            }
        }

        public LowMemoryListener(BitmapMemoryCache bitmapmemorycache)
        {
            mBitmapMemoryCache = bitmapmemorycache;
        }
    }

    private final class OnBitmapLoadedRunnable
        implements Runnable
    {

        private final Bitmap mBitmap;
        private final CountDownLatch mLatch;
        private boolean mOomTriggered;
        private final Uri mUri;
        final ImageManager this$0;

        public final void run()
        {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (mBitmapMemoryCache != null)
            {
                if (mOomTriggered)
                {
                    mBitmapMemoryCache.trimToSize(-1);
                    System.gc();
                    mOomTriggered = false;
                    mHandler.post(this);
                    return;
                }
                if (flag)
                {
                    mBitmapMemoryCache.put(new ImageRequest.ImageData(mUri), mBitmap);
                }
            }
            Object obj = (ImageReceiver)mUriImageReceiverMap.remove(mUri);
            if (obj != null)
            {
                obj = ((ImageReceiver) (obj)).mImageRequestList;
                int j = ((ArrayList) (obj)).size();
                int i = 0;
                while (i < j) 
                {
                    ImageRequest imagerequest = (ImageRequest)((ArrayList) (obj)).get(i);
                    if (flag)
                    {
                        imagerequest.onImageLoaded(mContext, mBitmap, false);
                    } else
                    {
                        mBlacklistUriMap.put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                        imagerequest.loadNoDataPlaceholder(mContext, mPostProcessedResourceCache, false);
                    }
                    if (!(imagerequest instanceof ImageRequest.ListenerImageRequest))
                    {
                        mImageRequestImageReceiverMap.remove(imagerequest);
                    }
                    i++;
                }
            }
            mLatch.countDown();
            synchronized (ImageManager.IN_FLIGHT_LOCK)
            {
                ImageManager.sInFlightImages.remove(mUri);
            }
            return;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public OnBitmapLoadedRunnable(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            this$0 = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            mOomTriggered = flag;
            mLatch = countdownlatch;
        }
    }

    public static interface OnImageLoadedListener
    {

        public abstract void onImageLoaded$482c40fe(Drawable drawable);
    }


    private static final Object IN_FLIGHT_LOCK = new Object();
    private static HashSet sInFlightImages = new HashSet();
    private static ImageManager sInstance;
    private static ImageManager sMemoryCacheInstance;
    private final BitmapMemoryCache mBitmapMemoryCache;
    private final Map mBlacklistUriMap = new HashMap();
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Map mImageRequestImageReceiverMap = new HashMap();
    private final ExecutorService mLoadBitmapFromDiskThreadPool = Executors.newFixedThreadPool(4);
    private final PostProcessedResourceCache mPostProcessedResourceCache = new PostProcessedResourceCache();
    private final Map mUriImageReceiverMap = new HashMap();

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            mBitmapMemoryCache = new BitmapMemoryCache(mContext);
            if (PlatformVersion.checkVersion(14))
            {
                mContext.registerComponentCallbacks(new LowMemoryListener(mBitmapMemoryCache));
            }
        } else
        {
            mBitmapMemoryCache = null;
        }
    }

    public static ImageManager create(Context context)
    {
        return create(context, false);
    }

    public static ImageManager create(Context context, boolean flag)
    {
        if (flag)
        {
            if (sMemoryCacheInstance == null)
            {
                sMemoryCacheInstance = new ImageManager(context, true);
            }
            return sMemoryCacheInstance;
        }
        if (sInstance == null)
        {
            sInstance = new ImageManager(context, false);
        }
        return sInstance;
    }

    public final void loadImage(ImageRequest imagerequest)
    {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        (new LoadImageRunnable(imagerequest)).run();
    }







/*
    static Bitmap access$300(ImageManager imagemanager, ImageRequest.ImageData imagedata)
    {
        if (imagemanager.mBitmapMemoryCache == null)
        {
            return null;
        } else
        {
            return (Bitmap)imagemanager.mBitmapMemoryCache.get(imagedata);
        }
    }

*/






}
