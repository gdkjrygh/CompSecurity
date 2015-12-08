// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.SkyLib;

public class MessageItem
{

    public static final PROPKEY MESSAGE_PROPKEYS[];
    private final String author;
    private final int conversationId;
    private final String conversationIdentity;
    private final String message;
    private final int objectId;
    private long timestamp;

    public MessageItem(SkyLib skylib, Proptable proptable, int i)
    {
        objectId = proptable.getObjectID(i);
        author = proptable.getStr(i, PROPKEY.MESSAGE_AUTHOR.toInt());
        conversationId = proptable.getInt(i, PROPKEY.MESSAGE_CONVO_ID.toInt());
        message = skylib.contentStripXML(proptable.getStr(i, PROPKEY.MESSAGE_BODY_XML.toInt())).m_result;
        conversationIdentity = proptable.getStr(i, PROPKEY.CHATMSG_CHATNAME.toInt());
        timestamp = (long)proptable.getInt(i, PROPKEY.MESSAGE_TIMESTAMP.toInt()) & 0xffffffffL;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MessageItem)
        {
            obj = (MessageItem)obj;
            flag = flag1;
            if (getMessageObjectId() == ((MessageItem) (obj)).getMessageObjectId())
            {
                flag = true;
            }
        }
        return flag;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getConversationId()
    {
        return conversationId;
    }

    public String getConversationIdentity()
    {
        return conversationIdentity;
    }

    public String getMessage()
    {
        return message;
    }

    public int getMessageObjectId()
    {
        return objectId;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public int hashCode()
    {
        return getMessageObjectId();
    }

    static 
    {
        MESSAGE_PROPKEYS = (new PROPKEY[] {
            PROPKEY.MESSAGE_AUTHOR, PROPKEY.MESSAGE_CONVO_ID, PROPKEY.MESSAGE_BODY_XML, PROPKEY.MESSAGE_TIMESTAMP, PROPKEY.CHATMSG_CHATNAME
        });
    }
}
