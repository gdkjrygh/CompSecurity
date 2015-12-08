// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;

import com.pinterest.api.remote.SearchApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.search.model:
//            TypeAheadItem

public class GuidedSearchTypeAheadItem
    implements Serializable, Comparable
{

    private String display;
    private boolean followedByMe;
    private int followersCount;
    private String identifier;
    private String imageUri;
    private boolean isVerified;
    private boolean isVerifiedIdentity;
    private ItemType itemType;
    private String location;
    private String owner;
    private int pinCount;
    private int position;
    private int textColor;
    private String title;
    private String uid;
    private String website;

    public GuidedSearchTypeAheadItem()
    {
        itemType = ItemType.NONE;
    }

    public static List parseJsonData(Object obj)
    {
        Object obj1 = Collections.emptyList();
        if (obj instanceof PinterestJsonArray)
        {
            obj = (PinterestJsonArray)obj;
            obj1 = new ArrayList();
            int i = 0;
            while (i < ((PinterestJsonArray) (obj)).a()) 
            {
                try
                {
                    PinterestJsonObject pinterestjsonobject = ((PinterestJsonArray) (obj)).d(i);
                    GuidedSearchTypeAheadItem guidedsearchtypeaheaditem = new GuidedSearchTypeAheadItem();
                    guidedsearchtypeaheaditem.setItem(pinterestjsonobject);
                    ((List) (obj1)).add(guidedsearchtypeaheaditem);
                }
                catch (Exception exception)
                {
                    CrashReporting.a(exception);
                }
                i++;
            }
        }
        return ((List) (obj1));
    }

    public static List parseTrendingQueryData(Object obj)
    {
        ArrayList arraylist = new ArrayList();
        if (obj instanceof PinterestJsonArray)
        {
            obj = (PinterestJsonArray)obj;
            int ai[] = Resources.intArray(0x7f08003e);
            int i = 0;
            while (i < ((PinterestJsonArray) (obj)).a()) 
            {
                try
                {
                    PinterestJsonObject pinterestjsonobject = ((PinterestJsonArray) (obj)).d(i);
                    GuidedSearchTypeAheadItem guidedsearchtypeaheaditem = new GuidedSearchTypeAheadItem();
                    guidedsearchtypeaheaditem.setTitle(pinterestjsonobject.a("query", ""));
                    guidedsearchtypeaheaditem.setItemType(ItemType.TRENDING_QUERY);
                    if (i < Integer.parseInt(SearchApi.c))
                    {
                        guidedsearchtypeaheaditem.setTextColor(ai[i]);
                    }
                    arraylist.add(guidedsearchtypeaheaditem);
                }
                catch (Exception exception)
                {
                    CrashReporting.a(exception);
                }
                i++;
            }
        }
        return arraylist;
    }

    private void setNewPin(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setUid(pinterestjsonobject.a("id", ""));
            setImageUri(pinterestjsonobject.a("image_medium_url", ""));
            return;
        }
    }

    private void setTextColor(int i)
    {
        textColor = i;
    }

    public int compareTo(Object obj)
    {
        if (obj instanceof TypeAheadItem)
        {
            obj = (TypeAheadItem)obj;
            if (getTitle() != null && ((TypeAheadItem) (obj)).getTitle() != null)
            {
                return getTitle().compareTo(((TypeAheadItem) (obj)).getTitle());
            }
        }
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof GuidedSearchTypeAheadItem))
        {
            return false;
        }
        obj = (GuidedSearchTypeAheadItem)obj;
        if (itemType != ItemType.PIN && itemType != ItemType.PIN_LOCAL_CACHE && itemType != ItemType.NONE && ((GuidedSearchTypeAheadItem) (obj)).itemType != ItemType.NONE)
        {
            break; /* Loop/switch isn't completed */
        }
        if (getTitle() != null)
        {
            return getTitle().equals(((GuidedSearchTypeAheadItem) (obj)).getTitle());
        }
        if (((GuidedSearchTypeAheadItem) (obj)).getTitle() != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (isVerified != ((GuidedSearchTypeAheadItem) (obj)).isVerified)
        {
            return false;
        }
        if (identifier == null ? ((GuidedSearchTypeAheadItem) (obj)).identifier != null : !identifier.equals(((GuidedSearchTypeAheadItem) (obj)).identifier))
        {
            return false;
        }
        if (imageUri == null ? ((GuidedSearchTypeAheadItem) (obj)).imageUri != null : !imageUri.equals(((GuidedSearchTypeAheadItem) (obj)).imageUri))
        {
            return false;
        }
        if (itemType != ((GuidedSearchTypeAheadItem) (obj)).itemType)
        {
            return false;
        }
        if (location == null ? ((GuidedSearchTypeAheadItem) (obj)).location != null : !location.equals(((GuidedSearchTypeAheadItem) (obj)).location))
        {
            return false;
        }
        if (title == null ? ((GuidedSearchTypeAheadItem) (obj)).title != null : !title.equals(((GuidedSearchTypeAheadItem) (obj)).title))
        {
            return false;
        }
        if (website == null ? ((GuidedSearchTypeAheadItem) (obj)).website != null : !website.equals(((GuidedSearchTypeAheadItem) (obj)).website))
        {
            return false;
        }
        if (display == null ? ((GuidedSearchTypeAheadItem) (obj)).display != null : !display.equals(((GuidedSearchTypeAheadItem) (obj)).display))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public String getDisplay()
    {
        return display;
    }

    public int getFollowersCount()
    {
        return followersCount;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public String getImageUri()
    {
        return imageUri;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    public String getLocation()
    {
        return location;
    }

    public String getOwner()
    {
        return owner;
    }

    public int getPinCount()
    {
        return pinCount;
    }

    public int getPosition()
    {
        return position;
    }

    public int getTextColor()
    {
        return textColor;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUid()
    {
        return uid;
    }

    public String getWebsite()
    {
        return website;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (title != null)
        {
            i = title.hashCode();
        } else
        {
            i = 0;
        }
        if (identifier != null)
        {
            j = identifier.hashCode();
        } else
        {
            j = 0;
        }
        if (itemType != null)
        {
            k = itemType.hashCode();
        } else
        {
            k = 0;
        }
        if (imageUri != null)
        {
            l = imageUri.hashCode();
        } else
        {
            l = 0;
        }
        if (location != null)
        {
            i1 = location.hashCode();
        } else
        {
            i1 = 0;
        }
        if (website != null)
        {
            j1 = website.hashCode();
        } else
        {
            j1 = 0;
        }
        if (isVerified)
        {
            k1 = 1;
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    public boolean isFollowedByMe()
    {
        return followedByMe;
    }

    public boolean isVerifiedIdentity()
    {
        return isVerifiedIdentity;
    }

    public boolean isWebsiteVerified()
    {
        return isVerified;
    }

    public void setDisplay(String s)
    {
        display = s;
    }

    public void setFollowedByMe(boolean flag)
    {
        followedByMe = flag;
    }

    public void setFollowersCount(int i)
    {
        followersCount = i;
    }

    public void setIdentifier(String s)
    {
        identifier = s;
    }

    public void setImageUri(String s)
    {
        imageUri = s;
    }

    public void setItem(PinterestJsonObject pinterestjsonobject)
    {
        setItemType(pinterestjsonobject);
        _cls1..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[getItemType().ordinal()];
        JVM INSTR tableswitch 1 7: default 312
    //                   1 60
    //                   2 60
    //                   3 60
    //                   4 60
    //                   5 103
    //                   6 186
    //                   7 288;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L4 _L5
_L1:
        break MISSING_BLOCK_LABEL_312;
_L2:
        setUid(pinterestjsonobject.a("id", ""));
        setTitle(pinterestjsonobject.a("query", ""));
        setIdentifier(pinterestjsonobject.a("link", ""));
        return;
_L3:
        try
        {
            setUid(pinterestjsonobject.a("id", ""));
            setTitle(pinterestjsonobject.a("name", ""));
            setIdentifier(pinterestjsonobject.a("url", ""));
            setImageUri(pinterestjsonobject.a("image_thumbnail_url", ""));
            setPinCount(pinterestjsonobject.a("pin_count", 0));
            pinterestjsonobject = pinterestjsonobject.c("owner");
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject)
        {
            CrashReporting.a(pinterestjsonobject);
            return;
        }
        if (pinterestjsonobject == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        setOwner(pinterestjsonobject.a("full_name", ""));
        return;
_L4:
        setUid(pinterestjsonobject.a("id", ""));
        setIdentifier(pinterestjsonobject.a("username", ""));
        setTitle(pinterestjsonobject.a("full_name", ""));
        setImageUri(pinterestjsonobject.a("image_medium_url", ""));
        setPinCount(pinterestjsonobject.a("pin_count", 0));
        setFollowersCount(pinterestjsonobject.a("follower_count", 0));
        pinterestjsonobject = pinterestjsonobject.c("verified_identity");
        if (pinterestjsonobject == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        setVerifiedIdentity(pinterestjsonobject.a("verified", Boolean.valueOf(false)).booleanValue());
        return;
_L5:
        setTitle(pinterestjsonobject.a("query", ""));
        setNewPin(pinterestjsonobject.c("pin"));
        return;
    }

    public void setItemType(ItemType itemtype)
    {
        itemType = itemtype;
    }

    public void setItemType(PinterestJsonObject pinterestjsonobject)
    {
        pinterestjsonobject = pinterestjsonobject.a("type", "");
        if (pinterestjsonobject.equals("board"))
        {
            itemType = ItemType.BOARD;
        } else
        {
            if (pinterestjsonobject.equals("query"))
            {
                itemType = ItemType.PIN;
                return;
            }
            if (pinterestjsonobject.equals("user"))
            {
                itemType = ItemType.PINNER;
                return;
            }
            if (pinterestjsonobject.equals("recent_pin_searches"))
            {
                itemType = ItemType.RECENT_HISTORY_PIN;
                return;
            }
            if (pinterestjsonobject.equals("recent_board_searches"))
            {
                itemType = ItemType.RECENT_HISTORY_BOARD;
                return;
            }
            if (pinterestjsonobject.equals("recent_user_searches"))
            {
                itemType = ItemType.RECENT_HISTORY_PINNER;
                return;
            }
            if (pinterestjsonobject.equals("recent_personal_searches"))
            {
                itemType = ItemType.RECENT_HISTORY_MY_PIN;
                return;
            }
        }
    }

    public void setLocation(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            location = s;
        }
    }

    public void setOwner(String s)
    {
        owner = s;
    }

    public void setPinCount(int i)
    {
        pinCount = i;
    }

    public void setPosition(int i)
    {
        position = i;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setVerifiedIdentity(boolean flag)
    {
        isVerifiedIdentity = flag;
    }

    public void setWebsite(String s, boolean flag)
    {
        if (!StringUtils.isEmpty(s))
        {
            website = s;
            isVerified = flag;
        }
    }

    public String toString()
    {
        return title;
    }

    private class ItemType extends Enum
    {

        private static final ItemType $VALUES[];
        public static final ItemType BOARD;
        public static final ItemType BOARD_SEARCH_ALL;
        public static final ItemType BOARD_SECTION_FOOTER;
        public static final ItemType EMPTY_SPACE_HEADER;
        public static final ItemType HEADER_DIVIDER;
        public static final ItemType NONE;
        public static final ItemType PIN;
        public static final ItemType PINNER;
        public static final ItemType PINNER_SEARCH_ALL;
        public static final ItemType PINNER_SECTION_FOOTER;
        public static final ItemType PIN_LOCAL_CACHE;
        public static final ItemType PIN_SEARCH_ALL;
        public static final ItemType PIN_SECTION_FOOTER;
        public static final ItemType RECENT_HISTORY_BOARD;
        public static final ItemType RECENT_HISTORY_BOARD_HEADER;
        public static final ItemType RECENT_HISTORY_MY_PIN;
        public static final ItemType RECENT_HISTORY_PIN;
        public static final ItemType RECENT_HISTORY_PINNER;
        public static final ItemType RECENT_HISTORY_PINNER_HEADER;
        public static final ItemType RECENT_HISTORY_PIN_HEADER;
        public static final ItemType TRENDING_QUERY;
        public static final ItemType TRENDING_QUERY_HEADER;

        public static ItemType valueOf(String s)
        {
            return (ItemType)Enum.valueOf(com/pinterest/activity/search/model/GuidedSearchTypeAheadItem$ItemType, s);
        }

        public static ItemType[] values()
        {
            return (ItemType[])$VALUES.clone();
        }

        static 
        {
            NONE = new ItemType("NONE", 0);
            HEADER_DIVIDER = new ItemType("HEADER_DIVIDER", 1);
            RECENT_HISTORY_PIN_HEADER = new ItemType("RECENT_HISTORY_PIN_HEADER", 2);
            RECENT_HISTORY_PINNER_HEADER = new ItemType("RECENT_HISTORY_PINNER_HEADER", 3);
            RECENT_HISTORY_BOARD_HEADER = new ItemType("RECENT_HISTORY_BOARD_HEADER", 4);
            RECENT_HISTORY_PIN = new ItemType("RECENT_HISTORY_PIN", 5);
            RECENT_HISTORY_PINNER = new ItemType("RECENT_HISTORY_PINNER", 6);
            RECENT_HISTORY_BOARD = new ItemType("RECENT_HISTORY_BOARD", 7);
            RECENT_HISTORY_MY_PIN = new ItemType("RECENT_HISTORY_MY_PIN", 8);
            PIN_SEARCH_ALL = new ItemType("PIN_SEARCH_ALL", 9);
            PIN_LOCAL_CACHE = new ItemType("PIN_LOCAL_CACHE", 10);
            PINNER_SEARCH_ALL = new ItemType("PINNER_SEARCH_ALL", 11);
            BOARD_SEARCH_ALL = new ItemType("BOARD_SEARCH_ALL", 12);
            PIN = new ItemType("PIN", 13);
            PINNER = new ItemType("PINNER", 14);
            BOARD = new ItemType("BOARD", 15);
            TRENDING_QUERY = new ItemType("TRENDING_QUERY", 16);
            TRENDING_QUERY_HEADER = new ItemType("TRENDING_QUERY_HEADER", 17);
            PINNER_SECTION_FOOTER = new ItemType("PINNER_SECTION_FOOTER", 18);
            BOARD_SECTION_FOOTER = new ItemType("BOARD_SECTION_FOOTER", 19);
            PIN_SECTION_FOOTER = new ItemType("PIN_SECTION_FOOTER", 20);
            EMPTY_SPACE_HEADER = new ItemType("EMPTY_SPACE_HEADER", 21);
            $VALUES = (new ItemType[] {
                NONE, HEADER_DIVIDER, RECENT_HISTORY_PIN_HEADER, RECENT_HISTORY_PINNER_HEADER, RECENT_HISTORY_BOARD_HEADER, RECENT_HISTORY_PIN, RECENT_HISTORY_PINNER, RECENT_HISTORY_BOARD, RECENT_HISTORY_MY_PIN, PIN_SEARCH_ALL, 
                PIN_LOCAL_CACHE, PINNER_SEARCH_ALL, BOARD_SEARCH_ALL, PIN, PINNER, BOARD, TRENDING_QUERY, TRENDING_QUERY_HEADER, PINNER_SECTION_FOOTER, BOARD_SECTION_FOOTER, 
                PIN_SECTION_FOOTER, EMPTY_SPACE_HEADER
            });
        }

        private ItemType(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType = new int[ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.RECENT_HISTORY_PIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.RECENT_HISTORY_BOARD.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.RECENT_HISTORY_PINNER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.RECENT_HISTORY_MY_PIN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.BOARD.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.PINNER.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[ItemType.PIN.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
