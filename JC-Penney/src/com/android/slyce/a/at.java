// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;
import com.android.slyce.a.e.b;

// Referenced classes of package com.android.slyce.a:
//            an, am, aq, au, 
//            aj, bp, ar, r

public class at extends an
    implements e, am, aq, b
{

    boolean c;
    private am d;
    private ar e;
    private int f;

    public at()
    {
    }

    public void a(am am1)
    {
        if (d != null)
        {
            d.a(null);
        }
        d = am1;
        d.a(this);
        d.b(new au(this));
    }

    public void a(am am1, aj aj1)
    {
        if (c)
        {
            aj1.m();
        } else
        {
            if (aj1 != null)
            {
                f = f + aj1.d();
            }
            bp.a(this, aj1);
            if (aj1 != null)
            {
                f = f - aj1.d();
            }
            if (e != null && aj1 != null)
            {
                e.a(f);
                return;
            }
        }
    }

    public void d()
    {
        c = true;
        if (d != null)
        {
            d.d();
        }
    }

    public void j()
    {
        d.j();
    }

    public boolean k()
    {
        return d.k();
    }

    public r l()
    {
        return d.l();
    }
}
