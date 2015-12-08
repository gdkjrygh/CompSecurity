// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class Xz
{

    public final String Xy;
    public final Object Xz;

    public boolean equals(Object obj)
    {
        if (obj instanceof Xz)
        {
            if (Xy.equals(((Xy) (obj = (Xy)obj)).Xy) && Xz.equals(((Xz) (obj)).Xz))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(Xy.hashCode()), Integer.valueOf(Xz.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(Xy).append(" value: ").append(Xz.toString()).toString();
    }

    (String s, Object obj)
    {
        Xy = s;
        Xz = obj;
    }
}
