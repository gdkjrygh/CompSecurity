// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.h;

// Referenced classes of package com.google.android.gms.signin:
//            c, d, e

public final class b
{

    public static final com.google.android.gms.common.api.Api.zzc a;
    public static final com.google.android.gms.common.api.Api.zzc b;
    public static final com.google.android.gms.common.api.Api.zza c;
    static final com.google.android.gms.common.api.Api.zza d;
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final Api g;
    public static final Api h;
    public static final e i = new h();

    static 
    {
        a = new com.google.android.gms.common.api.Api.zzc();
        b = new com.google.android.gms.common.api.Api.zzc();
        c = new c();
        d = new d();
        g = new Api("SignIn.API", c, a);
        h = new Api("SignIn.INTERNAL_API", d, b);
    }
}
