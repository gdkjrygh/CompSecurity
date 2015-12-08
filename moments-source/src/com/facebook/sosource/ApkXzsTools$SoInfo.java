// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.sosource;


public final class e
{

    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public final boolean equals(Object obj)
    {
        if (obj instanceof e)
        {
            if (a == ((a) (obj = (a)obj)).a && c.equals(((c) (obj)).c) && d.equals(((d) (obj)).d) && e.equals(((e) (obj)).e))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return b + a + c.hashCode() + d.hashCode() + e.hashCode();
    }

    (String s, int i, String s1, int j, String s2)
    {
        c = s;
        a = i;
        d = s1;
        b = j;
        e = s2;
    }
}
