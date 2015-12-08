// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.AggregatedPinData;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, AggregatedStats

public class IgAggregatedPinData
    implements IgModel
{

    AggregatedStats a;

    public IgAggregatedPinData()
    {
    }

    public final AggregatedPinData a()
    {
        AggregatedPinData aggregatedpindata = new AggregatedPinData();
        if (a != null)
        {
            aggregatedpindata.setSaves(Integer.valueOf(a.a));
            aggregatedpindata.setLikes(Integer.valueOf(a.b));
            aggregatedpindata.setUid(a.c);
        }
        return aggregatedpindata;
    }

    public Object getModel()
    {
        return a();
    }
}
