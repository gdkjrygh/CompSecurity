// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import java.util.Map;

// Referenced classes of package com.facebook.b:
//            t, am

public class ap
{

    private boolean a;
    private String b;
    private boolean c;
    private Map d;
    private t e;

    private ap(boolean flag, String s, boolean flag1, Map map, t t)
    {
        a = flag;
        b = s;
        c = flag1;
        d = map;
        e = t;
    }

    ap(boolean flag, String s, boolean flag1, Map map, t t, am am)
    {
        this(flag, s, flag1, map, t);
    }

    public boolean a()
    {
        return a;
    }

    public t b()
    {
        return e;
    }
}
