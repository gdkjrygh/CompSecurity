// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core.polyline;

import java.util.List;

// Referenced classes of package me.lyft.android.map.core.polyline:
//            IPolyline

public class NullPolyline
    implements IPolyline
{

    private static final IPolyline INSTANCE = new NullPolyline();

    public NullPolyline()
    {
    }

    public static IPolyline getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }

    public void remove()
    {
    }

    public void setColor(int i)
    {
    }

    public void setPoints(List list)
    {
    }

}
