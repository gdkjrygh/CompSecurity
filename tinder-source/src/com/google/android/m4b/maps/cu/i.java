// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cu;

import java.util.Arrays;

final class i
{

    final int a;
    final byte b[];

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof i))
            {
                return false;
            }
            obj = (i)obj;
            if (a != ((i) (obj)).a || !Arrays.equals(b, ((i) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (a + 527) * 31 + Arrays.hashCode(b);
    }
}
