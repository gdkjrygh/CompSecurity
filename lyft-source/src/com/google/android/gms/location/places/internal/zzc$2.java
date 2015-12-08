// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzm;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class b extends com.google.android.gms.location.places.c
{

    final String b[];
    final zzc c;

    protected void a(zzd zzd1)
    {
        java.util.List list = Arrays.asList(b);
        zzd1.a(new zzm(this, zzd1.i()), list);
    }

    protected void b(com.google.android.gms.common.api.ient ient)
    {
        a((zzd)ient);
    }

    (zzc zzc1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, String as[])
    {
        c = zzc1;
        b = as;
        super(ientkey, googleapiclient);
    }
}
