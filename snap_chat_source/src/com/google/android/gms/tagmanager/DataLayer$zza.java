// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class zzzt
{

    public final String zzqd;
    public final Object zzzt;

    public final boolean equals(Object obj)
    {
        if (obj instanceof zzzt)
        {
            if (zzqd.equals(((zzqd) (obj = (zzqd)obj)).zzqd) && zzzt.equals(((zzzt) (obj)).zzzt))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(zzqd.hashCode()), Integer.valueOf(zzzt.hashCode())
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Key: ")).append(zzqd).append(" value: ").append(zzzt.toString()).toString();
    }

    (String s, Object obj)
    {
        zzqd = s;
        zzzt = obj;
    }
}
