// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Event

public class EventFactory
{

    public EventFactory()
    {
    }

    public static Event fromJson(String s)
    {
        Event event = new Event(s);
        return event;
        JSONException jsonexception;
        jsonexception;
        Log.v("Error parsing json as Event: %s", jsonexception, new Object[] {
            s
        });
_L2:
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
