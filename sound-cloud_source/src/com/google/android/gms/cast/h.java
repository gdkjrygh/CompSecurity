// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.b.k;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.cast:
//            i, j, CastDevice

public final class h
{
    public static final class a
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        final CastDevice a;
        final b b;
    }

    public static interface b
    {
    }

    public static interface c
        extends Result
    {
    }


    public static final Api a;
    public static final j b;
    private static final com.google.android.gms.common.api.Api.zzc c;
    private static final com.google.android.gms.common.api.Api.zza d;

    static 
    {
        c = new com.google.android.gms.common.api.Api.zzc();
        d = new i();
        a = new Api("CastRemoteDisplay.API", d, c);
        b = new k(c);
    }
}
