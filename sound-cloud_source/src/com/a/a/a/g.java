// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.d;

// Referenced classes of package com.a.a.a:
//            e, p, A

final class g
    implements Runnable
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        try
        {
            A a1 = a.g;
            a.g = new p();
            a1.c();
            return;
        }
        catch (Exception exception)
        {
            d.a();
        }
    }
}
