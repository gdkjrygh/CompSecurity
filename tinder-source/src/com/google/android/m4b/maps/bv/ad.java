// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;


final class ad
{

    final String a;
    final int b;
    final int c;
    final int d;
    final int e;
    private final int f;

    public ad(String s, int i, int j, int k, int l)
    {
        a = s;
        f = (j << l + 1 | i | k << l + 2) ^ l ^ a.hashCode();
        b = i;
        c = j;
        d = k;
        e = l;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ad))
            {
                return false;
            }
            obj = (ad)obj;
            if (((ad) (obj)).b != b || ((ad) (obj)).c != c || ((ad) (obj)).d != d || ((ad) (obj)).e != e || !((ad) (obj)).a.equals(a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return f;
    }

    public final String toString()
    {
        String s = a;
        int i = e;
        int j = b;
        int k = c;
        int l = d;
        return (new StringBuilder(String.valueOf(s).length() + 69)).append("panoid=").append(s).append("&zoom=").append(i).append("&x=").append(j).append("&y=").append(k).append("&face=").append(l).toString();
    }
}
