// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import java.util.EnumSet;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            al

public class am
{

    private final EnumSet a;
    private final int b;
    private final int c;
    private final long d;
    private final boolean e;

    public am(EnumSet enumset, int i, int j, long l, boolean flag)
    {
        a = enumset;
        b = i;
        c = j;
        d = l;
        e = flag;
    }

    static int a(am am1)
    {
        return am1.b;
    }

    static int b(am am1)
    {
        return am1.c;
    }

    static long c(am am1)
    {
        return am1.d;
    }

    public boolean a()
    {
        return a.contains(al.FAVORITE_FRIENDS);
    }

    public boolean b()
    {
        return a.contains(al.TOP_FRIENDS);
    }

    public boolean c()
    {
        return e;
    }

    public boolean d()
    {
        return a.contains(al.ONLINE_FRIENDS);
    }

    public boolean e()
    {
        return a.contains(al.MOBILE_FRIENDS);
    }

    public boolean f()
    {
        return a.contains(al.OTHER_CONTACTS);
    }

    public boolean g()
    {
        return a.contains(al.TOP_GROUPS);
    }
}
