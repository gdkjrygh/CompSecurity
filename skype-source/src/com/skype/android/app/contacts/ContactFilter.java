// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.text.TextUtils;
import com.skype.ContactGroup;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.ContactUtil;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

final class ContactFilter
{
    protected static final class FilterType extends Enum
    {

        private static final FilterType $VALUES[];
        public static final FilterType AGENTS;
        public static final FilterType ALL;
        public static final FilterType AVAILABLE;
        public static final FilterType FAVORITES;
        public static final FilterType GROUP;
        public static final FilterType SKYPE;
        private final int value;

        public static FilterType fromInt(int i)
        {
            FilterType afiltertype[] = values();
            int k = afiltertype.length;
            for (int j = 0; j < k; j++)
            {
                FilterType filtertype = afiltertype[j];
                if (filtertype.value == i)
                {
                    return filtertype;
                }
            }

            return null;
        }

        public static FilterType valueOf(String s)
        {
            return (FilterType)Enum.valueOf(com/skype/android/app/contacts/ContactFilter$FilterType, s);
        }

        public static FilterType[] values()
        {
            return (FilterType[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ALL = new FilterType("ALL", 0, 1);
            AVAILABLE = new FilterType("AVAILABLE", 1, 2);
            SKYPE = new FilterType("SKYPE", 2, 3);
            FAVORITES = new FilterType("FAVORITES", 3, 4);
            AGENTS = new FilterType("AGENTS", 4, 5);
            GROUP = new FilterType("GROUP", 5, -1);
            $VALUES = (new FilterType[] {
                ALL, AVAILABLE, SKYPE, FAVORITES, AGENTS, GROUP
            });
        }

        private FilterType(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    private ContactUtil contactUtil;
    private Context context;
    private FilterType filterType;
    private ContactGroup group;

    ContactFilter(Context context1, ContactUtil contactutil, ContactGroup contactgroup)
    {
        init(context1, contactutil);
        group = contactgroup;
        filterType = FilterType.GROUP;
    }

    ContactFilter(Context context1, ContactUtil contactutil, FilterType filtertype)
    {
        init(context1, contactutil);
        filterType = filtertype;
    }

    ContactFilter(Context context1, ContactUtil contactutil, UserPreferences userpreferences)
    {
        init(context1, contactutil);
        restore(userpreferences);
    }

    private void init(Context context1, ContactUtil contactutil)
    {
        context = context1;
        contactUtil = contactutil;
    }

    private void restore(UserPreferences userpreferences)
    {
        String s = userpreferences.getLastCustomContactFilter();
        userpreferences = userpreferences.getLastContactFilter();
        if (userpreferences == null)
        {
            userpreferences = FilterType.SKYPE;
        } else
        {
            userpreferences = FilterType.fromInt(userpreferences.intValue());
        }
        filterType = userpreferences;
        if (!TextUtils.isEmpty(s))
        {
            group = contactUtil.c(s);
            if (group == null)
            {
                userpreferences = FilterType.SKYPE;
            } else
            {
                userpreferences = FilterType.GROUP;
            }
            filterType = userpreferences;
        }
    }

    public final boolean accept(ContactItem contactitem)
    {
        if (group == null) goto _L2; else goto _L1
_L1:
        int ai[];
        int i;
        int j;
        ai = group.getContacts().m_contactObjectIDList;
        j = ai.length;
        i = 0;
_L9:
        if (i >= j) goto _L4; else goto _L3
_L3:
        int k = ai[i];
        if (contactitem.getContactObjectId() != k || contactitem.isLocalContact()) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        return false;
_L2:
        if (filterType == FilterType.AVAILABLE)
        {
            return ContactUtil.a(contactitem.getAvailability());
        }
        if (filterType == FilterType.AGENTS)
        {
            return ContactUtil.b(contactitem);
        }
        if (filterType == FilterType.SKYPE)
        {
            return ContactUtil.a(contactitem.getType());
        }
        if (filterType == FilterType.FAVORITES)
        {
            return contactUtil.a(contactitem);
        }
        if (!contactitem.isBlocked()) goto _L5; else goto _L7
_L7:
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof ContactFilter))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = (ContactFilter)obj;
        if (((ContactFilter) (obj)).filterType != FilterType.GROUP) goto _L2; else goto _L1
_L1:
        if (group == null || group.getObjectID() != ((ContactFilter) (obj)).group.getObjectID()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (((ContactFilter) (obj)).filterType == filterType) goto _L3; else goto _L5
_L5:
        return false;
        return false;
    }

    public final boolean getExcludeBlocked()
    {
        return false;
    }

    public final boolean getExcludeContactRequest()
    {
        return true;
    }

    public final boolean getExcludeNotAuthorized()
    {
        return filterType != FilterType.ALL && filterType != FilterType.SKYPE;
    }

    public final FilterType getFilterType()
    {
        return filterType;
    }

    public final Set getTypes(UserPreferences userpreferences)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[];

            static 
            {
                $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType = new int[FilterType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[FilterType.GROUP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[FilterType.ALL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[FilterType.AVAILABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[FilterType.AGENTS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[FilterType.FAVORITES.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactFilter$FilterType[FilterType.SKYPE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.contacts.ContactFilter.FilterType[filterType.ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 130
    //                   2 48
    //                   3 83
    //                   4 90
    //                   5 48
    //                   6 97;
           goto _L1 _L2 _L1 _L3 _L4 _L1 _L5
_L1:
        EnumSet enumset;
        EnumSet enumset1 = EnumSet.of(com.skype.ContactGroup.TYPE.ALL_BUDDIES, com.skype.ContactGroup.TYPE.EXTERNAL_CONTACTS);
        enumset = enumset1;
        if (contactUtil.a(userpreferences))
        {
            enumset1.add(com.skype.ContactGroup.TYPE.SCD_CONTACTS);
            enumset = enumset1;
        }
_L7:
        return enumset;
_L3:
        return EnumSet.of(com.skype.ContactGroup.TYPE.ONLINE_BUDDIES);
_L4:
        return EnumSet.of(com.skype.ContactGroup.TYPE.BOT_BUDDIES);
_L5:
        EnumSet enumset2;
        enumset2 = EnumSet.of(com.skype.ContactGroup.TYPE.SKYPE_BUDDIES, com.skype.ContactGroup.TYPE.BOT_BUDDIES);
        enumset = enumset2;
        if (!contactUtil.a(userpreferences)) goto _L7; else goto _L6
_L6:
        enumset2.add(com.skype.ContactGroup.TYPE.SCD_CONTACTS);
        return enumset2;
_L2:
        return EnumSet.of(com.skype.ContactGroup.TYPE.CUSTOM_GROUP);
    }

    public final int hashCode()
    {
        if (filterType == FilterType.GROUP)
        {
            return group.getObjectID();
        } else
        {
            return filterType.hashCode();
        }
    }

    public final boolean isAllContacts()
    {
        return filterType == FilterType.ALL;
    }

    public final void save(UserPreferences userpreferences)
    {
        String s;
        if (group == null)
        {
            s = "";
        } else
        {
            s = group.getGivenDisplaynameProp();
        }
        userpreferences.setLastCustomContactFilter(s);
        userpreferences.setLastContactFilter(filterType.toInt());
    }

    public final String toString()
    {
        switch (_cls1..SwitchMap.com.skype.android.app.contacts.ContactFilter.FilterType[filterType.ordinal()])
        {
        default:
            return context.getString(0x7f08013f);

        case 1: // '\001'
            return group.getGivenDisplaynameProp();

        case 2: // '\002'
            return context.getString(0x7f08013c);

        case 3: // '\003'
            return context.getString(0x7f08013e);

        case 4: // '\004'
            return context.getString(0x7f08013b);

        case 5: // '\005'
            return context.getString(0x7f08013d);
        }
    }
}
