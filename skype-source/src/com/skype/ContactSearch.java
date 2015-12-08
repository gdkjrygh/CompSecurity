// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, PROPKEY

public interface ContactSearch
    extends ObjectInterface
{
    public static final class CONDITION extends Enum
    {

        private static final CONDITION $VALUES[];
        public static final CONDITION CONTAINS_WORDS;
        public static final CONDITION CONTAINS_WORD_PREFIXES;
        public static final CONDITION EQ;
        public static final CONDITION GE;
        public static final CONDITION GT;
        public static final CONDITION LE;
        public static final CONDITION LT;
        public static final CONDITION PREFIX_EQ;
        public static final CONDITION PREFIX_GE;
        public static final CONDITION PREFIX_LE;
        public static final CONDITION WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONDITION fromInt(int i)
        {
            CONDITION condition = (CONDITION)intToTypeMap.a(i);
            if (condition != null)
            {
                return condition;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONDITION valueOf(String s)
        {
            return (CONDITION)Enum.valueOf(com/skype/ContactSearch$CONDITION, s);
        }

        public static CONDITION[] values()
        {
            return (CONDITION[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            EQ = new CONDITION("EQ", 0, 0);
            GT = new CONDITION("GT", 1, 1);
            GE = new CONDITION("GE", 2, 2);
            LT = new CONDITION("LT", 3, 3);
            LE = new CONDITION("LE", 4, 4);
            PREFIX_EQ = new CONDITION("PREFIX_EQ", 5, 5);
            PREFIX_GE = new CONDITION("PREFIX_GE", 6, 6);
            PREFIX_LE = new CONDITION("PREFIX_LE", 7, 7);
            CONTAINS_WORDS = new CONDITION("CONTAINS_WORDS", 8, 8);
            CONTAINS_WORD_PREFIXES = new CONDITION("CONTAINS_WORD_PREFIXES", 9, 9);
            WRAPPER_UNKNOWN_VALUE = new CONDITION("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new CONDITION[] {
                EQ, GT, GE, LT, LE, PREFIX_EQ, PREFIX_GE, PREFIX_LE, CONTAINS_WORDS, CONTAINS_WORD_PREFIXES, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONDITION acondition[] = values();
            int k = acondition.length;
            for (int i = 0; i < k; i++)
            {
                CONDITION condition = acondition[i];
                intToTypeMap.a(condition.value, condition);
            }

        }

        private CONDITION(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CONTACT_TYPE extends Enum
    {

        private static final CONTACT_TYPE $VALUES[];
        public static final CONTACT_TYPE LYNC;
        public static final CONTACT_TYPE SKYPE;
        public static final CONTACT_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONTACT_TYPE fromInt(int i)
        {
            CONTACT_TYPE contact_type = (CONTACT_TYPE)intToTypeMap.a(i);
            if (contact_type != null)
            {
                return contact_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONTACT_TYPE valueOf(String s)
        {
            return (CONTACT_TYPE)Enum.valueOf(com/skype/ContactSearch$CONTACT_TYPE, s);
        }

        public static CONTACT_TYPE[] values()
        {
            return (CONTACT_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SKYPE = new CONTACT_TYPE("SKYPE", 0, 1);
            LYNC = new CONTACT_TYPE("LYNC", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new CONTACT_TYPE("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new CONTACT_TYPE[] {
                SKYPE, LYNC, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONTACT_TYPE acontact_type[] = values();
            int k = acontact_type.length;
            for (int i = 0; i < k; i++)
            {
                CONTACT_TYPE contact_type = acontact_type[i];
                intToTypeMap.a(contact_type.value, contact_type);
            }

        }

        private CONTACT_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface ContactSearchIListener
    {

        public abstract void onNewResult(ContactSearch contactsearch, int i, int j);
    }

    public static class GetResults_Result
    {

        public int m_contactObjectIDList[];

        public void init(int ai[])
        {
            m_contactObjectIDList = ai;
        }

        public GetResults_Result()
        {
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS CONSTRUCTION;
        public static final STATUS EXTENDABLE;
        public static final STATUS FAILED;
        public static final STATUS FINISHED;
        public static final STATUS PENDING;
        public static final STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static STATUS fromInt(int i)
        {
            STATUS status = (STATUS)intToTypeMap.a(i);
            if (status != null)
            {
                return status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static STATUS valueOf(String s)
        {
            return (STATUS)Enum.valueOf(com/skype/ContactSearch$STATUS, s);
        }

        public static STATUS[] values()
        {
            return (STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONSTRUCTION = new STATUS("CONSTRUCTION", 0, 1);
            PENDING = new STATUS("PENDING", 1, 2);
            EXTENDABLE = new STATUS("EXTENDABLE", 2, 3);
            FINISHED = new STATUS("FINISHED", 3, 4);
            FAILED = new STATUS("FAILED", 4, 5);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new STATUS[] {
                CONSTRUCTION, PENDING, EXTENDABLE, FINISHED, FAILED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            STATUS astatus[] = values();
            int k = astatus.length;
            for (int i = 0; i < k; i++)
            {
                STATUS status = astatus[i];
                intToTypeMap.a(status.value, status);
            }

        }

        private STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract boolean addEmailTerm(String s);

    public abstract boolean addEmailTerm(String s, boolean flag);

    public abstract boolean addIntTerm(PROPKEY propkey, CONDITION condition, int i);

    public abstract boolean addIntTerm(PROPKEY propkey, CONDITION condition, int i, boolean flag);

    public abstract boolean addLanguageTerm(String s);

    public abstract boolean addLanguageTerm(String s, boolean flag);

    public abstract void addListener(ContactSearchIListener contactsearchilistener);

    public abstract boolean addMaxAgeTerm(int i);

    public abstract boolean addMaxAgeTerm(int i, boolean flag);

    public abstract boolean addMinAgeTerm(int i);

    public abstract boolean addMinAgeTerm(int i, boolean flag);

    public abstract void addOr();

    public abstract boolean addStrTerm(PROPKEY propkey, CONDITION condition, String s);

    public abstract boolean addStrTerm(PROPKEY propkey, CONDITION condition, String s, boolean flag);

    public abstract void extend();

    public abstract STATUS getContactSearchStatusProp();

    public abstract GetResults_Result getResults();

    public abstract GetResults_Result getResults(int i);

    public abstract GetResults_Result getResults(int i, int j);

    public abstract int getStatusProp();

    public abstract boolean isValid();

    public abstract void release();

    public abstract void removeListener(ContactSearchIListener contactsearchilistener);

    public abstract void setSupportedContactTypes(int i);

    public abstract void submit();
}
