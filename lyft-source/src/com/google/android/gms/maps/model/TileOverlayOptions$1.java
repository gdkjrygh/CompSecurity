// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzl;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileProvider, TileOverlayOptions, Tile

class a
    implements TileProvider
{

    final TileOverlayOptions a;
    private final zzl c;

    public Tile getTile(int i, int j, int k)
    {
        Tile tile;
        try
        {
            tile = c.a(i, j, k);
        }
        catch (RemoteException remoteexception)
        {
            return null;
        }
        return tile;
    }

    (TileOverlayOptions tileoverlayoptions)
    {
        a = tileoverlayoptions;
        super();
        c = TileOverlayOptions.a(a);
    }
}
