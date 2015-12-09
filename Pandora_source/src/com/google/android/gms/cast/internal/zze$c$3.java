// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            zze, ApplicationStatus

class b
    implements Runnable
{

    final zze a;
    final ApplicationStatus b;
    final ionStatus c;

    public void run()
    {
        zze.zza(a, b);
    }

    ionStatus(ionStatus ionstatus, zze zze1, ApplicationStatus applicationstatus)
    {
        c = ionstatus;
        a = zze1;
        b = applicationstatus;
        super();
    }
}
