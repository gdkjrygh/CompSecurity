// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.e;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class eReceiver
    implements Runnable
{

    final ImageManager a;
    private final a b;

    public void run()
    {
        e.a("LoadImageRunnable must be executed on the main thread");
        Object obj = (eReceiver)ImageManager.a(a).get(b);
        if (obj != null)
        {
            ImageManager.a(a).remove(b);
            ((eReceiver) (obj)).b(b);
        }
        eReceiver ereceiver1 = b.a;
        if (ereceiver1.b == null)
        {
            b.a(ImageManager.b(a), ImageManager.c(a), true);
            return;
        }
        obj = ImageManager.a(a, ereceiver1);
        if (obj != null)
        {
            b.a(ImageManager.b(a), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.d(a).get(ereceiver1.a);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                b.a(ImageManager.b(a), ImageManager.c(a), true);
                return;
            }
            ImageManager.d(a).remove(ereceiver1.a);
        }
        b.a(ImageManager.b(a), ImageManager.c(a));
        eReceiver ereceiver = (eReceiver)com.google.android.gms.common.images.ImageManager.e(a).get(ereceiver1.a);
        obj = ereceiver;
        if (ereceiver == null)
        {
            obj = new eReceiver(a, ereceiver1.a);
            com.google.android.gms.common.images.ImageManager.e(a).put(ereceiver1.a, obj);
        }
        ((eReceiver) (obj)).a(b);
        if (!(b instanceof b))
        {
            ImageManager.a(a).put(b, obj);
        }
        synchronized (ImageManager.a())
        {
            if (!ImageManager.b().contains(ereceiver1.b))
            {
                ImageManager.b().add(ereceiver1.b);
                ((eReceiver) (obj)).a();
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
