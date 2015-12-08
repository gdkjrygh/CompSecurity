// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            n, g, i, ar

public abstract class as
{

    protected boolean e;

    public as()
    {
    }

    private boolean c(n n1)
    {
        int l;
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        l = c();
        i1 = n1.b();
        if (l != 0 && i1 != 0)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        flag = false;
        return flag;
        g g1;
        g g2;
        g g3;
        g ag[];
        int j;
        int k;
        ag = new g[2];
        g2 = n1.h();
        j = 0;
          goto _L1
        continue; /* Loop/switch isn't completed */
        j++;
    }

    public ar a()
    {
        return ar.a(b().a());
    }

    public abstract g a(int j);

    public abstract void a(int j, g ag[]);

    public abstract boolean a(g g1);

    public boolean a(n n1)
    {
        if (a().b(n1.a())) goto _L2; else goto _L1
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

    public abstract n b();

    public boolean b(n n1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!a().b(n1.a()))
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

    public abstract int c();
}
