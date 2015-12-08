// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.d;
import com.google.android.gms.signin.internal.m;

// Referenced classes of package com.google.android.gms.internal:
//            xf, xg, xh

public final class xe
{

    public static final d a;
    public static final d b;
    public static final b c;
    static final b d;
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope("email");
    public static final a g;
    public static final a h;
    public static final xh i = new m();

    static 
    {
        a = new d();
        b = new d();
        c = new xf();
        d = new xg();
        g = new a("SignIn.API", c, a);
        h = new a("SignIn.INTERNAL_API", d, b);
    }
}
