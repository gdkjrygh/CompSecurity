// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class atw
{

    final Class a;
    final ato b;
    private final Class c;

    public atw(Class class1, Class class2, ato ato)
    {
        c = class1;
        a = class2;
        b = ato;
    }

    public final boolean a(Class class1)
    {
        return c.isAssignableFrom(class1);
    }

    public final boolean a(Class class1, Class class2)
    {
        return a(class1) && a.isAssignableFrom(class2);
    }
}
