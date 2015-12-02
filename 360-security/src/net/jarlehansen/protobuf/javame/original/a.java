// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame.original;


public final class a
{

    static final int a = a(2, 0);
    static final int b = a(3, 2);

    public static int a(int i)
    {
        return i & 7;
    }

    public static int a(int i, int j)
    {
        return i << 3 | j;
    }

    public static int b(int i)
    {
        return i >>> 3;
    }

}
