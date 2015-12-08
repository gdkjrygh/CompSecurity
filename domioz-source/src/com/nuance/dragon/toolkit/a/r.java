// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.e;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            q, e, p

final class r extends l
{

    final String a;
    final q b;

    r(q q1, String s)
    {
        b = q1;
        a = s;
        super();
    }

    public final void a()
    {
    }

    public final void a(b b1)
    {
        int i = q.a(b).a(this);
_L1:
        int j;
        j = i - 1;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (com.nuance.dragon.toolkit.a.q.b(b) == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        q.d(b).a(a, (g)q.a(b).b(q.c(b)), false);
        i = j;
          goto _L1
        com.nuance.dragon.toolkit.a.q.e(b).add(q.a(b).b(q.c(b)));
        i = j;
          goto _L1
        b1;
        e.a(b, (new StringBuilder("Error sending audio for param ")).append(a).toString(), b1);
        q.f(b);
        h();
        if (com.nuance.dragon.toolkit.a.q.b(b) != null)
        {
            com.nuance.dragon.toolkit.a.q.b(b).a(b, true);
            com.nuance.dragon.toolkit.a.q.g(b);
        } else
        {
            q.h(b)[0] = Boolean.valueOf(true);
        }
        q.i(b);
    }

    public final void b(b b1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        a(b1);
        q.f(b);
        h();
        flag = flag1;
        if (com.nuance.dragon.toolkit.a.q.b(b) == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        q.d(b).a(a, null, true);
        flag = flag1;
_L2:
        if (com.nuance.dragon.toolkit.a.q.b(b) != null)
        {
            com.nuance.dragon.toolkit.a.q.b(b).a(b, flag);
            com.nuance.dragon.toolkit.a.q.g(b);
        }
        q.i(b);
        return;
        b1;
        q.h(b)[0] = Boolean.valueOf(true);
        e.a(b, (new StringBuilder("Error sending audio for param ")).append(a).toString(), b1);
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
