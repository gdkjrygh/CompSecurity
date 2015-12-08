// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public class bcm extends qss
{

    private bca a;

    public bcm()
    {
        super("trak");
    }

    public final bcn e()
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            baz baz1 = (baz)iterator.next();
            if (baz1 instanceof bcn)
            {
                return (bcn)baz1;
            }
        }

        return null;
    }

    public final bca f()
    {
        if (a != null)
        {
            return a;
        }
        Object obj = g();
        if (obj != null)
        {
            obj = ((bbq) (obj)).e();
            if (obj != null)
            {
                a = ((bbs) (obj)).e();
                return a;
            }
        }
        return null;
    }

    public final bbq g()
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            baz baz1 = (baz)iterator.next();
            if (baz1 instanceof bbq)
            {
                return (bbq)baz1;
            }
        }

        return null;
    }
}
