// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface PriceQuote
    extends ObjectInterface
{
    public static final class FAILUREREASON extends Enum
    {

        private static final FAILUREREASON $VALUES[];
        public static final FAILUREREASON ACCOUNT_ON_HOLD;
        public static final FAILUREREASON CALL_NOT_IN_PROGRESS;
        public static final FAILUREREASON GW_AUTHENTICATION_FAILED;
        public static final FAILUREREASON INTERNAL_ERROR;
        public static final FAILUREREASON NETWORK_PROBLEM;
        public static final FAILUREREASON NOT_SUPPORTED_BY_BUYER;
        public static final FAILUREREASON NO_FAILURE;
        public static final FAILUREREASON OUT_OF_FUNDS;
        public static final FAILUREREASON PAYMENTS_STOPPED;
        public static final FAILUREREASON PRICE_EXCEEDS_LIMIT;
        public static final FAILUREREASON REJECTED_BY_BUYER;
        public static final FAILUREREASON SECURITY_CHECK_FAILED;
        public static final FAILUREREASON SIGNUP_REQUIRED;
        public static final FAILUREREASON TIMEOUT;
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
            return (FAILUREREASON)Enum.valueOf(com/skype/PriceQuote$FAILUREREASON, s);
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
            NO_FAILURE = new FAILUREREASON("NO_FAILURE", 0, 0);
            REJECTED_BY_BUYER = new FAILUREREASON("REJECTED_BY_BUYER", 1, 1);
            NETWORK_PROBLEM = new FAILUREREASON("NETWORK_PROBLEM", 2, 2);
            INTERNAL_ERROR = new FAILUREREASON("INTERNAL_ERROR", 3, 3);
            GW_AUTHENTICATION_FAILED = new FAILUREREASON("GW_AUTHENTICATION_FAILED", 4, 4);
            SIGNUP_REQUIRED = new FAILUREREASON("SIGNUP_REQUIRED", 5, 5);
            PRICE_EXCEEDS_LIMIT = new FAILUREREASON("PRICE_EXCEEDS_LIMIT", 6, 6);
            NOT_SUPPORTED_BY_BUYER = new FAILUREREASON("NOT_SUPPORTED_BY_BUYER", 7, 7);
            PAYMENTS_STOPPED = new FAILUREREASON("PAYMENTS_STOPPED", 8, 8);
            SECURITY_CHECK_FAILED = new FAILUREREASON("SECURITY_CHECK_FAILED", 9, 9);
            OUT_OF_FUNDS = new FAILUREREASON("OUT_OF_FUNDS", 10, 10);
            TIMEOUT = new FAILUREREASON("TIMEOUT", 11, 11);
            ACCOUNT_ON_HOLD = new FAILUREREASON("ACCOUNT_ON_HOLD", 12, 12);
            CALL_NOT_IN_PROGRESS = new FAILUREREASON("CALL_NOT_IN_PROGRESS", 13, 13);
            WRAPPER_UNKNOWN_VALUE = new FAILUREREASON("WRAPPER_UNKNOWN_VALUE", 14, 0x7fffffff);
            $VALUES = (new FAILUREREASON[] {
                NO_FAILURE, REJECTED_BY_BUYER, NETWORK_PROBLEM, INTERNAL_ERROR, GW_AUTHENTICATION_FAILED, SIGNUP_REQUIRED, PRICE_EXCEEDS_LIMIT, NOT_SUPPORTED_BY_BUYER, PAYMENTS_STOPPED, SECURITY_CHECK_FAILED, 
                OUT_OF_FUNDS, TIMEOUT, ACCOUNT_ON_HOLD, CALL_NOT_IN_PROGRESS, WRAPPER_UNKNOWN_VALUE
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

    public static interface PriceQuoteIListener
    {
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS ACCEPTED;
        public static final STATUS FINISHED;
        public static final STATUS INPROGRESS;
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
            return (STATUS)Enum.valueOf(com/skype/PriceQuote$STATUS, s);
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
            PENDING = new STATUS("PENDING", 0, 1);
            ACCEPTED = new STATUS("ACCEPTED", 1, 2);
            INPROGRESS = new STATUS("INPROGRESS", 2, 3);
            FINISHED = new STATUS("FINISHED", 3, 4);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new STATUS[] {
                PENDING, ACCEPTED, INPROGRESS, FINISHED, WRAPPER_UNKNOWN_VALUE
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
        public static final TYPE CALL_EVENT;
        public static final TYPE CALL_MINUTE;
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
            return (TYPE)Enum.valueOf(com/skype/PriceQuote$TYPE, s);
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
            CALL_MINUTE = new TYPE("CALL_MINUTE", 0, 1);
            CALL_EVENT = new TYPE("CALL_EVENT", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new TYPE[] {
                CALL_MINUTE, CALL_EVENT, WRAPPER_UNKNOWN_VALUE
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


    public abstract boolean accept();

    public abstract void addListener(PriceQuoteIListener pricequoteilistener);

    public abstract int getAmountPaidProp();

    public abstract String getBuyerProp();

    public abstract int getConvoIdProp();

    public abstract String getDescriptionProp();

    public abstract FAILUREREASON getFailureReasonProp();

    public abstract int getMessageIdProp();

    public abstract String getPriceCurrencyProp();

    public abstract int getPricePrecisionProp();

    public abstract int getPriceProp();

    public abstract String getProviderProp();

    public abstract int getReferredObjectID();

    public abstract STATUS getStatusProp();

    public abstract TYPE getTypeProp();

    public abstract int getUsertouchedTimestampProp();

    public abstract boolean reject();

    public abstract void removeListener(PriceQuoteIListener pricequoteilistener);
}
