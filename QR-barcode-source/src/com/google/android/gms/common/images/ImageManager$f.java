// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mg
    implements Runnable
{

    final ImageManager KD;
    private boolean KG;
    private final Bitmap mBitmap;
    private final Uri mUri;
    private final CountDownLatch mg;

    private void a(ageReceiver agereceiver, boolean flag)
    {
        agereceiver = com.google.android.gms.common.images.ageReceiver.a(agereceiver);
        int j = agereceiver.size();
        int i = 0;
        while (i < j) 
        {
            com.google.android.gms.common.images.a a1 = (com.google.android.gms.common.images.a)agereceiver.get(i);
            if (flag)
            {
                a1.a(ImageManager.b(KD), mBitmap, false);
            } else
            {
                ImageManager.d(KD).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                a1.a(ImageManager.b(KD), ImageManager.c(KD), false);
            }
            if (!(a1 instanceof KD))
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
                ImageManager.h(KD).put(new put(mUri), mBitmap);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(KD).remove(mUri);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
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

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        KD = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        KG = flag;
        mg = countdownlatch;
    }
}
