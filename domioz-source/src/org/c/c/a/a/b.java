// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a.a;

import java.util.List;
import org.c.c.a.g;
import org.c.c.a.p;
import org.c.d.d;

// Referenced classes of package org.c.c.a.a:
//            a

public abstract class b extends a
{

    private List a;

    public b()
    {
    }

    public List getInterceptors()
    {
        return a;
    }

    public g getRequestFactory()
    {
        g g = super.getRequestFactory();
        if (!d.isEmpty(getInterceptors()))
        {
            return new p(g, getInterceptors());
        } else
        {
            return g;
        }
    }

    public void setInterceptors(List list)
    {
        a = list;
    }
}
