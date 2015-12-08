// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class ez extends eu
    implements Serializable
{

    static final ez a = new ez();

    private ez()
    {
    }

    public final eu a()
    {
        return eq.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        dv.a(obj);
        if (obj == obj1)
        {
            return 0;
        } else
        {
            return ((Comparable) (obj1)).compareTo(obj);
        }
    }

    public final String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
