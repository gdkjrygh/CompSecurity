// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.c;


// Referenced classes of package com.fasterxml.jackson.core.c:
//            c

public final class d extends c
{

    static final d c = new d("", 0, 0);
    final int d;

    d(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    static d b()
    {
        return c;
    }

    public boolean a(int i)
    {
        return i == d;
    }

    public boolean a(int i, int j)
    {
        return i == d && j == 0;
    }

    public boolean a(int ai[], int i)
    {
        return i == 1 && ai[0] == d;
    }

}
