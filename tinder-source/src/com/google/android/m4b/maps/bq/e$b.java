// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bl;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            e

public static final class h extends ac
{

    final bl h;

    public final ac a(af af)
    {
        return new <init>(super.a(af), h);
    }

    public final boolean a(h h1)
    {
        return h == h1.h;
    }

    public final boolean equals(Object obj)
    {
        while (obj == this || (obj instanceof h) && super.equals(obj) && a((a)obj)) 
        {
            return true;
        }
        return false;
    }

    public final int hashCode()
    {
        return super.hashCode() * 37 + h.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("[layer: ")).append(h.a);
        stringbuilder.append(" params: ");
        String as[] = h.b;
        for (int i = 0; i < as.length; i += 2)
        {
            stringbuilder.append(as[i]).append('=').append(as[i + 1]);
        }

        stringbuilder.append(" coords: ").append(super.toString()).append(']');
        return stringbuilder.toString();
    }

    private (ac ac1, bl bl1)
    {
        super(ac1.a, ac1.b, ac1.c, ac1.d);
        h = bl1;
    }
}
