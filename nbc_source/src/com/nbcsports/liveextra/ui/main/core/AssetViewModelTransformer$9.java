// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.configuration.Sport;
import org.apache.commons.collections4.Predicate;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModelTransformer

class val.sport
    implements Predicate
{

    final AssetViewModelTransformer this$0;
    final Sport val$sport;

    public boolean evaluate(Asset asset)
    {
        if (asset == null || asset.getSportCode() == null)
        {
            return false;
        } else
        {
            return asset.getSportCode().equals(val$sport.getCode());
        }
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((Asset)obj);
    }

    ()
    {
        this$0 = final_assetviewmodeltransformer;
        val$sport = Sport.this;
        super();
    }
}
