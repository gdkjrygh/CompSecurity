// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class wF
{

    public final String KP;
    public final Object wF;

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(KP.hashCode()), Integer.valueOf(wF.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(KP).append(" value: ").append(wF.toString()).toString();
    }

    (String s, Object obj)
    {
        KP = s;
        wF = obj;
    }
}
