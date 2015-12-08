// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface ContactGroup
    extends ObjectInterface
{
    public static interface ContactGroupIListener
    {

        public abstract void onChange(ContactGroup contactgroup, int i);

        public abstract void onChangeConversation(ContactGroup contactgroup, int i);
    }

    public static class GetContacts_Result
    {

        public int m_contactObjectIDList[];

        public void init(int ai[])
        {
            m_contactObjectIDList = ai;
        }

        public GetContacts_Result()
        {
        }
    }

    public static class GetConversations_Result
    {

        public int m_conversationObjectIDList[];

        public void init(int ai[])
        {
            m_conversationObjectIDList = ai;
        }

        public GetConversations_Result()
        {
        }
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE ALL_BUDDIES;
        public static final TYPE ALL_KNOWN_CONTACTS;
        public static final TYPE AUTO_BUDDIES;
        public static final TYPE BOT_BUDDIES;
        public static final TYPE CONTACTS_AUTHORIZED_BY_ME;
        public static final TYPE CONTACTS_BLOCKED_BY_ME;
        public static final TYPE CONTACTS_WAITING_MY_AUTHORIZATION;
        public static final TYPE CUSTOM_GROUP;
        public static final TYPE EXTERNAL_CONTACTS;
        public static final TYPE LYNC_CONTACTS;
        public static final TYPE ONLINE_BUDDIES;
        public static final TYPE PASSPORT_CONTACTS;
        public static final TYPE PROPOSED_SHARED_GROUP;
        public static final TYPE RECENTLY_CONTACTED_CONTACTS;
        public static final TYPE SCD_CONTACTS;
        public static final TYPE SHARED_GROUP;
        public static final TYPE SKYPEOUT_BUDDIES;
        public static final TYPE SKYPE_BUDDIES;
        public static final TYPE UNGROUPED_BUDDIES;
        public static final TYPE UNKNOWN_OR_PENDINGAUTH_BUDDIES;
        public static final TYPE WRAPPER_UNKNOWN_VALUE;
        public static final TYPE XMPP_CONTACTS;
        private static final j intToTypeMap;
        private final int value;

        public static TYPE fromInt(int i)
        {
            TYPE type = (TYPE)intToTypeMap.a(i);
            if (type != null)
            {
                return type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TYPE valueOf(String s)
        {
            return (TYPE)Enum.valueOf(com/skype/ContactGroup$TYPE, s);
        }

        public static TYPE[] values()
        {
            return (TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ALL_KNOWN_CONTACTS = new TYPE("ALL_KNOWN_CONTACTS", 0, 1);
            ALL_BUDDIES = new TYPE("ALL_BUDDIES", 1, 2);
            SKYPE_BUDDIES = new TYPE("SKYPE_BUDDIES", 2, 3);
            SKYPEOUT_BUDDIES = new TYPE("SKYPEOUT_BUDDIES", 3, 4);
            ONLINE_BUDDIES = new TYPE("ONLINE_BUDDIES", 4, 5);
            UNKNOWN_OR_PENDINGAUTH_BUDDIES = new TYPE("UNKNOWN_OR_PENDINGAUTH_BUDDIES", 5, 6);
            RECENTLY_CONTACTED_CONTACTS = new TYPE("RECENTLY_CONTACTED_CONTACTS", 6, 7);
            CONTACTS_WAITING_MY_AUTHORIZATION = new TYPE("CONTACTS_WAITING_MY_AUTHORIZATION", 7, 8);
            CONTACTS_AUTHORIZED_BY_ME = new TYPE("CONTACTS_AUTHORIZED_BY_ME", 8, 9);
            CONTACTS_BLOCKED_BY_ME = new TYPE("CONTACTS_BLOCKED_BY_ME", 9, 10);
            UNGROUPED_BUDDIES = new TYPE("UNGROUPED_BUDDIES", 10, 11);
            CUSTOM_GROUP = new TYPE("CUSTOM_GROUP", 11, 12);
            PROPOSED_SHARED_GROUP = new TYPE("PROPOSED_SHARED_GROUP", 12, 13);
            SHARED_GROUP = new TYPE("SHARED_GROUP", 13, 14);
            EXTERNAL_CONTACTS = new TYPE("EXTERNAL_CONTACTS", 14, 15);
            XMPP_CONTACTS = new TYPE("XMPP_CONTACTS", 15, 16);
            PASSPORT_CONTACTS = new TYPE("PASSPORT_CONTACTS", 16, 17);
            LYNC_CONTACTS = new TYPE("LYNC_CONTACTS", 17, 18);
            SCD_CONTACTS = new TYPE("SCD_CONTACTS", 18, 19);
            AUTO_BUDDIES = new TYPE("AUTO_BUDDIES", 19, 20);
            BOT_BUDDIES = new TYPE("BOT_BUDDIES", 20, 21);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 21, 0x7fffffff);
            $VALUES = (new TYPE[] {
                ALL_KNOWN_CONTACTS, ALL_BUDDIES, SKYPE_BUDDIES, SKYPEOUT_BUDDIES, ONLINE_BUDDIES, UNKNOWN_OR_PENDINGAUTH_BUDDIES, RECENTLY_CONTACTED_CONTACTS, CONTACTS_WAITING_MY_AUTHORIZATION, CONTACTS_AUTHORIZED_BY_ME, CONTACTS_BLOCKED_BY_ME, 
                UNGROUPED_BUDDIES, CUSTOM_GROUP, PROPOSED_SHARED_GROUP, SHARED_GROUP, EXTERNAL_CONTACTS, XMPP_CONTACTS, PASSPORT_CONTACTS, LYNC_CONTACTS, SCD_CONTACTS, AUTO_BUDDIES, 
                BOT_BUDDIES, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TYPE atype[] = values();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                TYPE type = atype[i];
                intToTypeMap.a(type.value, type);
            }

        }

        private TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract boolean addContact(int i);

    public abstract boolean addConversation(int i);

    public abstract void addListener(ContactGroupIListener contactgroupilistener);

    public abstract boolean canAddContact();

    public abstract boolean canAddContact(int i);

    public abstract boolean canAddConversation();

    public abstract boolean canAddConversation(int i);

    public abstract boolean canRemoveContact();

    public abstract boolean canRemoveConversation();

    public abstract boolean delete();

    public abstract String getAbchGuidProp();

    public abstract GetContacts_Result getContacts();

    public abstract GetConversations_Result getConversations();

    public abstract int getCustomGroupIdProp();

    public abstract String getGivenDisplaynameProp();

    public abstract int getGivenSortorderProp();

    public abstract int getNrofcontactsOnlineProp();

    public abstract int getNrofcontactsProp();

    public abstract TYPE getTypeProp();

    public abstract boolean giveDisplayName(String s);

    public abstract boolean giveSortOrder(int i);

    public abstract boolean removeContact(int i);

    public abstract boolean removeConversation(int i);

    public abstract void removeListener(ContactGroupIListener contactgroupilistener);
}
