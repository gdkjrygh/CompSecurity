// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzb

static final class zzCI extends Exception
{

    private final int zzCI;

    public int getErrorCode()
    {
        return zzCI;
    }

    public _cls9(String s, int i)
    {
        super(s);
        zzCI = i;
    }
}
