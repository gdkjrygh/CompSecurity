// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.os.Handler;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.c:
//            u, z, w

class y
    implements Runnable
{

    final u a;
    private z b;

    y(u u1, z z1)
    {
        a = u1;
        super();
        b = z1;
    }

    public void run()
    {
        if (a.a(b))
        {
            ae.c(u.a(), (new StringBuilder()).append("View reused for").append(z.a(b)).toString());
            return;
        } else
        {
            Object obj = u.a(a, z.a(b));
            ae.c(u.a(), (new StringBuilder()).append("Loaded url :").append(z.a(b)).toString());
            obj = new w(a, ((com.jcp.productentity.ProductEntityContainer) (obj)), b);
            u.a(a).post(((Runnable) (obj)));
            return;
        }
    }
}
