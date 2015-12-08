// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;

import android.text.TextUtils;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class TypeAheadItem
    implements Serializable, Comparable
{

    private static final int EXTERNAL_CONTACT_TYPE_EMAIL = 1;
    private Set _emailSet;
    private List _emails;
    private Set _phoneNumberSet;
    private List _phoneNumbers;
    private boolean followedByMe;
    private String identifier;
    private String imageUri;
    private boolean isVerified;
    private ItemType itemType;
    private String location;
    private String pinterestUid;
    private String title;
    private String uid;
    private String website;

    public TypeAheadItem()
    {
        itemType = ItemType.NONE;
        _emails = new LinkedList();
        _phoneNumbers = new LinkedList();
        _emailSet = new HashSet();
        _phoneNumberSet = new HashSet();
    }

    private void fromExternalType(PinterestJsonObject pinterestjsonobject)
    {
        setTitle(pinterestjsonobject.a("full_name", ""));
        int i = pinterestjsonobject.a("external_user_type", 0);
        switch (i)
        {
        default:
            throw new Exception(String.format("externalusercontact internal type %s not handled", new Object[] {
                Integer.valueOf(i)
            }));

        case 1: // '\001'
            pinterestjsonobject = pinterestjsonobject.a("eid", "");
            break;
        }
        if (!TextUtils.isEmpty(pinterestjsonobject))
        {
            setIdentifier(pinterestjsonobject);
            addEmail(pinterestjsonobject);
            if (TextUtils.isEmpty(getTitle()))
            {
                setTitle(pinterestjsonobject);
            }
        }
    }

    public static List parseData(Object obj)
    {
        List list = Collections.emptyList();
        Object obj1 = list;
        if (obj != null)
        {
            obj1 = list;
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
                        TypeAheadItem typeaheaditem = new TypeAheadItem();
                        typeaheaditem.setItem(pinterestjsonobject);
                        ((List) (obj1)).add(typeaheaditem);
                    }
                    catch (Exception exception)
                    {
                        PLog.error(exception, "exception occurred", new Object[0]);
                    }
                    i++;
                }
            }
        }
        return ((List) (obj1));
    }

    public void addEmail(String s)
    {
        if (!_emailSet.contains(s))
        {
            _emails.add(s);
            _emailSet.add(s);
        }
    }

    public void addPhoneNumber(String s)
    {
        if (!_phoneNumberSet.contains(s))
        {
            _phoneNumbers.add(s);
            _phoneNumberSet.add(s);
        }
    }

    public int compareTo(Object obj)
    {
        if (obj instanceof TypeAheadItem)
        {
            obj = (TypeAheadItem)obj;
            if (getTitle() != null && ((TypeAheadItem) (obj)).getTitle() != null)
            {
                return getTitle().compareToIgnoreCase(((TypeAheadItem) (obj)).getTitle());
            }
        }
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof TypeAheadItem))
            {
                return false;
            }
            obj = (TypeAheadItem)obj;
            if (!TextUtils.equals(uid, ((TypeAheadItem) (obj)).uid) || !TextUtils.equals(identifier, ((TypeAheadItem) (obj)).identifier) || !TextUtils.equals(imageUri, ((TypeAheadItem) (obj)).imageUri) || !TextUtils.equals(title, ((TypeAheadItem) (obj)).title))
            {
                return false;
            }
            if (_emails == null ? ((TypeAheadItem) (obj))._emails != null : !_emails.equals(((TypeAheadItem) (obj))._emails))
            {
                return false;
            }
            if (_phoneNumbers == null ? ((TypeAheadItem) (obj))._phoneNumbers != null : !_phoneNumbers.equals(((TypeAheadItem) (obj))._phoneNumbers))
            {
                return false;
            }
        }
        return true;
    }

    public List getEmails()
    {
        return _emails;
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

    public List getPhoneNumbers()
    {
        return _phoneNumbers;
    }

    public String getPinterestUid()
    {
        return pinterestUid;
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
        if (uid != null)
        {
            return uid.hashCode();
        } else
        {
            return 0;
        }
    }

    public boolean isFollowedByMe()
    {
        return followedByMe;
    }

    public boolean isPlaceHolder()
    {
        return itemType == ItemType.CONNECT_FB_PLACEHOLDER || itemType == ItemType.SEARCH_PLACEHOLDER || itemType == ItemType.EMAIL_PLACEHOLDER || itemType == ItemType.EMPTY_PLACEHOLDER;
    }

    public boolean isWebsiteVerified()
    {
        return isVerified;
    }

    public void setFollowedByMe(boolean flag)
    {
        followedByMe = flag;
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
        setItemType(pinterestjsonobject.a("type", ""), pinterestjsonobject.a("tag", ""));
        setUid(pinterestjsonobject.a("id", ""));
        _cls1..SwitchMap.com.pinterest.activity.search.model.TypeAheadItem.ItemType[getItemType().ordinal()];
        JVM INSTR tableswitch 1 12: default 394
    //                   1 104
    //                   2 104
    //                   3 141
    //                   4 180
    //                   5 180
    //                   6 180
    //                   7 287
    //                   8 287
    //                   9 287
    //                   10 287
    //                   11 287
    //                   12 388;
           goto _L1 _L2 _L2 _L3 _L4 _L4 _L4 _L5 _L5 _L5 _L5 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        setTitle(pinterestjsonobject.a("query", ""));
        setIdentifier(pinterestjsonobject.a("link", ""));
        return;
_L3:
        try
        {
            setTitle(pinterestjsonobject.a("name", ""));
            setIdentifier(pinterestjsonobject.a("url", ""));
            setImageUri(pinterestjsonobject.a("image_thumbnail_url", ""));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject)
        {
            PLog.error(pinterestjsonobject, "exception occurred", new Object[0]);
            return;
        }
_L4:
        setIdentifier(pinterestjsonobject.a("username", ""));
        setTitle(pinterestjsonobject.a("full_name", ""));
        setImageUri(pinterestjsonobject.a("image_medium_url", ""));
        setFollowedByMe(pinterestjsonobject.a("followed_by_me").booleanValue());
        if (pinterestjsonobject.f("website_url"))
        {
            setWebsite(pinterestjsonobject.a("website_url", null), pinterestjsonobject.a("domain_verified").booleanValue());
        }
        if (pinterestjsonobject.f("location"))
        {
            setLocation(pinterestjsonobject.a("location", null));
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        setUid(pinterestjsonobject.a("id", ""));
        setTitle(pinterestjsonobject.a("name", ""));
        String s = pinterestjsonobject.a("email", "");
        if (!TextUtils.isEmpty(s))
        {
            setIdentifier(s);
            addEmail(s);
            if (TextUtils.isEmpty(getTitle()))
            {
                setTitle(s);
            }
        }
        if (pinterestjsonobject.f("picture"))
        {
            setImageUri(pinterestjsonobject.c("picture").c("data").a("url", null));
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        fromExternalType(pinterestjsonobject);
        return;
    }

    public void setItemType(ItemType itemtype)
    {
        itemType = itemtype;
    }

    public void setItemType(String s, String s1)
    {
        if (s.equals("board"))
        {
            itemType = ItemType.BOARD;
            return;
        }
        if (s1.equals("pin_suggestion") || s1.equals("board_suggestion"))
        {
            itemType = ItemType.AUTO_COMPLETE;
            return;
        }
        if (s1.equals("facebook_non_pinner"))
        {
            itemType = ItemType.FACEBOOK_CONTACT;
            return;
        }
        if (s1.equals("mutual_follow"))
        {
            itemType = ItemType.MUTUAL_FOLLOW;
            return;
        }
        if (s1.equals("followee"))
        {
            itemType = ItemType.FOLLOWEE;
            return;
        }
        if (s1.equals("twitter_non_pinner"))
        {
            itemType = ItemType.TWITTER_CONTACT;
            return;
        }
        if (s.equals("yahoo_non_pinner"))
        {
            itemType = ItemType.YAHOO_CONTACT;
            return;
        }
        if (s.equals("google_non_pinner"))
        {
            itemType = ItemType.GOOGLE_CONTACT;
            return;
        }
        if (s.equals("emailcontact"))
        {
            itemType = ItemType.EMAIL_CONTACT;
            return;
        }
        if (s.equals("externalusercontact"))
        {
            itemType = ItemType.EXTERNAL_CONTACT;
            return;
        }
        if (s1.equals("recent_queries"))
        {
            itemType = ItemType.RECENT_QUERY;
            return;
        }
        if (s1.equals("conversation"))
        {
            itemType = ItemType.CONVERSATION;
            return;
        } else
        {
            itemType = ItemType.PINNER;
            return;
        }
    }

    public void setLocation(String s)
    {
        if (!StringUtils.isEmpty(s))
        {
            location = s;
        }
    }

    public void setPinterestUid(String s)
    {
        pinterestUid = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUid(String s)
    {
        uid = s;
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
        public static final ItemType AUTO_COMPLETE;
        public static final ItemType BOARD;
        public static final ItemType CONNECT_FB_PLACEHOLDER;
        public static final ItemType CONTACT_NOT_FOUND_MISSING_PERMISSION;
        public static final ItemType CONVERSATION;
        public static final ItemType EMAIL_CONTACT;
        public static final ItemType EMAIL_PLACEHOLDER;
        public static final ItemType EMPTY_PLACEHOLDER;
        public static final ItemType EXTERNAL_CONTACT;
        public static final ItemType FACEBOOK_CONTACT;
        public static final ItemType FOLLOWEE;
        public static final ItemType GOOGLE_CONTACT;
        public static final ItemType MUTUAL_FOLLOW;
        public static final ItemType NONE;
        public static final ItemType PHONE_CONTACT;
        public static final ItemType PINNER;
        public static final ItemType RECENT_QUERY;
        public static final ItemType SEARCH_PLACEHOLDER;
        public static final ItemType TWITTER_CONTACT;
        public static final ItemType YAHOO_CONTACT;

        public static ItemType valueOf(String s)
        {
            return (ItemType)Enum.valueOf(com/pinterest/activity/search/model/TypeAheadItem$ItemType, s);
        }

        public static ItemType[] values()
        {
            return (ItemType[])$VALUES.clone();
        }

        static 
        {
            EMPTY_PLACEHOLDER = new ItemType("EMPTY_PLACEHOLDER", 0);
            SEARCH_PLACEHOLDER = new ItemType("SEARCH_PLACEHOLDER", 1);
            CONNECT_FB_PLACEHOLDER = new ItemType("CONNECT_FB_PLACEHOLDER", 2);
            EMAIL_PLACEHOLDER = new ItemType("EMAIL_PLACEHOLDER", 3);
            RECENT_QUERY = new ItemType("RECENT_QUERY", 4);
            AUTO_COMPLETE = new ItemType("AUTO_COMPLETE", 5);
            FACEBOOK_CONTACT = new ItemType("FACEBOOK_CONTACT", 6);
            TWITTER_CONTACT = new ItemType("TWITTER_CONTACT", 7);
            YAHOO_CONTACT = new ItemType("YAHOO_CONTACT", 8);
            GOOGLE_CONTACT = new ItemType("GOOGLE_CONTACT", 9);
            EMAIL_CONTACT = new ItemType("EMAIL_CONTACT", 10);
            EXTERNAL_CONTACT = new ItemType("EXTERNAL_CONTACT", 11);
            PHONE_CONTACT = new ItemType("PHONE_CONTACT", 12);
            PINNER = new ItemType("PINNER", 13);
            MUTUAL_FOLLOW = new ItemType("MUTUAL_FOLLOW", 14);
            FOLLOWEE = new ItemType("FOLLOWEE", 15);
            BOARD = new ItemType("BOARD", 16);
            CONVERSATION = new ItemType("CONVERSATION", 17);
            CONTACT_NOT_FOUND_MISSING_PERMISSION = new ItemType("CONTACT_NOT_FOUND_MISSING_PERMISSION", 18);
            NONE = new ItemType("NONE", 19);
            $VALUES = (new ItemType[] {
                EMPTY_PLACEHOLDER, SEARCH_PLACEHOLDER, CONNECT_FB_PLACEHOLDER, EMAIL_PLACEHOLDER, RECENT_QUERY, AUTO_COMPLETE, FACEBOOK_CONTACT, TWITTER_CONTACT, YAHOO_CONTACT, GOOGLE_CONTACT, 
                EMAIL_CONTACT, EXTERNAL_CONTACT, PHONE_CONTACT, PINNER, MUTUAL_FOLLOW, FOLLOWEE, BOARD, CONVERSATION, CONTACT_NOT_FOUND_MISSING_PERMISSION, NONE
            });
        }

        private ItemType(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType = new int[ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.AUTO_COMPLETE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.RECENT_QUERY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.BOARD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.PINNER.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.MUTUAL_FOLLOW.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.FOLLOWEE.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.FACEBOOK_CONTACT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.TWITTER_CONTACT.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.YAHOO_CONTACT.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.GOOGLE_CONTACT.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.EMAIL_CONTACT.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$TypeAheadItem$ItemType[ItemType.EXTERNAL_CONTACT.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
