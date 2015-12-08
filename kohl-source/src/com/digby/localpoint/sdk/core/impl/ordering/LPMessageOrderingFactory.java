// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.ordering;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.localpoint.sdk.core.ordering.ILPMessageOrderingFactory;

// Referenced classes of package com.digby.localpoint.sdk.core.impl.ordering:
//            LPMessageExpirationOrdering

public class LPMessageOrderingFactory
    implements ILPMessageOrderingFactory
{

    private final Context mContext;

    public LPMessageOrderingFactory(Context context)
    {
        mContext = context;
    }

    public ILPOrdering getAscendingExpirationOrdering()
    {
        return new LPMessageExpirationOrdering(LPMessageExpirationOrdering.SortDirection.ASCENDING);
    }

    public ILPOrdering getDescendingExpirationOrdering()
    {
        return new LPMessageExpirationOrdering(LPMessageExpirationOrdering.SortDirection.DESCENDING);
    }
}
