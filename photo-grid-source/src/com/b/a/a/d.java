// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.f;
import a.a.a.a.s;

// Referenced classes of package com.b.a.a:
//            b, l, w

final class d
    implements Runnable
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        try
        {
            w w1 = a.b;
            a.b = new l();
            w1.c();
            return;
        }
        catch (Exception exception)
        {
            f.d().b("Answers", "Failed to disable events", exception);
        }
    }
}
