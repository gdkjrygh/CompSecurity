// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.g.b;
import a.a.a.a.f;
import a.a.a.a.s;

// Referenced classes of package com.b.a.a:
//            b, w

final class c
    implements Runnable
{

    final b a;
    final String b;
    final com.b.a.a.b c;

    c(com.b.a.a.b b1, b b2, String s1)
    {
        c = b1;
        a = b2;
        b = s1;
        super();
    }

    public final void run()
    {
        try
        {
            c.b.a(a, b);
            return;
        }
        catch (Exception exception)
        {
            f.d().b("Answers", "Failed to set analytics settings data", exception);
        }
    }
}
