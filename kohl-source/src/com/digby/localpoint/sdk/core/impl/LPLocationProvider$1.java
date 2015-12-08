// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.ILPOrdering;
import java.util.Comparator;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPLocationProvider

class val.o
    implements Comparator
{

    final LPLocationProvider this$0;
    final ILPOrdering val$o;

    public int compare(ILPLocation ilplocation, ILPLocation ilplocation1)
    {
        return val$o.compare(ilplocation, ilplocation1);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ILPLocation)obj, (ILPLocation)obj1);
    }

    ()
    {
        this$0 = final_lplocationprovider;
        val$o = ILPOrdering.this;
        super();
    }
}
