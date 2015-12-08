// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.gx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class kK
    implements Runnable
{

    final ImageManager Fi;
    private boolean Fl;
    private final CountDownLatch kK;
    private final Bitmap mBitmap;
    private final Uri mUri;

    private void a(ageReceiver agereceiver, boolean flag)
    {
        agereceiver = ageReceiver.a(agereceiver);
        int j = agereceiver.size();
        int i = 0;
        while (i < j) 
        {
            a a1 = (a)agereceiver.get(i);
            if (flag)
            {
                a1.a(ImageManager.b(Fi), mBitmap, false);
            } else
            {
                ImageManager.d(Fi).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                a1.a(ImageManager.b(Fi), ImageManager.c(Fi), false);
            }
            if (!(a1 instanceof Fi))
            {
                ImageManager.a(Fi).remove(a1);
            }
            i++;
        }
    }

    public void run()
    {
        gx.ay("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean flag;
        if (mBitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ImageManager.h(Fi) != null)
        {
            if (Fl)
            {
                ImageManager.h(Fi).evictAll();
                System.gc();
                Fl = false;
                ImageManager.g(Fi).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.h(Fi).put(new put(mUri), mBitmap);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(Fi).remove(mUri);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
        }
        kK.countDown();
        synchronized (ImageManager.fd())
        {
            ImageManager.fe().remove(mUri);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        Fi = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        Fl = flag;
        kK = countdownlatch;
    }
}
