// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.br;

import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.br:
//            b

public final class d
{

    public final bb a;
    final b b;

    public d(bb bb1, b b1)
    {
        j.a(bb1);
        a = bb1;
        b = b1;
    }

    public final int a()
    {
        return a.e();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (d)obj;
            if (!a.equals(((d) (obj)).a) || !com.google.android.m4b.maps.br.b.a(b, ((d) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = a.hashCode();
        int i = k;
        if (b != null)
        {
            i = k * 31 + b.hashCode();
        }
        return i;
    }
}
