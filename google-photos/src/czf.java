// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

public final class czf
    implements czc
{

    private final czc a;
    private final czg b = new czg();

    public czf(czc czc1)
    {
        a = (czc)b.a(czc1, "delegate", null);
    }

    public final long a(List list, List list1)
    {
        return a.a(list, list1);
    }

    public final List a(List list, List list1, Map map, cqp cqp1, czd czd)
    {
        b.a(cqp1.d, "targetDurationUs");
        boolean flag;
        if (!list.isEmpty() || !list1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "photos or videos non-empty");
        list1 = a.a(list, list1, map, cqp1, czd);
        cqp1 = cqp1.b;
        list = list1;
        if (cqp1 != null)
        {
            list = b.a(map, cqp1, list1);
        }
        return list;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof czf))
        {
            return false;
        } else
        {
            obj = (czf)obj;
            return a.equals(((czf) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return String.format("ReorderingClipSelector [delegate=%s]", new Object[] {
            a
        });
    }
}
