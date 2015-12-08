// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.internal.gy;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class Fh
    implements Runnable
{

    final ImageManager Ff;
    private final a Fh;

    public void run()
    {
        gy.ay("LoadImageRunnable must be executed on the main thread");
        Object obj = (ageReceiver)ImageManager.a(Ff).get(Fh);
        if (obj != null)
        {
            ImageManager.a(Ff).remove(Fh);
            ((ageReceiver) (obj)).c(Fh);
        }
        ageReceiver agereceiver1 = Fh.Fj;
        if (agereceiver1.Fh == null)
        {
            Fh.a(ImageManager.b(Ff), ImageManager.c(Ff), true);
            return;
        }
        obj = ImageManager.a(Ff, agereceiver1);
        if (obj != null)
        {
            Fh.a(ImageManager.b(Ff), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.d(Ff).get(agereceiver1.Ff);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                Fh.a(ImageManager.b(Ff), ImageManager.c(Ff), true);
                return;
            }
            ImageManager.d(Ff).remove(agereceiver1.Ff);
        }
        Fh.a(ImageManager.b(Ff), ImageManager.c(Ff));
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(Ff).get(agereceiver1.Ff);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(Ff, agereceiver1.Ff);
            ImageManager.e(Ff).put(agereceiver1.Ff, obj);
        }
        ((ageReceiver) (obj)).b(Fh);
        if (!(Fh instanceof Fh))
        {
            ImageManager.a(Ff).put(Fh, obj);
        }
        synchronized (ImageManager.eY())
        {
            if (!ImageManager.eZ().contains(agereceiver1.))
            {
                ImageManager.eZ().add(agereceiver1.);
                ((ageReceiver) (obj)).fa();
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ageReceiver(ImageManager imagemanager, a a1)
    {
        Ff = imagemanager;
        super();
        Fh = a1;
    }
}
