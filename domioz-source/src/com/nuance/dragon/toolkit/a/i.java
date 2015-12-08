// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;


// Referenced classes of package com.nuance.dragon.toolkit.a:
//            h, d, t

final class i
    implements Runnable
{

    final String a;
    final h b;

    i(h h1, String s)
    {
        b = h1;
        a = s;
        super();
    }

    public final void run()
    {
        d.a(b.a, a);
        d.a(b.a, t.a);
    }
}
