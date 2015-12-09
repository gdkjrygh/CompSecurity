// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.a;


public final class a
{

    public int a;
    public int b;
    public com.aviary.android.feather.library.filters.a c;

    public a(com.aviary.android.feather.library.filters.a a1, int i, int j)
    {
        c = a1;
        b = i;
        a = j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{name: ").append(c).append("}").toString();
    }
}
