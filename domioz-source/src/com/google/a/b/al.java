// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;

// Referenced classes of package com.google.a.b:
//            av, w, dc, ad, 
//            am

public abstract class al extends av
    implements w
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    al()
    {
    }

    public static al a(Object obj, Object obj1)
    {
        return new dc(obj, obj1);
    }

    public static al e()
    {
        return ad.a;
    }

    public abstract al a();

    public final am f()
    {
        return a().d();
    }

    public Collection values()
    {
        return a().d();
    }

}
