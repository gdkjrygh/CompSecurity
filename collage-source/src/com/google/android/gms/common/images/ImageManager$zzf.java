// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.e;
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

    private void a(eReceiver ereceiver, boolean flag)
    {
        ereceiver = eReceiver.a(ereceiver);
        int j = ereceiver.size();
        int i = 0;
        while (i < j) 
        {
            a a1 = (a)ereceiver.get(i);
            if (flag)
            {
                a1.a(ImageManager.b(a), c, false);
            } else
            {
                ImageManager.d(a).put(b, Long.valueOf(SystemClock.elapsedRealtime()));
                a1.a(ImageManager.b(a), ImageManager.c(a), false);
            }
            if (!(a1 instanceof a))
            {
                ImageManager.a(a).remove(a1);
            }
            i++;
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
                ImageManager.h(a).a(new a(b), c);
            }
        }
        eReceiver ereceiver = (eReceiver)com.google.android.gms.common.images.ImageManager.e(a).remove(b);
        if (ereceiver != null)
        {
            a(ereceiver, flag);
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

    public eReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        a = imagemanager;
        super();
        b = uri;
        c = bitmap;
        e = flag;
        d = countdownlatch;
    }
}
