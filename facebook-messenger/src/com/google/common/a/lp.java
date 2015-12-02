// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            im, ln, gg, lq, 
//            lk

class lp extends im
{

    final ln a;

    private lp(ln ln1)
    {
        a = ln1;
        super();
    }

    lp(ln ln1, lk lk)
    {
        this(ln1);
    }

    Map a()
    {
        return a;
    }

    public Iterator iterator()
    {
        Map map = a.a();
        if (map == null)
        {
            return gg.b();
        } else
        {
            return new lq(this, map.entrySet().iterator());
        }
    }

    public int size()
    {
        Map map = a.a();
        if (map == null)
        {
            return 0;
        } else
        {
            return map.size();
        }
    }
}
