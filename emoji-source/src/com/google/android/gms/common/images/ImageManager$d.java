// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.internal.gx;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class Fk
    implements Runnable
{

    final ImageManager Fi;
    private final a Fk;

    public void run()
    {
        gx.ay("LoadImageRunnable must be executed on the main thread");
        Object obj = (ageReceiver)ImageManager.a(Fi).get(Fk);
        if (obj != null)
        {
            ImageManager.a(Fi).remove(Fk);
            ((ageReceiver) (obj)).c(Fk);
        }
        ageReceiver agereceiver1 = Fk.Fm;
        if (agereceiver1.Fk == null)
        {
            Fk.a(ImageManager.b(Fi), ImageManager.c(Fi), true);
            return;
        }
        obj = ImageManager.a(Fi, agereceiver1);
        if (obj != null)
        {
            Fk.a(ImageManager.b(Fi), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.d(Fi).get(agereceiver1.Fi);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                Fk.a(ImageManager.b(Fi), ImageManager.c(Fi), true);
                return;
            }
            ImageManager.d(Fi).remove(agereceiver1.Fi);
        }
        Fk.a(ImageManager.b(Fi), ImageManager.c(Fi));
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(Fi).get(agereceiver1.Fi);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(Fi, agereceiver1.Fi);
            ImageManager.e(Fi).put(agereceiver1.Fi, obj);
        }
        ((ageReceiver) (obj)).b(Fk);
        if (!(Fk instanceof Fk))
        {
            ImageManager.a(Fi).put(Fk, obj);
        }
        synchronized (ImageManager.fd())
        {
            if (!ImageManager.fe().contains(agereceiver1.))
            {
                ImageManager.fe().add(agereceiver1.);
                ((ageReceiver) (obj)).ff();
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
        Fi = imagemanager;
        super();
        Fk = a1;
    }
}
