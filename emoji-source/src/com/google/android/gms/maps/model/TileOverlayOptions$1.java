// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.i;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileProvider, TileOverlayOptions, Tile

class abh
    implements TileProvider
{

    private final i abg;
    final TileOverlayOptions abh;

    public Tile getTile(int j, int k, int l)
    {
        Tile tile;
        try
        {
            tile = abg.getTile(j, k, l);
        }
        catch (RemoteException remoteexception)
        {
            return null;
        }
        return tile;
    }

    (TileOverlayOptions tileoverlayoptions)
    {
        abh = tileoverlayoptions;
        super();
        abg = TileOverlayOptions.a(abh);
    }
}
