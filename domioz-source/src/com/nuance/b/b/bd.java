// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            bc, bl

final class bd
    implements Runnable
{

    final bc a;

    bd(bc bc1)
    {
        a = bc1;
        super();
    }

    public final void run()
    {
        bc.c(a).a();
    }
}
