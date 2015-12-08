// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterResponseImpl, DirectMessage, TwitterException, HttpResponse, 
//            TwitterObjectFactory, JSONException, JSONArray, ResponseListImpl, 
//            ResponseList, ParseUtil, UserJSONImpl, JSONObject, 
//            UserMentionEntity, UserMentionEntityJSONImpl, URLEntity, URLEntityJSONImpl, 
//            HashtagEntity, HashtagEntityJSONImpl, SymbolEntity, MediaEntity, 
//            MediaEntityJSONImpl, HTMLEntity, User

final class DirectMessageJSONImpl extends TwitterResponseImpl
    implements Serializable, DirectMessage
{

    private static final long serialVersionUID = 0x626f10a4d0a22d89L;
    private Date createdAt;
    private MediaEntity extendedMediaEntities[];
    private HashtagEntity hashtagEntities[];
    private long id;
    private MediaEntity mediaEntities[];
    private User recipient;
    private long recipientId;
    private String recipientScreenName;
    private User sender;
    private long senderId;
    private String senderScreenName;
    private SymbolEntity symbolEntities[];
    private String text;
    private URLEntity urlEntities[];
    private UserMentionEntity userMentionEntities[];

    DirectMessageJSONImpl(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        super(httpresponse);
        httpresponse = httpresponse.asJSONObject();
        init(httpresponse);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, httpresponse);
        }
    }

    DirectMessageJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
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
                TwitterObjectFactory.clearThreadLocalMap();
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
            TwitterObjectFactory.registerJSONObject(directmessagejsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_116;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        boolean flag;
        flag = false;
        id = ParseUtil.getLong("id", jsonobject);
        senderId = ParseUtil.getLong("sender_id", jsonobject);
        recipientId = ParseUtil.getLong("recipient_id", jsonobject);
        createdAt = ParseUtil.getDate("created_at", jsonobject);
        senderScreenName = ParseUtil.getUnescapedString("sender_screen_name", jsonobject);
        recipientScreenName = ParseUtil.getUnescapedString("recipient_screen_name", jsonobject);
        sender = new UserJSONImpl(jsonobject.getJSONObject("sender"));
        recipient = new UserJSONImpl(jsonobject.getJSONObject("recipient"));
        if (jsonobject.isNull("entities")) goto _L2; else goto _L1
_L1:
        Object obj = jsonobject.getJSONObject("entities");
        if (((JSONObject) (obj)).isNull("user_mentions")) goto _L4; else goto _L3
_L3:
        JSONArray jsonarray;
        int j;
        jsonarray = ((JSONObject) (obj)).getJSONArray("user_mentions");
        j = jsonarray.length();
        userMentionEntities = new UserMentionEntity[j];
        int i = 0;
        while (i < j) 
        {
            Object aobj[];
            int k;
            try
            {
                userMentionEntities[i] = new UserMentionEntityJSONImpl(jsonarray.getJSONObject(i));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new TwitterException(jsonobject);
            }
            i++;
        }
_L4:
        if (((JSONObject) (obj)).isNull("urls")) goto _L6; else goto _L5
_L5:
        jsonarray = ((JSONObject) (obj)).getJSONArray("urls");
        k = jsonarray.length();
        urlEntities = new URLEntity[k];
        i = 0;
_L7:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        urlEntities[i] = new URLEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        if (((JSONObject) (obj)).isNull("hashtags")) goto _L9; else goto _L8
_L8:
        jsonarray = ((JSONObject) (obj)).getJSONArray("hashtags");
        k = jsonarray.length();
        hashtagEntities = new HashtagEntity[k];
        i = 0;
_L10:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        hashtagEntities[i] = new HashtagEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        if (((JSONObject) (obj)).isNull("symbols")) goto _L12; else goto _L11
_L11:
        jsonarray = ((JSONObject) (obj)).getJSONArray("symbols");
        k = jsonarray.length();
        symbolEntities = new SymbolEntity[k];
        i = 0;
_L13:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        symbolEntities[i] = new HashtagEntityJSONImpl(jsonarray.getJSONObject(i));
        i++;
        if (true) goto _L13; else goto _L12
_L12:
        if (((JSONObject) (obj)).isNull("media")) goto _L2; else goto _L14
_L14:
        obj = ((JSONObject) (obj)).getJSONArray("media");
        k = ((JSONArray) (obj)).length();
        mediaEntities = new MediaEntity[k];
        i = ((flag) ? 1 : 0);
_L15:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        mediaEntities[i] = new MediaEntityJSONImpl(((JSONArray) (obj)).getJSONObject(i));
        i++;
        if (true) goto _L15; else goto _L2
_L2:
        if (userMentionEntities != null) goto _L17; else goto _L16
_L16:
        aobj = new UserMentionEntity[0];
_L26:
        userMentionEntities = ((UserMentionEntity []) (aobj));
        if (urlEntities != null) goto _L19; else goto _L18
_L18:
        aobj = new URLEntity[0];
_L27:
        urlEntities = ((URLEntity []) (aobj));
        if (hashtagEntities != null) goto _L21; else goto _L20
_L20:
        aobj = new HashtagEntity[0];
_L28:
        hashtagEntities = ((HashtagEntity []) (aobj));
        if (symbolEntities != null) goto _L23; else goto _L22
_L22:
        aobj = new SymbolEntity[0];
_L29:
        symbolEntities = ((SymbolEntity []) (aobj));
        if (mediaEntities != null) goto _L25; else goto _L24
_L24:
        aobj = new MediaEntity[0];
_L30:
        mediaEntities = ((MediaEntity []) (aobj));
        if (extendedMediaEntities != null)
        {
            break MISSING_BLOCK_LABEL_636;
        }
        aobj = new MediaEntity[0];
_L31:
        extendedMediaEntities = ((MediaEntity []) (aobj));
        text = HTMLEntity.unescapeAndSlideEntityIncdices(jsonobject.getString("text"), userMentionEntities, urlEntities, hashtagEntities, mediaEntities);
        return;
_L17:
        aobj = userMentionEntities;
          goto _L26
_L19:
        aobj = urlEntities;
          goto _L27
_L21:
        aobj = hashtagEntities;
          goto _L28
_L23:
        aobj = symbolEntities;
          goto _L29
_L25:
        aobj = mediaEntities;
          goto _L30
        aobj = extendedMediaEntities;
          goto _L31
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

    public MediaEntity[] getExtendedMediaEntities()
    {
        return extendedMediaEntities;
    }

    public HashtagEntity[] getHashtagEntities()
    {
        return hashtagEntities;
    }

    public long getId()
    {
        return id;
    }

    public MediaEntity[] getMediaEntities()
    {
        return mediaEntities;
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

    public SymbolEntity[] getSymbolEntities()
    {
        return symbolEntities;
    }

    public String getText()
    {
        return text;
    }

    public URLEntity[] getURLEntities()
    {
        return urlEntities;
    }

    public UserMentionEntity[] getUserMentionEntities()
    {
        return userMentionEntities;
    }

    public int hashCode()
    {
        return (int)id;
    }

    public String toString()
    {
        Object obj = null;
        StringBuilder stringbuilder = (new StringBuilder()).append("DirectMessageJSONImpl{id=").append(id).append(", text='").append(text).append('\'').append(", sender_id=").append(senderId).append(", recipient_id=").append(recipientId).append(", created_at=").append(createdAt).append(", userMentionEntities=");
        java.util.List list;
        if (userMentionEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(userMentionEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", urlEntities=");
        if (urlEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(urlEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", hashtagEntities=");
        if (hashtagEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(hashtagEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", sender_screen_name='").append(senderScreenName).append('\'').append(", recipient_screen_name='").append(recipientScreenName).append('\'').append(", sender=").append(sender).append(", recipient=").append(recipient).append(", userMentionEntities=");
        if (userMentionEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(userMentionEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", urlEntities=");
        if (urlEntities == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(urlEntities);
        }
        stringbuilder = stringbuilder.append(list).append(", hashtagEntities=");
        if (hashtagEntities == null)
        {
            list = obj;
        } else
        {
            list = Arrays.asList(hashtagEntities);
        }
        return stringbuilder.append(list).append('}').toString();
    }
}
