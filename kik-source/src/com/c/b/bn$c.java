// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.c.b:
//            bn

private static final class ect extends AbstractList
    implements List
{

    bn a;

    final void a()
    {
        modCount = modCount + 1;
    }

    public final Object get(int i)
    {
        return a.c(i);
    }

    public final int size()
    {
        return a.c();
    }
}
