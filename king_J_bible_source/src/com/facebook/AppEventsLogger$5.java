// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;

// Referenced classes of package com.facebook:
//            AppEventsLogger

class val.event
    implements Runnable
{

    private final cessTokenAppIdPair val$accessTokenAppId;
    private final Context val$context;
    private final pEvent val$event;

    public void run()
    {
        AppEventsLogger.access$8(val$context, val$accessTokenAppId).addEvent(val$event);
        AppEventsLogger.access$9();
    }

    pEvent()
    {
        val$context = context1;
        val$accessTokenAppId = cesstokenappidpair;
        val$event = pevent;
        super();
    }
}
