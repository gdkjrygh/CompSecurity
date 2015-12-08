// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class wq
{

    public final String JO;
    public final Object wq;

    public boolean equals(Object obj)
    {
        if (obj instanceof wq)
        {
            if (JO.equals(((JO) (obj = (JO)obj)).JO) && wq.equals(((wq) (obj)).wq))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(JO.hashCode()), Integer.valueOf(wq.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(JO).append(" value: ").append(wq.toString()).toString();
    }

    (String s, Object obj)
    {
        JO = s;
        wq = obj;
    }
}
