// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            bk, bc

final class bj
    implements Runnable
{

    final bc a;

    bj(bc bc1)
    {
        a = bc1;
        super();
    }

    public final void run()
    {
        bc.a(a, new bk(a));
    }
}
