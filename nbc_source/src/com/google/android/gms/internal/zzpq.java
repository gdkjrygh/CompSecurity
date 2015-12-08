// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzpr

public final class zzpq
{

    public static final Api API;
    public static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    public static final com.google.android.gms.common.api.Api.zza zzNY;
    static final com.google.android.gms.common.api.Api.zza zzaJO;
    public static final zzpr zzaJP = new zzg();
    public static final Api zzada;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajz;

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzajz = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

        };
        zzaJO = new com.google.android.gms.common.api.Api.zza() {

        };
        API = new Api("SignIn.API", zzNY, zzNX, new Scope[0]);
        zzada = new Api("SignIn.INTERNAL_API", zzaJO, zzajz, new Scope[0]);
    }
}
