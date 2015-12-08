// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import java.util.Set;

// Referenced classes of package com.a.a.a:
//            g, l, q, r

public final class k
    implements g
{

    static final Set b = new l();
    final int a;

    public k(int i)
    {
        a = i;
    }

    public final boolean a(q q1)
    {
        boolean flag;
        if (!b.contains(q1.c) || q1.a.f != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        while (flag || Math.abs(q1.a.c.hashCode() % a) == 0) 
        {
            return false;
        }
        return true;
    }

}
