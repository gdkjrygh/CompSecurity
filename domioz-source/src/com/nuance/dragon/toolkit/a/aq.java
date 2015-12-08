// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;


// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ap, ar, x, aa, 
//            an

final class aq
    implements Runnable
{

    final an a;
    final ap b;

    aq(ap ap1, an an)
    {
        b = ap1;
        a = an;
        super();
    }

    public final void run()
    {
        if (ap.b(b))
        {
            b.a(new ar(b.a, b.b));
            b.b.i().a(b.b, a);
        }
    }
}
