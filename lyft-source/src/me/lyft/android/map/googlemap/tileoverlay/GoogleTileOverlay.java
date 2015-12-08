// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap.tileoverlay;

import com.google.android.gms.maps.model.TileOverlay;
import me.lyft.android.map.core.tileoverlay.ITileOverlay;

public class GoogleTileOverlay
    implements ITileOverlay
{

    private final TileOverlay tileOverlay;

    public GoogleTileOverlay(TileOverlay tileoverlay)
    {
        tileOverlay = tileoverlay;
    }

    public void clearTileCache()
    {
        tileOverlay.b();
    }

    public boolean isNull()
    {
        return false;
    }

    public void remove()
    {
        tileOverlay.a();
    }
}
