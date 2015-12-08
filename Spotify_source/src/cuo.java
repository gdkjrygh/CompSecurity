// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public abstract class cuo extends cup
{

    public Object a[];
    public int b;

    cuo()
    {
        cuj.a(4, "initialCapacity");
        a = new Object[4];
        b = 0;
    }

    private void a(int i)
    {
        if (a.length < i)
        {
            a = cuz.b(a, a(a.length, i));
        }
    }

    public cuo a(Object obj)
    {
        ctz.a(obj);
        a(b + 1);
        Object aobj[] = a;
        int i = b;
        b = i + 1;
        aobj[i] = obj;
        return this;
    }

    public cup a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            int i = b;
            a(collection.size() + i);
        }
        super.a(iterable);
        return this;
    }

    public transient cup a(Object aobj[])
    {
        cuz.a(aobj);
        a(b + aobj.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (a)), b, aobj.length);
        b = b + aobj.length;
        return this;
    }

    public cup b(Object obj)
    {
        return a(obj);
    }
}
