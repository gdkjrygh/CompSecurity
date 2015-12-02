// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.upsell;

import com.facebook.prefs.shared.d;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.upsell:
//            d

public class e
    implements a
{

    private final d a;
    private final com.facebook.common.time.a b;
    private final a c;

    public e(d d1, com.facebook.common.time.a a1, a a2)
    {
        a = d1;
        b = a1;
        c = a2;
    }

    private boolean c()
    {
        boolean flag = false;
        if (a.a(d.b, 0) >= 10)
        {
            flag = true;
        }
        return flag;
    }

    private boolean d()
    {
        boolean flag1 = false;
        int i = a.a(d.c, 0);
        long l = a.a(com.facebook.orca.upsell.d.d, -1L);
        boolean flag = flag1;
        if (b.a() - l < 0x5265c00L)
        {
            flag = flag1;
            if (i >= 3)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean e()
    {
        long l = a.a(d.e, -1L);
        return b.a() - l < 0x5265c00L;
    }

    public Boolean a()
    {
        boolean flag;
        if (((Boolean)c.b()).booleanValue() && !c() && !d() && !e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }
}
