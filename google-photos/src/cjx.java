// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cjx
{

    public final int a;
    final List b = new ArrayList();
    final List c = new ArrayList();

    public cjx(int i)
    {
        a = i;
    }

    public final cjy a(int i)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            cjy cjy1 = (cjy)iterator.next();
            if (cjy1.a == i)
            {
                return cjy1;
            }
        }

        return null;
    }

    public final cjx b(int i)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            cjx cjx1 = (cjx)iterator.next();
            if (cjx1.a == i)
            {
                return cjx1;
            }
        }

        return null;
    }
}
