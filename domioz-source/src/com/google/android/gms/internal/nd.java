// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nj, ne, nh, nn

public final class nd extends nj
{

    public ne a[];

    public nd()
    {
        a = ne.b();
        o = null;
        p = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    ne ne1 = a[j];
                    k = i;
                    if (ne1 != null)
                    {
                        k = i + nh.b(1, ne1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public final void a(nh nh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ne ne1 = a[i];
                if (ne1 != null)
                {
                    nh1.a(1, ne1);
                }
            }

        }
        super.a(nh1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof nd)
            {
                obj = (nd)obj;
                flag = flag1;
                if (nn.a(a, ((nd) (obj)).a))
                {
                    return a(((nj) (obj)));
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (nn.a(a) + 527) * 31 + c();
    }
}
