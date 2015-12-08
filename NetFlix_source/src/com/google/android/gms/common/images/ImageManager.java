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
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fu;
import com.google.android.gms.internal.gr;
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

        private final ArrayList Ch = new ArrayList();
        final ImageManager Ci;
        private final Uri mUri;

        static ArrayList a(ImageReceiver imagereceiver)
        {
            return imagereceiver.Ch;
        }

        public void b(com.google.android.gms.common.images.a a1)
        {
            fb.aj("ImageReceiver.addImageRequest() must be called in the main thread");
            Ch.add(a1);
        }

        public void c(com.google.android.gms.common.images.a a1)
        {
            fb.aj("ImageReceiver.removeImageRequest() must be called in the main thread");
            Ch.remove(a1);
        }

        public void ey()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.b(Ci).sendBroadcast(intent);
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.e(Ci).execute(Ci. new c(mUri, bundle));
        }

        ImageReceiver(Uri uri)
        {
            Ci = ImageManager.this;
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

    private static final class b extends fu
    {

        private static int w(Context context)
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
            if (i != 0 && gr.fu())
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
            super(w(context));
        }
    }

    private final class c
        implements Runnable
    {

        final ImageManager Ci;
        private final ParcelFileDescriptor Cj;
        private final Uri mUri;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            fb.ak("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (Cj == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(Cj.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                Cj.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.f(Ci).post(Ci. new f(mUri, ((Bitmap) (obj)), flag, countdownlatch));
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
            Ci = ImageManager.this;
            super();
            mUri = uri;
            Cj = parcelfiledescriptor;
        }
    }

    private final class d
        implements Runnable
    {

        final ImageManager Ci;
        private final com.google.android.gms.common.images.a Ck;

        public void run()
        {
            fb.aj("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.a(Ci).get(Ck);
            if (obj != null)
            {
                ImageManager.a(Ci).remove(Ck);
                ((ImageReceiver) (obj)).c(Ck);
            }
            a.a a1 = Ck.Cm;
            if (a1.uri == null)
            {
                Ck.a(ImageManager.b(Ci), ImageManager.c(Ci), true);
                return;
            }
            obj = ImageManager.a(Ci, a1);
            if (obj != null)
            {
                Ck.a(ImageManager.b(Ci), ((Bitmap) (obj)), true);
                return;
            }
            Ck.a(ImageManager.b(Ci), ImageManager.c(Ci));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.d(Ci).get(a1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = Ci. new ImageReceiver(a1.uri);
                ImageManager.d(Ci).put(a1.uri, obj);
            }
            ((ImageReceiver) (obj)).b(Ck);
            if (!(Ck instanceof a.c))
            {
                ImageManager.a(Ci).put(Ck, obj);
            }
            synchronized (ImageManager.ew())
            {
                if (!ImageManager.ex().contains(a1.uri))
                {
                    ImageManager.ex().add(a1.uri);
                    ((ImageReceiver) (obj)).ey();
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
            Ci = ImageManager.this;
            super();
            Ck = a1;
        }
    }

    private static final class e
        implements ComponentCallbacks2
    {

        private final b Cd;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            Cd.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                Cd.evictAll();
            } else
            if (i >= 20)
            {
                Cd.trimToSize(Cd.size() / 2);
                return;
            }
        }

        public e(b b1)
        {
            Cd = b1;
        }
    }

    private final class f
        implements Runnable
    {

        private final CountDownLatch AD;
        final ImageManager Ci;
        private boolean Cl;
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
                    a1.a(ImageManager.b(Ci), mBitmap, false);
                } else
                {
                    a1.a(ImageManager.b(Ci), ImageManager.c(Ci), false);
                }
                if (!(a1 instanceof a.c))
                {
                    ImageManager.a(Ci).remove(a1);
                }
                i++;
            }
        }

        public void run()
        {
            fb.aj("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.g(Ci) != null)
            {
                if (Cl)
                {
                    ImageManager.g(Ci).evictAll();
                    System.gc();
                    Cl = false;
                    ImageManager.f(Ci).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.g(Ci).put(new a.a(mUri), mBitmap);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.d(Ci).remove(mUri);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            AD.countDown();
            synchronized (ImageManager.ew())
            {
                ImageManager.ex().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public f(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            Ci = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            Cl = flag;
            AD = countdownlatch;
        }
    }


    private static final Object BY = new Object();
    private static HashSet BZ = new HashSet();
    private static ImageManager Ca;
    private static ImageManager Cb;
    private final ExecutorService Cc = Executors.newFixedThreadPool(4);
    private final b Cd;
    private final fa Ce = new fa();
    private final Map Cf = new HashMap();
    private final Map Cg = new HashMap();
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            Cd = new b(mContext);
            if (gr.fx())
            {
                ev();
            }
        } else
        {
            Cd = null;
        }
    }

    static Bitmap a(ImageManager imagemanager, a.a a1)
    {
        return imagemanager.a(a1);
    }

    private Bitmap a(a.a a1)
    {
        if (Cd == null)
        {
            return null;
        } else
        {
            return (Bitmap)Cd.get(a1);
        }
    }

    public static ImageManager a(Context context, boolean flag)
    {
        if (flag)
        {
            if (Cb == null)
            {
                Cb = new ImageManager(context, true);
            }
            return Cb;
        }
        if (Ca == null)
        {
            Ca = new ImageManager(context, false);
        }
        return Ca;
    }

    static Map a(ImageManager imagemanager)
    {
        return imagemanager.Cf;
    }

    static Context b(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    static fa c(ImageManager imagemanager)
    {
        return imagemanager.Ce;
    }

    public static ImageManager create(Context context)
    {
        return a(context, false);
    }

    static Map d(ImageManager imagemanager)
    {
        return imagemanager.Cg;
    }

    static ExecutorService e(ImageManager imagemanager)
    {
        return imagemanager.Cc;
    }

    private void ev()
    {
        mContext.registerComponentCallbacks(new e(Cd));
    }

    static Object ew()
    {
        return BY;
    }

    static HashSet ex()
    {
        return BZ;
    }

    static Handler f(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static b g(ImageManager imagemanager)
    {
        return imagemanager.Cd;
    }

    public void a(com.google.android.gms.common.images.a a1)
    {
        fb.aj("ImageManager.loadImage() must be called in the main thread");
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
        imageview.J(i);
        a(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        a(new a.c(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new a.c(onimageloadedlistener, uri);
        onimageloadedlistener.J(i);
        a(onimageloadedlistener);
    }

}
