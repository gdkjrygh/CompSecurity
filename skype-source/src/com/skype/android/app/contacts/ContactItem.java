// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.android.util.ObjectInterfaceItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactItem
    implements ObjectInterfaceItem
{
    public static class Contactable
    {

        String address;
        String label;
        int labelId;
        ContactableType type;

        public Contactable()
        {
        }
    }

    public static final class ContactableType extends Enum
    {

        private static final ContactableType $VALUES[];
        public static final ContactableType EMAIL;
        public static final ContactableType PHONE;
        private static HashMap typeMap;
        private final String mimeType;

        private static ContactableType findType(String s)
        {
            return (ContactableType)typeMap.get(s);
        }

        public static ContactableType valueOf(String s)
        {
            return (ContactableType)Enum.valueOf(com/skype/android/app/contacts/ContactItem$ContactableType, s);
        }

        public static ContactableType[] values()
        {
            return (ContactableType[])$VALUES.clone();
        }

        static 
        {
            PHONE = new ContactableType("PHONE", 0, "vnd.android.cursor.item/phone_v2");
            EMAIL = new ContactableType("EMAIL", 1, "vnd.android.cursor.item/email_v2");
            $VALUES = (new ContactableType[] {
                PHONE, EMAIL
            });
            typeMap = new HashMap(values().length);
            ContactableType acontactabletype[] = values();
            int j = acontactabletype.length;
            for (int i = 0; i < j; i++)
            {
                ContactableType contactabletype = acontactabletype[i];
                typeMap.put(contactabletype.mimeType, contactabletype);
            }

        }


        private ContactableType(String s, int i, String s1)
        {
            super(s, i);
            mimeType = s1;
        }
    }


    private static final int ALL_SET = 15;
    private static final int ANY_EMAIL = 1;
    private static final int ANY_PHONE = 4;
    private static final int CONTACT_ID_IDX = 0;
    public static final PROPKEY CONTACT_PROPKEYS[];
    private static final int CUSTOM_TYPE_IDX = 6;
    private static final int DATA_IDX = 4;
    private static final int DATA_TYPE_IDX = 5;
    private static final int DISPLAY_NAME_IDX = 1;
    private static final int HOME_EMAIL = 2;
    private static final int LOOKUPKEY_IDX = 3;
    private static final int MIMETYPE_IDX = 2;
    private static final int MOBILE_PHONE = 8;
    public static final String PROJECTION[] = {
        "contact_id", "display_name", "mimetype", "lookup", "data1", "data2", "data3"
    };
    private int authRequestCount;
    private boolean authorized;
    private com.skype.Contact.AVAILABILITY availability;
    private byte avatarImage[];
    private int avatarTimestamp;
    private boolean blocked;
    private List contactables;
    private String country;
    private String displayName;
    private String emailAddress;
    private int index;
    private final boolean isLocalContact;
    private String moodText;
    private int moodTimestamp;
    private int objectId;
    private int popularityOrder;
    private String pstnNumber;
    private String richMoodText;
    private String skypeName;
    private Proptable table;
    private com.skype.Contact.TYPE type;

    public ContactItem(Cursor cursor, boolean flag)
    {
        objectId = cursor.getInt(0);
        skypeName = cursor.getString(3);
        displayName = cursor.getString(1);
        type = com.skype.Contact.TYPE.EXTERNAL;
        availability = com.skype.Contact.AVAILABILITY.UNKNOWN;
        country = "";
        moodText = "";
        richMoodText = "";
        avatarImage = null;
        avatarTimestamp = 0;
        popularityOrder = 0;
        authRequestCount = 0;
        authorized = true;
        blocked = false;
        isLocalContact = true;
        if (flag)
        {
            setAllContactMethods(cursor);
            return;
        } else
        {
            setBestContactMethods(cursor);
            return;
        }
    }

    public ContactItem(Proptable proptable, int i)
    {
        boolean flag1 = true;
        super();
        objectId = proptable.getObjectID(i);
        skypeName = proptable.getStr(i, PROPKEY.CONTACT_SKYPENAME.toInt());
        displayName = proptable.getStr(i, PROPKEY.CONTACT_DISPLAYNAME.toInt());
        type = com.skype.Contact.TYPE.fromInt(proptable.getInt(i, PROPKEY.CONTACT_TYPE.toInt()));
        availability = com.skype.Contact.AVAILABILITY.fromInt(proptable.getInt(i, PROPKEY.CONTACT_AVAILABILITY.toInt()));
        country = proptable.getStr(i, PROPKEY.CONTACT_COUNTRY.toInt());
        moodText = proptable.getStr(i, PROPKEY.CONTACT_MOOD_TEXT.toInt());
        richMoodText = proptable.getStr(i, PROPKEY.CONTACT_RICH_MOOD_TEXT.toInt());
        moodTimestamp = proptable.getInt(i, PROPKEY.CONTACT_MOOD_TIMESTAMP.toInt());
        avatarImage = proptable.getBin(i, PROPKEY.CONTACT_AVATAR_IMAGE.toInt());
        avatarTimestamp = proptable.getInt(i, PROPKEY.CONTACT_AVATAR_TIMESTAMP.toInt());
        popularityOrder = proptable.getInt(i, PROPKEY.CONTACT_POPULARITY_ORD.toInt());
        authRequestCount = proptable.getInt(i, PROPKEY.CONTACT_AUTHREQUEST_COUNT.toInt());
        boolean flag;
        if (proptable.getInt(i, PROPKEY.USER_ISAUTHORIZED.toInt()) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        authorized = flag;
        if (proptable.getInt(i, PROPKEY.USER_ISBLOCKED.toInt()) > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        blocked = flag;
        pstnNumber = proptable.getStr(i, PROPKEY.CONTACT_PSTNNUMBER.toInt());
        isLocalContact = false;
    }

    private int getScore(Cursor cursor)
    {
        String s;
        byte byte0;
        byte0 = 2;
        s = cursor.getString(2);
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[];

            static 
            {
                $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType = new int[ContactableType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[ContactableType.PHONE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[ContactableType.EMAIL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.contacts.ContactItem.ContactableType[ContactableType.findType(s).ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 48
    //                   2 64;
           goto _L1 _L2 _L3
_L1:
        byte0 = 0;
_L5:
        return byte0;
_L2:
        return cursor.getInt(5) != 2 ? 4 : 8;
_L3:
        if (cursor.getInt(5) != 1)
        {
            return 1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean notFinished(Cursor cursor)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (cursor.moveToNext())
        {
            flag = flag1;
            if (!cursor.isAfterLast())
            {
                flag = flag1;
                if (cursor.getInt(0) == objectId)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void setAllContactMethods(Cursor cursor)
    {
        do
        {
            Contactable contactable = new Contactable();
            contactable.address = cursor.getString(4);
            contactable.type = ContactableType.findType(cursor.getString(2));
            contactable.labelId = cursor.getInt(5);
            contactable.label = cursor.getString(6);
            if (contactables == null)
            {
                contactables = new ArrayList();
            }
            contactables.add(contactable);
        } while (notFinished(cursor));
    }

    private void setBestContactMethods(Cursor cursor)
    {
        int i = 0;
        do
        {
            int j = i;
            if (i != 15)
            {
                int k = getScore(cursor);
                j = i;
                if ((k & i) == 0)
                {
                    j = setBestContactMethod(cursor, k, i);
                }
            }
            i = j;
        } while (notFinished(cursor));
    }

    public void copy(ContactItem contactitem)
    {
        table = contactitem.table;
        index = contactitem.index;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ContactItem)
        {
            obj = (ContactItem)obj;
            flag = flag1;
            if (getContactObjectId() == ((ContactItem) (obj)).getContactObjectId())
            {
                flag = flag1;
                if (isLocalContact == ((ContactItem) (obj)).isLocalContact)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int getAuthRequestCount()
    {
        return authRequestCount;
    }

    public com.skype.Contact.AVAILABILITY getAvailability()
    {
        return availability;
    }

    public byte[] getAvatar()
    {
        return avatarImage;
    }

    public int getAvatarTimestamp()
    {
        return avatarTimestamp;
    }

    public int getContactObjectId()
    {
        return objectId;
    }

    public List getContactables()
    {
        return contactables;
    }

    public String getCountry()
    {
        return country;
    }

    public String getDisplayName()
    {
        if (TextUtils.isEmpty(displayName))
        {
            return getIdentity();
        } else
        {
            return displayName;
        }
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getIdentity()
    {
        if (TextUtils.isEmpty(skypeName))
        {
            return getPstnNumber();
        } else
        {
            return skypeName;
        }
    }

    public CharSequence getLabel(Resources resources, Contactable contactable)
    {
        switch (_cls1..SwitchMap.com.skype.android.app.contacts.ContactItem.ContactableType[contactable.type.ordinal()])
        {
        default:
            return null;

        case 2: // '\002'
            return android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, contactable.labelId, contactable.label);

        case 1: // '\001'
            return android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, contactable.labelId, contactable.label);
        }
    }

    public String getMood()
    {
        return moodText;
    }

    public int getMoodTimestamp()
    {
        return moodTimestamp;
    }

    public int getObjectId()
    {
        return objectId;
    }

    public int getPopularityOrder()
    {
        return popularityOrder;
    }

    public String getPstnNumber()
    {
        return pstnNumber;
    }

    public String getRichMood()
    {
        return richMoodText;
    }

    public com.skype.Contact.TYPE getType()
    {
        return type;
    }

    public int hashCode()
    {
        return getContactObjectId();
    }

    public boolean isAuthorized()
    {
        return authorized;
    }

    public boolean isBlocked()
    {
        return blocked;
    }

    public boolean isLocalContact()
    {
        return isLocalContact;
    }

    int setBestContactMethod(Cursor cursor, int i, int j)
    {
        cursor = cursor.getString(4);
        switch (i)
        {
        default:
            pstnNumber = cursor;
            return j | 4;

        case 1: // '\001'
            emailAddress = cursor;
            return j | 1;

        case 2: // '\002'
            emailAddress = cursor;
            return j | 3;

        case 8: // '\b'
            pstnNumber = cursor;
            break;
        }
        return j | 0xc;
    }

    static 
    {
        CONTACT_PROPKEYS = (new PROPKEY[] {
            PROPKEY.CONTACT_SKYPENAME, PROPKEY.CONTACT_DISPLAYNAME, PROPKEY.CONTACT_TYPE, PROPKEY.CONTACT_AVAILABILITY, PROPKEY.CONTACT_COUNTRY, PROPKEY.CONTACT_MOOD_TEXT, PROPKEY.CONTACT_RICH_MOOD_TEXT, PROPKEY.CONTACT_MOOD_TIMESTAMP, PROPKEY.CONTACT_AVATAR_IMAGE, PROPKEY.CONTACT_AVATAR_TIMESTAMP, 
            PROPKEY.CONTACT_POPULARITY_ORD, PROPKEY.CONTACT_AUTHREQUEST_COUNT, PROPKEY.USER_ISAUTHORIZED, PROPKEY.USER_ISBLOCKED, PROPKEY.CONTACT_PSTNNUMBER
        });
    }
}
