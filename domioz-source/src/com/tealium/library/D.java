// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.List;
import java.util.Set;

// Referenced classes of package com.tealium.library:
//            f

final class D
    implements f
{

    private static Runnable a;

    D()
    {
    }

    static Runnable a(List list, Set set)
    {
        if (a == null)
        {
            a = new _cls1(set, list);
        }
        return a;
    }

    public final void a()
    {
        a = null;
    }

    private class _cls1
        implements Runnable
    {

        private Set a;
        private List b;

        public final void run()
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
            for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); iterator1.next()) { }
        }

        _cls1(Set set, List list)
        {
            a = set;
            b = list;
            super();
        }
    }

}
