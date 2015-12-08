// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import twitter4j.DirectMessage;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalParseUtil;

// Referenced classes of package twitter4j.internal.json:
//            TwitterResponseImpl, DataObjectFactoryUtil, ResponseListImpl, UserJSONImpl

final class DirectMessageJSONImpl extends TwitterResponseImpl
    implements DirectMessage, Serializable
{

    private static final long serialVersionUID = 0x9d68b11f622cb5f7L;
    private Date createdAt;
    private long id;
    private User recipient;
    private long recipientId;
    private String recipientScreenName;
    private User sender;
    private long senderId;
    private String senderScreenName;
    private String text;

    DirectMessageJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    DirectMessageJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
            DataObjectFactoryUtil.registerJSONObject(this, httpresponse);
        }
    }

    static ResponseList createDirectMessageList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        JSONArray jsonarray;
        JSONObject jsonobject;
        DirectMessageJSONImpl directmessagejsonimpl;
        int j;
        try
        {
            if (configuration.isJSONStoreEnabled())
            {
                DataObjectFactoryUtil.clearThreadLocalMap();
            }
            jsonarray = httpresponse.asJSONArray();
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw httpresponse;
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        jsonobject = jsonarray.getJSONObject(i);
        directmessagejsonimpl = new DirectMessageJSONImpl(jsonobject);
        httpresponse.add(directmessagejsonimpl);
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(directmessagejsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_119;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        id = z_T4JInternalParseUtil.getLong("id", jsonobject);
        text = z_T4JInternalParseUtil.getUnescapedString("text", jsonobject);
        senderId = z_T4JInternalParseUtil.getLong("sender_id", jsonobject);
        recipientId = z_T4JInternalParseUtil.getLong("recipient_id", jsonobject);
        createdAt = z_T4JInternalParseUtil.getDate("created_at", jsonobject);
        senderScreenName = z_T4JInternalParseUtil.getUnescapedString("sender_screen_name", jsonobject);
        recipientScreenName = z_T4JInternalParseUtil.getUnescapedString("recipient_screen_name", jsonobject);
        try
        {
            sender = new UserJSONImpl(jsonobject.getJSONObject("sender"));
            recipient = new UserJSONImpl(jsonobject.getJSONObject("recipient"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof DirectMessage))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((DirectMessage)obj).getId() == id) goto _L4; else goto _L5
_L5:
        return false;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public long getId()
    {
        return id;
    }

    public User getRecipient()
    {
        return recipient;
    }

    public long getRecipientId()
    {
        return recipientId;
    }

    public String getRecipientScreenName()
    {
        return recipientScreenName;
    }

    public User getSender()
    {
        return sender;
    }

    public long getSenderId()
    {
        return senderId;
    }

    public String getSenderScreenName()
    {
        return senderScreenName;
    }

    public String getText()
    {
        return text;
    }

    public int hashCode()
    {
        return (int)id;
    }

    public String toString()
    {
        return "DirectMessageJSONImpl{id=" + id + ", text='" + text + '\'' + ", sender_id=" + senderId + ", recipient_id=" + recipientId + ", created_at=" + createdAt + ", sender_screen_name='" + senderScreenName + '\'' + ", recipient_screen_name='" + recipientScreenName + '\'' + ", sender=" + sender + ", recipient=" + recipient + '}';
    }
}
