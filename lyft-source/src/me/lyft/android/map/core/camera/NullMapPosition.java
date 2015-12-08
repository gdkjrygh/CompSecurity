// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.camera;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;

// Referenced classes of package me.lyft.android.map.core.camera:
//            IMapPosition

public class NullMapPosition
    implements IMapPosition
{

    private static final IMapPosition INSTANCE = new NullMapPosition();

    public NullMapPosition()
    {
    }

    public static IMapPosition getInstance()
    {
        return INSTANCE;
    }

    public float getBearing()
    {
        return 0.0F;
    }

    public Location getLocation()
    {
        return NullLocation.getInstance();
    }

    public float getTilt()
    {
        return 0.0F;
    }

    public float getZoom()
    {
        return 0.0F;
    }

    public boolean isNull()
    {
        return true;
    }

}
