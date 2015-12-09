// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, d

final class c
    implements Runnable
{

    final ImageManager a;
    private final Uri b;
    private final ParcelFileDescriptor c;

    public c(ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = imagemanager;
        super();
        b = uri;
        c = parcelfiledescriptor;
    }

    public final void run()
    {
        Object obj;
        CountDownLatch countdownlatch;
        boolean flag;
        boolean flag1;
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder("checkNotMainThread: current thread ")).append(Thread.currentThread()).append(" IS the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        }
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
        ImageManager.g(a).post(new d(a, b, ((android.graphics.Bitmap) (obj)), flag, countdownlatch));
        try
        {
            countdownlatch.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("ImageManager", (new StringBuilder("Latch interrupted while posting ")).append(b).toString());
        }
        break MISSING_BLOCK_LABEL_218;
        outofmemoryerror;
        Log.e("ImageManager", (new StringBuilder("OOM while loading bitmap for uri: ")).append(b).toString(), outofmemoryerror);
        flag = true;
        outofmemoryerror = countdownlatch;
          goto _L3
    }
}
