// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package client.core.model;

import java.util.ArrayList;

// Referenced classes of package client.core.model:
//            b, c, d

public final class a
{

    ArrayList a;
    boolean b;
    private long c;
    private long d;
    private long e;
    private String f;

    public a()
    {
        c = 0L;
        d = 0L;
        e = 0L;
        f = "TRACER";
        a = new ArrayList();
        b = true;
        c = System.currentTimeMillis();
        a();
        a(".");
    }

    public final a a()
    {
        a = new ArrayList();
        int i = b.a;
        switch (c.a[i - 1])
        {
        default:
            return this;

        case 1: // '\001'
            d = System.currentTimeMillis();
            return this;

        case 2: // '\002'
            e = System.currentTimeMillis();
            break;
        }
        return this;
    }

    public final a a(String s)
    {
        a.add(new d(this, s));
        return this;
    }
}
