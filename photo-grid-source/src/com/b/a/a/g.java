// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.f;
import a.a.a.a.s;

// Referenced classes of package com.b.a.a:
//            b, w, y

final class g
    implements Runnable
{

    final y a;
    final boolean b;
    final b c;

    g(b b1, y y, boolean flag)
    {
        c = b1;
        a = y;
        b = flag;
        super();
    }

    public final void run()
    {
        try
        {
            c.b.a(a);
            if (b)
            {
                c.b.e();
            }
            return;
        }
        catch (Exception exception)
        {
            f.d().b("Answers", "Failed to process event", exception);
        }
    }
}
