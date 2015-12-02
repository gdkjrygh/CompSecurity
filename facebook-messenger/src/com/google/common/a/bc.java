// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.a:
//            bj, bg, hy, cn

class bc extends bj
{

    final Function a;

    bc(hy hy, Function function)
    {
        super(hy);
        a = (Function)Preconditions.checkNotNull(function);
    }

    bg a(int i)
    {
        return (bg)super.b(i);
    }

    cn a(int i, int j)
    {
        return new bg(this, i, j);
    }

    Object a(Object obj)
    {
        int i = b(Preconditions.checkNotNull(obj));
        return a(i).a(obj, i, a);
    }

    cn b(int i)
    {
        return a(i);
    }
}
