// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class ForegroundEvent extends TrackingEvent
{

    public static final String KEY_PAGE_NAME = "page_name";
    public static final String KEY_PAGE_URN = "page_urn";
    public static final String KEY_REFERRER = "referrer";
    public static final String KIND_OPEN = "open";

    private ForegroundEvent(String s)
    {
        super(s, System.currentTimeMillis());
    }

    public static ForegroundEvent open(Screen screen, Referrer referrer)
    {
        return (ForegroundEvent)(new ForegroundEvent("open")).put("page_name", screen.get()).put("referrer", referrer.get());
    }

    public static ForegroundEvent open(Screen screen, Referrer referrer, Urn urn)
    {
        return (ForegroundEvent)open(screen, referrer).put("page_urn", urn.toString());
    }
}
