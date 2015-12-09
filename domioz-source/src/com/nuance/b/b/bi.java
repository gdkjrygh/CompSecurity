// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            bc, bk

final class bi
    implements Runnable
{

    final bc a;

    bi(bc bc1)
    {
        a = bc1;
        super();
    }

    public final void run()
    {
        bc.a(a).a();
        bc.b(a);
    }
}
