// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.b;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.b.c.b:
//            c, b

final class d
    implements Serializable, Comparator
{

    private d()
    {
    }

    d(b b)
    {
        this();
    }

    public int a(c c1, c c2)
    {
        return c1.c() - c2.c();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c)obj, (c)obj1);
    }
}
