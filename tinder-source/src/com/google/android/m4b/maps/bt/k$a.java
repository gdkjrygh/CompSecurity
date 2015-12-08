// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import com.google.android.m4b.maps.j.v;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            k

public static final class b
{

    public long a;
    public long b;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (!v.a(Long.valueOf(a), Long.valueOf(((a) (obj)).a)) || !v.a(Long.valueOf(b), Long.valueOf(((b) (obj)).b)))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(a), Long.valueOf(b)
        });
    }

    public (long l, long l1)
    {
        a = l;
        b = l1;
    }
}
