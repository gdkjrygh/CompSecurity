// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;


public class b
{

    public final int a;
    public final int b;

    public String toString()
    {
        return (new StringBuilder("[ Class Load Attempts:")).append(a).append("Secondary Dex Queries:").append(b).append(" ]").toString();
    }

    public (int i, int j)
    {
        a = i;
        b = j;
    }
}
