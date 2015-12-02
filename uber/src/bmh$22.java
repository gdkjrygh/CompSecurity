// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements bkr
{

    final Class a;
    final Class b;
    final bkq c;

    public final bkq create(bjw bjw, bmj bmj1)
    {
        bjw = bmj1.getRawType();
        if (bjw == a || bjw == b)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[type=")).append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
    }

    ng.Class(Class class1, Class class2, bkq bkq)
    {
        a = class1;
        b = class2;
        c = bkq;
        super();
    }
}
