// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.content.Context;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class val.event
    implements Runnable
{

    final cessTokenAppIdPair val$accessTokenAppId;
    final Context val$context;
    final pEvent val$event;

    public void run()
    {
        AppEventsLogger.access$600(val$context, val$accessTokenAppId).addEvent(val$event);
        AppEventsLogger.access$700();
    }

    pEvent(Context context1, cessTokenAppIdPair cesstokenappidpair, pEvent pevent)
    {
        val$context = context1;
        val$accessTokenAppId = cesstokenappidpair;
        val$event = pevent;
        super();
    }
}
