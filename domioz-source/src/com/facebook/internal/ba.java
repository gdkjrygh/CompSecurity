// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            s

public final class ba
{

    private boolean a;
    private String b;
    private boolean c;
    private Map d;
    private s e;

    private ba(boolean flag, String s, boolean flag1, Map map, s s1)
    {
        a = flag;
        b = s;
        c = flag1;
        d = map;
        e = s1;
    }

    ba(boolean flag, String s, boolean flag1, Map map, s s1, byte byte0)
    {
        this(flag, s, flag1, map, s1);
    }

    public final boolean a()
    {
        return a;
    }

    public final Map b()
    {
        return d;
    }

    public final s c()
    {
        return e;
    }
}
