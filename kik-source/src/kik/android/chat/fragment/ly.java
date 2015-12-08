// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.f.q;
import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            lw, KikIqFragmentBase

final class ly
    implements Runnable
{

    final Throwable a;
    final lw b;

    ly(lw lw1, Throwable throwable)
    {
        b = lw1;
        a = throwable;
        super();
    }

    public final void run()
    {
        if (a instanceof q)
        {
            q q1 = (q)a;
            b.a.a(b.a.R, (String)q1.b());
            return;
        } else
        {
            String s = cy.a(a);
            b.a.Q = s;
            return;
        }
    }
}
