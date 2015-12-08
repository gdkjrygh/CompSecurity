// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import com.nbcsports.liveextra.library.api.models.Asset;
import org.apache.commons.collections4.Transformer;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModelTransformer, AssetViewModel

class this._cls0
    implements Transformer
{

    final AssetViewModelTransformer this$0;

    public AssetViewModel transform(Asset asset)
    {
        return new AssetViewModel(asset);
    }

    public volatile Object transform(Object obj)
    {
        return transform((Asset)obj);
    }

    ()
    {
        this$0 = AssetViewModelTransformer.this;
        super();
    }
}
