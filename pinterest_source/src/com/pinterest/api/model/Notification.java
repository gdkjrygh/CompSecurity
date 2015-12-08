// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.log.PLog;
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
//            Model, NotificationTemplate, User, Board, 
//            Pin

public class Notification extends Model
{

    private Date cacheExpirationDate;
    private Map sectionMap;
    private String sectionsJson;
    private String style;
    private String uid;

    public Notification()
    {
    }

    public Notification(String s)
    {
        uid = s;
    }

    public Notification(String s, Date date, String s1, String s2)
    {
        uid = s;
        cacheExpirationDate = date;
        style = s1;
        sectionsJson = s2;
    }

    public static NotificationArtifact make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        NotificationArtifact notificationartifact;
        final ArrayList partners;
        final ArrayList users;
        final ArrayList userIds;
        final ArrayList boards;
        final ArrayList boardIds;
        final ArrayList pins;
        final ArrayList pinIds;
        final ArrayList templates;
        final Notification notification;
        HashMap hashmap;
        PinterestJsonObject pinterestjsonobject2;
        Iterator iterator;
        notificationartifact = new NotificationArtifact();
        partners = new ArrayList();
        users = new ArrayList();
        userIds = new ArrayList();
        boards = new ArrayList();
        boardIds = new ArrayList();
        pins = new ArrayList();
        pinIds = new ArrayList();
        templates = new ArrayList();
        notification = (Notification)pinterestjsonobject.a(com/pinterest/api/model/Notification);
        notification.setStyle(notification.getStyle().toUpperCase());
        notificationartifact.setNotification(notification);
        hashmap = new HashMap();
        pinterestjsonobject2 = pinterestjsonobject.c("sections");
        if (pinterestjsonobject2 == null)
        {
            return null;
        }
        iterator = pinterestjsonobject2.d().iterator();
_L2:
        Object obj;
        Object obj1;
        String s1;
        String s2;
        HashMap hashmap1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_627;
            }
            s1 = (String)iterator.next();
            obj1 = pinterestjsonobject2.c(s1);
        } while (obj1 == null);
        s2 = ((PinterestJsonObject) (obj1)).a("type", "");
        obj = null;
        pinterestjsonobject = "";
        hashmap1 = new HashMap();
        if (!s2.equals("template_section"))
        {
            break; /* Loop/switch isn't completed */
        }
        PinterestJsonObject pinterestjsonobject1 = ((PinterestJsonObject) (obj1)).c("data");
        if (pinterestjsonobject1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((PinterestJsonObject) (obj1)).a("data_type", "");
        pinterestjsonobject = (new StringBuilder()).append(notification.getUid()).append(":").append(s1).toString();
        templates.add(NotificationTemplate.make(pinterestjsonobject1, pinterestjsonobject, ((PinterestJsonObject) (obj1)).a("template", ""), false));
_L4:
        hashmap1.put("data_id", pinterestjsonobject);
        hashmap1.put("data_type", obj);
        hashmap1.put("type", s2);
        hashmap.put(s1, hashmap1);
        if (true) goto _L2; else goto _L1
_L1:
        if (!s2.equals("model_section"))
        {
            break MISSING_BLOCK_LABEL_569;
        }
        obj = ((PinterestJsonObject) (obj1)).c("data");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj1 = ((PinterestJsonObject) (obj)).a("type", "");
        if (((String) (obj1)).equals("user"))
        {
            User user = User.make(((PinterestJsonObject) (obj)), false, false);
            users.add(user);
            String s = user.getUid();
            userIds.add(s);
            pinterestjsonobject = s;
            obj = obj1;
            if (user.getPartner() != null)
            {
                partners.add(user.getPartner());
                pinterestjsonobject = s;
                obj = obj1;
            }
        } else
        if (((String) (obj1)).equals("board"))
        {
            pinterestjsonobject = Board.make(((PinterestJsonObject) (obj)), false, false).getBoard();
            boards.add(pinterestjsonobject);
            pinterestjsonobject = pinterestjsonobject.getUid();
            boardIds.add(pinterestjsonobject);
            obj = obj1;
        } else
        if (((String) (obj1)).equals("pin"))
        {
            pinterestjsonobject = Pin.make(((PinterestJsonObject) (obj)), false, false).getPin();
            pins.add(pinterestjsonobject);
            pinterestjsonobject = pinterestjsonobject.getUid();
            pinIds.add(pinterestjsonobject);
            obj = obj1;
        } else
        {
            PLog.error((new StringBuilder("unknown dataType: ")).append(((String) (obj1))).toString(), new Object[0]);
            obj = obj1;
        }
          goto _L4
        if (s2.equals("date_section"))
        {
            obj = ((PinterestJsonObject) (obj1)).a("data_type", "");
            pinterestjsonobject = ((PinterestJsonObject) (obj1)).a("data", "");
        } else
        {
            PLog.error((new StringBuilder("unknown section type: ")).append(s2).toString(), new Object[0]);
        }
          goto _L4
        notification.setSectionsJson((new PinterestJsonObject(hashmap)).toString());
        notificationartifact.setUsers(users);
        notificationartifact.setUserIds(userIds);
        notificationartifact.setBoards(boards);
        notificationartifact.setBoardIds(boardIds);
        notificationartifact.setPins(pins);
        notificationartifact.setPinIds(pinIds);
        notificationartifact.setNotificationTemplates(templates);
        notificationartifact.setNotification(notification);
        if (flag)
        {
            (new _cls1()).execute();
        }
        return notificationartifact;
    }

    public static Notification make(PinterestJsonObject pinterestjsonobject)
    {
        pinterestjsonobject = make(pinterestjsonobject, true);
        if (pinterestjsonobject == null)
        {
            return null;
        } else
        {
            return pinterestjsonobject.getNotification();
        }
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        final ArrayList notifications = new ArrayList();
        if (pinterestjsonarray == null)
        {
            return notifications;
        }
        final ArrayList users = new ArrayList();
        final ArrayList userIds = new ArrayList();
        final ArrayList boards = new ArrayList();
        final ArrayList boardIds = new ArrayList();
        final ArrayList pins = new ArrayList();
        final ArrayList pinIds = new ArrayList();
        final ArrayList templates = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            NotificationArtifact notificationartifact = make(pinterestjsonarray.d(i), false);
            if (notificationartifact != null)
            {
                notifications.add(notificationartifact.getNotification());
                users.addAll(notificationartifact.getUsers());
                userIds.addAll(notificationartifact.getUserIds());
                boards.addAll(notificationartifact.getBoards());
                boardIds.addAll(notificationartifact.getBoardIds());
                pins.addAll(notificationartifact.getPins());
                pinIds.addAll(notificationartifact.getPinIds());
                templates.addAll(notificationartifact.getNotificationTemplates());
            }
        }

        (new _cls2()).execute();
        return notifications;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public Style getNotificationStyle()
    {
        return Style.parse(style);
    }

    public NotificationSection getSection(String s)
    {
        if (sectionMap == null)
        {
            sectionMap = new HashMap();
            PinterestJsonObject pinterestjsonobject = new PinterestJsonObject(getSectionsJson());
            Iterator iterator = pinterestjsonobject.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c(s1);
                if (pinterestjsonobject1 != null)
                {
                    DataType datatype = DataType.parse(pinterestjsonobject1.a("data_type", null));
                    SectionType sectiontype = SectionType.parse(pinterestjsonobject1.a("type", null));
                    if (datatype != null && sectiontype != null)
                    {
                        NotificationSection notificationsection = new NotificationSection();
                        notificationsection.setDataType(datatype);
                        notificationsection.setDataId(pinterestjsonobject1.a("data_id", null));
                        notificationsection.setType(sectiontype);
                        sectionMap.put(s1, notificationsection);
                    }
                }
            } while (true);
        }
        return (NotificationSection)sectionMap.get(s);
    }

    public String getSectionsJson()
    {
        return sectionsJson;
    }

    public String getStyle()
    {
        return style;
    }

    public String getUid()
    {
        return uid;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setSectionsJson(String s)
    {
        sectionsJson = s;
    }

    public void setStyle(String s)
    {
        style = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    private class NotificationArtifact
    {

        private List _boardIds;
        private List _boards;
        private Notification _notification;
        private List _notificationTemplates;
        private List _pinIds;
        private List _pins;
        private List _userIds;
        private List _users;

        public final List getBoardIds()
        {
            return _boardIds;
        }

        public final List getBoards()
        {
            return _boards;
        }

        public final Notification getNotification()
        {
            return _notification;
        }

        public final List getNotificationTemplates()
        {
            return _notificationTemplates;
        }

        public final List getPinIds()
        {
            return _pinIds;
        }

        public final List getPins()
        {
            return _pins;
        }

        public final List getUserIds()
        {
            return _userIds;
        }

        public final List getUsers()
        {
            return _users;
        }

        public final void setBoardIds(List list)
        {
            _boardIds = list;
        }

        public final void setBoards(List list)
        {
            _boards = list;
        }

        public final void setNotification(Notification notification)
        {
            _notification = notification;
        }

        public final void setNotificationTemplates(List list)
        {
            _notificationTemplates = list;
        }

        public final void setPinIds(List list)
        {
            _pinIds = list;
        }

        public final void setPins(List list)
        {
            _pins = list;
        }

        public final void setUserIds(List list)
        {
            _userIds = list;
        }

        public final void setUsers(List list)
        {
            _users = list;
        }

        public NotificationArtifact()
        {
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final List val$boardIds;
        final List val$boards;
        final Notification val$notification;
        final List val$partners;
        final List val$pinIds;
        final List val$pins;
        final List val$templates;
        final List val$userIds;
        final List val$users;

        public final void run()
        {
            ModelHelper.setPartners(partners);
            List list = ModelHelper.getUsers(userIds);
            ModelHelper.setUsers(User.mergeAll(users, list));
            list = ModelHelper.getBoards(boardIds);
            ModelHelper.setBoards(Board.mergeAll(boards, list));
            list = ModelHelper.getPins(pinIds);
            ModelHelper.setPins(Pin.mergeAll(pins, list));
            ModelHelper.setNotificationTemplates(templates);
            ModelHelper.setNotification(notification);
        }

        _cls1()
        {
            partners = list;
            userIds = list1;
            users = list2;
            boardIds = list3;
            boards = list4;
            pinIds = list5;
            pins = list6;
            templates = list7;
            notification = notification1;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final List val$boardIds;
        final List val$boards;
        final List val$notifications;
        final List val$pinIds;
        final List val$pins;
        final List val$templates;
        final List val$userIds;
        final List val$users;

        public final void run()
        {
            ModelHelper.setNotifications(notifications);
            ModelHelper.setNotificationTemplates(templates);
            List list = ModelHelper.getUsers(userIds);
            ModelHelper.setUsers(User.mergeAll(users, list));
            list = ModelHelper.getBoards(boardIds);
            ModelHelper.setBoards(Board.mergeAll(boards, list));
            list = ModelHelper.getPins(pinIds);
            ModelHelper.setPins(Pin.mergeAll(pins, list));
        }

        _cls2()
        {
            notifications = list;
            templates = list1;
            userIds = list2;
            users = list3;
            boardIds = list4;
            boards = list5;
            pinIds = list6;
            pins = list7;
            super();
        }
    }


    private class Style extends Enum
    {

        private static final Style $VALUES[];
        public static final Style BAL;
        public static final Style BAL_TXT;

        public static Style parse(String s)
        {
            try
            {
                s = valueOf(PStringUtils.toEnumUpperCase(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static String requestString()
        {
            ArrayList arraylist = new ArrayList();
            Style astyle[] = values();
            int j = astyle.length;
            for (int i = 0; i < j; i++)
            {
                arraylist.add(astyle[i].toString().toLowerCase());
            }

            return PStringUtils.concatStringArray(arraylist, ",");
        }

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/pinterest/api/model/Notification$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])$VALUES.clone();
        }

        static 
        {
            BAL = new Style("BAL", 0);
            BAL_TXT = new Style("BAL_TXT", 1);
            $VALUES = (new Style[] {
                BAL, BAL_TXT
            });
        }

        private Style(String s, int i)
        {
            super(s, i);
        }
    }


    private class DataType extends Enum
    {

        private static final DataType $VALUES[];
        public static final DataType BOARD;
        public static final DataType DATE;
        public static final DataType PIN;
        public static final DataType PIN_COMMENT;
        public static final DataType TEMPLATE;
        public static final DataType USER;

        public static DataType parse(String s)
        {
            try
            {
                s = valueOf(PStringUtils.toEnumUpperCase(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static DataType valueOf(String s)
        {
            return (DataType)Enum.valueOf(com/pinterest/api/model/Notification$DataType, s);
        }

        public static DataType[] values()
        {
            return (DataType[])$VALUES.clone();
        }

        static 
        {
            PIN = new DataType("PIN", 0);
            BOARD = new DataType("BOARD", 1);
            USER = new DataType("USER", 2);
            TEMPLATE = new DataType("TEMPLATE", 3);
            DATE = new DataType("DATE", 4);
            PIN_COMMENT = new DataType("PIN_COMMENT", 5);
            $VALUES = (new DataType[] {
                PIN, BOARD, USER, TEMPLATE, DATE, PIN_COMMENT
            });
        }

        private DataType(String s, int i)
        {
            super(s, i);
        }
    }


    private class SectionType extends Enum
    {

        private static final SectionType $VALUES[];
        public static final SectionType DATE_SECTION;
        public static final SectionType MODEL_SECTION;
        public static final SectionType TEMPLATE_SECTION;

        public static SectionType parse(String s)
        {
            try
            {
                s = valueOf(PStringUtils.toEnumUpperCase(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static SectionType valueOf(String s)
        {
            return (SectionType)Enum.valueOf(com/pinterest/api/model/Notification$SectionType, s);
        }

        public static SectionType[] values()
        {
            return (SectionType[])$VALUES.clone();
        }

        static 
        {
            TEMPLATE_SECTION = new SectionType("TEMPLATE_SECTION", 0);
            MODEL_SECTION = new SectionType("MODEL_SECTION", 1);
            DATE_SECTION = new SectionType("DATE_SECTION", 2);
            $VALUES = (new SectionType[] {
                TEMPLATE_SECTION, MODEL_SECTION, DATE_SECTION
            });
        }

        private SectionType(String s, int i)
        {
            super(s, i);
        }
    }


    private class NotificationSection
    {

        private String _dataId;
        private DataType _dataType;
        private SectionType _type;
        final Notification this$0;

        public final String getDataId()
        {
            return _dataId;
        }

        public final DataType getDataType()
        {
            return _dataType;
        }

        public final SectionType getType()
        {
            return _type;
        }

        public final void setDataId(String s)
        {
            _dataId = s;
        }

        public final void setDataType(DataType datatype)
        {
            _dataType = datatype;
        }

        public final void setType(SectionType sectiontype)
        {
            _type = sectiontype;
        }

        public NotificationSection()
        {
            this$0 = Notification.this;
            super();
        }
    }

}
