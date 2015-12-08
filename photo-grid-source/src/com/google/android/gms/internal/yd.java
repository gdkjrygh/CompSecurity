// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

final class yd
{

    final int a;
    final byte b[];

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof yd))
            {
                return false;
            }
            obj = (yd)obj;
            if (a != ((yd) (obj)).a || !Arrays.equals(b, ((yd) (obj)).b))
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
