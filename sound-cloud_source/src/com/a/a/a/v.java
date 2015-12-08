// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import java.util.Set;

// Referenced classes of package com.a.a.a:
//            r, w, B, C

final class v
    implements r
{

    static final Set b = new w();
    final int a;

    public v(int i)
    {
        a = i;
    }

    public final boolean a(B b1)
    {
        boolean flag;
        boolean flag1;
        if (b.contains(b1.c) && b1.a.g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(b1.a.c.hashCode() % a) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

}
