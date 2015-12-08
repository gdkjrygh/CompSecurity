// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Collection;

// Referenced classes of package com.c.a.b:
//            o, c, ak, f, 
//            k

public abstract class j extends o
    implements c
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    j()
    {
    }

    public static j a(Object obj, Object obj1)
    {
        return new ak(obj, obj1);
    }

    public static j e()
    {
        return f.a;
    }

    public abstract j a();

    public final k f()
    {
        return a().d();
    }

    public Collection values()
    {
        return a().d();
    }

}
