// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            bl

final class bm
    implements Runnable
{

    final bl a;

    bm(bl bl1)
    {
        a = bl1;
        super();
    }

    public final void run()
    {
        bl.a(a);
    }
}
