// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.android.util.ImageSource;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.recents:
//            Recent

public class RecentItem
    implements Recent, ImageSource
{

    public static final PROPKEY CONVERSATION_PROPKEYS[];
    private static final int DIALOG_TYPE;
    private String displayName;
    private String identity;
    private byte imageData[];
    private int inboxTimeStamp;
    private int lastMessageId;
    private com.skype.Conversation.LOCAL_LIVESTATUS localLiveStatus;
    private int objectId;
    private String picture;
    private long timestamp;
    private int type;
    private int unreadCount;

    public RecentItem(Proptable proptable, int i)
    {
        objectId = proptable.getObjectID(i);
        type = proptable.getInt(i, PROPKEY.CONVERSATION_TYPE.toInt());
        identity = proptable.getStr(i, PROPKEY.CONVERSATION_IDENTITY.toInt());
        displayName = proptable.getStr(i, PROPKEY.CONVERSATION_DISPLAYNAME.toInt());
        picture = proptable.getStr(i, PROPKEY.CONVERSATION_PICTURE.toInt());
        imageData = proptable.getBin(i, PROPKEY.CONVERSATION_META_PICTURE.toInt());
        lastMessageId = proptable.getInt(i, PROPKEY.CONVERSATION_LAST_MESSAGE_ID.toInt());
        unreadCount = proptable.getInt(i, PROPKEY.CONVERSATION_UNCONSUMED_NORMAL_MESSAGES.toInt());
        inboxTimeStamp = proptable.getInt(i, PROPKEY.CONVERSATION_INBOX_TIMESTAMP.toInt());
        localLiveStatus = com.skype.Conversation.LOCAL_LIVESTATUS.fromInt(proptable.getInt(i, PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.toInt()));
        if (localLiveStatus == com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE || localLiveStatus == com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE)
        {
            i = proptable.getInt(i, PROPKEY.CONVERSATION_LIVE_START_TIMESTAMP.toInt());
        } else
        {
            i = proptable.getInt(i, PROPKEY.CONVERSATION_LAST_ACTIVITY_TIMESTAMP.toInt());
        }
        timestamp = (long)i & 0xffffffffL;
    }

    public int compareTo(Recent recent)
    {
        return TIME_COMPARATOR.compare(this, recent);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Recent)obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RecentItem)
        {
            obj = (Recent)obj;
            flag = flag1;
            if (getConversationObjectId() == ((Recent) (obj)).getConversationObjectId())
            {
                flag = true;
            }
        }
        return flag;
    }

    public int getConversationObjectId()
    {
        return objectId;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getIdentity()
    {
        return identity;
    }

    public byte[] getImageData()
    {
        return imageData;
    }

    public long getImageTimestamp()
    {
        return 0L;
    }

    public int getLastMessageObjectId()
    {
        return lastMessageId;
    }

    public com.skype.Conversation.LOCAL_LIVESTATUS getLiveStatus()
    {
        return localLiveStatus;
    }

    public int getObjectId()
    {
        return 0;
    }

    public String getPicture()
    {
        return picture;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public int getUnreadCount()
    {
        return unreadCount;
    }

    public int hashCode()
    {
        return getConversationObjectId();
    }

    public boolean isDialog()
    {
        return type == DIALOG_TYPE;
    }

    public boolean isInboxConversation()
    {
        return inboxTimeStamp > 0;
    }

    static 
    {
        CONVERSATION_PROPKEYS = (new PROPKEY[] {
            PROPKEY.CONVERSATION_IDENTITY, PROPKEY.CONVERSATION_TYPE, PROPKEY.CONVERSATION_LAST_MESSAGE_ID, PROPKEY.CONVERSATION_DISPLAYNAME, PROPKEY.CONVERSATION_META_PICTURE, PROPKEY.CONVERSATION_LOCAL_LIVESTATUS, PROPKEY.CONVERSATION_LAST_ACTIVITY_TIMESTAMP, PROPKEY.CONVERSATION_LIVE_START_TIMESTAMP, PROPKEY.CONVERSATION_INBOX_TIMESTAMP, PROPKEY.CONVERSATION_UNCONSUMED_NORMAL_MESSAGES, 
            PROPKEY.CONVERSATION_UNCONSUMED_MESSAGES_VOICE, PROPKEY.CONVERSATION_CREATION_TIMESTAMP, PROPKEY.CONVERSATION_PICTURE
        });
        DIALOG_TYPE = com.skype.Conversation.TYPE.DIALOG.toInt();
    }
}
