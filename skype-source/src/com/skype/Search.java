// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, Term

public interface Search
    extends ObjectInterface
{
    public static class GetResults_Result
    {

        public int m_objectIDList[];

        public void init(int ai[])
        {
            m_objectIDList = ai;
        }

        public GetResults_Result()
        {
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS EXTENDABLE;
        public static final STATUS FAILED;
        public static final STATUS FINISHED;
        public static final STATUS PENDING;
        public static final STATUS UNSUBMITTED;
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
            return (STATUS)Enum.valueOf(com/skype/Search$STATUS, s);
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
            UNSUBMITTED = new STATUS("UNSUBMITTED", 0, 0);
            PENDING = new STATUS("PENDING", 1, 1);
            EXTENDABLE = new STATUS("EXTENDABLE", 2, 2);
            FINISHED = new STATUS("FINISHED", 3, 3);
            FAILED = new STATUS("FAILED", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new STATUS[] {
                UNSUBMITTED, PENDING, EXTENDABLE, FINISHED, FAILED, WRAPPER_UNKNOWN_VALUE
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

    public static interface SearchIListener
    {
    }

    public static final class TARGET extends Enum
    {

        private static final TARGET $VALUES[];
        public static final TARGET ALERTHISTORY;
        public static final TARGET CALLHISTORY;
        public static final TARGET CHATHISTORY;
        public static final TARGET CHATMSGHISTORY;
        public static final TARGET CONVERSATIONHISTORY;
        public static final TARGET LOCALUSERS;
        public static final TARGET MESSAGEHISTORY;
        public static final TARGET REMOTEUSERS;
        public static final TARGET SMSHISTORY;
        public static final TARGET TRANSFERHISTORY;
        public static final TARGET VOICEMAILHISTORY;
        public static final TARGET WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TARGET fromInt(int i)
        {
            TARGET target = (TARGET)intToTypeMap.a(i);
            if (target != null)
            {
                return target;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TARGET valueOf(String s)
        {
            return (TARGET)Enum.valueOf(com/skype/Search$TARGET, s);
        }

        public static TARGET[] values()
        {
            return (TARGET[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            REMOTEUSERS = new TARGET("REMOTEUSERS", 0, 0);
            LOCALUSERS = new TARGET("LOCALUSERS", 1, 1);
            CHATHISTORY = new TARGET("CHATHISTORY", 2, 2);
            CHATMSGHISTORY = new TARGET("CHATMSGHISTORY", 3, 3);
            CALLHISTORY = new TARGET("CALLHISTORY", 4, 4);
            VOICEMAILHISTORY = new TARGET("VOICEMAILHISTORY", 5, 5);
            SMSHISTORY = new TARGET("SMSHISTORY", 6, 6);
            TRANSFERHISTORY = new TARGET("TRANSFERHISTORY", 7, 7);
            ALERTHISTORY = new TARGET("ALERTHISTORY", 8, 8);
            CONVERSATIONHISTORY = new TARGET("CONVERSATIONHISTORY", 9, 9);
            MESSAGEHISTORY = new TARGET("MESSAGEHISTORY", 10, 10);
            WRAPPER_UNKNOWN_VALUE = new TARGET("WRAPPER_UNKNOWN_VALUE", 11, 0x7fffffff);
            $VALUES = (new TARGET[] {
                REMOTEUSERS, LOCALUSERS, CHATHISTORY, CHATMSGHISTORY, CALLHISTORY, VOICEMAILHISTORY, SMSHISTORY, TRANSFERHISTORY, ALERTHISTORY, CONVERSATIONHISTORY, 
                MESSAGEHISTORY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TARGET atarget[] = values();
            int k = atarget.length;
            for (int i = 0; i < k; i++)
            {
                TARGET target = atarget[i];
                intToTypeMap.a(target.value, target);
            }

        }

        private TARGET(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract void addListener(SearchIListener searchilistener);

    public abstract void addTerm(Term term);

    public abstract void extend();

    public abstract GetResults_Result getResults();

    public abstract GetResults_Result getResults(int i);

    public abstract GetResults_Result getResults(int i, int j);

    public abstract boolean isValid();

    public abstract void removeListener(SearchIListener searchilistener);

    public abstract void setAgeRangeTerm();

    public abstract void setAgeRangeTerm(int i);

    public abstract void setAgeRangeTerm(int i, int j);
}
