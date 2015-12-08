// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Scope;

public final class lpb
{

    public static final jyi a;
    public static final Scope b = new Scope("profile");
    public static final Scope c = new Scope("email");
    private static jym d;
    private static jym e;
    private static jyi f;

    static 
    {
        d = new jym();
        e = new jym();
        a = new lpc();
        f = new lpd();
        new jyh("SignIn.API", a, d);
        new jyh("SignIn.INTERNAL_API", f, e);
    }
}
