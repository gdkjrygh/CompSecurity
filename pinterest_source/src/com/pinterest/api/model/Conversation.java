// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.utils.PStringUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Model, User, ConversationMessage, ModelHelper, 
//            MyUser

public class Conversation extends Model
{

    private List _emailList;
    private List _users;
    private Date cacheExpirationDate;
    private String emails;
    private String uid;
    private Integer unread;
    private String users;

    public Conversation()
    {
        unread = Integer.valueOf(0);
    }

    public Conversation(String s)
    {
        unread = Integer.valueOf(0);
        uid = s;
    }

    public Conversation(String s, Date date, String s1, String s2, Integer integer)
    {
        unread = Integer.valueOf(0);
        uid = s;
        cacheExpirationDate = date;
        users = s1;
        emails = s2;
        unread = integer;
    }

    public static Conversation make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static Conversation make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        boolean flag1 = false;
        if (pinterestjsonobject == null) goto _L2; else goto _L1
_L1:
        final Conversation conversation;
        final ArrayList users;
        conversation = (Conversation)pinterestjsonobject.a(com/pinterest/api/model/Conversation);
        users = pinterestjsonobject.e("emails");
        if (users.a() <= 0) goto _L4; else goto _L3
_L3:
        final ArrayList partners = new ArrayList();
        int i = 0;
_L11:
        if (i >= users.a()) goto _L6; else goto _L5
_L5:
        Object obj = users.a(i);
        if (obj == null) goto _L8; else goto _L7
_L7:
        partners.add(obj);
          goto _L8
_L6:
        conversation.setEmails(PStringUtils.concatStringArray(partners, ","));
        conversation.cacheEmailList(partners);
_L4:
        pinterestjsonobject = pinterestjsonobject.e("users");
        users = new ArrayList();
        partners = new ArrayList();
        obj = new ArrayList();
        i = ((flag1) ? 1 : 0);
_L12:
        if (i >= pinterestjsonobject.a()) goto _L10; else goto _L9
_L9:
        User user = User.make(pinterestjsonobject.d(i), false);
        if (user == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        try
        {
            ((List) (obj)).add(user.getUid());
            users.add(user);
            if (user.getPartner() != null)
            {
                partners.add(user.getPartner());
            }
            break MISSING_BLOCK_LABEL_252;
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject) { }
          goto _L2
_L10:
        conversation.setUsers(PStringUtils.concatStringArray(((List) (obj)), ","));
        conversation.cacheUsers(users);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        (new _cls2()).execute();
        return conversation;
_L2:
        return null;
_L8:
        i++;
          goto _L11
        i++;
          goto _L12
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        final ArrayList conversations = new ArrayList(pinterestjsonarray.a());
        HashMap hashmap = new HashMap();
        final ArrayList users = new ArrayList();
        for (int i = 0; i < pinterestjsonarray.a(); i++)
        {
            PinterestJsonObject pinterestjsonobject = pinterestjsonarray.c(i);
            if (pinterestjsonobject == null)
            {
                continue;
            }
            Conversation conversation = make(pinterestjsonobject, false);
            if (conversation != null)
            {
                conversations.add(conversation);
                users.addAll(conversation.getCachedUsers());
            }
            pinterestjsonobject = pinterestjsonobject.c("last_message");
            if (pinterestjsonobject != null)
            {
                PinterestJsonArray pinterestjsonarray1 = new PinterestJsonArray();
                pinterestjsonarray1.a(pinterestjsonobject);
                hashmap.put(conversation.getUid(), pinterestjsonarray1);
            }
        }

        if (!hashmap.isEmpty())
        {
            ConversationMessage.makeAll(hashmap);
        }
        (new _cls1()).execute();
        return conversations;
    }

    public void cacheEmailList(List list)
    {
        _emailList = list;
    }

    public void cacheUsers(List list)
    {
        _users = list;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public List getCachedEmailList()
    {
        if (_emailList == null && StringUtils.isNotBlank(emails))
        {
            _emailList = Arrays.asList(emails.split(","));
        }
        return _emailList;
    }

    public List getCachedUsers()
    {
        if (_users == null)
        {
            _users = ModelHelper.getUsers(Arrays.asList(users.split(",")));
        }
        return _users;
    }

    public List getConversationImageUrls()
    {
        Object obj = getCachedUsers();
        ArrayList arraylist = new ArrayList();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                User user = (User)((Iterator) (obj)).next();
                if (!MyUser.isUserMe(user.getUid()))
                {
                    arraylist.add(user.getImageLargeUrlByDpi());
                }
            } while (true);
        }
        return arraylist;
    }

    public String getConversationTitle()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = getCachedUsers();
        if (obj != null)
        {
            int i = 0;
            while (i < ((List) (obj)).size()) 
            {
                User user = (User)((List) (obj)).get(i);
                if (!MyUser.isUserMe(user.getUid()))
                {
                    if (isGroupConversation())
                    {
                        stringbuilder.append(user.getFirstName());
                        if (i + 1 < ((List) (obj)).size())
                        {
                            stringbuilder.append(", ");
                        }
                    } else
                    {
                        stringbuilder.append(user.getFullName());
                    }
                }
                i++;
            }
        }
        obj = getCachedEmailList();
        if (obj != null)
        {
            String s;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(s))
            {
                s = (String)((Iterator) (obj)).next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
            }

        }
        return stringbuilder.toString();
    }

    public String getEmails()
    {
        return emails;
    }

    public String getUid()
    {
        return uid;
    }

    public Integer getUnread()
    {
        return unread;
    }

    public String getUsers()
    {
        return users;
    }

    public boolean isGroupConversation()
    {
        boolean flag = false;
        int i;
        int j;
        if (getCachedUsers() != null)
        {
            i = getCachedUsers().size();
        } else
        {
            i = 0;
        }
        if (getCachedEmailList() != null)
        {
            j = getCachedEmailList().size();
        } else
        {
            j = 0;
        }
        if (i + j > 2)
        {
            flag = true;
        }
        return flag;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setEmails(String s)
    {
        emails = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUnread(Integer integer)
    {
        unread = integer;
    }

    public void setUsers(String s)
    {
        users = s;
    }

    private class _cls2 extends BackgroundTask
    {

        final Conversation val$conversation;
        final List val$partners;
        final List val$users;

        public final void run()
        {
            ModelHelper.setPartners(partners);
            ModelHelper.setUsers(users);
            ModelHelper.setConversation(conversation);
        }

        _cls2()
        {
            partners = list;
            users = list1;
            conversation = conversation1;
            super();
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final List val$conversations;
        final List val$users;

        public final void run()
        {
            if (!conversations.isEmpty())
            {
                ModelHelper.setConversations(conversations);
            }
            if (!users.isEmpty())
            {
                ModelHelper.setUsers(users);
            }
        }

        _cls1()
        {
            conversations = list;
            users = list1;
            super();
        }
    }

}
