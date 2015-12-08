// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;

// Referenced classes of package bo.app:
//            fn, hf, hp

public abstract class hh
    implements Comparator
{

    protected hh()
    {
    }

    public static hh a(Comparator comparator)
    {
        if (comparator instanceof hh)
        {
            return (hh)comparator;
        } else
        {
            return new fn(comparator);
        }
    }

    public static hh b()
    {
        return hf.a;
    }

    public hh a()
    {
        return new hp(this);
    }

    public abstract int compare(Object obj, Object obj1);
}
