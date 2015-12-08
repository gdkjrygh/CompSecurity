// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.camera;

import java.util.Collections;
import java.util.List;

// Referenced classes of package me.lyft.android.map.core.camera:
//            IMapBound

public class NullMapBound
    implements IMapBound
{

    private static final IMapBound INSTANCE = new NullMapBound();

    public NullMapBound()
    {
    }

    public static IMapBound getInstance()
    {
        return INSTANCE;
    }

    public int getHeight()
    {
        return 0;
    }

    public List getLocationList()
    {
        return Collections.emptyList();
    }

    public int getPadding()
    {
        return 0;
    }

    public int getWidth()
    {
        return 0;
    }

    public boolean isNull()
    {
        return true;
    }

}
