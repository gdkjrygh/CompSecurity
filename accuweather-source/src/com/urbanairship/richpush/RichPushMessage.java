// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.database.Cursor;
import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushManager, RichPushInbox

public class RichPushMessage
    implements Comparable
{

    static final SimpleDateFormat UA_DATE_FORMATTER;
    boolean deleted;
    Long expirationMS;
    Bundle extras;
    String messageBodyUrl;
    String messageId;
    String messageReadUrl;
    String messageUrl;
    JSONObject rawMessageJSON;
    long sentMS;
    String title;
    boolean unreadClient;
    boolean unreadOrigin;

    RichPushMessage(String s)
    {
        deleted = false;
        messageId = s;
    }

    private boolean areObjectsEqual(Object obj, Object obj1)
    {
        if (obj == null && obj1 == null)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    private RichPushInbox getInbox()
    {
        return UAirship.shared().getRichPushManager().getRichPushInbox();
    }

    static Long getMillisecondsFromTimeStamp(String s, Long long1)
    {
        Long long2 = long1;
        if (s != null)
        {
            long l;
            try
            {
                l = UA_DATE_FORMATTER.parse(s).getTime();
            }
            catch (Exception exception)
            {
                Logger.error((new StringBuilder()).append("Couldn't parse message date: ").append(s).append(", defaulting to:").append(long1).append(".").toString());
                return long1;
            }
            long2 = Long.valueOf(l);
        }
        return long2;
    }

    private static Bundle jsonToBundle(JSONObject jsonobject)
        throws JSONException
    {
        Bundle bundle = new Bundle();
        if (jsonobject != null)
        {
            String s;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); bundle.putString(s, jsonobject.getString(s)))
            {
                s = (String)iterator.next();
            }

        }
        return bundle;
    }

    static RichPushMessage messageFromCursor(Cursor cursor)
        throws JSONException
    {
        boolean flag1 = true;
        RichPushMessage richpushmessage = new RichPushMessage(cursor.getString(cursor.getColumnIndex("message_id")));
        richpushmessage.messageUrl = cursor.getString(cursor.getColumnIndex("message_url"));
        richpushmessage.messageBodyUrl = cursor.getString(cursor.getColumnIndex("message_body_url"));
        richpushmessage.messageReadUrl = cursor.getString(cursor.getColumnIndex("message_read_url"));
        Object obj;
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndex("unread")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        richpushmessage.unreadClient = flag;
        if (cursor.getInt(cursor.getColumnIndex("unread_orig")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        richpushmessage.unreadOrigin = flag;
        richpushmessage.extras = jsonToBundle(new JSONObject(cursor.getString(cursor.getColumnIndex("extra"))));
        richpushmessage.title = cursor.getString(cursor.getColumnIndex("title"));
        richpushmessage.sentMS = getMillisecondsFromTimeStamp(cursor.getString(cursor.getColumnIndex("timestamp")), Long.valueOf(System.currentTimeMillis())).longValue();
        if (cursor.getInt(cursor.getColumnIndex("deleted")) == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        richpushmessage.deleted = flag;
        obj = cursor.getString(cursor.getColumnIndex("raw_message_object"));
        if (obj == null)
        {
            obj = new JSONObject();
        } else
        {
            obj = new JSONObject(((String) (obj)));
        }
        richpushmessage.rawMessageJSON = ((JSONObject) (obj));
        richpushmessage.expirationMS = getMillisecondsFromTimeStamp(cursor.getString(cursor.getColumnIndex("expiration_timestamp")), null);
        return richpushmessage;
    }

    public int compareTo(RichPushMessage richpushmessage)
    {
        return getMessageId().compareTo(richpushmessage.getMessageId());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((RichPushMessage)obj);
    }

    public void delete()
    {
        if (!deleted)
        {
            deleted = true;
            if (getInbox() != null)
            {
                HashSet hashset = new HashSet();
                hashset.add(messageId);
                getInbox().deleteMessages(hashset);
            }
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && (obj instanceof RichPushMessage)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        obj = (RichPushMessage)obj;
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        if (!areObjectsEqual(messageId, ((RichPushMessage) (obj)).messageId) || !areObjectsEqual(messageBodyUrl, ((RichPushMessage) (obj)).messageBodyUrl) || !areObjectsEqual(messageReadUrl, ((RichPushMessage) (obj)).messageReadUrl) || !areObjectsEqual(messageUrl, ((RichPushMessage) (obj)).messageUrl) || !areObjectsEqual(extras, ((RichPushMessage) (obj)).extras) || unreadClient != ((RichPushMessage) (obj)).unreadClient)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (sentMS == ((RichPushMessage) (obj)).sentMS) goto _L4; else goto _L5
_L5:
        return false;
    }

    public Date getExpirationDate()
    {
        if (expirationMS != null)
        {
            return new Date(expirationMS.longValue());
        } else
        {
            return null;
        }
    }

    public Long getExpirationDateMS()
    {
        return expirationMS;
    }

    public Bundle getExtras()
    {
        return extras;
    }

    public String getMessageBodyUrl()
    {
        return messageBodyUrl;
    }

    public String getMessageId()
    {
        return messageId;
    }

    public String getMessageReadUrl()
    {
        return messageReadUrl;
    }

    public String getMessageUrl()
    {
        return messageUrl;
    }

    public JSONObject getRawMessageJSON()
    {
        return rawMessageJSON;
    }

    public Date getSentDate()
    {
        return new Date(sentMS);
    }

    public long getSentDateMS()
    {
        return sentMS;
    }

    public String getTitle()
    {
        return title;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (unreadClient)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (!deleted)
        {
            j = 1;
        }
        return ((i + 629) * 37 + j) * 37 + messageId.hashCode();
    }

    public boolean isDeleted()
    {
        return deleted;
    }

    public boolean isExpired()
    {
        while (expirationMS == null || System.currentTimeMillis() < expirationMS.longValue()) 
        {
            return false;
        }
        return true;
    }

    public boolean isRead()
    {
        return !unreadClient;
    }

    public void markRead()
    {
        if (unreadClient)
        {
            unreadClient = false;
            if (getInbox() != null)
            {
                HashSet hashset = new HashSet();
                hashset.add(messageId);
                getInbox().markMessagesRead(hashset);
            }
        }
    }

    public void markUnread()
    {
        if (!unreadClient)
        {
            unreadClient = true;
            if (getInbox() != null)
            {
                HashSet hashset = new HashSet();
                hashset.add(messageId);
                getInbox().markMessagesUnread(hashset);
            }
        }
    }

    static 
    {
        UA_DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        UA_DATE_FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
