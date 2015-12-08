// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public final class cuu extends cus
{

    public final Comparator c;

    public cuu(Comparator comparator)
    {
        c = (Comparator)ctz.a(comparator);
    }

    public final cuo a(Object obj)
    {
        super.c(obj);
        return this;
    }

    public final cup a(Iterable iterable)
    {
        super.b(iterable);
        return this;
    }

    public final cup a(Object aobj[])
    {
        super.b(aobj);
        return this;
    }

    public final cup b(Object obj)
    {
        super.c(obj);
        return this;
    }

    public final volatile cus b(Iterable iterable)
    {
        super.b(iterable);
        return this;
    }

    public final volatile cus b(Object aobj[])
    {
        super.b(aobj);
        return this;
    }

    public final volatile cus c(Object obj)
    {
        super.c(obj);
        return this;
    }

    public final transient cuu c(Object aobj[])
    {
        super.b(aobj);
        return this;
    }
}
