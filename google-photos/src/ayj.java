// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ayj
{

    final Class a;
    final anj b;
    private final Class c;

    public ayj(Class class1, Class class2, anj anj)
    {
        c = class1;
        a = class2;
        b = anj;
    }

    public final boolean a(Class class1, Class class2)
    {
        return c.isAssignableFrom(class1) && class2.isAssignableFrom(a);
    }
}
