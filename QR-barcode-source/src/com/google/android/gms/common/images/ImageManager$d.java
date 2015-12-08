// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.a;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class KF
    implements Runnable
{

    final ImageManager KD;
    private final com.google.android.gms.common.images.a KF;

    public void run()
    {
        a.aT("LoadImageRunnable must be executed on the main thread");
        Object obj = (ageReceiver)com.google.android.gms.common.images.ImageManager.a(KD).get(KF);
        if (obj != null)
        {
            com.google.android.gms.common.images.ImageManager.a(KD).remove(KF);
            ((ageReceiver) (obj)).c(KF);
        }
        ageReceiver agereceiver1 = KF.KH;
        if (agereceiver1.KF == null)
        {
            KF.a(ImageManager.b(KD), ImageManager.c(KD), true);
            return;
        }
        obj = com.google.android.gms.common.images.ImageManager.a(KD, agereceiver1);
        if (obj != null)
        {
            KF.a(ImageManager.b(KD), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.d(KD).get(agereceiver1.KD);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                KF.a(ImageManager.b(KD), ImageManager.c(KD), true);
                return;
            }
            ImageManager.d(KD).remove(agereceiver1.KD);
        }
        KF.a(ImageManager.b(KD), ImageManager.c(KD));
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(KD).get(agereceiver1.KD);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(KD, agereceiver1.KD);
            ImageManager.e(KD).put(agereceiver1.KD, obj);
        }
        ((ageReceiver) (obj)).b(KF);
        if (!(KF instanceof KF))
        {
            com.google.android.gms.common.images.ImageManager.a(KD).put(KF, obj);
        }
        synchronized (ImageManager.gH())
        {
            if (!ImageManager.gI().contains(agereceiver1.))
            {
                ImageManager.gI().add(agereceiver1.);
                ((ageReceiver) (obj)).gJ();
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ageReceiver(ImageManager imagemanager, com.google.android.gms.common.images.a a1)
    {
        KD = imagemanager;
        super();
        KF = a1;
    }
}
