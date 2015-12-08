// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name

public final class Name1 extends Name
{

    static final Name1 sEmptyName = new Name1("", 0, 0);
    final int mQuad;

    Name1(String s, int i, int j)
    {
        super(s, i);
        mQuad = j;
    }

    static Name1 getEmptyName()
    {
        return sEmptyName;
    }

    public boolean equals(int i)
    {
        return i == mQuad;
    }

    public boolean equals(int i, int j)
    {
        return i == mQuad && j == 0;
    }

    public boolean equals(int ai[], int i)
    {
        return i == 1 && ai[0] == mQuad;
    }

}
