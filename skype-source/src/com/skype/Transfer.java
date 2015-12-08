// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface Transfer
    extends ObjectInterface
{
    public static final class FAILUREREASON extends Enum
    {

        private static final FAILUREREASON $VALUES[];
        public static final FAILUREREASON FAILED_READ;
        public static final FAILUREREASON FAILED_REMOTE_READ;
        public static final FAILUREREASON FAILED_REMOTE_WRITE;
        public static final FAILUREREASON FAILED_WRITE;
        public static final FAILUREREASON PLACEHOLDER_TIMEOUT;
        public static final FAILUREREASON REMOTELY_CANCELLED;
        public static final FAILUREREASON REMOTE_DOES_NOT_SUPPORT_FT;
        public static final FAILUREREASON REMOTE_OFFLINE_FOR_TOO_LONG;
        public static final FAILUREREASON SENDER_NOT_AUTHORISED;
        public static final FAILUREREASON TOO_MANY_PARALLEL;
        public static final FAILUREREASON WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static FAILUREREASON fromInt(int i)
        {
            FAILUREREASON failurereason = (FAILUREREASON)intToTypeMap.a(i);
            if (failurereason != null)
            {
                return failurereason;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static FAILUREREASON valueOf(String s)
        {
            return (FAILUREREASON)Enum.valueOf(com/skype/Transfer$FAILUREREASON, s);
        }

        public static FAILUREREASON[] values()
        {
            return (FAILUREREASON[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SENDER_NOT_AUTHORISED = new FAILUREREASON("SENDER_NOT_AUTHORISED", 0, 1);
            REMOTELY_CANCELLED = new FAILUREREASON("REMOTELY_CANCELLED", 1, 2);
            FAILED_READ = new FAILUREREASON("FAILED_READ", 2, 3);
            FAILED_REMOTE_READ = new FAILUREREASON("FAILED_REMOTE_READ", 3, 4);
            FAILED_WRITE = new FAILUREREASON("FAILED_WRITE", 4, 5);
            FAILED_REMOTE_WRITE = new FAILUREREASON("FAILED_REMOTE_WRITE", 5, 6);
            REMOTE_DOES_NOT_SUPPORT_FT = new FAILUREREASON("REMOTE_DOES_NOT_SUPPORT_FT", 6, 7);
            REMOTE_OFFLINE_FOR_TOO_LONG = new FAILUREREASON("REMOTE_OFFLINE_FOR_TOO_LONG", 7, 8);
            TOO_MANY_PARALLEL = new FAILUREREASON("TOO_MANY_PARALLEL", 8, 9);
            PLACEHOLDER_TIMEOUT = new FAILUREREASON("PLACEHOLDER_TIMEOUT", 9, 10);
            WRAPPER_UNKNOWN_VALUE = new FAILUREREASON("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new FAILUREREASON[] {
                SENDER_NOT_AUTHORISED, REMOTELY_CANCELLED, FAILED_READ, FAILED_REMOTE_READ, FAILED_WRITE, FAILED_REMOTE_WRITE, REMOTE_DOES_NOT_SUPPORT_FT, REMOTE_OFFLINE_FOR_TOO_LONG, TOO_MANY_PARALLEL, PLACEHOLDER_TIMEOUT, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            FAILUREREASON afailurereason[] = values();
            int k = afailurereason.length;
            for (int i = 0; i < k; i++)
            {
                FAILUREREASON failurereason = afailurereason[i];
                intToTypeMap.a(failurereason.value, failurereason);
            }

        }

        private FAILUREREASON(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS CANCELLED;
        public static final STATUS CANCELLED_BY_REMOTE;
        public static final STATUS COMPLETED;
        public static final STATUS CONNECTING;
        public static final STATUS FAILED;
        public static final STATUS NEW;
        public static final STATUS OFFER_FROM_OTHER_INSTANCE;
        public static final STATUS PAUSED;
        public static final STATUS PLACEHOLDER;
        public static final STATUS REMOTELY_PAUSED;
        public static final STATUS TRANSFERRING;
        public static final STATUS TRANSFERRING_OVER_RELAY;
        public static final STATUS WAITING_FOR_ACCEPT;
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
            return (STATUS)Enum.valueOf(com/skype/Transfer$STATUS, s);
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
            NEW = new STATUS("NEW", 0, 0);
            CONNECTING = new STATUS("CONNECTING", 1, 1);
            WAITING_FOR_ACCEPT = new STATUS("WAITING_FOR_ACCEPT", 2, 2);
            TRANSFERRING = new STATUS("TRANSFERRING", 3, 3);
            TRANSFERRING_OVER_RELAY = new STATUS("TRANSFERRING_OVER_RELAY", 4, 4);
            PAUSED = new STATUS("PAUSED", 5, 5);
            REMOTELY_PAUSED = new STATUS("REMOTELY_PAUSED", 6, 6);
            CANCELLED = new STATUS("CANCELLED", 7, 7);
            COMPLETED = new STATUS("COMPLETED", 8, 8);
            FAILED = new STATUS("FAILED", 9, 9);
            PLACEHOLDER = new STATUS("PLACEHOLDER", 10, 10);
            OFFER_FROM_OTHER_INSTANCE = new STATUS("OFFER_FROM_OTHER_INSTANCE", 11, 11);
            CANCELLED_BY_REMOTE = new STATUS("CANCELLED_BY_REMOTE", 12, 12);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 13, 0x7fffffff);
            $VALUES = (new STATUS[] {
                NEW, CONNECTING, WAITING_FOR_ACCEPT, TRANSFERRING, TRANSFERRING_OVER_RELAY, PAUSED, REMOTELY_PAUSED, CANCELLED, COMPLETED, FAILED, 
                PLACEHOLDER, OFFER_FROM_OTHER_INSTANCE, CANCELLED_BY_REMOTE, WRAPPER_UNKNOWN_VALUE
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

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE INCOMING;
        public static final TYPE OUTGOING;
        public static final TYPE WRAPPER_UNKNOWN_VALUE;
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
            return (TYPE)Enum.valueOf(com/skype/Transfer$TYPE, s);
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
            INCOMING = new TYPE("INCOMING", 0, 1);
            OUTGOING = new TYPE("OUTGOING", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new TYPE[] {
                INCOMING, OUTGOING, WRAPPER_UNKNOWN_VALUE
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

    public static interface TransferIListener
    {
    }


    public abstract boolean accept(String s);

    public abstract void addListener(TransferIListener transferilistener);

    public abstract boolean cancel();

    public abstract int getBytespersecondProp();

    public abstract String getBytestransferredProp();

    public abstract byte[] getChatmsgGuidProp();

    public abstract int getChatmsgIndexProp();

    public abstract int getConvoIdProp();

    public abstract FAILUREREASON getFailureReasonProp();

    public abstract String getFilenameProp();

    public abstract String getFilepathProp();

    public abstract String getFilesizeProp();

    public abstract int getFinishtimeProp();

    public abstract String getPartnerDispnameProp();

    public abstract String getPartnerHandleProp();

    public abstract int getStarttimeProp();

    public abstract STATUS getStatusProp();

    public abstract TYPE getTypeProp();

    public abstract boolean isController();

    public abstract boolean pause();

    public abstract void removeListener(TransferIListener transferilistener);

    public abstract boolean resume();
}
