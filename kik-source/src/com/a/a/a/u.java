// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.b.j;
import b.a.a.a.a.g.b;

// Referenced classes of package com.a.a.a:
//            t, p, a

final class u
    implements Runnable
{

    final b a;
    final String b;
    final t c;

    u(t t1, b b1, String s)
    {
        c = t1;
        a = b1;
        b = s;
        super();
    }

    public final void run()
    {
        try
        {
            ((p)t.a(c)).a(a, b);
            return;
        }
        catch (Exception exception)
        {
            j.a(com.a.a.a.a.c().v(), "Crashlytics failed to set analytics settings data.");
        }
    }
}
