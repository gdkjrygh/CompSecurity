// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.config.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe:
//            g, h

class k extends d
{

    final g a;
    private a b;

    private k(g g)
    {
        a = g;
        super();
        b = null;
    }

    k(g g, h h)
    {
        this(g);
    }

    public Boolean a()
    {
        if (b == null)
        {
            b = (a)a(com/facebook/config/a/a);
        }
        boolean flag;
        if (b.i() == com.facebook.config.a.d.FB4A)
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
