// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name

public final class Name3 extends Name
{

    private final int q1;
    private final int q2;
    private final int q3;

    Name3(String s, int i, int j, int k, int l)
    {
        super(s, i);
        q1 = j;
        q2 = k;
        q3 = l;
    }

    public boolean equals(int i)
    {
        return false;
    }

    public boolean equals(int i, int j)
    {
        return false;
    }

    public boolean equals(int ai[], int i)
    {
        return i == 3 && ai[0] == q1 && ai[1] == q2 && ai[2] == q3;
    }
}
