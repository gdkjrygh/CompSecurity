// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import a.a.at;
import a.a.bc;
import a.a.df;
import a.a.dh;

// Referenced classes of package com.appboy:
//            f

public class e
{

    private static final String c;
    final Object a = new Object();
    volatile String b;
    private final dh d;
    private final at e;
    private final df f;
    private final bc g;

    e(dh dh, at at, String s, bc bc, df df)
    {
        b = s;
        d = dh;
        e = at;
        g = bc;
        f = df;
    }

    public final String a()
    {
        String s;
        synchronized (a)
        {
            s = b;
        }
        return s;
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            f.a, com/appboy/e.getName()
        });
    }
}
