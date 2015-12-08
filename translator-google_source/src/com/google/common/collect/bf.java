// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            aq, LinkedHashMultiset, dl

public final class bf extends aq
{

    final dl a;

    public bf()
    {
        this(((dl) (LinkedHashMultiset.create())));
    }

    private bf(dl dl1)
    {
        a = dl1;
    }

    public final aq a(Iterator iterator)
    {
        super.a(iterator);
        return this;
    }

    public final aq a(Object aobj[])
    {
        super.a(aobj);
        return this;
    }

    public final bf a(Object obj)
    {
        a.add(p.a(obj));
        return this;
    }

    public final aq b(Object obj)
    {
        return a(obj);
    }

    public final transient bf b(Object aobj[])
    {
        super.a(aobj);
        return this;
    }
}
