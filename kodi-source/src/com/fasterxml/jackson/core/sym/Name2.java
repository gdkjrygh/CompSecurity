// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name

public final class Name2 extends Name
{

    private final int q1;
    private final int q2;

    Name2(String s, int i, int j, int k)
    {
        super(s, i);
        q1 = j;
        q2 = k;
    }

    public boolean equals(int i)
    {
        return false;
    }

    public boolean equals(int i, int j)
    {
        return i == q1 && j == q2;
    }

    public boolean equals(int ai[], int i)
    {
        return i == 2 && ai[0] == q1 && ai[1] == q2;
    }
}
