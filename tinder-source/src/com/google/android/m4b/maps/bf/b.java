// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import com.google.android.m4b.maps.bo.ac;

public final class b
{

    public final ac a;
    public final boolean b;
    public final long c;

    public b(ac ac, long l, boolean flag)
    {
        a = ac;
        b = flag;
        c = l;
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        boolean flag = b;
        long l = c;
        return (new StringBuilder(String.valueOf(s).length() + 55)).append(s).append(", isLocalRequest=").append(flag).append(", fetchToken=").append(l).toString();
    }
}
