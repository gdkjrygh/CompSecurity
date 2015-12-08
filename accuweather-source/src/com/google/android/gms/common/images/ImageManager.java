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
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.iq;
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

        private final ArrayList Fe = new ArrayList();
        final ImageManager Ff;
        private final Uri mUri;

        static ArrayList a(ImageReceiver imagereceiver)
        {
            return imagereceiver.Fe;
        }

        public void b(com.google.android.gms.common.images.a a1)
        {
            gy.ay("ImageReceiver.addImageRequest() must be called in the main thread");
            Fe.add(a1);
        }

        public void c(com.google.android.gms.common.images.a a1)
        {
            gy.ay("ImageReceiver.removeImageRequest() must be called in the main thread");
            Fe.remove(a1);
        }

        public void fa()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.b(Ff).sendBroadcast(intent);
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.f(Ff).execute(Ff. new c(mUri, bundle));
        }

        ImageReceiver(Uri uri)
        {
            Ff = ImageManager.this;
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

    private static final class b extends hr
    {

        private static int A(Context context)
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
            if (i != 0 && iq.fX())
            {
                i = a.a(activitymanager);
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
            super(A(context));
        }
    }

    private final class c
        implements Runnable
    {

        final ImageManager Ff;
        private final ParcelFileDescriptor Fg;
        private final Uri mUri;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            gy.az("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (Fg == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(Fg.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                Fg.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.g(Ff).post(Ff. new f(mUri, ((Bitmap) (obj)), flag, countdownlatch));
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
            Ff = ImageManager.this;
            super();
            mUri = uri;
            Fg = parcelfiledescriptor;
        }
    }

    private final class d
        implements Runnable
    {

        final ImageManager Ff;
        private final com.google.android.gms.common.images.a Fh;

        public void run()
        {
            gy.ay("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.a(Ff).get(Fh);
            if (obj != null)
            {
                ImageManager.a(Ff).remove(Fh);
                ((ImageReceiver) (obj)).c(Fh);
            }
            a.a a1 = Fh.Fj;
            if (a1.uri == null)
            {
                Fh.a(ImageManager.b(Ff), ImageManager.c(Ff), true);
                return;
            }
            obj = ImageManager.a(Ff, a1);
            if (obj != null)
            {
                Fh.a(ImageManager.b(Ff), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.d(Ff).get(a1.uri);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    Fh.a(ImageManager.b(Ff), ImageManager.c(Ff), true);
                    return;
                }
                ImageManager.d(Ff).remove(a1.uri);
            }
            Fh.a(ImageManager.b(Ff), ImageManager.c(Ff));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.e(Ff).get(a1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = Ff. new ImageReceiver(a1.uri);
                ImageManager.e(Ff).put(a1.uri, obj);
            }
            ((ImageReceiver) (obj)).b(Fh);
            if (!(Fh instanceof a.c))
            {
                ImageManager.a(Ff).put(Fh, obj);
            }
            synchronized (ImageManager.eY())
            {
                if (!ImageManager.eZ().contains(a1.uri))
                {
                    ImageManager.eZ().add(a1.uri);
                    ((ImageReceiver) (obj)).fa();
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
            Ff = ImageManager.this;
            super();
            Fh = a1;
        }
    }

    private static final class e
        implements ComponentCallbacks2
    {

        private final b EZ;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            EZ.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                EZ.evictAll();
            } else
            if (i >= 20)
            {
                EZ.trimToSize(EZ.size() / 2);
                return;
            }
        }

        public e(b b1)
        {
            EZ = b1;
        }
    }

    private final class f
        implements Runnable
    {

        final ImageManager Ff;
        private boolean Fi;
        private final CountDownLatch kI;
        private final Bitmap mBitmap;
        private final Uri mUri;

        private void a(ImageReceiver imagereceiver, boolean flag)
        {
            imagereceiver = ImageReceiver.a(imagereceiver);
            int j = imagereceiver.size();
            int i = 0;
            while (i < j) 
            {
                com.google.android.gms.common.images.a a1 = (com.google.android.gms.common.images.a)imagereceiver.get(i);
                if (flag)
                {
                    a1.a(ImageManager.b(Ff), mBitmap, false);
                } else
                {
                    ImageManager.d(Ff).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    a1.a(ImageManager.b(Ff), ImageManager.c(Ff), false);
                }
                if (!(a1 instanceof a.c))
                {
                    ImageManager.a(Ff).remove(a1);
                }
                i++;
            }
        }

        public void run()
        {
            gy.ay("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.h(Ff) != null)
            {
                if (Fi)
                {
                    ImageManager.h(Ff).evictAll();
                    System.gc();
                    Fi = false;
                    ImageManager.g(Ff).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.h(Ff).put(new a.a(mUri), mBitmap);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.e(Ff).remove(mUri);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            kI.countDown();
            synchronized (ImageManager.eY())
            {
                ImageManager.eZ().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public f(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            Ff = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            Fi = flag;
            kI = countdownlatch;
        }
    }


    private static final Object EU = new Object();
    private static HashSet EV = new HashSet();
    private static ImageManager EW;
    private static ImageManager EX;
    private final ExecutorService EY = Executors.newFixedThreadPool(4);
    private final b EZ;
    private final gx Fa = new gx();
    private final Map Fb = new HashMap();
    private final Map Fc = new HashMap();
    private final Map Fd = new HashMap();
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            EZ = new b(mContext);
            if (iq.ga())
            {
                eX();
            }
        } else
        {
            EZ = null;
        }
    }

    static Bitmap a(ImageManager imagemanager, a.a a1)
    {
        return imagemanager.a(a1);
    }

    private Bitmap a(a.a a1)
    {
        if (EZ == null)
        {
            return null;
        } else
        {
            return (Bitmap)EZ.get(a1);
        }
    }

    public static ImageManager a(Context context, boolean flag)
    {
        if (flag)
        {
            if (EX == null)
            {
                EX = new ImageManager(context, true);
            }
            return EX;
        }
        if (EW == null)
        {
            EW = new ImageManager(context, false);
        }
        return EW;
    }

    static Map a(ImageManager imagemanager)
    {
        return imagemanager.Fb;
    }

    static Context b(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    static gx c(ImageManager imagemanager)
    {
        return imagemanager.Fa;
    }

    public static ImageManager create(Context context)
    {
        return a(context, false);
    }

    static Map d(ImageManager imagemanager)
    {
        return imagemanager.Fd;
    }

    static Map e(ImageManager imagemanager)
    {
        return imagemanager.Fc;
    }

    private void eX()
    {
        mContext.registerComponentCallbacks(new e(EZ));
    }

    static Object eY()
    {
        return EU;
    }

    static HashSet eZ()
    {
        return EV;
    }

    static ExecutorService f(ImageManager imagemanager)
    {
        return imagemanager.EY;
    }

    static Handler g(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static b h(ImageManager imagemanager)
    {
        return imagemanager.EZ;
    }

    public void a(com.google.android.gms.common.images.a a1)
    {
        gy.ay("ImageManager.loadImage() must be called in the main thread");
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
        imageview.aj(i);
        a(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        a(new a.c(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new a.c(onimageloadedlistener, uri);
        onimageloadedlistener.aj(i);
        a(onimageloadedlistener);
    }

}
