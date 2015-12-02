// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a.a;

import java.util.Comparator;

// Referenced classes of package com.facebook.i.a.a:
//            b

final class c
    implements Comparator
{

    c()
    {
    }

    public int a(b b1, b b2)
    {
        if (b.a(b1) > b.a(b2))
        {
            return -1;
        }
        if (b.a(b1) < b.a(b2))
        {
            return 1;
        } else
        {
            return Integer.valueOf(b1.hashCode()).compareTo(Integer.valueOf(b2.hashCode()));
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((b)obj, (b)obj1);
    }
}
