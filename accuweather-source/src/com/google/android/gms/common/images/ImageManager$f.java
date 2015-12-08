// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.gy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class kI
    implements Runnable
{

    final ImageManager Ff;
    private boolean Fi;
    private final CountDownLatch kI;
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
                a1.a(ImageManager.b(Ff), mBitmap, false);
            } else
            {
                ImageManager.d(Ff).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                a1.a(ImageManager.b(Ff), ImageManager.c(Ff), false);
            }
            if (!(a1 instanceof Ff))
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
                ImageManager.h(Ff).put(new put(mUri), mBitmap);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(Ff).remove(mUri);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
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

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        Ff = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        Fi = flag;
        kI = countdownlatch;
    }
}
