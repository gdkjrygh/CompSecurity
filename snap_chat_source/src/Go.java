// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Go
{

    public final int a;
    public final int b;
    final List c = new ArrayList();

    public Go(int i, int j)
    {
        a = i;
        b = j;
    }

    public final int a()
    {
        return c.size();
    }

    public final String a(int i)
    {
        boolean flag;
        if (i >= 0 && i < c.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        return (String)c.get(i);
    }

    public final void a(List list)
    {
        if (list != null)
        {
            String s;
            for (list = list.iterator(); list.hasNext(); c.add(s))
            {
                s = (String)list.next();
            }

        }
    }
}
