// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.ordering;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.localpoint.sdk.core.ordering.ILPLocationOrderingFactory;

// Referenced classes of package com.digby.localpoint.sdk.core.impl.ordering:
//            LPLocationProximityOrdering

public class LPLocationOrderingFactory
    implements ILPLocationOrderingFactory
{

    private final Context mContext;

    public LPLocationOrderingFactory(Context context)
    {
        mContext = context;
    }

    public ILPOrdering getAscendingDistanceOrdering()
    {
        return new LPLocationProximityOrdering(mContext, LPLocationProximityOrdering.SortDirection.ASCENDING);
    }

    public ILPOrdering getDescendingDistanceOrdering()
    {
        return new LPLocationProximityOrdering(mContext, LPLocationProximityOrdering.SortDirection.DESCENDING);
    }
}
