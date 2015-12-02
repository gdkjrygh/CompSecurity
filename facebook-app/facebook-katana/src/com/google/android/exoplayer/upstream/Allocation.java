// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;


public final class Allocation
{

    public final byte a[];
    private final int b;

    public Allocation(byte abyte0[], int i)
    {
        a = abyte0;
        b = i;
    }

    public final int a(int i)
    {
        return b + i;
    }
}
