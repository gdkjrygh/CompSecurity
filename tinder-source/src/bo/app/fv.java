// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;

// Referenced classes of package bo.app:
//            gi, fk, hr, fp, 
//            fw

public abstract class fv extends gi
    implements fk
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    fv()
    {
    }

    public static fv a(Object obj, Object obj1)
    {
        return new hr(obj, obj1);
    }

    public static fv g()
    {
        return fp.a;
    }

    public abstract fv c_();

    public final fw f()
    {
        return c_().d();
    }

    public Collection values()
    {
        return c_().d();
    }

}
