// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;


public final class a
{

    private int a;

    public a()
    {
        a = 0;
    }

    public final int a()
    {
        return a;
    }

    public final a a(int i, int j)
    {
        if (a != 0)
        {
            return this;
        }
        if (i < j)
        {
            i = -1;
        } else
        if (i > j)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = i;
        return this;
    }
}
