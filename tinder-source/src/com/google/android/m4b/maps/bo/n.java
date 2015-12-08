// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            ax, i, g, m

public abstract class n
    implements ax
{

    public n()
    {
    }

    private boolean c(n n1)
    {
        int l = b();
        int i1 = n1.b();
        if (l != 0 && i1 != 0)
        {
            g g1 = h();
            g g3 = n1.h();
            int j = 0;
            while (j < l) 
            {
                g g4 = a(j);
                int k = 0;
                g g5;
                for (g g2 = g3; k < i1; g2 = g5)
                {
                    g5 = n1.a(k);
                    if (i.a(g1, g4, g2, g5))
                    {
                        return true;
                    }
                    k++;
                }

                j++;
                g1 = g4;
            }
        }
        return false;
    }

    public abstract g a(int j);

    public m a()
    {
        int k1 = a(0).a;
        int j = a(0).b;
        boolean flag = true;
        int j1 = k1;
        int i1 = j;
        int l = j;
        for (int k = ((flag) ? 1 : 0); k < b(); k++)
        {
            k1 = Math.min(k1, a(k).a);
            j1 = Math.max(j1, a(k).a);
            i1 = Math.min(i1, a(k).b);
            l = Math.max(l, a(k).b);
        }

        return new m(new g(k1, i1), new g(j1, l));
    }

    public abstract boolean a(g g1);

    public boolean a(n n1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!a().a(n1.a()))
            {
                break label0;
            }
            if (!a(n1.a(0)) && !n1.a(a(0)))
            {
                flag = flag1;
                if (!c(n1))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public abstract int b();

    public boolean b(n n1)
    {
        if (a().a(n1.a())) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
_L4:
        if (j >= n1.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!a(n1.a(j))) goto _L1; else goto _L3
_L3:
        j++;
          goto _L4
        if (c(n1)) goto _L1; else goto _L5
_L5:
        return true;
    }

    public g h()
    {
        return a(b() - 1);
    }
}
