// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            ef, eg

class ei extends b
{

    final ef a;

    private ei(ef ef1)
    {
        a = ef1;
        super();
    }

    ei(ef ef1, eg eg)
    {
        this(ef1);
    }

    public void b(c c1)
    {
        if (c1 == ef.a(a))
        {
            ef.a(a, c1.c());
        } else
        if (c1 == com.facebook.orca.chatheads.ef.b(a))
        {
            com.facebook.orca.chatheads.ef.b(a, c1.c());
            return;
        }
    }

    public void c(c c1)
    {
        if (com.facebook.orca.chatheads.ef.c(a) != null && ef.a(a).h() && com.facebook.orca.chatheads.ef.b(a).h())
        {
            com.facebook.orca.chatheads.ef.c(a).a_(null);
            ef.a(a, null);
        }
    }
}
