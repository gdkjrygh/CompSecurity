// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


final class Hashing
{

    private Hashing()
    {
    }

    static int smear(int i)
    {
        i ^= i >>> 20 ^ i >>> 12;
        return i >>> 7 ^ i ^ i >>> 4;
    }
}
