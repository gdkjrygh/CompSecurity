// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;

// Referenced classes of package bo.app:
//            ft, hl, hv

public abstract class hn
    implements Comparator
{

    protected hn()
    {
    }

    public static hn a(Comparator comparator)
    {
        if (comparator instanceof hn)
        {
            return (hn)comparator;
        } else
        {
            return new ft(comparator);
        }
    }

    public static hn b()
    {
        return hl.a;
    }

    public hn a()
    {
        return new hv(this);
    }

    public abstract int compare(Object obj, Object obj1);
}
