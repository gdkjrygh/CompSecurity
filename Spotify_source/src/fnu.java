// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class fnu
{

    public fnu()
    {
    }

    public static fnu a(Object obj)
    {
        return new fnw(obj);
    }

    public static fnu b(Object obj)
    {
        if (obj == null)
        {
            return fnv.a;
        } else
        {
            return a(obj);
        }
    }

    public abstract Object a();

    public abstract boolean b();

    public Object c(Object obj)
    {
        if (b())
        {
            obj = a();
        }
        return obj;
    }
}
