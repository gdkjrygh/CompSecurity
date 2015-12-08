// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, ImageRequest

private final class mLatch
    implements Runnable
{

    private final Bitmap mBitmap;
    private final CountDownLatch mLatch;
    private boolean mOomTriggered;
    private final Uri mUri;
    final ImageManager this$0;

    public final void run()
    {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean flag;
        if (mBitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ImageManager.access$1000(ImageManager.this) != null)
        {
            if (mOomTriggered)
            {
                ImageManager.access$1000(ImageManager.this).trimToSize(-1);
                System.gc();
                mOomTriggered = false;
                ImageManager.access$900(ImageManager.this).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.access$1000(ImageManager.this)._mth0(new this._cls0(mUri), mBitmap);
            }
        }
        Object obj = (mBitmap)ImageManager.access$500(ImageManager.this).remove(mUri);
        if (obj != null)
        {
            obj = _mth00(((_cls00) (obj)));
            int j = ((ArrayList) (obj)).size();
            int i = 0;
            while (i < j) 
            {
                ImageRequest imagerequest = (ImageRequest)((ArrayList) (obj)).get(i);
                if (flag)
                {
                    imagerequest.onImageLoaded(ImageManager.access$100(ImageManager.this), mBitmap, false);
                } else
                {
                    ImageManager.access$400(ImageManager.this).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                    imagerequest.loadNoDataPlaceholder(ImageManager.access$100(ImageManager.this), ImageManager.access$200(ImageManager.this), false);
                }
                if (!(imagerequest instanceof this._cls0))
                {
                    ImageManager.access$000(ImageManager.this).remove(imagerequest);
                }
                i++;
            }
        }
        mLatch.countDown();
        synchronized (ImageManager.access$600())
        {
            ImageManager.access$700().remove(mUri);
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        this$0 = ImageManager.this;
        super();
        mUri = uri;
        mBitmap = bitmap;
        mOomTriggered = flag;
        mLatch = countdownlatch;
    }
}
