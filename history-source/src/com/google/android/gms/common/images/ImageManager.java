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
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.kj;
import com.google.android.gms.internal.ll;
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

        private final ArrayList LE = new ArrayList();
        final ImageManager LF;
        private final Uri mUri;

        static ArrayList a(ImageReceiver imagereceiver)
        {
            return imagereceiver.LE;
        }

        public void b(com.google.android.gms.common.images.a a1)
        {
            je.aU("ImageReceiver.addImageRequest() must be called in the main thread");
            LE.add(a1);
        }

        public void c(com.google.android.gms.common.images.a a1)
        {
            je.aU("ImageReceiver.removeImageRequest() must be called in the main thread");
            LE.remove(a1);
        }

        public void hg()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", mUri);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.b(LF).sendBroadcast(intent);
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.f(LF).execute(LF. new c(mUri, bundle));
        }

        ImageReceiver(Uri uri)
        {
            LF = ImageManager.this;
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

    private static final class b extends kj
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
            if (i != 0 && ll.ig())
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
            super(I(context));
        }
    }

    private final class c
        implements Runnable
    {

        final ImageManager LF;
        private final ParcelFileDescriptor LG;
        private final Uri mUri;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            je.aV("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (LG == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(LG.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                LG.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.g(LF).post(LF. new f(mUri, ((Bitmap) (obj)), flag, countdownlatch));
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
            LF = ImageManager.this;
            super();
            mUri = uri;
            LG = parcelfiledescriptor;
        }
    }

    private final class d
        implements Runnable
    {

        final ImageManager LF;
        private final com.google.android.gms.common.images.a LH;

        public void run()
        {
            je.aU("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.a(LF).get(LH);
            if (obj != null)
            {
                ImageManager.a(LF).remove(LH);
                ((ImageReceiver) (obj)).c(LH);
            }
            a.a a1 = LH.LJ;
            if (a1.uri == null)
            {
                LH.a(ImageManager.b(LF), ImageManager.c(LF), true);
                return;
            }
            obj = ImageManager.a(LF, a1);
            if (obj != null)
            {
                LH.a(ImageManager.b(LF), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.d(LF).get(a1.uri);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    LH.a(ImageManager.b(LF), ImageManager.c(LF), true);
                    return;
                }
                ImageManager.d(LF).remove(a1.uri);
            }
            LH.a(ImageManager.b(LF), ImageManager.c(LF));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.e(LF).get(a1.uri);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = LF. new ImageReceiver(a1.uri);
                ImageManager.e(LF).put(a1.uri, obj);
            }
            ((ImageReceiver) (obj)).b(LH);
            if (!(LH instanceof a.c))
            {
                ImageManager.a(LF).put(LH, obj);
            }
            synchronized (ImageManager.he())
            {
                if (!ImageManager.hf().contains(a1.uri))
                {
                    ImageManager.hf().add(a1.uri);
                    ((ImageReceiver) (obj)).hg();
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
            LF = ImageManager.this;
            super();
            LH = a1;
        }
    }

    private static final class e
        implements ComponentCallbacks2
    {

        private final b Lz;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            Lz.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                Lz.evictAll();
            } else
            if (i >= 20)
            {
                Lz.trimToSize(Lz.size() / 2);
                return;
            }
        }

        public e(b b1)
        {
            Lz = b1;
        }
    }

    private final class f
        implements Runnable
    {

        final ImageManager LF;
        private boolean LI;
        private final Bitmap mBitmap;
        private final Uri mUri;
        private final CountDownLatch mr;

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
                    a1.a(ImageManager.b(LF), mBitmap, false);
                } else
                {
                    ImageManager.d(LF).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    a1.a(ImageManager.b(LF), ImageManager.c(LF), false);
                }
                if (!(a1 instanceof a.c))
                {
                    ImageManager.a(LF).remove(a1);
                }
                i++;
            }
        }

        public void run()
        {
            je.aU("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (mBitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.h(LF) != null)
            {
                if (LI)
                {
                    ImageManager.h(LF).evictAll();
                    System.gc();
                    LI = false;
                    ImageManager.g(LF).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.h(LF).put(new a.a(mUri), mBitmap);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.e(LF).remove(mUri);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            mr.countDown();
            synchronized (ImageManager.he())
            {
                ImageManager.hf().remove(mUri);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public f(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            LF = ImageManager.this;
            super();
            mUri = uri;
            mBitmap = bitmap;
            LI = flag;
            mr = countdownlatch;
        }
    }


    private static final Object Lu = new Object();
    private static HashSet Lv = new HashSet();
    private static ImageManager Lw;
    private static ImageManager Lx;
    private final jc LA = new jc();
    private final Map LB = new HashMap();
    private final Map LC = new HashMap();
    private final Map LD = new HashMap();
    private final ExecutorService Ly = Executors.newFixedThreadPool(4);
    private final b Lz;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            Lz = new b(mContext);
            if (ll.ij())
            {
                hd();
            }
        } else
        {
            Lz = null;
        }
    }

    static Bitmap a(ImageManager imagemanager, a.a a1)
    {
        return imagemanager.a(a1);
    }

    private Bitmap a(a.a a1)
    {
        if (Lz == null)
        {
            return null;
        } else
        {
            return (Bitmap)Lz.get(a1);
        }
    }

    static Map a(ImageManager imagemanager)
    {
        return imagemanager.LB;
    }

    static Context b(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    public static ImageManager c(Context context, boolean flag)
    {
        if (flag)
        {
            if (Lx == null)
            {
                Lx = new ImageManager(context, true);
            }
            return Lx;
        }
        if (Lw == null)
        {
            Lw = new ImageManager(context, false);
        }
        return Lw;
    }

    static jc c(ImageManager imagemanager)
    {
        return imagemanager.LA;
    }

    public static ImageManager create(Context context)
    {
        return c(context, false);
    }

    static Map d(ImageManager imagemanager)
    {
        return imagemanager.LD;
    }

    static Map e(ImageManager imagemanager)
    {
        return imagemanager.LC;
    }

    static ExecutorService f(ImageManager imagemanager)
    {
        return imagemanager.Ly;
    }

    static Handler g(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static b h(ImageManager imagemanager)
    {
        return imagemanager.Lz;
    }

    private void hd()
    {
        mContext.registerComponentCallbacks(new e(Lz));
    }

    static Object he()
    {
        return Lu;
    }

    static HashSet hf()
    {
        return Lv;
    }

    public void a(com.google.android.gms.common.images.a a1)
    {
        je.aU("ImageManager.loadImage() must be called in the main thread");
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
        imageview.az(i);
        a(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        a(new a.c(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new a.c(onimageloadedlistener, uri);
        onimageloadedlistener.az(i);
        a(onimageloadedlistener);
    }

}
