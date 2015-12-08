// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, NativeStringConvert

public interface Sms
    extends ObjectInterface
{
    public static final class CLI_USED extends Enum
    {

        private static final CLI_USED $VALUES[];
        public static final CLI_USED CLI_CANNOT_BE_USED;
        public static final CLI_USED CLI_CAN_BE_USED;
        public static final CLI_USED CLI_USE_UNKNOWN;
        public static final CLI_USED WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CLI_USED fromInt(int i)
        {
            CLI_USED cli_used = (CLI_USED)intToTypeMap.a(i);
            if (cli_used != null)
            {
                return cli_used;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CLI_USED valueOf(String s)
        {
            return (CLI_USED)Enum.valueOf(com/skype/Sms$CLI_USED, s);
        }

        public static CLI_USED[] values()
        {
            return (CLI_USED[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CLI_CANNOT_BE_USED = new CLI_USED("CLI_CANNOT_BE_USED", 0, 0);
            CLI_CAN_BE_USED = new CLI_USED("CLI_CAN_BE_USED", 1, 1);
            CLI_USE_UNKNOWN = new CLI_USED("CLI_USE_UNKNOWN", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new CLI_USED("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CLI_USED[] {
                CLI_CANNOT_BE_USED, CLI_CAN_BE_USED, CLI_USE_UNKNOWN, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CLI_USED acli_used[] = values();
            int k = acli_used.length;
            for (int i = 0; i < k; i++)
            {
                CLI_USED cli_used = acli_used[i];
                intToTypeMap.a(cli_used.value, cli_used);
            }

        }

        private CLI_USED(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CONFIRM_TYPE extends Enum
    {

        private static final CONFIRM_TYPE $VALUES[];
        public static final CONFIRM_TYPE ID_MOBILE;
        public static final CONFIRM_TYPE ID_SKYPEIN;
        public static final CONFIRM_TYPE ID_SMS;
        public static final CONFIRM_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONFIRM_TYPE fromInt(int i)
        {
            CONFIRM_TYPE confirm_type = (CONFIRM_TYPE)intToTypeMap.a(i);
            if (confirm_type != null)
            {
                return confirm_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONFIRM_TYPE valueOf(String s)
        {
            return (CONFIRM_TYPE)Enum.valueOf(com/skype/Sms$CONFIRM_TYPE, s);
        }

        public static CONFIRM_TYPE[] values()
        {
            return (CONFIRM_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ID_SMS = new CONFIRM_TYPE("ID_SMS", 0, 1);
            ID_MOBILE = new CONFIRM_TYPE("ID_MOBILE", 1, 2);
            ID_SKYPEIN = new CONFIRM_TYPE("ID_SKYPEIN", 2, 3);
            WRAPPER_UNKNOWN_VALUE = new CONFIRM_TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CONFIRM_TYPE[] {
                ID_SMS, ID_MOBILE, ID_SKYPEIN, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONFIRM_TYPE aconfirm_type[] = values();
            int k = aconfirm_type.length;
            for (int i = 0; i < k; i++)
            {
                CONFIRM_TYPE confirm_type = aconfirm_type[i];
                intToTypeMap.a(confirm_type.value, confirm_type);
            }

        }

        private CONFIRM_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class ERROR_CATEGORY extends Enum
    {

        private static final ERROR_CATEGORY $VALUES[];
        public static final ERROR_CATEGORY ERROR_CATEGORY_BROKEN_DELIVERY_REPORT;
        public static final ERROR_CATEGORY ERROR_CATEGORY_DESTINATION_NOT_SUPPORTED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_INSUFFICIENT_FUNDS;
        public static final ERROR_CATEGORY ERROR_CATEGORY_INVALID_CONFIRMATION_CODE;
        public static final ERROR_CATEGORY ERROR_CATEGORY_INVALID_DST_ADDRESS;
        public static final ERROR_CATEGORY ERROR_CATEGORY_INVALID_SRC_ADDRESS;
        public static final ERROR_CATEGORY ERROR_CATEGORY_IP_BLOCKED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_MESSAGE_EXPIRED_BACKEND;
        public static final ERROR_CATEGORY ERROR_CATEGORY_MESSAGE_EXPIRED_OPERATOR;
        public static final ERROR_CATEGORY ERROR_CATEGORY_MISC_ERROR;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NODE_BLOCKED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NO_DELIVERY_REPORT;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NO_ERROR;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NO_SENDERID_CAPABILITY;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NO_SMS_CAPABILITY;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NUMBER_BLOCKED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NUMBER_DOES_NOT_EXIST;
        public static final ERROR_CATEGORY ERROR_CATEGORY_NUMBER_UNREACHABLE;
        public static final ERROR_CATEGORY ERROR_CATEGORY_PERMANENT_SERVICE_ERROR;
        public static final ERROR_CATEGORY ERROR_CATEGORY_RECIPIENT_BLOCKED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SENDER_BLOCKED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SENDER_BLOCKED_BY_RECIPIENT;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SERVER_CONNECT_FAILED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SMS_VELOCITY_DST_REACHED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SMS_VELOCITY_REACHED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SPAM_DETECTED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SPAM_VELOCITY_REACHED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_SYSTEM_ID_BLOCKED;
        public static final ERROR_CATEGORY ERROR_CATEGORY_TRANSIENT_SERVICE_ERROR;
        public static final ERROR_CATEGORY ERROR_CATEGORY_USER_BLOCKED;
        public static final ERROR_CATEGORY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static ERROR_CATEGORY fromInt(int i)
        {
            ERROR_CATEGORY error_category = (ERROR_CATEGORY)intToTypeMap.a(i);
            if (error_category != null)
            {
                return error_category;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static ERROR_CATEGORY valueOf(String s)
        {
            return (ERROR_CATEGORY)Enum.valueOf(com/skype/Sms$ERROR_CATEGORY, s);
        }

        public static ERROR_CATEGORY[] values()
        {
            return (ERROR_CATEGORY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ERROR_CATEGORY_NO_ERROR = new ERROR_CATEGORY("ERROR_CATEGORY_NO_ERROR", 0, 0);
            ERROR_CATEGORY_MISC_ERROR = new ERROR_CATEGORY("ERROR_CATEGORY_MISC_ERROR", 1, 1);
            ERROR_CATEGORY_SERVER_CONNECT_FAILED = new ERROR_CATEGORY("ERROR_CATEGORY_SERVER_CONNECT_FAILED", 2, 2);
            ERROR_CATEGORY_NO_SMS_CAPABILITY = new ERROR_CATEGORY("ERROR_CATEGORY_NO_SMS_CAPABILITY", 3, 3);
            ERROR_CATEGORY_INSUFFICIENT_FUNDS = new ERROR_CATEGORY("ERROR_CATEGORY_INSUFFICIENT_FUNDS", 4, 4);
            ERROR_CATEGORY_INVALID_CONFIRMATION_CODE = new ERROR_CATEGORY("ERROR_CATEGORY_INVALID_CONFIRMATION_CODE", 5, 5);
            ERROR_CATEGORY_USER_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_USER_BLOCKED", 6, 6);
            ERROR_CATEGORY_IP_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_IP_BLOCKED", 7, 7);
            ERROR_CATEGORY_NODE_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_NODE_BLOCKED", 8, 8);
            ERROR_CATEGORY_NO_SENDERID_CAPABILITY = new ERROR_CATEGORY("ERROR_CATEGORY_NO_SENDERID_CAPABILITY", 9, 9);
            ERROR_CATEGORY_RECIPIENT_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_RECIPIENT_BLOCKED", 10, 10);
            ERROR_CATEGORY_SENDER_BLOCKED_BY_RECIPIENT = new ERROR_CATEGORY("ERROR_CATEGORY_SENDER_BLOCKED_BY_RECIPIENT", 11, 11);
            ERROR_CATEGORY_SENDER_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_SENDER_BLOCKED", 12, 12);
            ERROR_CATEGORY_SMS_VELOCITY_REACHED = new ERROR_CATEGORY("ERROR_CATEGORY_SMS_VELOCITY_REACHED", 13, 13);
            ERROR_CATEGORY_SPAM_VELOCITY_REACHED = new ERROR_CATEGORY("ERROR_CATEGORY_SPAM_VELOCITY_REACHED", 14, 14);
            ERROR_CATEGORY_SPAM_DETECTED = new ERROR_CATEGORY("ERROR_CATEGORY_SPAM_DETECTED", 15, 15);
            ERROR_CATEGORY_NO_DELIVERY_REPORT = new ERROR_CATEGORY("ERROR_CATEGORY_NO_DELIVERY_REPORT", 16, 16);
            ERROR_CATEGORY_BROKEN_DELIVERY_REPORT = new ERROR_CATEGORY("ERROR_CATEGORY_BROKEN_DELIVERY_REPORT", 17, 17);
            ERROR_CATEGORY_SYSTEM_ID_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_SYSTEM_ID_BLOCKED", 18, 18);
            ERROR_CATEGORY_SMS_VELOCITY_DST_REACHED = new ERROR_CATEGORY("ERROR_CATEGORY_SMS_VELOCITY_DST_REACHED", 19, 19);
            ERROR_CATEGORY_INVALID_SRC_ADDRESS = new ERROR_CATEGORY("ERROR_CATEGORY_INVALID_SRC_ADDRESS", 20, 100);
            ERROR_CATEGORY_INVALID_DST_ADDRESS = new ERROR_CATEGORY("ERROR_CATEGORY_INVALID_DST_ADDRESS", 21, 101);
            ERROR_CATEGORY_DESTINATION_NOT_SUPPORTED = new ERROR_CATEGORY("ERROR_CATEGORY_DESTINATION_NOT_SUPPORTED", 22, 102);
            ERROR_CATEGORY_NUMBER_DOES_NOT_EXIST = new ERROR_CATEGORY("ERROR_CATEGORY_NUMBER_DOES_NOT_EXIST", 23, 103);
            ERROR_CATEGORY_NUMBER_BLOCKED = new ERROR_CATEGORY("ERROR_CATEGORY_NUMBER_BLOCKED", 24, 104);
            ERROR_CATEGORY_NUMBER_UNREACHABLE = new ERROR_CATEGORY("ERROR_CATEGORY_NUMBER_UNREACHABLE", 25, 105);
            ERROR_CATEGORY_MESSAGE_EXPIRED_OPERATOR = new ERROR_CATEGORY("ERROR_CATEGORY_MESSAGE_EXPIRED_OPERATOR", 26, 200);
            ERROR_CATEGORY_MESSAGE_EXPIRED_BACKEND = new ERROR_CATEGORY("ERROR_CATEGORY_MESSAGE_EXPIRED_BACKEND", 27, 201);
            ERROR_CATEGORY_TRANSIENT_SERVICE_ERROR = new ERROR_CATEGORY("ERROR_CATEGORY_TRANSIENT_SERVICE_ERROR", 28, 300);
            ERROR_CATEGORY_PERMANENT_SERVICE_ERROR = new ERROR_CATEGORY("ERROR_CATEGORY_PERMANENT_SERVICE_ERROR", 29, 301);
            WRAPPER_UNKNOWN_VALUE = new ERROR_CATEGORY("WRAPPER_UNKNOWN_VALUE", 30, 0x7fffffff);
            $VALUES = (new ERROR_CATEGORY[] {
                ERROR_CATEGORY_NO_ERROR, ERROR_CATEGORY_MISC_ERROR, ERROR_CATEGORY_SERVER_CONNECT_FAILED, ERROR_CATEGORY_NO_SMS_CAPABILITY, ERROR_CATEGORY_INSUFFICIENT_FUNDS, ERROR_CATEGORY_INVALID_CONFIRMATION_CODE, ERROR_CATEGORY_USER_BLOCKED, ERROR_CATEGORY_IP_BLOCKED, ERROR_CATEGORY_NODE_BLOCKED, ERROR_CATEGORY_NO_SENDERID_CAPABILITY, 
                ERROR_CATEGORY_RECIPIENT_BLOCKED, ERROR_CATEGORY_SENDER_BLOCKED_BY_RECIPIENT, ERROR_CATEGORY_SENDER_BLOCKED, ERROR_CATEGORY_SMS_VELOCITY_REACHED, ERROR_CATEGORY_SPAM_VELOCITY_REACHED, ERROR_CATEGORY_SPAM_DETECTED, ERROR_CATEGORY_NO_DELIVERY_REPORT, ERROR_CATEGORY_BROKEN_DELIVERY_REPORT, ERROR_CATEGORY_SYSTEM_ID_BLOCKED, ERROR_CATEGORY_SMS_VELOCITY_DST_REACHED, 
                ERROR_CATEGORY_INVALID_SRC_ADDRESS, ERROR_CATEGORY_INVALID_DST_ADDRESS, ERROR_CATEGORY_DESTINATION_NOT_SUPPORTED, ERROR_CATEGORY_NUMBER_DOES_NOT_EXIST, ERROR_CATEGORY_NUMBER_BLOCKED, ERROR_CATEGORY_NUMBER_UNREACHABLE, ERROR_CATEGORY_MESSAGE_EXPIRED_OPERATOR, ERROR_CATEGORY_MESSAGE_EXPIRED_BACKEND, ERROR_CATEGORY_TRANSIENT_SERVICE_ERROR, ERROR_CATEGORY_PERMANENT_SERVICE_ERROR, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            ERROR_CATEGORY aerror_category[] = values();
            int k = aerror_category.length;
            for (int i = 0; i < k; i++)
            {
                ERROR_CATEGORY error_category = aerror_category[i];
                intToTypeMap.a(error_category.value, error_category);
            }

        }

        private ERROR_CATEGORY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class FAILUREREASON extends Enum
    {

        private static final FAILUREREASON $VALUES[];
        public static final FAILUREREASON INSUFFICIENT_FUNDS;
        public static final FAILUREREASON INVALID_CONFIRMATION_CODE;
        public static final FAILUREREASON IP_BLOCKED;
        public static final FAILUREREASON MISC_ERROR;
        public static final FAILUREREASON NODE_BLOCKED;
        public static final FAILUREREASON NO_SENDERID_CAPABILITY;
        public static final FAILUREREASON NO_SMS_CAPABILITY;
        public static final FAILUREREASON SERVER_CONNECT_FAILED;
        public static final FAILUREREASON USER_BLOCKED;
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
            return (FAILUREREASON)Enum.valueOf(com/skype/Sms$FAILUREREASON, s);
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
            MISC_ERROR = new FAILUREREASON("MISC_ERROR", 0, 1);
            SERVER_CONNECT_FAILED = new FAILUREREASON("SERVER_CONNECT_FAILED", 1, 2);
            NO_SMS_CAPABILITY = new FAILUREREASON("NO_SMS_CAPABILITY", 2, 3);
            INSUFFICIENT_FUNDS = new FAILUREREASON("INSUFFICIENT_FUNDS", 3, 4);
            INVALID_CONFIRMATION_CODE = new FAILUREREASON("INVALID_CONFIRMATION_CODE", 4, 5);
            USER_BLOCKED = new FAILUREREASON("USER_BLOCKED", 5, 6);
            IP_BLOCKED = new FAILUREREASON("IP_BLOCKED", 6, 7);
            NODE_BLOCKED = new FAILUREREASON("NODE_BLOCKED", 7, 8);
            NO_SENDERID_CAPABILITY = new FAILUREREASON("NO_SENDERID_CAPABILITY", 8, 9);
            WRAPPER_UNKNOWN_VALUE = new FAILUREREASON("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new FAILUREREASON[] {
                MISC_ERROR, SERVER_CONNECT_FAILED, NO_SMS_CAPABILITY, INSUFFICIENT_FUNDS, INVALID_CONFIRMATION_CODE, USER_BLOCKED, IP_BLOCKED, NODE_BLOCKED, NO_SENDERID_CAPABILITY, WRAPPER_UNKNOWN_VALUE
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

    public static class GetBodyChunks_Result
    {

        public int m_charsUntilNextChunk;
        public boolean m_return;
        public String m_textChunks[];

        public void init(byte abyte0[][], int i, boolean flag)
        {
            m_textChunks = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_charsUntilNextChunk = i;
            m_return = flag;
        }

        public GetBodyChunks_Result()
        {
        }
    }

    public static final class HANDSET_DELIVERY_REPORT extends Enum
    {

        private static final HANDSET_DELIVERY_REPORT $VALUES[];
        public static final HANDSET_DELIVERY_REPORT HANDSET_DELIVERY_REPORT_CAPABLE;
        public static final HANDSET_DELIVERY_REPORT HANDSET_DELIVERY_REPORT_NOT_CAPABLE;
        public static final HANDSET_DELIVERY_REPORT HANDSET_DELIVERY_REPORT_UNKNOWN;
        public static final HANDSET_DELIVERY_REPORT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static HANDSET_DELIVERY_REPORT fromInt(int i)
        {
            HANDSET_DELIVERY_REPORT handset_delivery_report = (HANDSET_DELIVERY_REPORT)intToTypeMap.a(i);
            if (handset_delivery_report != null)
            {
                return handset_delivery_report;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static HANDSET_DELIVERY_REPORT valueOf(String s)
        {
            return (HANDSET_DELIVERY_REPORT)Enum.valueOf(com/skype/Sms$HANDSET_DELIVERY_REPORT, s);
        }

        public static HANDSET_DELIVERY_REPORT[] values()
        {
            return (HANDSET_DELIVERY_REPORT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            HANDSET_DELIVERY_REPORT_NOT_CAPABLE = new HANDSET_DELIVERY_REPORT("HANDSET_DELIVERY_REPORT_NOT_CAPABLE", 0, 0);
            HANDSET_DELIVERY_REPORT_CAPABLE = new HANDSET_DELIVERY_REPORT("HANDSET_DELIVERY_REPORT_CAPABLE", 1, 1);
            HANDSET_DELIVERY_REPORT_UNKNOWN = new HANDSET_DELIVERY_REPORT("HANDSET_DELIVERY_REPORT_UNKNOWN", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new HANDSET_DELIVERY_REPORT("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new HANDSET_DELIVERY_REPORT[] {
                HANDSET_DELIVERY_REPORT_NOT_CAPABLE, HANDSET_DELIVERY_REPORT_CAPABLE, HANDSET_DELIVERY_REPORT_UNKNOWN, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            HANDSET_DELIVERY_REPORT ahandset_delivery_report[] = values();
            int k = ahandset_delivery_report.length;
            for (int i = 0; i < k; i++)
            {
                HANDSET_DELIVERY_REPORT handset_delivery_report = ahandset_delivery_report[i];
                intToTypeMap.a(handset_delivery_report.value, handset_delivery_report);
            }

        }

        private HANDSET_DELIVERY_REPORT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class OUTGOING_REPLY_TYPE extends Enum
    {

        private static final OUTGOING_REPLY_TYPE $VALUES[];
        public static final OUTGOING_REPLY_TYPE REPLY_2WAY_AUTOASSIGNED_NR;
        public static final OUTGOING_REPLY_TYPE REPLY_SKYPENAME;
        public static final OUTGOING_REPLY_TYPE REPLY_TYPE_MIXED;
        public static final OUTGOING_REPLY_TYPE REPLY_USER_PHONE_NR;
        public static final OUTGOING_REPLY_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static OUTGOING_REPLY_TYPE fromInt(int i)
        {
            OUTGOING_REPLY_TYPE outgoing_reply_type = (OUTGOING_REPLY_TYPE)intToTypeMap.a(i);
            if (outgoing_reply_type != null)
            {
                return outgoing_reply_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static OUTGOING_REPLY_TYPE valueOf(String s)
        {
            return (OUTGOING_REPLY_TYPE)Enum.valueOf(com/skype/Sms$OUTGOING_REPLY_TYPE, s);
        }

        public static OUTGOING_REPLY_TYPE[] values()
        {
            return (OUTGOING_REPLY_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            REPLY_SKYPENAME = new OUTGOING_REPLY_TYPE("REPLY_SKYPENAME", 0, 1);
            REPLY_USER_PHONE_NR = new OUTGOING_REPLY_TYPE("REPLY_USER_PHONE_NR", 1, 2);
            REPLY_2WAY_AUTOASSIGNED_NR = new OUTGOING_REPLY_TYPE("REPLY_2WAY_AUTOASSIGNED_NR", 2, 3);
            REPLY_TYPE_MIXED = new OUTGOING_REPLY_TYPE("REPLY_TYPE_MIXED", 3, 4);
            WRAPPER_UNKNOWN_VALUE = new OUTGOING_REPLY_TYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new OUTGOING_REPLY_TYPE[] {
                REPLY_SKYPENAME, REPLY_USER_PHONE_NR, REPLY_2WAY_AUTOASSIGNED_NR, REPLY_TYPE_MIXED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            OUTGOING_REPLY_TYPE aoutgoing_reply_type[] = values();
            int k = aoutgoing_reply_type.length;
            for (int i = 0; i < k; i++)
            {
                OUTGOING_REPLY_TYPE outgoing_reply_type = aoutgoing_reply_type[i];
                intToTypeMap.a(outgoing_reply_type.value, outgoing_reply_type);
            }

        }

        private OUTGOING_REPLY_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class REPLY_CAPABILITY extends Enum
    {

        private static final REPLY_CAPABILITY $VALUES[];
        public static final REPLY_CAPABILITY CAPABLE_GLOBALLY;
        public static final REPLY_CAPABILITY CAPABLE_LOCALLY;
        public static final REPLY_CAPABILITY NOT_CAPABLE;
        public static final REPLY_CAPABILITY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static REPLY_CAPABILITY fromInt(int i)
        {
            REPLY_CAPABILITY reply_capability = (REPLY_CAPABILITY)intToTypeMap.a(i);
            if (reply_capability != null)
            {
                return reply_capability;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static REPLY_CAPABILITY valueOf(String s)
        {
            return (REPLY_CAPABILITY)Enum.valueOf(com/skype/Sms$REPLY_CAPABILITY, s);
        }

        public static REPLY_CAPABILITY[] values()
        {
            return (REPLY_CAPABILITY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOT_CAPABLE = new REPLY_CAPABILITY("NOT_CAPABLE", 0, 0);
            CAPABLE_GLOBALLY = new REPLY_CAPABILITY("CAPABLE_GLOBALLY", 1, 1);
            CAPABLE_LOCALLY = new REPLY_CAPABILITY("CAPABLE_LOCALLY", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new REPLY_CAPABILITY("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new REPLY_CAPABILITY[] {
                NOT_CAPABLE, CAPABLE_GLOBALLY, CAPABLE_LOCALLY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            REPLY_CAPABILITY areply_capability[] = values();
            int k = areply_capability.length;
            for (int i = 0; i < k; i++)
            {
                REPLY_CAPABILITY reply_capability = areply_capability[i];
                intToTypeMap.a(reply_capability.value, reply_capability);
            }

        }

        private REPLY_CAPABILITY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SETBODYRESULT extends Enum
    {

        private static final SETBODYRESULT $VALUES[];
        public static final SETBODYRESULT BODY_INVALID;
        public static final SETBODYRESULT BODY_LASTCHAR_IGNORED;
        public static final SETBODYRESULT BODY_OK;
        public static final SETBODYRESULT BODY_TRUNCATED;
        public static final SETBODYRESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SETBODYRESULT fromInt(int i)
        {
            SETBODYRESULT setbodyresult = (SETBODYRESULT)intToTypeMap.a(i);
            if (setbodyresult != null)
            {
                return setbodyresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SETBODYRESULT valueOf(String s)
        {
            return (SETBODYRESULT)Enum.valueOf(com/skype/Sms$SETBODYRESULT, s);
        }

        public static SETBODYRESULT[] values()
        {
            return (SETBODYRESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            BODY_INVALID = new SETBODYRESULT("BODY_INVALID", 0, 0);
            BODY_TRUNCATED = new SETBODYRESULT("BODY_TRUNCATED", 1, 1);
            BODY_OK = new SETBODYRESULT("BODY_OK", 2, 2);
            BODY_LASTCHAR_IGNORED = new SETBODYRESULT("BODY_LASTCHAR_IGNORED", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new SETBODYRESULT("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new SETBODYRESULT[] {
                BODY_INVALID, BODY_TRUNCATED, BODY_OK, BODY_LASTCHAR_IGNORED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SETBODYRESULT asetbodyresult[] = values();
            int k = asetbodyresult.length;
            for (int i = 0; i < k; i++)
            {
                SETBODYRESULT setbodyresult = asetbodyresult[i];
                intToTypeMap.a(setbodyresult.value, setbodyresult);
            }

        }

        private SETBODYRESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS COMPOSING;
        public static final STATUS DELIVERED;
        public static final STATUS FAILED;
        public static final STATUS READ;
        public static final STATUS RECEIVED;
        public static final STATUS SENDING_TO_SERVER;
        public static final STATUS SENT_TO_SERVER;
        public static final STATUS SOME_TARGETS_FAILED;
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
            return (STATUS)Enum.valueOf(com/skype/Sms$STATUS, s);
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
            RECEIVED = new STATUS("RECEIVED", 0, 1);
            READ = new STATUS("READ", 1, 2);
            COMPOSING = new STATUS("COMPOSING", 2, 3);
            SENDING_TO_SERVER = new STATUS("SENDING_TO_SERVER", 3, 4);
            SENT_TO_SERVER = new STATUS("SENT_TO_SERVER", 4, 5);
            DELIVERED = new STATUS("DELIVERED", 5, 6);
            SOME_TARGETS_FAILED = new STATUS("SOME_TARGETS_FAILED", 6, 7);
            FAILED = new STATUS("FAILED", 7, 8);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
            $VALUES = (new STATUS[] {
                RECEIVED, READ, COMPOSING, SENDING_TO_SERVER, SENT_TO_SERVER, DELIVERED, SOME_TARGETS_FAILED, FAILED, WRAPPER_UNKNOWN_VALUE
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

    public static class SetBody_Result
    {

        public int m_charsUntilNextChunk;
        public String m_chunks[];
        public SETBODYRESULT m_return;

        public void init(byte abyte0[][], int i, SETBODYRESULT setbodyresult)
        {
            m_chunks = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_charsUntilNextChunk = i;
            m_return = setbodyresult;
        }

        public SetBody_Result()
        {
        }
    }

    public static interface SmsIListener
    {
    }

    public static final class TARGETSTATUS extends Enum
    {

        private static final TARGETSTATUS $VALUES[];
        public static final TARGETSTATUS TARGET_ACCEPTABLE;
        public static final TARGETSTATUS TARGET_ANALYZING;
        public static final TARGETSTATUS TARGET_DELIVERY_FAILED;
        public static final TARGETSTATUS TARGET_DELIVERY_PENDING;
        public static final TARGETSTATUS TARGET_DELIVERY_SUCCESSFUL;
        public static final TARGETSTATUS TARGET_NOT_ROUTABLE;
        public static final TARGETSTATUS TARGET_UNDEFINED;
        public static final TARGETSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TARGETSTATUS fromInt(int i)
        {
            TARGETSTATUS targetstatus = (TARGETSTATUS)intToTypeMap.a(i);
            if (targetstatus != null)
            {
                return targetstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TARGETSTATUS valueOf(String s)
        {
            return (TARGETSTATUS)Enum.valueOf(com/skype/Sms$TARGETSTATUS, s);
        }

        public static TARGETSTATUS[] values()
        {
            return (TARGETSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TARGET_ANALYZING = new TARGETSTATUS("TARGET_ANALYZING", 0, 1);
            TARGET_UNDEFINED = new TARGETSTATUS("TARGET_UNDEFINED", 1, 2);
            TARGET_ACCEPTABLE = new TARGETSTATUS("TARGET_ACCEPTABLE", 2, 3);
            TARGET_NOT_ROUTABLE = new TARGETSTATUS("TARGET_NOT_ROUTABLE", 3, 4);
            TARGET_DELIVERY_PENDING = new TARGETSTATUS("TARGET_DELIVERY_PENDING", 4, 5);
            TARGET_DELIVERY_SUCCESSFUL = new TARGETSTATUS("TARGET_DELIVERY_SUCCESSFUL", 5, 6);
            TARGET_DELIVERY_FAILED = new TARGETSTATUS("TARGET_DELIVERY_FAILED", 6, 7);
            WRAPPER_UNKNOWN_VALUE = new TARGETSTATUS("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new TARGETSTATUS[] {
                TARGET_ANALYZING, TARGET_UNDEFINED, TARGET_ACCEPTABLE, TARGET_NOT_ROUTABLE, TARGET_DELIVERY_PENDING, TARGET_DELIVERY_SUCCESSFUL, TARGET_DELIVERY_FAILED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TARGETSTATUS atargetstatus[] = values();
            int k = atargetstatus.length;
            for (int i = 0; i < k; i++)
            {
                TARGETSTATUS targetstatus = atargetstatus[i];
                intToTypeMap.a(targetstatus.value, targetstatus);
            }

        }

        private TARGETSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE CONFIRMATION_CODE_REQUEST;
        public static final TYPE CONFIRMATION_CODE_SUBMIT;
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
            return (TYPE)Enum.valueOf(com/skype/Sms$TYPE, s);
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
            CONFIRMATION_CODE_REQUEST = new TYPE("CONFIRMATION_CODE_REQUEST", 2, 3);
            CONFIRMATION_CODE_SUBMIT = new TYPE("CONFIRMATION_CODE_SUBMIT", 3, 4);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new TYPE[] {
                INCOMING, OUTGOING, CONFIRMATION_CODE_REQUEST, CONFIRMATION_CODE_SUBMIT, WRAPPER_UNKNOWN_VALUE
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


    public abstract void addListener(SmsIListener smsilistener);

    public abstract REPLY_CAPABILITY canTargetReply(String s);

    public abstract GetBodyChunks_Result getBodyChunks();

    public abstract String getBodyProp();

    public abstract int getChatmsgIdProp();

    public abstract String getConvoNameProp();

    public abstract ERROR_CATEGORY getErrorCategoryProp();

    public abstract FAILUREREASON getFailureReasonProp();

    public abstract String getIdentityProp();

    public abstract boolean getIsFailedUnseenProp();

    public abstract OUTGOING_REPLY_TYPE getOutgoingReplyTypeProp();

    public abstract String getPriceCurrencyProp();

    public abstract int getPricePrecisionProp();

    public abstract int getPriceProp();

    public abstract String getReplyIdNumberProp();

    public abstract String getReplyToNumberProp();

    public abstract STATUS getStatusProp();

    public abstract CLI_USED getTargetCLIUsed(String s);

    public abstract ERROR_CATEGORY getTargetErrorCategory(String s);

    public abstract HANDSET_DELIVERY_REPORT getTargetHandsetDeliveryReport(String s);

    public abstract String getTargetNumbersProp();

    public abstract int getTargetPrice(String s);

    public abstract String getTargetReplyNumber(String s);

    public abstract OUTGOING_REPLY_TYPE getTargetReplyType(String s);

    public abstract TARGETSTATUS getTargetStatus(String s);

    public abstract byte[] getTargetStatusesProp();

    public abstract int getTimestampProp();

    public abstract TYPE getTypeProp();

    public abstract void removeListener(SmsIListener smsilistener);

    public abstract boolean send();

    public abstract SetBody_Result setBody(String s);

    public abstract void setConfirmationType(CONFIRM_TYPE confirm_type);

    public abstract boolean setOrigin(String s);

    public abstract boolean setReplyId(long l);

    public abstract boolean setReplyTo(String s);

    public abstract boolean setTargets(String as[]);
}
