// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import com.fitbit.util.format.e;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class Message extends Entity
    implements b
{
    public static final class MessageType extends Enum
    {

        private static final MessageType $VALUES[];
        public static final MessageType CHEER;
        public static final MessageType MESSAGE;
        public static final MessageType TAUNT;

        public static MessageType valueOf(String s)
        {
            return (MessageType)Enum.valueOf(com/fitbit/data/domain/Message$MessageType, s);
        }

        public static MessageType[] values()
        {
            return (MessageType[])$VALUES.clone();
        }

        static 
        {
            MESSAGE = new MessageType("MESSAGE", 0);
            CHEER = new MessageType("CHEER", 1);
            TAUNT = new MessageType("TAUNT", 2);
            $VALUES = (new MessageType[] {
                MESSAGE, CHEER, TAUNT
            });
        }

        private MessageType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int a = 30;
    private String body;
    private String from;
    private MessageType messageType;
    private String to;

    public Message()
    {
    }

    public String a()
    {
        return from;
    }

    public void a(MessageType messagetype)
    {
        messageType = messagetype;
    }

    public void a(String s)
    {
        from = s;
    }

    public String b()
    {
        return to;
    }

    public void b(String s)
    {
        to = s;
    }

    public MessageType c()
    {
        return messageType;
    }

    public void c(String s)
    {
        body = s;
    }

    public String d()
    {
        return body;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        setServerId(jsonobject.getLong("messageId"));
        setTimeCreated(e.f(jsonobject.getString("dateTime")));
        if (getTimeCreated() == null)
        {
            throw new JSONException((new StringBuilder()).append("Parse failed for date: ").append(jsonobject.getString("dateTime")).toString());
        }
        a(jsonobject.getString("from"));
        b(jsonobject.getString("to"));
        try
        {
            a(MessageType.valueOf(jsonobject.getString("type").toUpperCase()));
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        c(jsonobject.optString("body", null));
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
