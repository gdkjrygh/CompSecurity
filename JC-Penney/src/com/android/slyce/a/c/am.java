// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;

// Referenced classes of package com.android.slyce.a.c:
//            al, aj, l, u, 
//            ai

class am
    implements c
{

    final a a;
    final al b;

    am(al al1, a a1)
    {
        b = al1;
        a = a1;
        super();
    }

    public void a(Exception exception, ag ag)
    {
        if (b.c.isDone())
        {
            b.c.a = new Exception((new StringBuilder()).append("internal error during connect to ").append(b.a).toString());
            a.a(null);
        } else
        {
            if (exception != null)
            {
                b.c.a = exception;
                a.a(null);
                return;
            }
            if (b.c.isDone() || b.c.isCancelled())
            {
                b.c.b.j.c("Recycling extra socket leftover from cancelled operation");
                com.android.slyce.a.c.ai.a(b.c.n, ag);
                com.android.slyce.a.c.ai.a(b.c.n, ag, b.c.b.j);
                return;
            }
            if (b.c.b(null, ag))
            {
                b.c.b.a.a(null, ag);
                return;
            }
        }
    }
}
