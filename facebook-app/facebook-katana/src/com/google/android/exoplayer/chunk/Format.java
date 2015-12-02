// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.util.Assertions;

public class Format
{

    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;

    public Format(String s, String s1, int k, int l, float f1, int i1, int j1, 
            int k1, String s2, String s3)
    {
        a = (String)Assertions.a(s);
        b = s1;
        d = k;
        e = l;
        f = f1;
        g = i1;
        h = j1;
        c = k1;
        j = s2;
        i = s3;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return ((Format)obj).a.equals(a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
