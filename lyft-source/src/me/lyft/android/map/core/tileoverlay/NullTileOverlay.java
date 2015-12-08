// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.tileoverlay;


// Referenced classes of package me.lyft.android.map.core.tileoverlay:
//            ITileOverlay

public class NullTileOverlay
    implements ITileOverlay
{

    private static final ITileOverlay INSTANCE = new NullTileOverlay();

    private NullTileOverlay()
    {
    }

    public static ITileOverlay getInstance()
    {
        return INSTANCE;
    }

    public void clearTileCache()
    {
    }

    public boolean isNull()
    {
        return true;
    }

    public void remove()
    {
    }

}
