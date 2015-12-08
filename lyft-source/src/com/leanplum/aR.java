// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;


// Referenced classes of package com.leanplum:
//            aT, Var

final class aR
    implements aT
{

    private final int a;
    private final String b;
    private final byte c[];

    aR(int i, String s, byte abyte0[])
    {
        a = i;
        b = s;
        c = abyte0;
        super();
    }

    public final void a(Var var)
    {
        var.b = true;
        var.c = a;
        var.d = b;
        Var.a(var, c);
    }
}
