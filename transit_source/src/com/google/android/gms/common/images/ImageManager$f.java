// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.db;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class jQ
    implements Runnable
{

    final ImageManager jM;
    private final Bitmap jP;
    private final CountDownLatch jQ;
    private boolean jR;
    private final Uri mUri;

    private void a(ageReceiver agereceiver, boolean flag)
    {
        agereceiver.jL = true;
        ArrayList arraylist = ageReceiver.a(agereceiver);
        int j = arraylist.size();
        int i = 0;
        while (i < j) 
        {
            a a1 = (a)arraylist.get(i);
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
        agereceiver.jL = false;
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
                ImageManager.f(jM).put(new put(mUri), jP);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.b(jM).remove(mUri);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
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

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        jM = imagemanager;
        super();
        mUri = uri;
        jP = bitmap;
        jR = flag;
        jQ = countdownlatch;
    }
}
