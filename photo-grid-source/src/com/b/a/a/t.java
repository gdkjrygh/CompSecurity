// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.q;
import a.a.a.a.a.d.d;
import a.a.a.a.a.d.h;
import a.a.a.a.a.g.b;
import android.content.Context;
import java.util.UUID;

// Referenced classes of package com.b.a.a:
//            ab

final class t extends d
{

    private b g;

    t(Context context, ab ab, q q1, h h)
    {
        super(context, ab, q1, h);
    }

    protected final String a()
    {
        UUID uuid = UUID.randomUUID();
        return (new StringBuilder("sa_")).append(uuid.toString()).append("_").append(c.a()).append(".tap").toString();
    }

    final void a(b b1)
    {
        g = b1;
    }

    protected final int b()
    {
        if (g == null)
        {
            return super.b();
        } else
        {
            return g.e;
        }
    }

    protected final int c()
    {
        if (g == null)
        {
            return super.c();
        } else
        {
            return g.c;
        }
    }
}
