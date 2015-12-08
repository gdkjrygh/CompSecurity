// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;

// Referenced classes of package bo.app:
//            go, fq, hx, fv, 
//            gc

public abstract class gb extends go
    implements fq
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    gb()
    {
    }

    public static gb a(Object obj, Object obj1)
    {
        return new hx(obj, obj1);
    }

    public static gb g()
    {
        return fv.a;
    }

    public abstract gb c_();

    public final gc f()
    {
        return c_().d();
    }

    public Collection values()
    {
        return c_().d();
    }

}
