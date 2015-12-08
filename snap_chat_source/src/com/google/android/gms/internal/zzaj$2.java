// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzaj, zzic

class zznT
    implements Runnable
{

    final String zznQ;
    final zzaj zznS;
    final String zznT;

    public void run()
    {
        zzaj.zza(zznS).zzb(zznQ, zznT);
    }

    (zzaj zzaj1, String s, String s1)
    {
        zznS = zzaj1;
        zznQ = s;
        zznT = s1;
        super();
    }
}
