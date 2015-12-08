// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import java.io.Reader;

// Referenced classes of package com.google.a.c:
//            g, e

public abstract class d
{

    protected d()
    {
    }

    public abstract Reader a();

    public final String b()
    {
        g g1 = g.a();
        String s = e.a((Reader)g1.a(a()));
        g1.close();
        return s;
        Object obj;
        obj;
        throw g1.a(((Throwable) (obj)));
        obj;
        g1.close();
        throw obj;
    }
}
