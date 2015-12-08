// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.o;

// Referenced classes of package com.google.android.m4b.maps.model:
//            u, TileOverlayOptions, Tile

final class c
    implements u
{

    private final o b;
    private TileOverlayOptions c;

    public final Tile a(int i, int j, int k)
    {
        Tile tile;
        try
        {
            tile = b.a(i, j, k);
        }
        catch (RemoteException remoteexception)
        {
            return null;
        }
        return tile;
    }

    (TileOverlayOptions tileoverlayoptions)
    {
        c = tileoverlayoptions;
        super();
        b = TileOverlayOptions.a(c);
    }
}
