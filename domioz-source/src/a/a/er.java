// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;

// Referenced classes of package a.a:
//            fe, eg, go, el, 
//            es

public abstract class er extends fe
    implements eg
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    er()
    {
    }

    public static er a(Object obj, Object obj1)
    {
        return new go(obj, obj1);
    }

    public static er g()
    {
        return el.a;
    }

    public abstract er c_();

    public final es f()
    {
        return c_().d();
    }

    public Collection values()
    {
        return c_().d();
    }

}
