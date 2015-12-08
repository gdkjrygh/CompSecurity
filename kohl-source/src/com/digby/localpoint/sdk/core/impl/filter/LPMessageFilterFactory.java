// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.filter.ILPMessageFilterFactory;

// Referenced classes of package com.digby.localpoint.sdk.core.impl.filter:
//            LPAllFilter, LPMessageExpiredFilter, LPMessageNotExpiredFilter

public class LPMessageFilterFactory
    implements ILPMessageFilterFactory
{

    private final Context mContext;

    public LPMessageFilterFactory(Context context)
    {
        mContext = context;
    }

    public ILPFilter getAllFilter()
    {
        return new LPAllFilter();
    }

    public ILPFilter getExpiredFilter()
    {
        return new LPMessageExpiredFilter();
    }

    public ILPFilter getValidFilter()
    {
        return new LPMessageNotExpiredFilter();
    }
}
