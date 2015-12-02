// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            p, j, ap

class q
    implements Runnable
{

    final ap a;
    final p b;

    q(p p1, ap ap)
    {
        b = p1;
        a = ap;
        super();
    }

    public void run()
    {
        b.a.b(a);
    }
}
