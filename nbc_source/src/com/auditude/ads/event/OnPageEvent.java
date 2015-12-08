// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import com.auditude.ads.model.IOnPageAsset;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.event:
//            AdPluginEvent

public class OnPageEvent extends AdPluginEvent
{

    public static final String HIDE_BANNER = "hideBanner";
    public static final String SHOW_BANNER = "showBanner";
    private IOnPageAsset asset;

    public OnPageEvent(String s, IOnPageAsset ionpageasset)
    {
        this(s, ionpageasset, null);
    }

    public OnPageEvent(String s, IOnPageAsset ionpageasset, HashMap hashmap)
    {
        super(s, hashmap);
        asset = ionpageasset;
    }

    public final IOnPageAsset getAsset()
    {
        return asset;
    }
}
