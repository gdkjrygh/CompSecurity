// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;

// Referenced classes of package com.pinterest.api.model:
//            Model, Board, Actor, ModelHelper, 
//            User, Pin

public class Story extends Model
{

    private static final String BOARD_LINK_FORMAT = "<a href='pinterest://pinterest.com%s'><b>%s</b></a>";
    private static final String HOLDER_REX = "\\{\\}";
    private static final String HOLDER_STR = "{}";
    public static final int TYPE_BOARD = 1;
    public static final int TYPE_INTEREST = 3;
    public static final int TYPE_PIN = 0;
    public static final int TYPE_STORY = 4;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_USER = 2;
    private static final String USER_LINK_FORMAT = "<a href='pinterest://pinterest.com/%s/'><b>%s</b></a>";
    private String actorIds;
    private List actors;
    private Board board;
    private List boards;
    private Date cacheExpirationDate;
    private String cellType;
    private List comments;
    private String destinationUrl;
    private Spanned formattedText;
    private Boolean hasViewed;
    private Long id;
    private String imageUrl;
    private Long lastUpdateTs;
    private String mainActorId;
    private Integer mainActorType;
    private String mainObjectId;
    private Integer mainObjectType;
    private String message;
    private Integer objectsCount;
    private Integer objectsType;
    private Pin pin;
    private List pins;
    private String relatedHeader;
    private String relatedObjectIds;
    private String storyType;
    private Integer totalCount;
    private String uid;
    private User user;
    private List users;

    public Story()
    {
    }

    public Story(Long long1)
    {
        id = long1;
    }

    public Story(Long long1, String s, Date date, String s1, String s2, String s3, Boolean boolean1, 
            Long long2, String s4, String s5, String s6, Integer integer, String s7, String s8, 
            Integer integer1, Integer integer2, Integer integer3, Integer integer4, String s9, String s10)
    {
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        storyType = s1;
        cellType = s2;
        relatedHeader = s3;
        hasViewed = boolean1;
        lastUpdateTs = long2;
        message = s4;
        mainObjectId = s5;
        mainActorId = s6;
        mainActorType = integer;
        actorIds = s7;
        relatedObjectIds = s8;
        mainObjectType = integer1;
        objectsType = integer2;
        objectsCount = integer3;
        totalCount = integer4;
        imageUrl = s9;
        destinationUrl = s10;
    }

    public static int getIntType(String s)
    {
        if ("pin".equals(s))
        {
            return 0;
        }
        if ("user".equals(s))
        {
            return 2;
        }
        if ("board".equals(s))
        {
            return 1;
        }
        if ("interest".equals(s))
        {
            return 3;
        }
        return !"story".equals(s) ? -1 : 4;
    }

    private String getLinkedBoard(Board board1)
    {
        if (board1 == null || board1.getUrl() == null || board1.getName() == null)
        {
            return "";
        } else
        {
            return String.format("<a href='pinterest://pinterest.com%s'><b>%s</b></a>", new Object[] {
                board1.getUrl(), board1.getName()
            });
        }
    }

    private String getLinkedText(Actor actor)
    {
        switch (actor.getType().intValue())
        {
        default:
            return "";

        case 2: // '\002'
            return getLinkedUser(ModelHelper.getUser(actor.getUid()));

        case 1: // '\001'
            return getLinkedBoard(ModelHelper.getBoard(actor.getUid()));
        }
    }

    private String getLinkedUser(User user1)
    {
        if (user1 == null || user1.getUsername() == null || user1.getFullName() == null)
        {
            return "";
        } else
        {
            return String.format("<a href='pinterest://pinterest.com/%s/'><b>%s</b></a>", new Object[] {
                user1.getUsername(), user1.getFullName()
            });
        }
    }

    public static Story make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static Story make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        boolean flag1 = false;
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            final Story story = (Story)pinterestjsonobject.a(com/pinterest/api/model/Story);
            story.users = new ArrayList();
            story.pins = new ArrayList();
            story.boards = new ArrayList();
            Object obj = pinterestjsonobject.c("main_actor");
            if (obj != null)
            {
                story.setMainActorType(Integer.valueOf(getIntType(((PinterestJsonObject) (obj)).a("type", ""))));
                story.setMainActorId(((PinterestJsonObject) (obj)).a("id", ""));
                makeObject(((PinterestJsonObject) (obj)), story.users, story.pins, story.boards);
            }
            obj = pinterestjsonobject.c("main_object");
            if (obj != null)
            {
                story.setMainObjectType(Integer.valueOf(getIntType(((PinterestJsonObject) (obj)).a("type", ""))));
                story.setMainObjectId(((PinterestJsonObject) (obj)).a("id", ""));
                makeObject(((PinterestJsonObject) (obj)), story.users, story.pins, story.boards);
            }
            obj = pinterestjsonobject.e("actors");
            if (((PinterestJsonArray) (obj)).a() > 0)
            {
                ArrayList arraylist = new ArrayList();
                StringBuilder stringbuilder1 = new StringBuilder();
                int k = ((PinterestJsonArray) (obj)).a();
                for (int i = 0; i < k; i++)
                {
                    PinterestJsonObject pinterestjsonobject2 = ((PinterestJsonArray) (obj)).d(i);
                    makeObject(pinterestjsonobject2, story.users, story.pins, story.boards);
                    stringbuilder1.append((new StringBuilder(",")).append(pinterestjsonobject2.a("id", "")).toString());
                    Actor actor = new Actor();
                    actor.setUid(pinterestjsonobject2.a("id", ""));
                    actor.setType(Integer.valueOf(getIntType(pinterestjsonobject2.a("type", ""))));
                    arraylist.add(actor);
                }

                story.setActors(arraylist);
                story.setActorIds(stringbuilder1.substring(1));
            }
            pinterestjsonobject = pinterestjsonobject.e("related_objects");
            if (pinterestjsonobject.a() > 0)
            {
                story.objectsType = Integer.valueOf(getIntType(pinterestjsonobject.d(0).a("type", "")));
                StringBuilder stringbuilder = new StringBuilder();
                int l = pinterestjsonobject.a();
                for (int j = ((flag1) ? 1 : 0); j < l; j++)
                {
                    PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.d(j);
                    makeObject(pinterestjsonobject1, story.users, story.pins, story.boards);
                    stringbuilder.append((new StringBuilder(",")).append(pinterestjsonobject1.a("id", "")).toString());
                }

                story.setRelatedObjectIds(stringbuilder.substring(1));
                story.setObjectsCount(Integer.valueOf(pinterestjsonobject.a()));
            }
            pinterestjsonobject = story;
            if (flag)
            {
                (new _cls1()).execute();
                return story;
            }
        }
        return pinterestjsonobject;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        final ArrayList items = new ArrayList();
        if (pinterestjsonarray == null)
        {
            return items;
        }
        final ArrayList users = new ArrayList();
        final ArrayList pins = new ArrayList();
        final ArrayList boards = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            Story story = make(pinterestjsonarray.c(i), false);
            if (story != null)
            {
                items.add(story);
                users.addAll(story.users);
                pins.addAll(story.pins);
                boards.addAll(story.boards);
            }
        }

        (new _cls2()).execute();
        return items;
    }

    private static void makeObject(PinterestJsonObject pinterestjsonobject, List list, List list1, List list2)
    {
        if (pinterestjsonobject == null)
        {
            return;
        }
        switch (getIntType(pinterestjsonobject.a("type", "")))
        {
        default:
            return;

        case 0: // '\0'
            list1.add(Pin.make(pinterestjsonobject, false, false).getPin());
            return;

        case 2: // '\002'
            list.add(User.make(pinterestjsonobject, false, false));
            return;

        case 1: // '\001'
            list2.add(Board.make(pinterestjsonobject, false, false).getBoard());
            return;
        }
    }

    public static Story merge(Story story)
    {
        if (story == null)
        {
            story = null;
        } else
        {
            Story story1 = ModelHelper.getStory(story.getUid());
            if (story1 != null)
            {
                return story1;
            }
        }
        return story;
    }

    public String getActorIds()
    {
        return actorIds;
    }

    public List getActors()
    {
        return actors;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getCellType()
    {
        return cellType;
    }

    public String getDestinationUrl()
    {
        return destinationUrl;
    }

    public Spanned getFormattedText()
    {
        if (formattedText != null) goto _L2; else goto _L1
_L1:
        List list = getActors();
        if (list != null && list.size() != 0) goto _L4; else goto _L3
_L3:
        formattedText = Html.fromHtml(message);
_L2:
        PLog.log(formattedText.toString(), new Object[0]);
        return formattedText;
_L4:
        String s;
        int i;
        s = message;
        i = 0;
_L5:
        String s2;
        if (!s.contains("{}"))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        s2 = getLinkedText((Actor)list.get(i));
        String s1;
        s1 = s2;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s1 = (new StringBuilder()).append(s2).append("<br/>").toString();
        s1 = s.replaceFirst("\\{\\}", s1);
        s = s1;
        i++;
          goto _L5
        Exception exception;
        exception;
        formattedText = Html.fromHtml(s);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public Boolean getHasViewed()
    {
        return hasViewed;
    }

    public Long getId()
    {
        return id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public Long getLastUpdateTs()
    {
        return lastUpdateTs;
    }

    public String getMainActorId()
    {
        return mainActorId;
    }

    public Integer getMainActorType()
    {
        return mainActorType;
    }

    public String getMainObjectId()
    {
        return mainObjectId;
    }

    public Integer getMainObjectType()
    {
        return mainObjectType;
    }

    public String getMessage()
    {
        return message;
    }

    public Integer getObjectsCount()
    {
        return objectsCount;
    }

    public Integer getObjectsType()
    {
        return objectsType;
    }

    public String getRelatedHeader()
    {
        return relatedHeader;
    }

    public String getRelatedObjectIds()
    {
        return relatedObjectIds;
    }

    public String[] getRelatedObjectIdsArray()
    {
        if (getRelatedObjectIds() != null)
        {
            return getRelatedObjectIds().split(",");
        } else
        {
            return new String[0];
        }
    }

    public String getStoryType()
    {
        return storyType;
    }

    public Board getTargetBoard()
    {
        if (!isBoard())
        {
            return null;
        }
        if (board == null)
        {
            board = ModelHelper.getBoard(mainObjectId);
        }
        return board;
    }

    public String getTargetImage()
    {
        if (!isPin()) goto _L2; else goto _L1
_L1:
        Pin pin1 = getTargetPin();
        if (pin1 != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return pin1.getImageSquareUrl();
_L2:
        if (isBoard())
        {
            Board board1 = getTargetBoard();
            if (board1 != null)
            {
                return board1.getImagePreviewUrl();
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Pin getTargetPin()
    {
        if (pin == null && isPin())
        {
            pin = ModelHelper.getPin(mainObjectId);
        }
        return pin;
    }

    public User getTargetUser()
    {
        if (!isUser())
        {
            return null;
        }
        if (user == null)
        {
            user = ModelHelper.getUser(mainObjectId);
        }
        return user;
    }

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public String getUid()
    {
        return uid;
    }

    public boolean isBoard()
    {
        return ObjectUtils.equals(objectsType, Integer.valueOf(1));
    }

    public boolean isPin()
    {
        return ObjectUtils.equals(objectsType, Integer.valueOf(0));
    }

    public boolean isUser()
    {
        return ObjectUtils.equals(objectsType, Integer.valueOf(2));
    }

    public void setActorIds(String s)
    {
        actorIds = s;
    }

    public void setActors(List list)
    {
        actors = list;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCellType(String s)
    {
        cellType = s;
    }

    public void setDestinationUrl(String s)
    {
        destinationUrl = s;
    }

    public void setHasViewed(Boolean boolean1)
    {
        hasViewed = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageUrl(String s)
    {
        imageUrl = s;
    }

    public void setLastUpdateTs(Long long1)
    {
        lastUpdateTs = long1;
    }

    public void setMainActorId(String s)
    {
        mainActorId = s;
    }

    public void setMainActorType(Integer integer)
    {
        mainActorType = integer;
    }

    public void setMainObjectId(String s)
    {
        mainObjectId = s;
    }

    public void setMainObjectType(Integer integer)
    {
        mainObjectType = integer;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setObjectsCount(Integer integer)
    {
        objectsCount = integer;
    }

    public void setObjectsType(Integer integer)
    {
        objectsType = integer;
    }

    public void setRelatedHeader(String s)
    {
        relatedHeader = s;
    }

    public void setRelatedObjectIds(String s)
    {
        relatedObjectIds = s;
    }

    public void setStoryType(String s)
    {
        storyType = s;
    }

    public void setTotalCount(Integer integer)
    {
        totalCount = integer;
    }

    public void setUid(String s)
    {
        uid = s;
    }



/*
    static List access$002(Story story, List list)
    {
        story.users = list;
        return list;
    }

*/



/*
    static List access$102(Story story, List list)
    {
        story.boards = list;
        return list;
    }

*/



/*
    static List access$202(Story story, List list)
    {
        story.pins = list;
        return list;
    }

*/

    private class _cls1 extends BackgroundTask
    {

        final Story val$story;

        public final void run()
        {
            Object obj = new ArrayList();
            for (Iterator iterator = story.users.iterator(); iterator.hasNext(); ((List) (obj)).add(((User)iterator.next()).getUid())) { }
            obj = ModelHelper.getUsers(((List) (obj)));
            story.users = User.mergeAll(story.users, ((List) (obj)));
            ModelHelper.setUsers(story.users);
            obj = new ArrayList();
            for (Iterator iterator1 = story.boards.iterator(); iterator1.hasNext(); ((List) (obj)).add(((Board)iterator1.next()).getUid())) { }
            obj = ModelHelper.getBoards(((List) (obj)));
            story.boards = Board.mergeAll(story.boards, ((List) (obj)));
            ModelHelper.setBoards(story.boards);
            obj = new ArrayList();
            for (Iterator iterator2 = story.pins.iterator(); iterator2.hasNext(); ((List) (obj)).add(((Pin)iterator2.next()).getUid())) { }
            obj = ModelHelper.getPins(((List) (obj)));
            story.pins = Pin.mergeAll(story.pins, ((List) (obj)));
            ModelHelper.setPins(story.pins);
            ModelHelper.setStory(story);
        }

        _cls1()
        {
            story = story1;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final List val$boards;
        final List val$items;
        final List val$pins;
        final List val$users;

        public final void run()
        {
            ModelHelper.setStories(items);
            Object obj = new ArrayList();
            for (Iterator iterator = users.iterator(); iterator.hasNext(); ((List) (obj)).add(((User)iterator.next()).getUid())) { }
            obj = ModelHelper.getUsers(((List) (obj)));
            ModelHelper.setUsers(User.mergeAll(users, ((List) (obj))));
            obj = new ArrayList();
            for (Iterator iterator1 = boards.iterator(); iterator1.hasNext(); ((List) (obj)).add(((Board)iterator1.next()).getUid())) { }
            obj = ModelHelper.getBoards(((List) (obj)));
            ModelHelper.setBoards(Board.mergeAll(boards, ((List) (obj))));
            obj = new ArrayList();
            for (Iterator iterator2 = pins.iterator(); iterator2.hasNext(); ((List) (obj)).add(((Pin)iterator2.next()).getUid())) { }
            obj = ModelHelper.getPins(((List) (obj)));
            ModelHelper.setPins(Pin.mergeAll(pins, ((List) (obj))));
        }

        _cls2()
        {
            items = list;
            users = list1;
            boards = list2;
            pins = list3;
            super();
        }
    }

}
