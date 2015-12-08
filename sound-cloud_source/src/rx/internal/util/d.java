// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.Queue;
import rx.b.a;

// Referenced classes of package rx.internal.util:
//            c

final class d
    implements a
{

    final int a = 0;
    final int b = 0;
    final c c;

    d(c c1)
    {
        c = c1;
        super();
    }

    public final void call()
    {
        int k = 0;
        int i = 0;
        int l = c.a.size();
        if (l < a)
        {
            for (k = b; i < k - l; i++)
            {
                c.a.add(c.b());
            }

        } else
        if (l > b)
        {
            int i1 = b;
            for (int j = k; j < l - i1; j++)
            {
                c.a.poll();
            }

        }
    }
}
