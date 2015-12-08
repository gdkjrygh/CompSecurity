// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;


// Referenced classes of package com.leanplum:
//            Var

final class aS
    implements Runnable
{

    private Var a;

    aS(Var var)
    {
        a = var;
        super();
    }

    public final void run()
    {
        Var.a(a);
    }
}
