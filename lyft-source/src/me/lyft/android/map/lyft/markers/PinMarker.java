// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import me.lyft.android.map.core.markers.IMarker;

// Referenced classes of package me.lyft.android.map.lyft.markers:
//            Marker

public abstract class PinMarker extends Marker
{

    public PinMarker(String s, IMarker imarker)
    {
        super(s, imarker);
    }

    public void makeFill()
    {
        setAlpha(1.0F);
    }

    public void makeTransparent()
    {
        setAlpha(0.5F);
    }
}
