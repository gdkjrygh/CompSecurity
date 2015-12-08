// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.NbcDate;
import com.nbcsports.liveextra.library.core.SortOrder;
import java.util.Comparator;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModelTransformer

class val.order
    implements Comparator
{

    final AssetViewModelTransformer this$0;
    final SortOrder val$order;

    public int compare(Asset asset, Asset asset1)
    {
        int i;
        int j;
        if (asset.isLive())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (asset1.isLive())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i < j)
        {
            return 1;
        }
        if (i > j)
        {
            return -1;
        }
        if (val$order == SortOrder.ASC)
        {
            return asset.getStart().getDateTime().compareTo(asset1.getStart().getDateTime());
        } else
        {
            return asset1.getStart().getDateTime().compareTo(asset.getStart().getDateTime());
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Asset)obj, (Asset)obj1);
    }

    ()
    {
        this$0 = final_assetviewmodeltransformer;
        val$order = SortOrder.this;
        super();
    }
}
