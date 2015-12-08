// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            z, bf, af

public static final class  extends 
{

    public final  a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }

    public final  a(Map map)
    {
        super.a(map);
        return this;
    }

    public final af a()
    {
        switch (b)
        {
        default:
            return new bf(b, a);

        case 0: // '\0'
            return z.j();

        case 1: // '\001'
            return z.c(a[0].getKey(), a[0].getValue());
        }
    }

    public ()
    {
    }
}
