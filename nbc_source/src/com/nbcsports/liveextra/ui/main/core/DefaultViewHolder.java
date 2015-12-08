// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;


// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewHolder, DefaultItemView, AssetViewModel

public class DefaultViewHolder extends AssetViewHolder
{

    private final com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageInfo;

    public DefaultViewHolder(DefaultItemView defaultitemview, com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo)
    {
        super(defaultitemview);
        pageInfo = pageinfo;
    }

    public void bind(AssetViewModel assetviewmodel)
    {
        ((DefaultItemView)itemView).bind(assetviewmodel, pageInfo);
    }
}
