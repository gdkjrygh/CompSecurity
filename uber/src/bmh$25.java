// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements bkr
{

    final Class a;
    final bkq b;

    public final bkq create(bjw bjw, bmj bmj1)
    {
        if (a.isAssignableFrom(bmj1.getRawType()))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[typeHierarchy=")).append(a.getName()).append(",adapter=").append(b).append("]").toString();
    }

    ng.Class(Class class1, bkq bkq)
    {
        a = class1;
        b = bkq;
        super();
    }
}
