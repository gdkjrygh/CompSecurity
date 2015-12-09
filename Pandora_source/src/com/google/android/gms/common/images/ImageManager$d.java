// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, zza

private final class b
    implements Runnable
{

    final ImageManager a;
    private final zza b;

    public void run()
    {
        zzb.zzbI("LoadImageRunnable must be executed on the main thread");
        Object obj = (ageReceiver)ImageManager.zza(a).get(b);
        if (obj != null)
        {
            ImageManager.zza(a).remove(b);
            ((ageReceiver) (obj)).b(b);
        }
        ageReceiver agereceiver1 = b.zzSg;
        if (agereceiver1.b == null)
        {
            b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a), true);
            return;
        }
        obj = ImageManager.zza(a, agereceiver1);
        if (obj != null)
        {
            b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.zzd(a).get(agereceiver1.a);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a), true);
                return;
            }
            ImageManager.zzd(a).remove(agereceiver1.a);
        }
        b.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a));
        ageReceiver agereceiver = (ageReceiver)ImageManager.zze(a).get(agereceiver1.a);
        obj = agereceiver;
        if (agereceiver == null)
        {
            obj = new ageReceiver(a, agereceiver1.a);
            ImageManager.zze(a).put(agereceiver1.a, obj);
        }
        ((ageReceiver) (obj)).a(b);
        if (!(b instanceof b))
        {
            ImageManager.zza(a).put(b, obj);
        }
        synchronized (ImageManager.zzlx())
        {
            if (!ImageManager.zzly().contains(agereceiver1.ly))
            {
                ImageManager.zzly().add(agereceiver1.ly);
                ((ageReceiver) (obj)).a();
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ageReceiver(ImageManager imagemanager, zza zza1)
    {
        a = imagemanager;
        super();
        b = zza1;
    }
}
