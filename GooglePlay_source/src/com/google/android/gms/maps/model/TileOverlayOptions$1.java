// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.internal.ITileProviderDelegate;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileProvider, TileOverlayOptions

final class this._cls0
    implements TileProvider
{

    private final ITileProviderDelegate mDelegate;
    final TileOverlayOptions this$0;

    rDelegate()
    {
        this$0 = TileOverlayOptions.this;
        super();
        mDelegate = TileOverlayOptions.access$000(TileOverlayOptions.this);
    }
}
