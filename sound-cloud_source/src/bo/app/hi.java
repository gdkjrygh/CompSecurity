// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;

// Referenced classes of package bo.app:
//            fo, hg, hq

public abstract class hi
    implements Comparator
{

    protected hi()
    {
    }

    public static hi a(Comparator comparator)
    {
        if (comparator instanceof hi)
        {
            return (hi)comparator;
        } else
        {
            return new fo(comparator);
        }
    }

    public static hi b()
    {
        return hg.a;
    }

    public hi a()
    {
        return new hq(this);
    }

    public abstract int compare(Object obj, Object obj1);
}
