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
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.ek;
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

        private final ArrayList jK = new ArrayList();
        boolean jL;
        final ImageManager jM;
        private final Uri mUri;

        static ArrayList a(ImageReceiver imagereceiver)
        {
            return imagereceiver.jK;
        }

        public void aR()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.a(jM).sendBroadcast(intent);
        }

        public void c(com.google.android.gms.common.images.a a1)
        {
            boolean flag;
            if (!jL)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            db.a(flag, "Cannot add an ImageRequest when mHandlingRequests is true");
            db.w("ImageReceiver.addImageRequest() must be called in the main thread");
            jK.add(a1);
        }

        public void d(com.google.android.gms.common.images.a a1)
        {
            boolean flag;
            if (!jL)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            db.a(flag, "Cannot remove an ImageRequest when mHandlingRequests is true");
            db.w("ImageReceiver.removeImageRequest() must be called in the main thread");
            jK.remove(a1);
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.d(jM).execute(jM. new c(mUri, bundle));
        }

        ImageReceiver(Uri uri)
        {
            jM = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            jL = false;
            mUri = uri;
        }
    }

    public static interface OnImageLoadedListener
    {

        public abstract void onImageLoaded(Uri uri, Drawable drawable);
    }

    private static final class a
    {

        static int a(ActivityManager activitymanager)
        {
            return activitymanager.getLargeMemoryClass();
        }
    }

    private static final class b extends dq
    {

        private static int q(Context context)
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
            if (i != 0 && ek.bJ())
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
            super(q(context));
        }
    }

    private final class c
        implements Runnable
    {

        final ImageManager jM;
        private final ParcelFileDescriptor jN;
        private final Uri mUri;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            db.x("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (jN == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(jN.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                jN.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.e(jM).post(jM. new f(mUri, ((Bitmap) (obj)), flag, countdownlatch));
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
            jM = ImageManager.this;
            super();
            mUri = uri;
            jN = parcelfiledescriptor;
        }
    }

    private final class d
        implements Runnable
    {

        final ImageManager jM;
        private final com.google.android.gms.common.images.a jO;

        public void run()
        {
            db.w("LoadImageRunnable must be executed on the main thread");
            ImageManager.a(jM, jO);
            a.a a1 = jO.jS;
            if (a1.uri == null)
            {
                jO.b(ImageManager.a(jM), true);
                return;
            }
            Object obj = ImageManager.a(jM, a1);
            if (obj != null)
            {
                jO.a(ImageManager.a(jM), ((Bitmap) (obj)), true);
                return;
            }
            jO.r(ImageManager.a(jM));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.b(jM).get(a1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = jM. new ImageReceiver(a1.uri);
                ImageManager.b(jM).put(a1.uri, obj);
            }
            ((ImageReceiver) (obj)).c(jO);
            if (jO.jV != 1)
            {
                ImageManager.c(jM).put(jO, obj);
            }
            synchronized (ImageManager.aP())
            {
                if (!ImageManager.aQ().contains(a1.uri))
                {
                    ImageManager.aQ().add(a1.uri);
                    ((ImageReceiver) (obj)).aR();
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
            jM = ImageManager.this;
            super();
            jO = a1;
        }
    }

    private static final class e
        implements ComponentCallbacks2
    {

        private final b jH;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            jH.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                jH.evictAll();
            } else
            if (i >= 20)
            {
                jH.trimToSize(jH.size() / 2);
                return;
            }
        }

        public e(b b1)
        {
            jH = b1;
        }
    }

    private final class f
        implements Runnable
    {

        final ImageManager jM;
        private final Bitmap jP;
        private final CountDownLatch jQ;
        private boolean jR;
        private final Uri mUri;

        private void a(ImageReceiver imagereceiver, boolean flag)
        {
            imagereceiver.jL = true;
            ArrayList arraylist = ImageReceiver.a(imagereceiver);
            int j = arraylist.size();
            int i = 0;
            while (i < j) 
            {
                com.google.android.gms.common.images.a a1 = (com.google.android.gms.common.images.a)arraylist.get(i);
                if (flag)
                {
                    a1.a(ImageManager.a(jM), jP, false);
                } else
                {
                    a1.b(ImageManager.a(jM), false);
                }
                if (a1.jV != 1)
                {
                    ImageManager.c(jM).remove(a1);
                }
                i++;
            }
            imagereceiver.jL = false;
        }

        public void run()
        {
            db.w("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (jP != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.f(jM) != null)
            {
                if (jR)
                {
                    ImageManager.f(jM).evictAll();
                    System.gc();
                    jR = false;
                    ImageManager.e(jM).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.f(jM).put(new a.a(mUri), jP);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.b(jM).remove(mUri);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            jQ.countDown();
            synchronized (ImageManager.aP())
            {
                ImageManager.aQ().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public f(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            jM = ImageManager.this;
            super();
            mUri = uri;
            jP = bitmap;
            jR = flag;
            jQ = countdownlatch;
        }
    }


    private static final Object jC = new Object();
    private static HashSet jD = new HashSet();
    private static ImageManager jE;
    private static ImageManager jF;
    private final ExecutorService jG = Executors.newFixedThreadPool(4);
    private final b jH;
    private final Map jI = new HashMap();
    private final Map jJ = new HashMap();
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            jH = new b(mContext);
            if (ek.bM())
            {
                aO();
            }
        } else
        {
            jH = null;
        }
    }

    static Context a(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    static Bitmap a(ImageManager imagemanager, a.a a1)
    {
        return imagemanager.a(a1);
    }

    private Bitmap a(a.a a1)
    {
        if (jH == null)
        {
            return null;
        } else
        {
            return (Bitmap)jH.get(a1);
        }
    }

    public static ImageManager a(Context context, boolean flag)
    {
        if (flag)
        {
            if (jF == null)
            {
                jF = new ImageManager(context, true);
            }
            return jF;
        }
        if (jE == null)
        {
            jE = new ImageManager(context, false);
        }
        return jE;
    }

    static boolean a(ImageManager imagemanager, com.google.android.gms.common.images.a a1)
    {
        return imagemanager.b(a1);
    }

    private void aO()
    {
        mContext.registerComponentCallbacks(new e(jH));
    }

    static Object aP()
    {
        return jC;
    }

    static HashSet aQ()
    {
        return jD;
    }

    static Map b(ImageManager imagemanager)
    {
        return imagemanager.jJ;
    }

    private boolean b(com.google.android.gms.common.images.a a1)
    {
        db.w("ImageManager.cleanupHashMaps() must be called in the main thread");
        if (a1.jV == 1)
        {
            return true;
        }
        ImageReceiver imagereceiver = (ImageReceiver)jI.get(a1);
        if (imagereceiver == null)
        {
            return true;
        }
        if (imagereceiver.jL)
        {
            return false;
        } else
        {
            jI.remove(a1);
            imagereceiver.d(a1);
            return true;
        }
    }

    static Map c(ImageManager imagemanager)
    {
        return imagemanager.jI;
    }

    public static ImageManager create(Context context)
    {
        return a(context, false);
    }

    static ExecutorService d(ImageManager imagemanager)
    {
        return imagemanager.jG;
    }

    static Handler e(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static b f(ImageManager imagemanager)
    {
        return imagemanager.jH;
    }

    public void a(com.google.android.gms.common.images.a a1)
    {
        db.w("ImageManager.loadImage() must be called in the main thread");
        boolean flag = b(a1);
        a1 = new d(a1);
        if (flag)
        {
            a1.run();
            return;
        } else
        {
            mHandler.post(a1);
            return;
        }
    }

    public void loadImage(ImageView imageview, int i)
    {
        com.google.android.gms.common.images.a a1 = new com.google.android.gms.common.images.a(i);
        a1.a(imageview);
        a(a1);
    }

    public void loadImage(ImageView imageview, Uri uri)
    {
        uri = new com.google.android.gms.common.images.a(uri);
        uri.a(imageview);
        a(uri);
    }

    public void loadImage(ImageView imageview, Uri uri, int i)
    {
        uri = new com.google.android.gms.common.images.a(uri);
        uri.v(i);
        uri.a(imageview);
        a(uri);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        uri = new com.google.android.gms.common.images.a(uri);
        uri.a(onimageloadedlistener);
        a(uri);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        uri = new com.google.android.gms.common.images.a(uri);
        uri.v(i);
        uri.a(onimageloadedlistener);
        a(uri);
    }

}
