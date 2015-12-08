// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.mm.android.library.exception.LPArgumentException;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPLocationProvider

class this._cls0
    implements ILPOrdering
{

    final LPLocationProvider this$0;

    public int compare(Object obj, Object obj1)
    {
        if (!(obj instanceof ILPLocation) || !(obj1 instanceof ILPLocation))
        {
            throw new LPArgumentException("Ordering requires objects of type ILPLocation.");
        } else
        {
            obj = (ILPLocation)obj;
            obj1 = (ILPLocation)obj1;
            return Long.valueOf(Long.parseLong(((ILPLocation) (obj)).getID().getValue())).compareTo(Long.valueOf(Long.parseLong(((ILPLocation) (obj1)).getID().getValue())));
        }
    }

    ()
    {
        this$0 = LPLocationProvider.this;
        super();
    }
}
