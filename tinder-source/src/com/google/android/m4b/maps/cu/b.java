// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cu;


// Referenced classes of package com.google.android.m4b.maps.cu:
//            g, d, e, f, 
//            a

public class b extends g
{

    public d m;

    public b()
    {
    }

    public void a(a a1)
    {
        if (m != null)
        {
            int i = 0;
            while (i < m.b) 
            {
                m.a[i].a(a1);
                i++;
            }
        }
    }

    public int b()
    {
        int j = 0;
        int k;
        if (m != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= m.b)
                {
                    break;
                }
                i += m.a[j].a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public b c()
    {
        b b1 = (b)super.d();
        f.a(this, b1);
        return b1;
    }

    public Object clone()
    {
        return c();
    }

    public g d()
    {
        return c();
    }
}
