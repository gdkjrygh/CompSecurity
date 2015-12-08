// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Model, ModelHelper, User, Board

public class PinPicksSections extends Model
{

    public static final List LOCAL_CATEGORIES = Collections.unmodifiableList(Arrays.asList(new String[] {
        "hero", "featured_pinner", "board", "pinners", "user", "card", "pin_feed", "title", "pins"
    }));
    public static final String TYPE_BOARD = "board";
    public static final String TYPE_CARD = "card";
    public static final String TYPE_FEATURED_PINNER = "featured_pinner";
    public static final String TYPE_HERO = "hero";
    public static final String TYPE_PINNERS = "pinners";
    public static final String TYPE_PINS = "pins";
    public static final String TYPE_PIN_FEED = "pin_feed";
    public static final String TYPE_TITLE = "title";
    public static final String TYPE_USER = "user";
    private Board board;
    private boolean cardType;
    private String detail;
    private boolean gridSection;
    private Long id;
    private String mobileImageUrl;
    private String pinId;
    private String title;
    private String type;
    private String uid;
    private User user;

    public PinPicksSections()
    {
    }

    public PinPicksSections(Long long1)
    {
        id = long1;
    }

    public PinPicksSections(Long long1, String s, String s1, String s2, String s3, String s4, String s5, 
            User user1, Board board1, boolean flag, boolean flag1)
    {
        id = long1;
        uid = s;
        pinId = s1;
        mobileImageUrl = s2;
        title = s3;
        detail = s4;
        type = s5;
        user = user1;
        board = board1;
        gridSection = flag;
        cardType = flag1;
    }

    public static PinPicksSections make(PinterestJsonObject pinterestjsonobject, List list)
    {
        PinPicksSections pinpickssections = new PinPicksSections();
        if (pinterestjsonobject == null)
        {
            return pinpickssections;
        }
        long l = pinterestjsonobject.a("id", -1L);
        if (l != -1L)
        {
            pinpickssections.setId(Long.valueOf(l));
        }
        PinterestJsonArray pinterestjsonarray = pinterestjsonobject.e("elements");
        pinpickssections.setGridSection(true);
        list.addAll(setPinPicksElementArtifact(pinterestjsonarray));
        pinpickssections.setMobileImageUrl(pinterestjsonobject.a("mobile_image_url", ""));
        pinpickssections.setTitle(pinterestjsonobject.a("title", ""));
        pinpickssections.setDetail(pinterestjsonobject.a("detail", ""));
        pinpickssections.setType(pinterestjsonobject.a("type", ""));
        pinpickssections.setUid(pinterestjsonobject.a("id", "0"));
        return pinpickssections;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray == null)
        {
            return arraylist;
        }
        int i = 0;
        for (int j = pinterestjsonarray.a(); i < j; i++)
        {
            Object obj = pinterestjsonarray.d(i);
            if (i != 0)
            {
                PinPicksSections pinpickssections = makeTitleSection(((PinterestJsonObject) (obj)));
                if (pinpickssections == null)
                {
                    continue;
                }
                arraylist.add(pinpickssections);
            }
            obj = make(((PinterestJsonObject) (obj)), arraylist);
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        ModelHelper.setPinPicksItems(arraylist);
        return arraylist;
    }

    public static PinPicksSections makeElement(PinterestJsonObject pinterestjsonobject)
    {
        PinPicksSections pinpickssections = new PinPicksSections();
        if (pinterestjsonobject != null)
        {
            long l = pinterestjsonobject.a("id", -1L);
            if (l != -1L)
            {
                pinpickssections.setId(Long.valueOf(l));
            }
            pinpickssections.setType(pinterestjsonobject.a("type", ""));
            pinpickssections.setUid(pinterestjsonobject.a("id", "0"));
            if (pinpickssections.getType().equals("user"))
            {
                pinpickssections.setUser(User.merge(User.make(pinterestjsonobject, false, false)));
                return pinpickssections;
            }
            if (pinpickssections.getType().equals("board"))
            {
                pinpickssections.setBoard(Board.merge(Board.make(pinterestjsonobject, false, false).getBoard()));
                return pinpickssections;
            }
        }
        return pinpickssections;
    }

    public static PinPicksSections makeTitleSection(PinterestJsonObject pinterestjsonobject)
    {
        PinPicksSections pinpickssections = new PinPicksSections();
        if (pinterestjsonobject != null)
        {
            pinpickssections.setType("title");
            pinpickssections.setTitle(pinterestjsonobject.a("title", ""));
            pinpickssections.setDetail(pinterestjsonobject.a("detail", ""));
            pinpickssections.setCardType(false);
            if (pinterestjsonobject.a("type", "").equals("card"))
            {
                pinpickssections.setCardType(true);
                return pinpickssections;
            }
        }
        return pinpickssections;
    }

    private static List setPinPicksElementArtifact(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        int i = 0;
        for (int j = pinterestjsonarray.a(); i < j; i++)
        {
            PinPicksSections pinpickssections = makeElement(pinterestjsonarray.d(i));
            if (pinpickssections == null)
            {
                continue;
            }
            arraylist.add(pinpickssections);
            if (pinpickssections.getUser() != null)
            {
                arraylist1.add(pinpickssections.getUser());
            }
            if (pinpickssections.getBoard() != null)
            {
                arraylist2.add(pinpickssections.getBoard());
            }
        }

        ModelHelper.setUsers(arraylist1);
        ModelHelper.setBoards(arraylist2);
        return arraylist;
    }

    public Board getBoard()
    {
        return board;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public String getDetail()
    {
        return detail;
    }

    public Long getId()
    {
        return id;
    }

    public String getMobileImageUrl()
    {
        return mobileImageUrl;
    }

    public String getPinId()
    {
        return pinId;
    }

    public String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public User getUser()
    {
        return user;
    }

    public boolean isCardType()
    {
        return cardType;
    }

    public boolean isGridSection()
    {
        return gridSection;
    }

    public void setBoard(Board board1)
    {
        board = board1;
    }

    public void setCacheExpirationDate(Date date)
    {
    }

    public void setCardType(boolean flag)
    {
        cardType = flag;
    }

    public void setDetail(String s)
    {
        detail = s;
    }

    public void setGridSection(boolean flag)
    {
        gridSection = flag;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setMobileImageUrl(String s)
    {
        mobileImageUrl = s;
    }

    public void setPinId(String s)
    {
        pinId = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUser(User user1)
    {
        user = user1;
    }

}
