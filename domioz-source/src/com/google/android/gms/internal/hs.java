// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

public final class hs
{

    public final int a;
    public final int b;

    public hs(int i, int j)
    {
        a = i;
        b = j;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof hs)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (hs)obj;
            if (((hs) (obj)).a == a && ((hs) (obj)).b == b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }
}
