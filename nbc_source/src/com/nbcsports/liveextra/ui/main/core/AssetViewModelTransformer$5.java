// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.nbcsports.liveextra.library.api.models.Asset;
import org.apache.commons.collections4.Predicate;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModelTransformer

class this._cls0
    implements Predicate
{

    final AssetViewModelTransformer this$0;

    public boolean evaluate(Asset asset)
    {
        return !asset.isExpired();
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((Asset)obj);
    }

    ()
    {
        this$0 = AssetViewModelTransformer.this;
        super();
    }
}
