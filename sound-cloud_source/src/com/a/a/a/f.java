// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.g.b;
import b.a.a.a.d;

// Referenced classes of package com.a.a.a:
//            e, A

final class f
    implements Runnable
{

    final b a;
    final String b;
    final e c;

    f(e e1, b b1, String s)
    {
        c = e1;
        a = b1;
        b = s;
        super();
    }

    public final void run()
    {
        try
        {
            c.g.a(a, b);
            return;
        }
        catch (Exception exception)
        {
            d.a();
        }
    }
}
