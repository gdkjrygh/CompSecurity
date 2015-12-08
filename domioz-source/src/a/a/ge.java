// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Comparator;

// Referenced classes of package a.a:
//            ej, gc, gm

public abstract class ge
    implements Comparator
{

    protected ge()
    {
    }

    public static ge a(Comparator comparator)
    {
        if (comparator instanceof ge)
        {
            return (ge)comparator;
        } else
        {
            return new ej(comparator);
        }
    }

    public static ge b()
    {
        return gc.a;
    }

    public ge a()
    {
        return new gm(this);
    }

    public abstract int compare(Object obj, Object obj1);
}
