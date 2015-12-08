// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.a;

import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.d.a;
import org.json.JSONObject;

public final class g
    implements a
{

    private final an a;
    private final int b;

    public g(an an)
    {
        this(an, (byte)0);
    }

    private g(an an, byte byte0)
    {
        b = 0;
        a = an;
    }

    public final int a()
    {
        return b;
    }

    public final an b()
    {
        return a;
    }

    public final JSONObject c()
    {
        com.nuance.dragon.toolkit.d.a.a a1 = new com.nuance.dragon.toolkit.d.a.a();
        a1.a("type", Integer.valueOf(b));
        a1.a("transaction_error", a);
        return a1;
    }
}
