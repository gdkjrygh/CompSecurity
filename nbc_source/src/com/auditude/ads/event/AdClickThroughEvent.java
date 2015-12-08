// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import com.auditude.ads.model.IClick;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.event:
//            AdPluginEvent

public class AdClickThroughEvent extends AdPluginEvent
{

    public static final String AD_CLICK = "adClick";
    private IClick click;

    public AdClickThroughEvent(String s, IClick iclick)
    {
        this(s, iclick, null);
    }

    public AdClickThroughEvent(String s, IClick iclick, HashMap hashmap)
    {
        super(s, hashmap);
        click = iclick;
    }

    public final IClick getClick()
    {
        return click;
    }
}
