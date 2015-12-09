// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.b.a.w;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.b.a.z;
import com.nuance.b.b.aq;
import com.nuance.b.e.a.a;
import com.nuance.b.e.a.b;

// Referenced classes of package com.nuance.b.e:
//            c, n, e

final class s
    implements z
{

    final c a;

    s(c c1)
    {
        a = c1;
        super();
    }

    public final void a(w w1)
    {
        Log.d("Nina", String.format("NinaObserver.onInterpretation [%d]", new Object[] {
            Long.valueOf(w1.b)
        }));
        com.nuance.b.e.c.a(w1.a);
        com.nuance.b.e.c.a(a, w1.b);
        if (c.A().d())
        {
            if (w1.a.b >= c.B())
            {
                c.A().b();
                a.a(false);
            }
            return;
        } else
        {
            com.nuance.b.e.c.a(a, w1.a);
            return;
        }
    }

    public final void a(x x1)
    {
        Log.d("Nina", String.format("NinaObserver.onInterpretationError [%d] -- %s", new Object[] {
            Long.valueOf(x1.a), x1.b
        }));
        com.nuance.b.e.c.a(a, x1.a);
        a.a(false);
        switch (com.nuance.b.e.e.b[x1.b.ordinal()])
        {
        default:
            x1 = (new StringBuilder("Error during interpretation. (")).append(x1.b).append(")  errorMessage: ").append(x1.c).toString();
            if (c.j(a))
            {
                c.c(a).reportResult(new a(x1));
            }
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return;
        }
    }
}
