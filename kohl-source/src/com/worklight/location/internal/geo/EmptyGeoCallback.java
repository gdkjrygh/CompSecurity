// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.internal.AbstractPosition;

public class EmptyGeoCallback
    implements WLGeoCallback
{

    public EmptyGeoCallback()
    {
    }

    public void execute(WLGeoPosition wlgeoposition)
    {
    }

    public volatile void execute(AbstractPosition abstractposition)
    {
        execute((WLGeoPosition)abstractposition);
    }
}
