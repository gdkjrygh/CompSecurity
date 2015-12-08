// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import b.a.a.a.a.d.d;
import b.a.a.a.a.d.l;
import b.a.a.a.a.g.b;
import java.util.UUID;

// Referenced classes of package com.a.a.a:
//            s

final class m extends d
{

    private b g;

    m(Context context, s s, b.a.a.a.a.b.m m1, l l)
    {
        super(context, s, m1, l);
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
