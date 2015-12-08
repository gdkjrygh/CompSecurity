// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            fn

final class fo
    implements Comparator
{

    private fo()
    {
    }

    fo(byte byte0)
    {
        this();
    }

    public final int compare(Object obj, Object obj1)
    {
        if (obj == null && obj1 == null)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        }
        if (obj instanceof List)
        {
            return fn.a((List)obj, (List)obj1);
        }
        if (obj instanceof Set)
        {
            return fn.a((Set)obj, (Set)obj1);
        }
        if (obj instanceof Map)
        {
            return fn.a((Map)obj, (Map)obj1);
        }
        if (obj instanceof byte[])
        {
            return fn.a((byte[])obj, (byte[])obj1);
        } else
        {
            return fn.a((Comparable)obj, (Comparable)obj1);
        }
    }
}
