// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            ez, iw, ex

public class ey
{

    iw a;
    Comparator b;

    public ey()
    {
        a = new ez();
    }

    public ex a()
    {
        if (b != null)
        {
            for (Iterator iterator = a.b().values().iterator(); iterator.hasNext(); Collections.sort((List)(Collection)iterator.next(), b)) { }
        }
        return ex.b(a);
    }

    public ey a(Object obj, Object obj1)
    {
        a.a(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj1));
        return this;
    }
}
