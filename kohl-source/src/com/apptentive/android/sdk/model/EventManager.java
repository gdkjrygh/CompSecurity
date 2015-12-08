// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import android.content.Context;
import com.apptentive.android.sdk.storage.ApptentiveDatabase;
import com.apptentive.android.sdk.storage.EventStore;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload, Event

public class EventManager
{

    public EventManager()
    {
    }

    private static EventStore getEventStore(Context context)
    {
        return ApptentiveDatabase.getInstance(context);
    }

    public static void sendEvent(Context context, Event event)
    {
        getEventStore(context).addPayload(new Payload[] {
            event
        });
    }
}
