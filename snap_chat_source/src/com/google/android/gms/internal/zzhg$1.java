// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzhg, zzgh

class zzyX
    implements Runnable
{

    final Thread zzyX;
    final zzhg zzyY;

    public void run()
    {
        zzgh.zza(zzhg.zza(zzyY), zzyX, zzhg.zzb(zzyY));
    }

    (zzhg zzhg1, Thread thread)
    {
        zzyY = zzhg1;
        zzyX = thread;
        super();
    }
}
