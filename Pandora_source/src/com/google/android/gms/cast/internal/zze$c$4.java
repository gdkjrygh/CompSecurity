// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, zzl

class c
    implements Runnable
{

    final zze a;
    final String b;
    final String c;
    final b d;

    public void run()
    {
        com.google.android.gms.cast.sageReceivedCallback sagereceivedcallback;
        synchronized (zze.zzf(a))
        {
            sagereceivedcallback = (com.google.android.gms.cast.sageReceivedCallback)zze.zzf(a).get(b);
        }
        if (sagereceivedcallback != null)
        {
            sagereceivedcallback.onMessageReceived(zze.zzg(a), b, c);
            return;
        } else
        {
            zze.zzkh().zzb("Discarded message for unknown namespace '%s'", new Object[] {
                b
            });
            return;
        }
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    vedCallback(vedCallback vedcallback, zze zze1, String s, String s1)
    {
        d = vedcallback;
        a = zze1;
        b = s;
        c = s1;
        super();
    }
}
