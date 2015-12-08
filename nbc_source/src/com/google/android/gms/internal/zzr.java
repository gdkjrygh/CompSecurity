// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzi

public class zzr extends Exception
{

    private long zzC;
    public final zzi zzaj;

    public zzr()
    {
        zzaj = null;
    }

    public zzr(zzi zzi)
    {
        zzaj = zzi;
    }

    public zzr(Throwable throwable)
    {
        super(throwable);
        zzaj = null;
    }

    void zza(long l)
    {
        zzC = l;
    }
}
