// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            mc, es

class me extends mc
{

    final mc a;

    me(mc mc1, es es)
    {
        a = mc1;
        super(es);
    }

    Object b(Object obj)
    {
        return a.b(obj);
    }

    public ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public List subList(int i, int j)
    {
        return super.a(i, j);
    }
}
