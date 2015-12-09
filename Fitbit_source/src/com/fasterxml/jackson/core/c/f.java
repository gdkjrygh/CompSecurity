// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.c;


// Referenced classes of package com.fasterxml.jackson.core.c:
//            c

public final class f extends c
{

    final int c;
    final int d;
    final int e;

    f(String s, int i, int j, int k, int l)
    {
        super(s, i);
        c = j;
        d = k;
        e = l;
    }

    public boolean a(int i)
    {
        return false;
    }

    public boolean a(int i, int j)
    {
        return false;
    }

    public boolean a(int ai[], int i)
    {
        return i == 3 && ai[0] == c && ai[1] == d && ai[2] == e;
    }
}
