// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.d;

// Referenced classes of package com.a.a.a:
//            e, A

final class j
    implements Runnable
{

    final B.a a;
    final boolean b;
    final e c;

    j(e e1, B.a a1, boolean flag)
    {
        c = e1;
        a = a1;
        b = flag;
        super();
    }

    public final void run()
    {
        try
        {
            c.g.a(a);
            if (b)
            {
                c.g.e();
            }
            return;
        }
        catch (Exception exception)
        {
            d.a();
        }
    }
}
