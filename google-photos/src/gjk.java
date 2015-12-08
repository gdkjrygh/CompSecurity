// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public final class gjk
{

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Set f;

    public gjk()
    {
        this(0, 0, 0, 0, 0, null);
    }

    private gjk(int i, int j, int k, int l, int i1, Set set)
    {
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
        f = set;
    }

    public gjk(int i, int j, int k, int l, int i1, Set set, byte byte0)
    {
        this(i, 0, 0, l, i1, set);
    }
}
