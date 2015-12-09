// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.b.l;
import b.a.a.a.a.g.b;

// Referenced classes of package com.a.a.a:
//            q, l, a

final class r
    implements Runnable
{

    final b a;
    final String b;
    final q c;

    r(q q1, b b1, String s)
    {
        c = q1;
        a = b1;
        b = s;
        super();
    }

    public final void run()
    {
        try
        {
            ((com.a.a.a.l)q.a(c)).a(a, b);
            return;
        }
        catch (Exception exception)
        {
            l.b(com.a.a.a.a.b().w(), "Crashlytics failed to set analytics settings data.");
        }
    }
}
