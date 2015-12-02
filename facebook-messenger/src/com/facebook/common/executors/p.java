// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;


// Referenced classes of package com.facebook.common.executors:
//            n, q, r

class p
    implements Runnable
{

    final q a;
    final r b;
    final n c;

    p(n n1, q q, r r)
    {
        c = n1;
        a = q;
        b = r;
        super();
    }

    public void run()
    {
        n.a(c, a, b);
    }
}
