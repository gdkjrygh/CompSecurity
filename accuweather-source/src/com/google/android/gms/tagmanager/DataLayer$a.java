// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class afe
{

    public final String JI;
    public final Object afe;

    public boolean equals(Object obj)
    {
        if (obj instanceof afe)
        {
            if (JI.equals(((JI) (obj = (JI)obj)).JI) && afe.equals(((afe) (obj)).afe))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(JI.hashCode()), Integer.valueOf(afe.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(JI).append(" value: ").append(afe.toString()).toString();
    }

    (String s, Object obj)
    {
        JI = s;
        afe = obj;
    }
}
