// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.i;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileProvider, TileOverlayOptions, Tile

class Tx
    implements TileProvider
{

    private final i Tw;
    final TileOverlayOptions Tx;

    public Tile getTile(int j, int k, int l)
    {
        Tile tile;
        try
        {
            tile = Tw.getTile(j, k, l);
        }
        catch (RemoteException remoteexception)
        {
            return null;
        }
        return tile;
    }

    (TileOverlayOptions tileoverlayoptions)
    {
        Tx = tileoverlayoptions;
        super();
        Tw = TileOverlayOptions.a(Tx);
    }
}
