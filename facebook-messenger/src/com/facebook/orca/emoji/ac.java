// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;


public class ac
{

    public final int a;
    public final int b;

    public ac(int i, int j)
    {
        a = i;
        b = j;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ac)obj;
            if (b != ((ac) (obj)).b)
            {
                return false;
            }
            if (a != ((ac) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a * 31 + b;
    }
}
