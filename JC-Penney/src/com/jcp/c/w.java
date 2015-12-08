// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.view.View;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.c:
//            u, z, v, x

class w
    implements Runnable
{

    final u a;
    private ProductEntityContainer b;
    private z c;

    public w(u u1, ProductEntityContainer productentitycontainer, z z1)
    {
        a = u1;
        super();
        b = productentitycontainer;
        c = z1;
    }

    public void run()
    {
        if (u.b(a) != null)
        {
            ae.c(u.a(), (new StringBuilder()).append("Sending to Adapter:").append(z.a(c)).toString());
            if (b != null)
            {
                u.b(a).a(z.a(c), b);
            } else
            {
                z.b(c).findViewById(0x7f0e0334).setVisibility(4);
                if (u.c(a))
                {
                    z.b(c).post(new x(this));
                    return;
                }
            }
        }
    }
}
