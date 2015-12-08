// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.f;
import com.android.slyce.a.ag;
import com.android.slyce.a.b.l;
import com.android.slyce.a.r;

// Referenced classes of package com.android.slyce.a.c:
//            a, b

class i extends l
{

    public ag a;
    public Object b;
    public Runnable c;
    final a m;

    private i(a a1)
    {
        m = a1;
        super();
    }

    i(a a1, b b1)
    {
        this(a1);
    }

    public boolean b()
    {
        if (!super.b())
        {
            return false;
        }
        if (a != null)
        {
            a.a(new f());
            a.d();
        }
        if (b != null)
        {
            m.e.a(b);
        }
        return true;
    }
}
