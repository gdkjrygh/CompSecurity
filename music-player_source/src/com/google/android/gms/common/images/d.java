// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.gw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            e, ImageManager, f, b

final class d
    implements Runnable
{

    final ImageManager a;
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;

    public d(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        a = imagemanager;
        super();
        b = uri;
        c = bitmap;
        e = flag;
        d = countdownlatch;
    }

    private void a(ImageManager.ImageReceiver imagereceiver, boolean flag)
    {
        imagereceiver.a = true;
        ArrayList arraylist = ImageManager.ImageReceiver.a(imagereceiver);
        int j = arraylist.size();
        int i = 0;
        while (i < j) 
        {
            e e1 = (e)arraylist.get(i);
            if (flag)
            {
                e1.a(ImageManager.a(a), c);
            } else
            {
                e1.a(ImageManager.a(a));
            }
            if (e1.b != 1)
            {
                ImageManager.c(a).remove(e1);
            }
            i++;
        }
        imagereceiver.a = false;
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
        if (ImageManager.f(a) != null)
        {
            if (e)
            {
                ImageManager.f(a).a(-1);
                System.gc();
                e = false;
                ImageManager.e(a).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.f(a).a(new f(b), c);
            }
        }
        ImageManager.ImageReceiver imagereceiver = (ImageManager.ImageReceiver)ImageManager.b(a).remove(b);
        if (imagereceiver != null)
        {
            a(imagereceiver, flag);
        }
        d.countDown();
        synchronized (ImageManager.a())
        {
            ImageManager.b().remove(b);
        }
    }
}
