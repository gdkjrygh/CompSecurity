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
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.kc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public final class ImageManager
{
    private final class ImageReceiver extends ResultReceiver
    {

        private final ArrayList KC = new ArrayList();
        final ImageManager KD;
        private final Uri mUri;

        static ArrayList a(ImageReceiver imagereceiver)
        {
            return imagereceiver.KC;
        }

        public void b(com.google.android.gms.common.images.a a1)
        {
            com.google.android.gms.common.internal.a.aT("ImageReceiver.addImageRequest() must be called in the main thread");
            KC.add(a1);
        }

        public void c(com.google.android.gms.common.images.a a1)
        {
            com.google.android.gms.common.internal.a.aT("ImageReceiver.removeImageRequest() must be called in the main thread");
            KC.remove(a1);
        }

        public void gJ()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.b(KD).sendBroadcast(intent);
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.f(KD).execute(KD. new c(mUri, bundle));
        }

        ImageReceiver(Uri uri)
        {
            KD = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            mUri = uri;
        }
    }

    public static interface OnImageLoadedListener
    {

        public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
    }

    private static final class a
    {

        static int a(ActivityManager activitymanager)
        {
            return activitymanager.getLargeMemoryClass();
        }
    }

    private static final class b extends ja
    {

        private static int I(Context context)
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
            if (i != 0 && kc.hB())
            {
                i = com.google.android.gms.common.images.a.a(activitymanager);
            } else
            {
                i = activitymanager.getMemoryClass();
            }
            return (int)((float)(i * 0x100000) * 0.33F);
        }

        protected int a(a.a a1, Bitmap bitmap)
        {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected void a(boolean flag, a.a a1, Bitmap bitmap, Bitmap bitmap1)
        {
            super.entryRemoved(flag, a1, bitmap, bitmap1);
        }

        protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            a(flag, (a.a)obj, (Bitmap)obj1, (Bitmap)obj2);
        }

        protected int sizeOf(Object obj, Object obj1)
        {
            return a((a.a)obj, (Bitmap)obj1);
        }

        public b(Context context)
        {
            super(I(context));
        }
    }

    private final class c
        implements Runnable
    {

        final ImageManager KD;
        private final ParcelFileDescriptor KE;
        private final Uri mUri;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            com.google.android.gms.common.internal.a.aU("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (KE == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(KE.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                KE.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.g(KD).post(KD. new f(mUri, ((Bitmap) (obj)), flag, countdownlatch));
            try
            {
                countdownlatch.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w("ImageManager", (new StringBuilder()).append("Latch interrupted while posting ").append(mUri).toString());
            }
            break MISSING_BLOCK_LABEL_164;
            outofmemoryerror;
            Log.e("ImageManager", (new StringBuilder()).append("OOM while loading bitmap for uri: ").append(mUri).toString(), outofmemoryerror);
            flag = true;
            outofmemoryerror = countdownlatch;
              goto _L3
        }

        public c(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
        {
            KD = ImageManager.this;
            super();
            mUri = uri;
            KE = parcelfiledescriptor;
        }
    }

    private final class d
        implements Runnable
    {

        final ImageManager KD;
        private final com.google.android.gms.common.images.a KF;

        public void run()
        {
            com.google.android.gms.common.internal.a.aT("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)com.google.android.gms.common.images.ImageManager.a(KD).get(KF);
            if (obj != null)
            {
                com.google.android.gms.common.images.ImageManager.a(KD).remove(KF);
                ((ImageReceiver) (obj)).c(KF);
            }
            a.a a1 = KF.KH;
            if (a1.uri == null)
            {
                KF.a(ImageManager.b(KD), ImageManager.c(KD), true);
                return;
            }
            obj = com.google.android.gms.common.images.ImageManager.a(KD, a1);
            if (obj != null)
            {
                KF.a(ImageManager.b(KD), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.d(KD).get(a1.uri);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    KF.a(ImageManager.b(KD), ImageManager.c(KD), true);
                    return;
                }
                ImageManager.d(KD).remove(a1.uri);
            }
            KF.a(ImageManager.b(KD), ImageManager.c(KD));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.e(KD).get(a1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = KD. new ImageReceiver(a1.uri);
                ImageManager.e(KD).put(a1.uri, obj);
            }
            ((ImageReceiver) (obj)).b(KF);
            if (!(KF instanceof a.c))
            {
                com.google.android.gms.common.images.ImageManager.a(KD).put(KF, obj);
            }
            synchronized (ImageManager.gH())
            {
                if (!ImageManager.gI().contains(a1.uri))
                {
                    ImageManager.gI().add(a1.uri);
                    ((ImageReceiver) (obj)).gJ();
                }
            }
            return;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public d(com.google.android.gms.common.images.a a1)
        {
            KD = ImageManager.this;
            super();
            KF = a1;
        }
    }

    private static final class e
        implements ComponentCallbacks2
    {

        private final b Kx;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            Kx.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                Kx.evictAll();
            } else
            if (i >= 20)
            {
                Kx.trimToSize(Kx.size() / 2);
                return;
            }
        }

        public e(b b1)
        {
            Kx = b1;
        }
    }

    private final class f
        implements Runnable
    {

        final ImageManager KD;
        private boolean KG;
        private final Bitmap mBitmap;
        private final Uri mUri;
        private final CountDownLatch mg;

        private void a(ImageReceiver imagereceiver, boolean flag)
        {
            imagereceiver = com.google.android.gms.common.images.ImageReceiver.a(imagereceiver);
            int j = imagereceiver.size();
            int i = 0;
            while (i < j) 
            {
                com.google.android.gms.common.images.a a1 = (com.google.android.gms.common.images.a)imagereceiver.get(i);
                if (flag)
                {
                    a1.a(ImageManager.b(KD), mBitmap, false);
                } else
                {
                    ImageManager.d(KD).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    a1.a(ImageManager.b(KD), ImageManager.c(KD), false);
                }
                if (!(a1 instanceof a.c))
                {
                    com.google.android.gms.common.images.ImageManager.a(KD).remove(a1);
                }
                i++;
            }
        }

        public void run()
        {
            com.google.android.gms.common.internal.a.aT("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.h(KD) != null)
            {
                if (KG)
                {
                    ImageManager.h(KD).evictAll();
                    System.gc();
                    KG = false;
                    ImageManager.g(KD).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.h(KD).put(new a.a(mUri), mBitmap);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.e(KD).remove(mUri);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            mg.countDown();
            synchronized (ImageManager.gH())
            {
                ImageManager.gI().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public f(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            KD = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            KG = flag;
            mg = countdownlatch;
        }
    }


    private static final Object Ks = new Object();
    private static HashSet Kt = new HashSet();
    private static ImageManager Ku;
    private static ImageManager Kv;
    private final Map KA = new HashMap();
    private final Map KB = new HashMap();
    private final ExecutorService Kw = Executors.newFixedThreadPool(4);
    private final b Kx;
    private final iz Ky = new iz();
    private final Map Kz = new HashMap();
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            Kx = new b(mContext);
            if (kc.hE())
            {
                gG();
            }
        } else
        {
            Kx = null;
        }
    }

    static Bitmap a(ImageManager imagemanager, a.a a1)
    {
        return imagemanager.a(a1);
    }

    private Bitmap a(a.a a1)
    {
        if (Kx == null)
        {
            return null;
        } else
        {
            return (Bitmap)Kx.get(a1);
        }
    }

    static Map a(ImageManager imagemanager)
    {
        return imagemanager.Kz;
    }

    static Context b(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    public static ImageManager c(Context context, boolean flag)
    {
        if (flag)
        {
            if (Kv == null)
            {
                Kv = new ImageManager(context, true);
            }
            return Kv;
        }
        if (Ku == null)
        {
            Ku = new ImageManager(context, false);
        }
        return Ku;
    }

    static iz c(ImageManager imagemanager)
    {
        return imagemanager.Ky;
    }

    public static ImageManager create(Context context)
    {
        return c(context, false);
    }

    static Map d(ImageManager imagemanager)
    {
        return imagemanager.KB;
    }

    static Map e(ImageManager imagemanager)
    {
        return imagemanager.KA;
    }

    static ExecutorService f(ImageManager imagemanager)
    {
        return imagemanager.Kw;
    }

    static Handler g(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    private void gG()
    {
        mContext.registerComponentCallbacks(new e(Kx));
    }

    static Object gH()
    {
        return Ks;
    }

    static HashSet gI()
    {
        return Kt;
    }

    static b h(ImageManager imagemanager)
    {
        return imagemanager.Kx;
    }

    public void a(com.google.android.gms.common.images.a a1)
    {
        com.google.android.gms.common.internal.a.aT("ImageManager.loadImage() must be called in the main thread");
        (new d(a1)).run();
    }

    public void loadImage(ImageView imageview, int i)
    {
        a(new a.b(imageview, i));
    }

    public void loadImage(ImageView imageview, Uri uri)
    {
        a(new a.b(imageview, uri));
    }

    public void loadImage(ImageView imageview, Uri uri, int i)
    {
        imageview = new a.b(imageview, uri);
        imageview.aw(i);
        a(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        a(new a.c(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new a.c(onimageloadedlistener, uri);
        onimageloadedlistener.aw(i);
        a(onimageloadedlistener);
    }

}
