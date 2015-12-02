// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            lw, lj

class ls extends lw
{

    final lj a;

    ls(lj lj1)
    {
        a = lj1;
        super(lj1, null);
    }

    public boolean contains(Object obj)
    {
        return a.a(obj);
    }

    public Iterator iterator()
    {
        return lj.a(a.b());
    }

    public boolean remove(Object obj)
    {
        return obj != null && a.a.remove(obj) != null;
    }

    public int size()
    {
        return a.a.size();
    }
}
