// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface AccessSession
    extends ObjectInterface
{
    public static interface AccessSessionIListener
    {
    }

    public static final class CONNECTIONPROGRESS extends Enum
    {

        private static final CONNECTIONPROGRESS $VALUES[];
        public static final CONNECTIONPROGRESS CHECKING;
        public static final CONNECTIONPROGRESS COMPLETED;
        public static final CONNECTIONPROGRESS MAXSTEPS;
        public static final CONNECTIONPROGRESS STARTING;
        public static final CONNECTIONPROGRESS SUBMITTING;
        public static final CONNECTIONPROGRESS VERIFYING;
        public static final CONNECTIONPROGRESS WAITING;
        public static final CONNECTIONPROGRESS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONNECTIONPROGRESS fromInt(int i)
        {
            CONNECTIONPROGRESS connectionprogress = (CONNECTIONPROGRESS)intToTypeMap.a(i);
            if (connectionprogress != null)
            {
                return connectionprogress;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONNECTIONPROGRESS valueOf(String s)
        {
            return (CONNECTIONPROGRESS)Enum.valueOf(com/skype/AccessSession$CONNECTIONPROGRESS, s);
        }

        public static CONNECTIONPROGRESS[] values()
        {
            return (CONNECTIONPROGRESS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            STARTING = new CONNECTIONPROGRESS("STARTING", 0, 0);
            VERIFYING = new CONNECTIONPROGRESS("VERIFYING", 1, 1);
            SUBMITTING = new CONNECTIONPROGRESS("SUBMITTING", 2, 2);
            CHECKING = new CONNECTIONPROGRESS("CHECKING", 3, 3);
            WAITING = new CONNECTIONPROGRESS("WAITING", 4, 4);
            COMPLETED = new CONNECTIONPROGRESS("COMPLETED", 5, 5);
            MAXSTEPS = new CONNECTIONPROGRESS("MAXSTEPS", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new CONNECTIONPROGRESS("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new CONNECTIONPROGRESS[] {
                STARTING, VERIFYING, SUBMITTING, CHECKING, WAITING, COMPLETED, MAXSTEPS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONNECTIONPROGRESS aconnectionprogress[] = values();
            int k = aconnectionprogress.length;
            for (int i = 0; i < k; i++)
            {
                CONNECTIONPROGRESS connectionprogress = aconnectionprogress[i];
                intToTypeMap.a(connectionprogress.value, connectionprogress);
            }

        }

        private CONNECTIONPROGRESS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class FAILUREREASON extends Enum
    {

        private static final FAILUREREASON $VALUES[];
        public static final FAILUREREASON ALREADY_ONLINE;
        public static final FAILUREREASON CONNECTION_ERROR;
        public static final FAILUREREASON HTTP_FAILURE;
        public static final FAILUREREASON LOGIN_ABORTED;
        public static final FAILUREREASON LOGIN_FAILURE;
        public static final FAILUREREASON LOGOUT_FAILURE;
        public static final FAILUREREASON NO_BALANCE;
        public static final FAILUREREASON NO_FAILURE;
        public static final FAILUREREASON NO_HTML_URL;
        public static final FAILUREREASON NO_SUBSCRIPTION;
        public static final FAILUREREASON NO_SUPPORT;
        public static final FAILUREREASON SSID_QUERY_FAILURE;
        public static final FAILUREREASON TOKEN_QUERY_FAILURE;
        public static final FAILUREREASON TOO_MANY_REDIRECTS;
        public static final FAILUREREASON WISPR_CONTENT_ERROR;
        public static final FAILUREREASON WISPR_LOGIN_ERROR;
        public static final FAILUREREASON WISPR_LOGIN_REJECTED;
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
            return (FAILUREREASON)Enum.valueOf(com/skype/AccessSession$FAILUREREASON, s);
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
            NO_BALANCE = new FAILUREREASON("NO_BALANCE", 1, 1);
            NO_SUBSCRIPTION = new FAILUREREASON("NO_SUBSCRIPTION", 2, 2);
            NO_SUPPORT = new FAILUREREASON("NO_SUPPORT", 3, 3);
            LOGIN_FAILURE = new FAILUREREASON("LOGIN_FAILURE", 4, 4);
            LOGOUT_FAILURE = new FAILUREREASON("LOGOUT_FAILURE", 5, 5);
            LOGIN_ABORTED = new FAILUREREASON("LOGIN_ABORTED", 6, 6);
            CONNECTION_ERROR = new FAILUREREASON("CONNECTION_ERROR", 7, 7);
            ALREADY_ONLINE = new FAILUREREASON("ALREADY_ONLINE", 8, 8);
            TOO_MANY_REDIRECTS = new FAILUREREASON("TOO_MANY_REDIRECTS", 9, 9);
            HTTP_FAILURE = new FAILUREREASON("HTTP_FAILURE", 10, 10);
            WISPR_CONTENT_ERROR = new FAILUREREASON("WISPR_CONTENT_ERROR", 11, 11);
            WISPR_LOGIN_REJECTED = new FAILUREREASON("WISPR_LOGIN_REJECTED", 12, 12);
            WISPR_LOGIN_ERROR = new FAILUREREASON("WISPR_LOGIN_ERROR", 13, 13);
            NO_HTML_URL = new FAILUREREASON("NO_HTML_URL", 14, 14);
            TOKEN_QUERY_FAILURE = new FAILUREREASON("TOKEN_QUERY_FAILURE", 15, 15);
            SSID_QUERY_FAILURE = new FAILUREREASON("SSID_QUERY_FAILURE", 16, 16);
            WRAPPER_UNKNOWN_VALUE = new FAILUREREASON("WRAPPER_UNKNOWN_VALUE", 17, 0x7fffffff);
            $VALUES = (new FAILUREREASON[] {
                NO_FAILURE, NO_BALANCE, NO_SUBSCRIPTION, NO_SUPPORT, LOGIN_FAILURE, LOGOUT_FAILURE, LOGIN_ABORTED, CONNECTION_ERROR, ALREADY_ONLINE, TOO_MANY_REDIRECTS, 
                HTTP_FAILURE, WISPR_CONTENT_ERROR, WISPR_LOGIN_REJECTED, WISPR_LOGIN_ERROR, NO_HTML_URL, TOKEN_QUERY_FAILURE, SSID_QUERY_FAILURE, WRAPPER_UNKNOWN_VALUE
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

    public static final class HOTSPOTTYPE extends Enum
    {

        private static final HOTSPOTTYPE $VALUES[];
        public static final HOTSPOTTYPE FIRSTPAGEREDIRECT;
        public static final HOTSPOTTYPE FORM;
        public static final HOTSPOTTYPE NONE;
        public static final HOTSPOTTYPE OPEN;
        public static final HOTSPOTTYPE SUPPORTED;
        public static final HOTSPOTTYPE UNKNOWN;
        public static final HOTSPOTTYPE WISPR;
        public static final HOTSPOTTYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static HOTSPOTTYPE fromInt(int i)
        {
            HOTSPOTTYPE hotspottype = (HOTSPOTTYPE)intToTypeMap.a(i);
            if (hotspottype != null)
            {
                return hotspottype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static HOTSPOTTYPE valueOf(String s)
        {
            return (HOTSPOTTYPE)Enum.valueOf(com/skype/AccessSession$HOTSPOTTYPE, s);
        }

        public static HOTSPOTTYPE[] values()
        {
            return (HOTSPOTTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UNKNOWN = new HOTSPOTTYPE("UNKNOWN", 0, 0);
            OPEN = new HOTSPOTTYPE("OPEN", 1, 1);
            WISPR = new HOTSPOTTYPE("WISPR", 2, 2);
            FORM = new HOTSPOTTYPE("FORM", 3, 3);
            FIRSTPAGEREDIRECT = new HOTSPOTTYPE("FIRSTPAGEREDIRECT", 4, 4);
            NONE = new HOTSPOTTYPE("NONE", 5, 5);
            SUPPORTED = new HOTSPOTTYPE("SUPPORTED", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new HOTSPOTTYPE("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new HOTSPOTTYPE[] {
                UNKNOWN, OPEN, WISPR, FORM, FIRSTPAGEREDIRECT, NONE, SUPPORTED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            HOTSPOTTYPE ahotspottype[] = values();
            int k = ahotspottype.length;
            for (int i = 0; i < k; i++)
            {
                HOTSPOTTYPE hotspottype = ahotspottype[i];
                intToTypeMap.a(hotspottype.value, hotspottype);
            }

        }

        private HOTSPOTTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SESSIONFLAGS extends Enum
    {

        private static final SESSIONFLAGS $VALUES[];
        public static final SESSIONFLAGS SA_ASK_TO_RATE;
        public static final SESSIONFLAGS SA_LOW_CREDIT;
        public static final SESSIONFLAGS SA_NO_CURRENCY_CHANGE;
        public static final SESSIONFLAGS SA_OPEN_URL;
        public static final SESSIONFLAGS SA_PRODUCT_CREDIT;
        public static final SESSIONFLAGS SA_SHOW_PROMO_DIALOG;
        public static final SESSIONFLAGS SA_STAR_RATING_0;
        public static final SESSIONFLAGS SA_STAR_RATING_1;
        public static final SESSIONFLAGS SA_STAR_RATING_2;
        public static final SESSIONFLAGS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SESSIONFLAGS fromInt(int i)
        {
            SESSIONFLAGS sessionflags = (SESSIONFLAGS)intToTypeMap.a(i);
            if (sessionflags != null)
            {
                return sessionflags;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SESSIONFLAGS valueOf(String s)
        {
            return (SESSIONFLAGS)Enum.valueOf(com/skype/AccessSession$SESSIONFLAGS, s);
        }

        public static SESSIONFLAGS[] values()
        {
            return (SESSIONFLAGS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SA_OPEN_URL = new SESSIONFLAGS("SA_OPEN_URL", 0, 1);
            SA_SHOW_PROMO_DIALOG = new SESSIONFLAGS("SA_SHOW_PROMO_DIALOG", 1, 2);
            SA_NO_CURRENCY_CHANGE = new SESSIONFLAGS("SA_NO_CURRENCY_CHANGE", 2, 4);
            SA_ASK_TO_RATE = new SESSIONFLAGS("SA_ASK_TO_RATE", 3, 8);
            SA_STAR_RATING_0 = new SESSIONFLAGS("SA_STAR_RATING_0", 4, 32);
            SA_STAR_RATING_1 = new SESSIONFLAGS("SA_STAR_RATING_1", 5, 64);
            SA_STAR_RATING_2 = new SESSIONFLAGS("SA_STAR_RATING_2", 6, 128);
            SA_PRODUCT_CREDIT = new SESSIONFLAGS("SA_PRODUCT_CREDIT", 7, 256);
            SA_LOW_CREDIT = new SESSIONFLAGS("SA_LOW_CREDIT", 8, 0x10000);
            WRAPPER_UNKNOWN_VALUE = new SESSIONFLAGS("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new SESSIONFLAGS[] {
                SA_OPEN_URL, SA_SHOW_PROMO_DIALOG, SA_NO_CURRENCY_CHANGE, SA_ASK_TO_RATE, SA_STAR_RATING_0, SA_STAR_RATING_1, SA_STAR_RATING_2, SA_PRODUCT_CREDIT, SA_LOW_CREDIT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SESSIONFLAGS asessionflags[] = values();
            int k = asessionflags.length;
            for (int i = 0; i < k; i++)
            {
                SESSIONFLAGS sessionflags = asessionflags[i];
                intToTypeMap.a(sessionflags.value, sessionflags);
            }

        }

        private SESSIONFLAGS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS AVAILABLE;
        public static final STATUS LOGGED_IN;
        public static final STATUS LOGGED_OUT;
        public static final STATUS LOGGING_IN;
        public static final STATUS LOGGING_OUT;
        public static final STATUS LOGIN_FAILED;
        public static final STATUS UNAVAILABLE;
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
            return (STATUS)Enum.valueOf(com/skype/AccessSession$STATUS, s);
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
            UNAVAILABLE = new STATUS("UNAVAILABLE", 0, 0);
            AVAILABLE = new STATUS("AVAILABLE", 1, 1);
            LOGGING_IN = new STATUS("LOGGING_IN", 2, 2);
            LOGGED_IN = new STATUS("LOGGED_IN", 3, 3);
            LOGGED_OUT = new STATUS("LOGGED_OUT", 4, 4);
            LOGIN_FAILED = new STATUS("LOGIN_FAILED", 5, 5);
            LOGGING_OUT = new STATUS("LOGGING_OUT", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new STATUS[] {
                UNAVAILABLE, AVAILABLE, LOGGING_IN, LOGGED_IN, LOGGED_OUT, LOGIN_FAILED, LOGGING_OUT, WRAPPER_UNKNOWN_VALUE
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


    public abstract void addListener(AccessSessionIListener accesssessionilistener);

    public abstract void detectHotspot();

    public abstract void detectHotspotOffline();

    public abstract byte[] getAccountIdProp();

    public abstract byte[] getApMacProp();

    public abstract String getApSsidProp();

    public abstract int getConnectionProgressProp();

    public abstract String getDnsServerProp();

    public abstract FAILUREREASON getFailureReasonProp();

    public abstract int getHotspotRatingProp();

    public abstract int getHotspotTypeProp();

    public abstract int getMinutesRemainingProp();

    public abstract int getPartnerIdProp();

    public abstract String getPriceCurrencyProp();

    public abstract int getPricePerMinuteProp();

    public abstract int getPricePrecisionProp();

    public abstract int getPromoIdProp();

    public abstract int getSessionDurationProp();

    public abstract int getSessionFlagsProp();

    public abstract int getSessionTimestampProp();

    public abstract STATUS getStatusProp();

    public abstract boolean login();

    public abstract void loginWispr(String s, String s1);

    public abstract void logout();

    public abstract void notifyWifiChanged(byte abyte0[], String s, byte abyte1[]);

    public abstract void notifyWifiChanged(byte abyte0[], String s, byte abyte1[], String s1);

    public abstract void removeListener(AccessSessionIListener accesssessionilistener);

    public abstract void sendLocation(int i, int j, int k);

    public abstract void sendRating(int i);
}
