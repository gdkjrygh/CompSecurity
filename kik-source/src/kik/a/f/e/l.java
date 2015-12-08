// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.d.a.j;
import kik.a.f.n;

// Referenced classes of package kik.a.f.e:
//            g

public class l
    implements kik.a.f.e.g
{

    public l()
    {
    }

    public final g a(n n1)
    {
        j j1 = null;
        if (n1.a("roster"))
        {
            n1 = n1.getAttributeValue(null, "full");
            boolean flag;
            if (n1 != null && n1.equals("1"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j1 = new j(flag);
        }
        return j1;
    }
}
