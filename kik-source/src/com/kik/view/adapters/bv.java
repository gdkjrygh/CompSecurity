// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;


// Referenced classes of package com.kik.view.adapters:
//            bu, bf

final class bv
    implements Runnable
{

    final bu a;

    bv(bu bu1)
    {
        a = bu1;
        super();
    }

    public final void run()
    {
        a.c.a(a.a, a.b, true);
    }
}
