// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class atj
{

    public final bad a;

    public atj()
    {
        this(250);
    }

    public atj(int i)
    {
        a = new atk(this, i);
    }

    public final Object a(Object obj, int i, int j)
    {
        obj = atl.a(obj, i, j);
        Object obj1 = a.b(obj);
        ((atl) (obj)).a();
        return obj1;
    }

    public final void a(Object obj, int i, int j, Object obj1)
    {
        obj = atl.a(obj, i, j);
        a.b(obj, obj1);
    }
}
