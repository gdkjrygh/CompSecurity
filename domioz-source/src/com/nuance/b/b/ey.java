// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            ex, fq

final class ey
    implements Runnable
{

    final fq a;
    final ex b;

    ey(ex ex1, fq fq)
    {
        b = ex1;
        a = fq;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
