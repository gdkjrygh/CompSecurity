// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, DeviceStatus

class b
    implements Runnable
{

    final zze a;
    final DeviceStatus b;
    final atus c;

    public void run()
    {
        zze.zza(a, b);
    }

    atus(atus atus, zze zze1, DeviceStatus devicestatus)
    {
        c = atus;
        a = zze1;
        b = devicestatus;
        super();
    }
}
