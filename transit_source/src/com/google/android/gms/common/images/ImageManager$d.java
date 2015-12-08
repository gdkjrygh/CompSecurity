// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import com.google.android.gms.internal.db;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, a

private final class jO
    implements Runnable
{

    final ImageManager jM;
    private final a jO;

    public void run()
    {
        db.w("LoadImageRunnable must be executed on the main thread");
        ImageManager.a(jM, jO);
        jO jo = jO.jS;
        if (jo.jO == null)
        {
            jO.b(ImageManager.a(jM), true);
            return;
        }
        Object obj = ImageManager.a(jM, jo);
        if (obj != null)
        {
            jO.a(ImageManager.a(jM), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        jO.r(ImageManager.a(jM));
        ageReceiver agereceiver = (ageReceiver)ImageManager.b(jM).get(jo.jM);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(jM, jo.jM);
            ImageManager.b(jM).put(jo.jM, obj);
        }
        ((ageReceiver) (obj)).c(jO);
        if (jO.jV != 1)
        {
            ImageManager.c(jM).put(jO, obj);
        }
        synchronized (ImageManager.aP())
        {
            if (!ImageManager.aQ().contains(jo.))
            {
                ImageManager.aQ().add(jo.);
                ((ageReceiver) (obj)).aR();
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
        jM = imagemanager;
        super();
        jO = a1;
    }
}
