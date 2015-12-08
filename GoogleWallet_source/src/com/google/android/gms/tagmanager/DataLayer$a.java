// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class wE
{

    public final String TN;
    public final Object wE;

    public final boolean equals(Object obj)
    {
        if (obj instanceof wE)
        {
            if (TN.equals(((TN) (obj = (TN)obj)).TN) && wE.equals(((wE) (obj)).wE))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(TN.hashCode()), Integer.valueOf(wE.hashCode())
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Key: ")).append(TN).append(" value: ").append(wE.toString()).toString();
    }

    (String s, Object obj)
    {
        TN = s;
        wE = obj;
    }
}
