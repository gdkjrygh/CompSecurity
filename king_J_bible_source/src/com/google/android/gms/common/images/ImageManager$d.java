// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import com.google.android.gms.internal.fb;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class Ck
    implements Runnable
{

    final ImageManager Ci;
    private final a Ck;

    public void run()
    {
        fb.aj("LoadImageRunnable must be executed on the main thread");
        Object obj = (ageReceiver)ImageManager.a(Ci).get(Ck);
        if (obj != null)
        {
            ImageManager.a(Ci).remove(Ck);
            ((ageReceiver) (obj)).c(Ck);
        }
        ageReceiver agereceiver1 = Ck.Cm;
        if (agereceiver1.Ck == null)
        {
            Ck.a(ImageManager.b(Ci), ImageManager.c(Ci), true);
            return;
        }
        obj = ImageManager.a(Ci, agereceiver1);
        if (obj != null)
        {
            Ck.a(ImageManager.b(Ci), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        Ck.a(ImageManager.b(Ci), ImageManager.c(Ci));
        ageReceiver agereceiver = (ageReceiver)ImageManager.d(Ci).get(agereceiver1.Ci);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(Ci, agereceiver1.Ci);
            ImageManager.d(Ci).put(agereceiver1.Ci, obj);
        }
        ((ageReceiver) (obj)).b(Ck);
        if (!(Ck instanceof Ck))
        {
            ImageManager.a(Ci).put(Ck, obj);
        }
        synchronized (ImageManager.ew())
        {
            if (!ImageManager.ex().contains(agereceiver1.))
            {
                ImageManager.ex().add(agereceiver1.);
                ((ageReceiver) (obj)).ey();
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
        Ci = imagemanager;
        super();
        Ck = a1;
    }
}
