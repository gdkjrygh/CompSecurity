// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class eq extends eu
    implements Serializable
{

    static final eq a = new eq();

    private eq()
    {
    }

    public final eu a()
    {
        return ez.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        dv.a(obj);
        dv.a(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public final String toString()
    {
        return "Ordering.natural()";
    }

}
