// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


public final class b
{

    public final int a;
    public final int b;

    public b(int i, int j)
    {
        int k = j;
        if (j == 0xf5456b00)
        {
            k = j * -1;
        }
        a = i;
        b = k;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof b)
            {
                if (((b) (obj = (b)obj)).a != a || ((b) (obj)).b != b)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a * 29 + b;
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(",").append(s1).toString();
    }
}
