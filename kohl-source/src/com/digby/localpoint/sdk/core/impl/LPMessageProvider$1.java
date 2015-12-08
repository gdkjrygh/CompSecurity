// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.localpoint.sdk.core.ILPOrdering;
import java.util.Comparator;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPMessageProvider

class val.o
    implements Comparator
{

    final LPMessageProvider this$0;
    final ILPOrdering val$o;

    public int compare(ILPMessage ilpmessage, ILPMessage ilpmessage1)
    {
        return val$o.compare(ilpmessage, ilpmessage1);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ILPMessage)obj, (ILPMessage)obj1);
    }

    ()
    {
        this$0 = final_lpmessageprovider;
        val$o = ILPOrdering.this;
        super();
    }
}
