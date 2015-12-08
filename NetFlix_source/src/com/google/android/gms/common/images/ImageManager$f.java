// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.fb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class AD
    implements Runnable
{

    private final CountDownLatch AD;
    final ImageManager Ci;
    private boolean Cl;
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
                a1.a(ImageManager.b(Ci), mBitmap, false);
            } else
            {
                a1.a(ImageManager.b(Ci), ImageManager.c(Ci), false);
            }
            if (!(a1 instanceof Ci))
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
                ImageManager.g(Ci).put(new put(mUri), mBitmap);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.d(Ci).remove(mUri);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
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

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        Ci = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        Cl = flag;
        AD = countdownlatch;
    }
}
