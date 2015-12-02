// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            ej, ef

class eh
    implements ej
{

    final ef a;
    private double b;
    private double c;

    public eh(ef ef1, double d, double d1)
    {
        a = ef1;
        super();
        b = d;
        c = d1;
    }

    public void a(double d, double d1)
    {
        if (ef.d(a))
        {
            ef.a(a).b(b + d);
            ef.b(a).b(c + d1);
            if (com.facebook.orca.chatheads.ef.c(a) != null && ef.a(a).h() && ef.b(a).h())
            {
                com.facebook.orca.chatheads.ef.c(a).a_(null);
                return;
            }
        }
    }
}
