// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ih;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class d
    implements Runnable
{

    final ImageManager a;
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;

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
                a1.a(ImageManager.b(a), c);
            } else
            {
                ImageManager.d(a).put(b, Long.valueOf(SystemClock.elapsedRealtime()));
                a1.a(ImageManager.b(a), ImageManager.c(a));
            }
            if (!(a1 instanceof a))
            {
                ImageManager.a(a).remove(a1);
            }
            i++;
        }
    }

    public final void run()
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder("checkMainThread: current thread ")).append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException("OnBitmapLoadedRunnable must be executed in the main thread");
        }
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
                ImageManager.h(a).a(-1);
                System.gc();
                e = false;
                ImageManager.g(a).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.h(a).a(new a(b), c);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(a).remove(b);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
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

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        a = imagemanager;
        super();
        b = uri;
        c = bitmap;
        e = flag;
        d = countdownlatch;
    }
}
