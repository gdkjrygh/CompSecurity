// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.b:
//            A

public static final class b
{

    public final int a;
    public final int b;

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (b)obj;
            if (((b) (obj)).a == a && ((a) (obj)).b == b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }

    public .internal.zzw(int i, int j)
    {
        a = i;
        b = j;
    }
}
