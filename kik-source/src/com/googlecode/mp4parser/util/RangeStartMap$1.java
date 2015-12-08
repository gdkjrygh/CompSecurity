// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.util.Comparator;

// Referenced classes of package com.googlecode.mp4parser.util:
//            RangeStartMap

class this._cls0
    implements Comparator
{

    final RangeStartMap this$0;

    public int compare(Comparable comparable, Comparable comparable1)
    {
        return -comparable.compareTo(comparable1);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Comparable)obj, (Comparable)obj1);
    }

    ()
    {
        this$0 = RangeStartMap.this;
        super();
    }
}
