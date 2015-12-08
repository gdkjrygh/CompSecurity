// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b.a;

import com.kik.m.o;
import java.util.Comparator;

// Referenced classes of package kik.a.b.a:
//            a

private final class <init>
    implements Comparator
{

    final a a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (o)obj;
        obj1 = (o)obj1;
        if (((Long)((o) (obj)).b).longValue() < ((Long)((o) (obj1)).b).longValue())
        {
            return 1;
        }
        if (((Long)((o) (obj)).b).longValue() > ((Long)((o) (obj1)).b).longValue())
        {
            return -1;
        } else
        {
            return ((String)((o) (obj)).a).compareTo((String)((o) (obj1)).a);
        }
    }

    private ct(a a1)
    {
        a = a1;
        super();
    }

    ct(a a1, byte byte0)
    {
        this(a1);
    }
}
