// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, zza

private final class d
    implements Runnable
{

    final ImageManager a;
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;

    private void a(ageReceiver agereceiver, boolean flag)
    {
        agereceiver = ageReceiver.a(agereceiver);
        int j = agereceiver.size();
        int i = 0;
        while (i < j) 
        {
            zza zza1 = (zza)agereceiver.get(i);
            if (flag)
            {
                zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(a), c, false);
            } else
            {
                ImageManager.zzd(a).put(b, Long.valueOf(SystemClock.elapsedRealtime()));
                zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(a), ImageManager.zzc(a), false);
            }
            if (!(zza1 instanceof a))
            {
                ImageManager.zza(a).remove(zza1);
            }
            i++;
        }
    }

    public void run()
    {
        zzb.zzbI("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ImageManager.zzh(a) != null)
        {
            if (e)
            {
                ImageManager.zzh(a).evictAll();
                System.gc();
                e = false;
                ImageManager.zzg(a).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.zzh(a).put(new put(b), c);
            }
        }
        ageReceiver agereceiver = (ageReceiver)ImageManager.zze(a).remove(b);
        if (agereceiver != null)
        {
            a(agereceiver, flag);
        }
        d.countDown();
        synchronized (ImageManager.zzlx())
        {
            ImageManager.zzly().remove(b);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ageReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        a = imagemanager;
        super();
        b = uri;
        c = bitmap;
        e = flag;
        d = countdownlatch;
    }
}
