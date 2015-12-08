// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public class axm
{

    public final axy a;

    public axm(axy axy1)
    {
        a = axy1;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            axy axy1 = a;
            Iterator iterator = bag.a(axy1.a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ayo ayo1 = (ayo)iterator.next();
                if (!ayo1.f() && !ayo1.h())
                {
                    ayo1.c();
                    if (!axy1.c)
                    {
                        ayo1.a();
                    } else
                    {
                        axy1.b.add(ayo1);
                    }
                }
            } while (true);
        }
    }
}
