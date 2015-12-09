// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk;

import com.uservoice.uservoicesdk.model.Attachment;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.ClientConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk:
//            Session

public class Config extends BaseModel
{

    private List attachmentList;
    private Map customFields;
    private String email;
    private int forumId;
    private String guid;
    private String key;
    private String name;
    private String secret;
    private boolean showContactUs;
    private boolean showForum;
    private boolean showKnowledgeBase;
    private boolean showPostIdea;
    private String site;
    private int topicId;
    private Map userTraits;

    public Config()
    {
        customFields = new HashMap();
        topicId = -1;
        forumId = -1;
        showForum = true;
        showPostIdea = true;
        showContactUs = true;
        showKnowledgeBase = true;
        userTraits = new HashMap();
        attachmentList = new ArrayList();
    }

    public Config(String s)
    {
        customFields = new HashMap();
        topicId = -1;
        forumId = -1;
        showForum = true;
        showPostIdea = true;
        showContactUs = true;
        showKnowledgeBase = true;
        userTraits = new HashMap();
        attachmentList = new ArrayList();
        site = s;
    }

    public Config(String s, String s1, String s2)
    {
        customFields = new HashMap();
        topicId = -1;
        forumId = -1;
        showForum = true;
        showPostIdea = true;
        showContactUs = true;
        showKnowledgeBase = true;
        userTraits = new HashMap();
        attachmentList = new ArrayList();
        site = s;
        key = s1;
        secret = s2;
    }

    public void addAttachment(Attachment attachment)
    {
        if (attachment != null)
        {
            attachmentList.add(attachment);
        }
    }

    public List getAttachmentList()
    {
        return attachmentList;
    }

    public Map getCustomFields()
    {
        return customFields;
    }

    public String getEmail()
    {
        return email;
    }

    public int getForumId()
    {
        if (forumId == -1 && Session.getInstance().getClientConfig() != null)
        {
            return Session.getInstance().getClientConfig().getDefaultForumId();
        } else
        {
            return forumId;
        }
    }

    public String getGuid()
    {
        return guid;
    }

    public String getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getSite()
    {
        return site;
    }

    public int getTopicId()
    {
        return topicId;
    }

    public Map getUserTraits()
    {
        return userTraits;
    }

    public void identifyUser(String s, String s1, String s2)
    {
        guid = s;
        name = s1;
        email = s2;
        putUserTrait("id", s);
        putUserTrait("name", s1);
        putUserTrait("email", s2);
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        site = getString(jsonobject, "site");
        key = getString(jsonobject, "key");
        secret = getString(jsonobject, "secret");
        email = getString(jsonobject, "email");
        name = getString(jsonobject, "name");
        guid = getString(jsonobject, "guid");
        customFields = deserializeStringMap(jsonobject.getJSONObject("customFields"));
        topicId = jsonobject.getInt("topicId");
        forumId = jsonobject.getInt("forumId");
        showForum = jsonobject.getBoolean("showForum");
        showPostIdea = jsonobject.getBoolean("showPostIdea");
        showContactUs = jsonobject.getBoolean("showContactUs");
        showKnowledgeBase = jsonobject.getBoolean("showKnowledgeBase");
        userTraits = deserializeMap(jsonobject.getJSONObject("userTraits"));
        attachmentList = deserializeList(jsonobject, "attachmentList", com/uservoice/uservoicesdk/model/Attachment);
    }

    public void putAccountTrait(String s, float f)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), f);
    }

    public void putAccountTrait(String s, int i)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), i);
    }

    public void putAccountTrait(String s, String s1)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), s1);
    }

    public void putAccountTrait(String s, Date date)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), date);
    }

    public void putAccountTrait(String s, boolean flag)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), flag);
    }

    public void putUserTrait(String s, float f)
    {
        userTraits.put(s, Float.valueOf(f));
    }

    public void putUserTrait(String s, int i)
    {
        userTraits.put(s, Integer.valueOf(i));
    }

    public void putUserTrait(String s, String s1)
    {
        userTraits.put(s, s1);
    }

    public void putUserTrait(String s, Date date)
    {
        userTraits.put(s, Long.valueOf(date.getTime() / 1000L));
    }

    public void putUserTrait(String s, boolean flag)
    {
        userTraits.put(s, Boolean.valueOf(flag));
    }

    public void save(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject.put("site", site);
        jsonobject.put("key", key);
        jsonobject.put("secret", secret);
        jsonobject.put("email", email);
        jsonobject.put("name", name);
        jsonobject.put("guid", guid);
        jsonobject.put("customFields", serializeStringMap(customFields));
        jsonobject.put("topicId", topicId);
        jsonobject.put("forumId", forumId);
        jsonobject.put("showForum", showForum);
        jsonobject.put("showPostIdea", showPostIdea);
        jsonobject.put("showContactUs", showContactUs);
        jsonobject.put("showKnowledgeBase", showKnowledgeBase);
        jsonobject.put("userTraits", serializeMap(userTraits));
        jsonobject.put("attachmentList", serializeList(attachmentList));
    }

    public void setCustomFields(Map map)
    {
        customFields = map;
    }

    public void setForumId(int i)
    {
        forumId = i;
    }

    public void setShowContactUs(boolean flag)
    {
        showContactUs = flag;
    }

    public void setShowForum(boolean flag)
    {
        showForum = flag;
    }

    public void setShowKnowledgeBase(boolean flag)
    {
        showKnowledgeBase = flag;
    }

    public void setShowPostIdea(boolean flag)
    {
        showPostIdea = flag;
    }

    public void setTopicId(int i)
    {
        topicId = i;
    }

    public boolean shouldShowContactUs()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isTicketSystemEnabled())
        {
            return false;
        } else
        {
            return showContactUs;
        }
    }

    public boolean shouldShowForum()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isFeedbackEnabled())
        {
            return false;
        } else
        {
            return showForum;
        }
    }

    public boolean shouldShowKnowledgeBase()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isTicketSystemEnabled())
        {
            return false;
        } else
        {
            return showKnowledgeBase;
        }
    }

    public boolean shouldShowPostIdea()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isFeedbackEnabled())
        {
            return false;
        } else
        {
            return showPostIdea;
        }
    }
}
