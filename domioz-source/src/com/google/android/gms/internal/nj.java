// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            no, nn, nl, nm, 
//            nh

public abstract class nj extends no
{

    protected nl o;

    public nj()
    {
    }

    private nj b()
    {
        nj nj1 = (nj)super.d();
        nn.a(this, nj1);
        return nj1;
    }

    protected int a()
    {
        int j = 0;
        int k;
        if (o != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= o.a())
                {
                    break;
                }
                i += o.a(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public void a(nh nh)
    {
        if (o != null)
        {
            int i = 0;
            while (i < o.a()) 
            {
                o.a(i).a(nh);
                i++;
            }
        }
    }

    protected final boolean a(nj nj1)
    {
        if (o == null || o.b())
        {
            return nj1.o == null || nj1.o.b();
        } else
        {
            return o.equals(nj1.o);
        }
    }

    protected final int c()
    {
        if (o == null || o.b())
        {
            return 0;
        } else
        {
            return o.hashCode();
        }
    }

    public Object clone()
    {
        return b();
    }

    public final no d()
    {
        return b();
    }
}
