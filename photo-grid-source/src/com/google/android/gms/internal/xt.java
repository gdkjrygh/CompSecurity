// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            yb, ya, xy, xz, 
//            xr

public abstract class xt extends yb
{

    protected xy m;

    public xt()
    {
    }

    private xt e()
    {
        xt xt1 = (xt)super.b();
        ya.a(this, xt1);
        return xt1;
    }

    protected int a()
    {
        int j = 0;
        int k;
        if (m != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= m.a())
                {
                    break;
                }
                i += m.a(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public void a(xr xr)
    {
        if (m != null)
        {
            int i = 0;
            while (i < m.a()) 
            {
                m.a(i).a(xr);
                i++;
            }
        }
    }

    public final yb b()
    {
        return e();
    }

    public Object clone()
    {
        return e();
    }
}
