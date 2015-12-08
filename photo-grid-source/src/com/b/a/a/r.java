// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import java.util.Set;

// Referenced classes of package com.b.a.a:
//            n, s, x, aa

final class r
    implements n
{

    static final Set b = new s();
    final int a;

    public r(int i)
    {
        a = i;
    }

    public final boolean a(x x1)
    {
        boolean flag;
        boolean flag1;
        if (b.contains(x1.c) && x1.a.g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(x1.a.c.hashCode() % a) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

}
