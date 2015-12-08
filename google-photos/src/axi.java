// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axi
{

    final axg a;
    private final Class b;
    private final Class c;

    axi(Class class1, Class class2, axg axg)
    {
        b = class1;
        c = class2;
        a = axg;
    }

    public final boolean a(Class class1, Class class2)
    {
        return b.isAssignableFrom(class1) && class2.isAssignableFrom(c);
    }
}
