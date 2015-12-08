// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package org.a.a.a:
//            d, g

class f
    implements d
{

    private final Map a = new HashMap();
    private final g b = new g();

    f()
    {
    }

    public final int a(String s)
    {
        s = ((String) (a.get(s)));
        if (s == null)
        {
            return -1;
        } else
        {
            return ((Integer)s).intValue();
        }
    }

    public final void a(String s, int i)
    {
        a.put(s, new Integer(i));
        b.a(i, s);
    }
}
