// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.je;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class mr
    implements Runnable
{

    final ImageManager LF;
    private boolean LI;
    private final Bitmap mBitmap;
    private final Uri mUri;
    private final CountDownLatch mr;

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
                a1.a(ImageManager.b(LF), mBitmap, false);
            } else
            {
                ImageManager.d(LF).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                a1.a(ImageManager.b(LF), ImageManager.c(LF), false);
            }
            if (!(a1 instanceof LF))
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
                ImageManager.h(LF).put(new put(mUri), mBitmap);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(LF).remove(mUri);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
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

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        LF = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        LI = flag;
        mr = countdownlatch;
    }
}
