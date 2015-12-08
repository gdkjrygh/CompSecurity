// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import b.a.a.a.a.b.m;
import b.a.a.a.a.d.d;
import b.a.a.a.a.d.g;
import b.a.a.a.a.g.b;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.a.a.a:
//            D

final class x extends d
{

    b a;

    x(Context context, D d1, m m1, g g)
        throws IOException
    {
        super(context, d1, m1, g);
    }

    protected final String a()
    {
        UUID uuid = UUID.randomUUID();
        return (new StringBuilder("sa_")).append(uuid.toString()).append("_").append(d.a()).append(".tap").toString();
    }

    protected final int b()
    {
        if (a == null)
        {
            return super.b();
        } else
        {
            return a.e;
        }
    }

    protected final int c()
    {
        if (a == null)
        {
            return super.c();
        } else
        {
            return a.c;
        }
    }
}
