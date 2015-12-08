// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
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
import com.google.android.gms.common.internal.e;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.is;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            a

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
            ImageManager.b(a).sendBroadcast(intent);
        }

        public void a(com.google.android.gms.common.images.a a1)
        {
            com.google.android.gms.common.internal.e.a("ImageReceiver.addImageRequest() must be called in the main thread");
            c.add(a1);
        }

        public void b(com.google.android.gms.common.images.a a1)
        {
            com.google.android.gms.common.internal.e.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            c.remove(a1);
        }

        public void onReceiveResult(int k, Bundle bundle)
        {
            bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.f(a).execute(a. new zzc(b, bundle));
        }

        ImageReceiver(Uri uri)
        {
            a = ImageManager.this;
            super(new Handler(Looper.getMainLooper()));
            b = uri;
        }
    }

    public static interface a
    {

        public abstract void a(Uri uri, Drawable drawable, boolean flag);
    }

    private static final class b extends is
    {

        protected int a(a.a a1, Bitmap bitmap)
        {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected int a(Object obj, Object obj1)
        {
            return a((a.a)obj, (Bitmap)obj1);
        }

        protected void a(boolean flag, a.a a1, Bitmap bitmap, Bitmap bitmap1)
        {
            super.a(flag, a1, bitmap, bitmap1);
        }

        protected void a(boolean flag, Object obj, Object obj1, Object obj2)
        {
            a(flag, (a.a)obj, (Bitmap)obj1, (Bitmap)obj2);
        }
    }

    private final class zzc
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
            com.google.android.gms.common.internal.e.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
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
            ImageManager.g(a).post(a. new zzf(b, ((Bitmap) (obj)), flag, countdownlatch));
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

        public zzc(Uri uri, ParcelFileDescriptor parcelfiledescriptor)
        {
            a = ImageManager.this;
            super();
            b = uri;
            c = parcelfiledescriptor;
        }
    }

    private final class zzd
        implements Runnable
    {

        final ImageManager a;
        private final com.google.android.gms.common.images.a b;

        public void run()
        {
            com.google.android.gms.common.internal.e.a("LoadImageRunnable must be executed on the main thread");
            Object obj = (ImageReceiver)ImageManager.a(a).get(b);
            if (obj != null)
            {
                ImageManager.a(a).remove(b);
                ((ImageReceiver) (obj)).b(b);
            }
            a.a a1 = b.a;
            if (a1.a == null)
            {
                b.a(ImageManager.b(a), ImageManager.c(a), true);
                return;
            }
            obj = ImageManager.a(a, a1);
            if (obj != null)
            {
                b.a(ImageManager.b(a), ((Bitmap) (obj)), true);
                return;
            }
            obj = (Long)ImageManager.d(a).get(a1.a);
            if (obj != null)
            {
                if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
                {
                    b.a(ImageManager.b(a), ImageManager.c(a), true);
                    return;
                }
                ImageManager.d(a).remove(a1.a);
            }
            b.a(ImageManager.b(a), ImageManager.c(a));
            ImageReceiver imagereceiver = (ImageReceiver)com.google.android.gms.common.images.ImageManager.e(a).get(a1.a);
            obj = imagereceiver;
            if (imagereceiver == null)
            {
                obj = a. new ImageReceiver(a1.a);
                com.google.android.gms.common.images.ImageManager.e(a).put(a1.a, obj);
            }
            ((ImageReceiver) (obj)).a(b);
            if (!(b instanceof a.b))
            {
                ImageManager.a(a).put(b, obj);
            }
            synchronized (ImageManager.a())
            {
                if (!ImageManager.b().contains(a1.a))
                {
                    ImageManager.b().add(a1.a);
                    ((ImageReceiver) (obj)).a();
                }
            }
            return;
            exception;
            obj1;
            JVM INSTR monitorexit ;
            throw exception;
        }
    }

    private final class zzf
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
            int l = imagereceiver.size();
            int k = 0;
            while (k < l) 
            {
                com.google.android.gms.common.images.a a1 = (com.google.android.gms.common.images.a)imagereceiver.get(k);
                if (flag)
                {
                    a1.a(ImageManager.b(a), c, false);
                } else
                {
                    ImageManager.d(a).put(b, Long.valueOf(SystemClock.elapsedRealtime()));
                    a1.a(ImageManager.b(a), ImageManager.c(a), false);
                }
                if (!(a1 instanceof a.b))
                {
                    ImageManager.a(a).remove(a1);
                }
                k++;
            }
        }

        public void run()
        {
            com.google.android.gms.common.internal.e.a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean flag;
            if (c != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (ImageManager.h(a) != null)
            {
                if (e)
                {
                    ImageManager.h(a).a();
                    System.gc();
                    e = false;
                    ImageManager.g(a).post(this);
                    return;
                }
                if (flag)
                {
                    ImageManager.h(a).b(new a.a(b), c);
                }
            }
            ImageReceiver imagereceiver = (ImageReceiver)com.google.android.gms.common.images.ImageManager.e(a).remove(b);
            if (imagereceiver != null)
            {
                a(imagereceiver, flag);
            }
            d.countDown();
            synchronized (ImageManager.a())
            {
                ImageManager.b().remove(b);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public zzf(Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
        {
            a = ImageManager.this;
            super();
            b = uri;
            c = bitmap;
            e = flag;
            d = countdownlatch;
        }
    }


    private static final Object a = new Object();
    private static HashSet b = new HashSet();
    private final Context c;
    private final Handler d;
    private final ExecutorService e;
    private final b f;
    private final io g;
    private final Map h;
    private final Map i;
    private final Map j;

    static Bitmap a(ImageManager imagemanager, a.a a1)
    {
        return imagemanager.a(a1);
    }

    private Bitmap a(a.a a1)
    {
        if (f == null)
        {
            return null;
        } else
        {
            return (Bitmap)f.a(a1);
        }
    }

    static Object a()
    {
        return a;
    }

    static Map a(ImageManager imagemanager)
    {
        return imagemanager.h;
    }

    static Context b(ImageManager imagemanager)
    {
        return imagemanager.c;
    }

    static HashSet b()
    {
        return b;
    }

    static io c(ImageManager imagemanager)
    {
        return imagemanager.g;
    }

    static Map d(ImageManager imagemanager)
    {
        return imagemanager.j;
    }

    static Map e(ImageManager imagemanager)
    {
        return imagemanager.i;
    }

    static ExecutorService f(ImageManager imagemanager)
    {
        return imagemanager.e;
    }

    static Handler g(ImageManager imagemanager)
    {
        return imagemanager.d;
    }

    static b h(ImageManager imagemanager)
    {
        return imagemanager.f;
    }

}
