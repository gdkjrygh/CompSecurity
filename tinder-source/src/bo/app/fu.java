// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            gf, fw

abstract class fu extends gf
{

    fu()
    {
    }

    abstract fw c();

    public boolean contains(Object obj)
    {
        return c().contains(obj);
    }

    final boolean e()
    {
        return c().e();
    }

    public boolean isEmpty()
    {
        return c().isEmpty();
    }

    public int size()
    {
        return c().size();
    }
}
