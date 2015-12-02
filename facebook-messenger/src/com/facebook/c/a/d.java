// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c.a;

import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.c.a:
//            c, b

public class d
{

    private List a;

    public d()
    {
    }

    public void a(b b1)
    {
        if (a != null)
        {
            Preconditions.checkNotNull(b1);
            int j = a.size();
            for (int i = 0; i < j; i++)
            {
                b1.a((c)a.get(i));
            }

        }
    }

    public boolean a(c c1)
    {
        if (c1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a == null)
        {
            a = hq.a();
        }
        int j = a.size();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (a.get(i) == c1)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return a.add(c1);
    }

    public void b(b b1)
    {
        if (a != null)
        {
            Preconditions.checkNotNull(b1);
            int j = a.size();
            for (int i = 0; i < j; i++)
            {
                b1.b((c)a.get(i));
            }

        }
    }

    public boolean b(c c1)
    {
        if (a != null)
        {
            int j = a.size();
            int i = 0;
            while (i < j) 
            {
                if (a.get(i) == c1)
                {
                    a.remove(i);
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
