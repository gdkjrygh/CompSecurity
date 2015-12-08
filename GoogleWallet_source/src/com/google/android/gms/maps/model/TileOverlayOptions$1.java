// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.maps.model.internal.o;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileProvider, TileOverlayOptions

final class aAM
    implements TileProvider
{

    private final o aAL;
    final TileOverlayOptions aAM;

    (TileOverlayOptions tileoverlayoptions)
    {
        aAM = tileoverlayoptions;
        super();
        aAL = TileOverlayOptions.a(aAM);
    }
}
