// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import com.digby.mm.android.library.utils.Logger;
import java.util.Queue;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEvent

public class PushCallbackEvent extends AbstractEvent
{

    public static final String CALLBACK_DATA_FIELD = "callbackData";
    public static final String EVENT_ID_RECEIVED_FIELD = "notification";
    public static final String EVENT_ID_RETURN_FIELD = "eventId";
    private static final String TYPE_ID = "PUSH_CALLBACK";
    private final String mCallbackData;
    private final long mEventID;

    public PushCallbackEvent(Context context, long l, String s)
    {
        super(context);
        mEventID = l;
        mCallbackData = s;
    }

    public boolean addToQueue(Queue queue)
    {
        return true;
    }

    public JSONObject getJSON()
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = super.getJSON();
        }
        catch (Exception exception)
        {
            Logger.Error("getJSON", exception);
            return jsonobject;
        }
        jsonobject = jsonobject1;
        if (mEventID <= 0L)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        jsonobject = jsonobject1;
        jsonobject1.put("eventId", mEventID);
        jsonobject = jsonobject1;
        if (mCallbackData == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        jsonobject = jsonobject1;
        jsonobject1.put("callbackData", mCallbackData);
        return jsonobject1;
    }

    String getTypeID()
    {
        return "PUSH_CALLBACK";
    }
}
