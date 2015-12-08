// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.tileoverlay;


// Referenced classes of package me.lyft.android.map.core.tileoverlay:
//            ITileOverlayOptions, ITileProvider

public class TileOverlayOptions
    implements ITileOverlayOptions
{

    private final boolean isFadeIn;
    private final ITileProvider tileProvider;
    private final float zIndex;

    public TileOverlayOptions(ITileProvider itileprovider, float f, boolean flag)
    {
        tileProvider = itileprovider;
        zIndex = f;
        isFadeIn = flag;
    }

    public ITileProvider getProvider()
    {
        return tileProvider;
    }

    public float getZIndex()
    {
        return zIndex;
    }

    public boolean isFadeIn()
    {
        return isFadeIn;
    }
}
