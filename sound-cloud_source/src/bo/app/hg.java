// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;

// Referenced classes of package bo.app:
//            hi, hp, fa

final class hg extends hi
    implements Serializable
{

    static final hg a = new hg();

    private hg()
    {
    }

    public final hi a()
    {
        return hp.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        fa.a(obj);
        fa.a(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public final String toString()
    {
        return "Ordering.natural()";
    }

}
