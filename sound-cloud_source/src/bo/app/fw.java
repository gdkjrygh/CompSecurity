// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;

// Referenced classes of package bo.app:
//            gj, fl, hs, fq, 
//            fx

public abstract class fw extends gj
    implements fl
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    fw()
    {
    }

    public static fw a(Object obj, Object obj1)
    {
        return new hs(obj, obj1);
    }

    public static fw g()
    {
        return fq.a;
    }

    public abstract fw c_();

    public final fx f()
    {
        return c_().d();
    }

    public Collection values()
    {
        return c_().d();
    }

}
