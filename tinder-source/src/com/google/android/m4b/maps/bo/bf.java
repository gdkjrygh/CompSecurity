// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


public final class bf
{

    final String a;
    final int b;

    public bf(String s, int i)
    {
        a = s;
        b = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bf)obj;
            if (a != ((bf) (obj)).a || b != ((bf) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 31) * 31 + b;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Icon{url=").append(a).append(", , scaleDownFactor=").append(b).append('}');
        return stringbuilder.toString();
    }
}
