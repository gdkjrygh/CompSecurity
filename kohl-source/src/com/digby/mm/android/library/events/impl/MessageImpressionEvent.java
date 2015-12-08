// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import com.digby.mm.android.library.messages.IMessage;
import com.digby.mm.android.library.utils.Logger;
import java.util.Queue;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEvent

public class MessageImpressionEvent extends AbstractEvent
{

    private static final String TYPE_ID = "MESSAGE_IMPRESSION";
    private IMessage mMessage;

    public MessageImpressionEvent(Context context, IMessage imessage)
    {
        super(context);
        mMessage = imessage;
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
        jsonobject1.put("messageId", mMessage.getID());
        return jsonobject1;
    }

    String getTypeID()
    {
        return "MESSAGE_IMPRESSION";
    }
}
