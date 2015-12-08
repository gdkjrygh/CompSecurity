// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.friends.ui:
//            MessagesFragment

static class b
{

    private List a;
    private List b;
    private boolean c;

    static List a(b b1)
    {
        return b1.b;
    }

    static List a(b b1, List list)
    {
        b1.a = list;
        return list;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.c = flag;
        return flag;
    }

    static List b(c c1, List list)
    {
        c1.b = list;
        return list;
    }

    static boolean b(b b1)
    {
        return b1.c;
    }

    static List c(c c1)
    {
        return c1.a;
    }

    ()
    {
        a = new ArrayList();
        b = new ArrayList();
    }
}
