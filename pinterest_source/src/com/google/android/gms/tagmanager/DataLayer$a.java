// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class wF
{

    public final String KP;
    public final Object wF;

    public final boolean equals(Object obj)
    {
        if (obj instanceof wF)
        {
            if (KP.equals(((KP) (obj = (KP)obj)).KP) && wF.equals(((wF) (obj)).wF))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(KP.hashCode()), Integer.valueOf(wF.hashCode())
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Key: ")).append(KP).append(" value: ").append(wF.toString()).toString();
    }

    (String s, Object obj)
    {
        KP = s;
        wF = obj;
    }
}
