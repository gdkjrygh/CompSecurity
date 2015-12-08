// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.api.model:
//            Model, Pin, Board, User, 
//            ModelHelper

public class ConversationMessage extends Model
{

    private String boardId;
    private Date cacheExpirationDate;
    private String conversationId;
    private Date createdAt;
    private String pinId;
    private String senderId;
    private String text;
    private String uid;
    private String userId;

    public ConversationMessage()
    {
    }

    public ConversationMessage(String s)
    {
        uid = s;
    }

    public ConversationMessage(String s, Date date, String s1, String s2, String s3, String s4, String s5, 
            String s6, Date date1)
    {
        uid = s;
        cacheExpirationDate = date;
        conversationId = s1;
        senderId = s2;
        pinId = s3;
        boardId = s4;
        userId = s5;
        text = s6;
        createdAt = date1;
    }

    public static ConversationMessageArtifact make(String s, PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        return make(s, pinterestjsonobject, flag, true);
    }

    public static ConversationMessageArtifact make(String s, PinterestJsonObject pinterestjsonobject, boolean flag, boolean flag1)
    {
        Board board1 = null;
        ConversationMessageArtifact conversationmessageartifact = new ConversationMessageArtifact();
        ConversationMessage conversationmessage = (ConversationMessage)pinterestjsonobject.a(com/pinterest/api/model/ConversationMessage);
        conversationmessage.setConversationId(s);
        s = pinterestjsonobject.c("sender");
        if (s != null)
        {
            conversationmessage.setSenderId(s.a("id", ""));
        }
        s = pinterestjsonobject.c("pin");
        Board board;
        Object obj;
        Object obj1;
        if (s != null)
        {
            s = Pin.make(s, false, false).getPin();
            conversationmessage.setPinId(s.getUid());
        } else
        {
            s = null;
        }
        obj = pinterestjsonobject.c("board");
        if (obj != null)
        {
            board = Board.make(((PinterestJsonObject) (obj)), false, false).getBoard();
            conversationmessage.setBoardId(((PinterestJsonObject) (obj)).a("id", null));
        } else
        {
            board = null;
        }
        obj = pinterestjsonobject.c("user");
        pinterestjsonobject = board1;
        if (obj != null)
        {
            pinterestjsonobject = User.make(((PinterestJsonObject) (obj)), false, false);
            conversationmessage.setUserId(((PinterestJsonObject) (obj)).a("id", null));
        }
        obj1 = s;
        obj = pinterestjsonobject;
        board1 = board;
        if (flag1)
        {
            obj1 = Pin.merge(s);
            board1 = Board.merge(board);
            obj = User.merge(pinterestjsonobject);
        }
        conversationmessageartifact.setMessage(conversationmessage);
        conversationmessageartifact.setPin(((Pin) (obj1)));
        conversationmessageartifact.setBoard(board1);
        conversationmessageartifact.setUser(((User) (obj)));
        if (flag)
        {
            ModelHelper.setConversationMessage(conversationmessage);
            ModelHelper.setPin(conversationmessageartifact.getPin());
            ModelHelper.setBoard(conversationmessageartifact.getBoard());
            if (obj != null)
            {
                ModelHelper.setPartner(((User) (obj)).getPartner());
            }
            ModelHelper.setUser(conversationmessageartifact.getUser());
        }
        return conversationmessageartifact;
    }

    public static List makeAll(String s, PinterestJsonArray pinterestjsonarray)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(s, pinterestjsonarray);
        return makeAll(((Map) (hashmap)));
    }

    public static List makeAll(Map map)
    {
        final ArrayList conversationMsgList;
        final ArrayList pinIds;
        final ArrayList boardIds;
        final ArrayList userIds;
        final ArrayList pins;
        final ArrayList boards;
        final ArrayList users;
        final ArrayList partners;
        conversationMsgList = new ArrayList();
        pinIds = new ArrayList();
        boardIds = new ArrayList();
        userIds = new ArrayList();
        pins = new ArrayList();
        boards = new ArrayList();
        users = new ArrayList();
        partners = new ArrayList();
        map = map.entrySet().iterator();
_L5:
        String s;
        Object obj;
        int i;
        do
        {
            if (!map.hasNext())
            {
                break MISSING_BLOCK_LABEL_329;
            }
            obj = (java.util.Map.Entry)map.next();
            s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (PinterestJsonArray)((java.util.Map.Entry) (obj)).getValue();
        } while (obj == null);
        i = 0;
_L3:
        if (i >= ((PinterestJsonArray) (obj)).a()) goto _L2; else goto _L1
_L1:
        ConversationMessageArtifact conversationmessageartifact = make(s, ((PinterestJsonArray) (obj)).d(i), false, false);
        if (conversationmessageartifact != null)
        {
            try
            {
                if (conversationmessageartifact.getMessage() != null)
                {
                    conversationMsgList.add(conversationmessageartifact.getMessage());
                }
                if (conversationmessageartifact.getPin() != null)
                {
                    pins.add(conversationmessageartifact.getPin());
                    pinIds.add(conversationmessageartifact.getPin().getUid());
                }
                if (conversationmessageartifact.getBoard() != null)
                {
                    boards.add(conversationmessageartifact.getBoard());
                    boardIds.add(conversationmessageartifact.getBoard().getUid());
                }
                if (conversationmessageartifact.getUser() != null)
                {
                    users.add(conversationmessageartifact.getUser());
                    userIds.add(conversationmessageartifact.getUser().getUid());
                    if (conversationmessageartifact.getUser().getPartner() != null)
                    {
                        partners.add(conversationmessageartifact.getUser().getPartner());
                    }
                }
            }
            catch (Exception exception) { }
        }
        i++;
          goto _L3
_L2:
        if (true) goto _L5; else goto _L4
_L4:
        (new _cls1()).execute();
        return conversationMsgList;
    }

    public String getBoardId()
    {
        return boardId;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getConversationId()
    {
        return conversationId;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getPinId()
    {
        return pinId;
    }

    public String getSenderId()
    {
        return senderId;
    }

    public String getText()
    {
        return text;
    }

    public String getUid()
    {
        return uid;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setBoardId(String s)
    {
        boardId = s;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setConversationId(String s)
    {
        conversationId = s;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setPinId(String s)
    {
        pinId = s;
    }

    public void setSenderId(String s)
    {
        senderId = s;
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUserId(String s)
    {
        userId = s;
    }

    private class ConversationMessageArtifact
    {

        private Board board;
        private ConversationMessage message;
        private Pin pin;
        private User user;

        public final Board getBoard()
        {
            return board;
        }

        public final ConversationMessage getMessage()
        {
            return message;
        }

        public final Pin getPin()
        {
            return pin;
        }

        public final User getUser()
        {
            return user;
        }

        public final void setBoard(Board board1)
        {
            board = board1;
        }

        public final void setMessage(ConversationMessage conversationmessage)
        {
            message = conversationmessage;
        }

        public final void setPin(Pin pin1)
        {
            pin = pin1;
        }

        public final void setUser(User user1)
        {
            user = user1;
        }

        public ConversationMessageArtifact()
        {
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final List val$boardIds;
        final List val$boards;
        final List val$conversationMsgList;
        final List val$partners;
        final List val$pinIds;
        final List val$pins;
        final List val$userIds;
        final List val$users;

        public final void run()
        {
            List list1 = ModelHelper.getPins(pinIds);
            List list2 = ModelHelper.getBoards(boardIds);
            List list = ModelHelper.getUsers(userIds);
            list1 = Pin.mergeAll(pins, list1);
            list2 = Board.mergeAll(boards, list2);
            list = User.mergeAll(users, list);
            ModelHelper.setConversationMessages(conversationMsgList);
            ModelHelper.setPins(list1);
            ModelHelper.setBoards(list2);
            ModelHelper.setPartners(partners);
            ModelHelper.setUsers(list);
        }

        _cls1()
        {
            pinIds = list;
            boardIds = list1;
            userIds = list2;
            pins = list3;
            boards = list4;
            users = list5;
            conversationMsgList = list6;
            partners = list7;
            super();
        }
    }

}
