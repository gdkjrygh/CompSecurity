// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.internal.je;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class LH
    implements Runnable
{

    final ImageManager LF;
    private final a LH;

    public void run()
    {
        je.aU("LoadImageRunnable must be executed on the main thread");
        Object obj = (ageReceiver)ImageManager.a(LF).get(LH);
        if (obj != null)
        {
            ImageManager.a(LF).remove(LH);
            ((ageReceiver) (obj)).c(LH);
        }
        ageReceiver agereceiver1 = LH.LJ;
        if (agereceiver1.LH == null)
        {
            LH.a(ImageManager.b(LF), ImageManager.c(LF), true);
            return;
        }
        obj = ImageManager.a(LF, agereceiver1);
        if (obj != null)
        {
            LH.a(ImageManager.b(LF), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.d(LF).get(agereceiver1.LF);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                LH.a(ImageManager.b(LF), ImageManager.c(LF), true);
                return;
            }
            ImageManager.d(LF).remove(agereceiver1.LF);
        }
        LH.a(ImageManager.b(LF), ImageManager.c(LF));
        ageReceiver agereceiver = (ageReceiver)ImageManager.e(LF).get(agereceiver1.LF);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(LF, agereceiver1.LF);
            ImageManager.e(LF).put(agereceiver1.LF, obj);
        }
        ((ageReceiver) (obj)).b(LH);
        if (!(LH instanceof LH))
        {
            ImageManager.a(LF).put(LH, obj);
        }
        synchronized (ImageManager.he())
        {
            if (!ImageManager.hf().contains(agereceiver1.))
            {
                ImageManager.hf().add(agereceiver1.);
                ((ageReceiver) (obj)).hg();
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
        LF = imagemanager;
        super();
        LH = a1;
    }
}
