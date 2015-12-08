// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;


public final class HashAccumulator
{

    static int PRIME = 31;
    public int mHash;

    public HashAccumulator()
    {
        mHash = 1;
    }

    public final HashAccumulator addBoolean(boolean flag)
    {
        int j = PRIME;
        int k = mHash;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mHash = i + k * j;
        return this;
    }

    public final HashAccumulator addObject(Object obj)
    {
        int j = PRIME;
        int k = mHash;
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        mHash = i + k * j;
        return this;
    }

}
