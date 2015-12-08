// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.y;
import java.io.IOException;

// Referenced classes of package com.c.a.a.b:
//            k

final class l extends c.l
{

    final k a;

    l(k k1, y y)
    {
        a = k1;
        super(y);
    }

    public final long a(e e, long l1)
        throws IOException
    {
        if (a.a != 0)
        {
            if ((l1 = super.a(e, Math.min(l1, a.a))) != -1L)
            {
                a.a = (int)((long)a.a - l1);
                return l1;
            }
        }
        return -1L;
    }
}
