// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            n, bf

final class p
    implements Runnable
{

    final bf a;
    final n b;

    p(n n1, bf bf)
    {
        b = n1;
        a = bf;
        super();
    }

    public final void run()
    {
        n.a(b, a);
    }
}
