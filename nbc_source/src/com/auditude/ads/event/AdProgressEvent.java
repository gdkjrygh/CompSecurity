// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import com.auditude.ads.model.IAsset;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.event:
//            AdPluginEvent

public class AdProgressEvent extends AdPluginEvent
{

    public static final String AD_PROGRESS = "adProgress";
    private IAsset asset;
    private int duration;
    private int position;

    public AdProgressEvent(String s, int i, int j, IAsset iasset)
    {
        this(s, i, j, iasset, null);
    }

    public AdProgressEvent(String s, int i, int j, IAsset iasset, HashMap hashmap)
    {
        super(s, hashmap);
        position = i;
        duration = j;
        asset = iasset;
    }

    public final IAsset getAsset()
    {
        return asset;
    }

    public final int getDuration()
    {
        return duration;
    }

    public final int getPosition()
    {
        return position;
    }
}
