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
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzhg;
import com.google.android.gms.internal.zzhp;
import com.google.android.gms.internal.zzic;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.common.images:
//            zza

public final class ImageManager
{
    private final class ImageReceiver extends ResultReceiver
    {

        final ImageManager a;
        private final Uri b;
        private final ArrayList c = new ArrayList();

        static ArrayList a(ImageReceiver imagereceiver)
        {
            return imagereceiver.c;
        }

        public void a()
        {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", b);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            com.google.android.gms.common.images.ImageManager.zzb(a).sendBroadcast(intent);
        }

        public void a(zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzbI("ImageReceiver.addImageRequest() must be called in the main thread");
            c.add(zza1);
        }

        public void b(zza zza1)
        {
            com.google.android.gms.common.internal.zzb.zzbI("ImageReceiver.removeImageRequest() must be called in the main thread");
            c.remove(zza1);
        }

        public void onReceiveResult(int i, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.zzf(a).execute(a. new c(b, bundle));
        }

        ImageReceiver(Uri uri)
        {
            a = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            b = uri;
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

    private static final class b extends zzhp
    {

        private static int a(Context context)
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
            if (i != 0 && zzic.zzne())
            {
                i = a.a(activitymanager);
            } else
            {
                i = activitymanager.getMemoryClass();
            }
            return (int)((float)(i * 0x100000) * 0.33F);
        }

        protected int a(zza.a a1, Bitmap bitmap)
        {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected void a(boolean flag, zza.a a1, Bitmap bitmap, Bitmap bitmap1)
        {
            super.entryRemoved(flag, a1, bitmap, bitmap1);
        }

        protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
        {
            a(flag, (zza.a)obj, (Bitmap)obj1, (Bitmap)obj2);
        }

        protected int sizeOf(Object obj, Object obj1)
        {
            return a((zza.a)obj, (Bitmap)obj1);
        }

        public b(Context context)
        {
            super(a(context));
        }
    }

    private final class c
        implements Runnable
    {

        final ImageManager a;
        private final Uri b;
        private final ParcelFileDescriptor c;

        public void run()
        {
            Object obj;
            CountDownLatch countdownlatch;
            boolean flag;
            boolean flag1;
            com.google.android.gms.common.internal.zzb.zzbJ("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            flag = false;
            flag1 = false;
            obj = null;
            countdownlatch = null;
            if (c == null) goto _L2; else goto _L1
_L1:
            obj = BitmapFactory.decodeFileDescriptor(c.getFileDescriptor());
            flag = flag1;
_L3:
            OutOfMemoryError outofmemoryerror;
            try
            {
                c.close();
            }
            catch (IOException ioexception)
            {
                Log.e("ImageManager", "closed failed", ioexception);
            }
_L2:
            countdownlatch = new CountDownLatch(1);
            ImageManager.zzg(a).post(a. new f(b, ((Bitmap) (obj)), flag, countdownlatch));
            try
            {
                countdownlatch.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w("ImageManager", (new StringBuilder()).append("Latch interrupted while posting ").append(b).toString());
            }
            break MISSING_BLOCK_LABEL_164;
            outofmemoryerror;
            Log.e("ImageManager", (new StringBuilder()).append("OOM while loading bitmap for uri: ").append(b).toString(), outofmemoryerror);
            flag = true;
            outofmemoryerror = countdownlatch;
              goto _L3
        }

        public c(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
        {
            a = ImageManager.this;
            super();
            b = uri;
            c = parcelfiledescriptor;
        }
    }

    private final class d
        implements Runnable
    {

        final ImageManager a;
        private final zza b;

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzbI("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.zza(a).get(b);
            if (obj != null)
            {
                ImageManager.zza(a).remove(b);
                ((ImageReceiver) (obj)).b(b);
            }
            zza.a a1 = b.zzSg;
            if (a1.a == null)
            {
                b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a), true);
                return;
            }
            obj = ImageManager.zza(a, a1);
            if (obj != null)
            {
                b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.zzd(a).get(a1.a);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a), true);
                    return;
                }
                ImageManager.zzd(a).remove(a1.a);
            }
            b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a));
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(a).get(a1.a);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = a. new ImageReceiver(a1.a);
                ImageManager.zze(a).put(a1.a, obj);
            }
            ((ImageReceiver) (obj)).a(b);
            if (!(b instanceof zza.zzc))
            {
                ImageManager.zza(a).put(b, obj);
            }
            synchronized (ImageManager.zzlx())
            {
                if (!ImageManager.zzly().contains(a1.a))
                {
                    ImageManager.zzly().add(a1.a);
                    ((ImageReceiver) (obj)).a();
                }
            }
            return;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public d(zza zza1)
        {
            a = ImageManager.this;
            super();
            b = zza1;
        }
    }

    private static final class e
        implements ComponentCallbacks2
    {

        private final b a;

        public void onConfigurationChanged(Configuration configuration)
        {
        }

        public void onLowMemory()
        {
            a.evictAll();
        }

        public void onTrimMemory(int i)
        {
            if (i >= 60)
            {
                a.evictAll();
            } else
            if (i >= 20)
            {
                a.trimToSize(a.size() / 2);
                return;
            }
        }

        public e(b b1)
        {
            a = b1;
        }
    }

    private final class f
        implements Runnable
    {

        final ImageManager a;
        private final Uri b;
        private final Bitmap c;
        private final CountDownLatch d;
        private boolean e;

        private void a(ImageReceiver imagereceiver, boolean flag)
        {
            imagereceiver = ImageReceiver.a(imagereceiver);
            int j = imagereceiver.size();
            int i = 0;
            while (i < j) 
            {
                zza zza1 = (zza)imagereceiver.get(i);
                if (flag)
                {
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(a), c, false);
                } else
                {
                    ImageManager.zzd(a).put(b, Long.valueOf(SystemClock.elapsedRealtime()));
                    zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a), false);
                }
                if (!(zza1 instanceof zza.zzc))
                {
                    ImageManager.zza(a).remove(zza1);
                }
                i++;
            }
        }

        public void run()
        {
            com.google.android.gms.common.internal.zzb.zzbI("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (c != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.zzh(a) != null)
            {
                if (e)
                {
                    ImageManager.zzh(a).evictAll();
                    System.gc();
                    e = false;
                    ImageManager.zzg(a).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.zzh(a).put(new zza.a(b), c);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)ImageManager.zze(a).remove(b);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            d.countDown();
            synchronized (ImageManager.zzlx())
            {
                ImageManager.zzly().remove(b);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public f(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            a = ImageManager.this;
            super();
            b = uri;
            c = bitmap;
            e = flag;
            d = countdownlatch;
        }
    }


    private static final Object zzRR = new Object();
    private static HashSet zzRS = new HashSet();
    private static ImageManager zzRT;
    private static ImageManager zzRU;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ExecutorService zzRV = Executors.newFixedThreadPool(4);
    private final b zzRW;
    private final zzhg zzRX = new zzhg();
    private final Map zzRY = new HashMap();
    private final Map zzRZ = new HashMap();
    private final Map zzSa = new HashMap();

    private ImageManager(Context context, boolean flag)
    {
        mContext = context.getApplicationContext();
        if (flag)
        {
            zzRW = new b(mContext);
            if (zzic.zznh())
            {
                zzlw();
            }
        } else
        {
            zzRW = null;
        }
    }

    public static ImageManager create(Context context)
    {
        return zzb(context, false);
    }

    static Bitmap zza(ImageManager imagemanager, zza.a a1)
    {
        return imagemanager.zza(a1);
    }

    private Bitmap zza(zza.a a1)
    {
        if (zzRW == null)
        {
            return null;
        } else
        {
            return (Bitmap)zzRW.get(a1);
        }
    }

    static Map zza(ImageManager imagemanager)
    {
        return imagemanager.zzRY;
    }

    static Context zzb(ImageManager imagemanager)
    {
        return imagemanager.mContext;
    }

    public static ImageManager zzb(Context context, boolean flag)
    {
        if (flag)
        {
            if (zzRU == null)
            {
                zzRU = new ImageManager(context, true);
            }
            return zzRU;
        }
        if (zzRT == null)
        {
            zzRT = new ImageManager(context, false);
        }
        return zzRT;
    }

    static zzhg zzc(ImageManager imagemanager)
    {
        return imagemanager.zzRX;
    }

    static Map zzd(ImageManager imagemanager)
    {
        return imagemanager.zzSa;
    }

    static Map zze(ImageManager imagemanager)
    {
        return imagemanager.zzRZ;
    }

    static ExecutorService zzf(ImageManager imagemanager)
    {
        return imagemanager.zzRV;
    }

    static Handler zzg(ImageManager imagemanager)
    {
        return imagemanager.mHandler;
    }

    static b zzh(ImageManager imagemanager)
    {
        return imagemanager.zzRW;
    }

    private void zzlw()
    {
        mContext.registerComponentCallbacks(new e(zzRW));
    }

    static Object zzlx()
    {
        return zzRR;
    }

    static HashSet zzly()
    {
        return zzRS;
    }

    public void loadImage(ImageView imageview, int i)
    {
        zza(new zza.zzb(imageview, i));
    }

    public void loadImage(ImageView imageview, Uri uri)
    {
        zza(new zza.zzb(imageview, uri));
    }

    public void loadImage(ImageView imageview, Uri uri, int i)
    {
        imageview = new zza.zzb(imageview, uri);
        imageview.zzaI(i);
        zza(imageview);
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri)
    {
        zza(new zza.zzc(onimageloadedlistener, uri));
    }

    public void loadImage(OnImageLoadedListener onimageloadedlistener, Uri uri, int i)
    {
        onimageloadedlistener = new zza.zzc(onimageloadedlistener, uri);
        onimageloadedlistener.zzaI(i);
        zza(onimageloadedlistener);
    }

    public void zza(zza zza1)
    {
        com.google.android.gms.common.internal.zzb.zzbI("ImageManager.loadImage() must be called in the main thread");
        (new d(zza1)).run();
    }

}
