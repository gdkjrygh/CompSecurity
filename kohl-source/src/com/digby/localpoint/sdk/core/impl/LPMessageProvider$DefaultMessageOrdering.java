// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.localpoint.sdk.core.ILPOrdering;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPMessageProvider

class this._cls0
    implements ILPOrdering
{

    final LPMessageProvider this$0;

    public int compare(Object obj, Object obj1)
    {
        obj = (ILPMessage)obj;
        obj1 = (ILPMessage)obj1;
        return Long.valueOf(Long.parseLong(((ILPMessage) (obj)).getID().getValue())).compareTo(Long.valueOf(Long.parseLong(((ILPMessage) (obj1)).getID().getValue())));
    }

    Q()
    {
        this$0 = LPMessageProvider.this;
        super();
    }
}
