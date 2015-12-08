// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;

import com.fitbit.data.domain.s;
import java.io.Serializable;

// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class ServerResponseException extends ServerCommunicationException
    implements Serializable
{
    public static final class ErrorCode extends Enum
        implements s
    {

        public static final ErrorCode a;
        public static final ErrorCode b;
        public static final ErrorCode c;
        public static final ErrorCode d;
        public static final ErrorCode e;
        public static final ErrorCode f;
        private static final ErrorCode g[];
        private final String serializableName;

        public static ErrorCode a(String s1, ErrorCode errorcode)
        {
            try
            {
                s1 = valueOf(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return errorcode;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return errorcode;
            }
            return s1;
        }

        public static ErrorCode valueOf(String s1)
        {
            return (ErrorCode)Enum.valueOf(com/fitbit/data/bl/exceptions/ServerResponseException$ErrorCode, s1);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])g.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            a = new ErrorCode("VALIDATION_ERROR", 0, "VALIDATION_ERROR");
            b = new ErrorCode("SYSTEM_ERROR", 1, "SYSTEM_ERROR");
            c = new ErrorCode("SYSTEM_ERROR_DETAILS", 2, "SYSTEM_ERROR_DETAILS");
            d = new ErrorCode("NOT_PAIRED", 3, "NOT_PAIRED");
            e = new ErrorCode("LOW_BATTERY", 4, "LOW_BATTERY");
            f = new ErrorCode("UNKNOWN_ERROR", 5, "UNKNOWN_ERROR");
            g = (new ErrorCode[] {
                a, b, c, d, e, f
            });
        }

        private ErrorCode(String s1, int i, String s2)
        {
            super(s1, i);
            serializableName = s2;
        }
    }

    public static final class ErrorType extends Enum
        implements s
    {

        public static final ErrorType a;
        public static final ErrorType b;
        private static final ErrorType c[];
        private final String serializableName;

        public static ErrorType a(String s1, ErrorType errortype)
        {
            try
            {
                s1 = valueOf(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return errortype;
            }
            return s1;
        }

        public static ErrorType valueOf(String s1)
        {
            return (ErrorType)Enum.valueOf(com/fitbit/data/bl/exceptions/ServerResponseException$ErrorType, s1);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])c.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            a = new ErrorType("GOAL", 0, "GOAL");
            b = new ErrorType("NO_TYPE", 1, "NO_TYPE");
            c = (new ErrorType[] {
                a, b
            });
        }

        private ErrorType(String s1, int i, String s2)
        {
            super(s1, i);
            serializableName = s2;
        }
    }


    public static final int a = 0;
    private static final long serialVersionUID = 1L;
    private final ErrorCode code;
    private final ErrorType type;

    public ServerResponseException(ErrorCode errorcode, ErrorType errortype, String s)
    {
        super(s);
        code = errorcode;
        type = errortype;
    }

    public int a()
    {
        if (d() != ErrorType.a) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ErrorCode.values().length];
                try
                {
                    a[ErrorCode.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1.a[c().ordinal()];
        JVM INSTR tableswitch 1 1: default 40
    //                   1 43;
           goto _L2 _L3
_L2:
        return 0x7f08056e;
_L3:
        return 0x7f08023a;
    }

    public String b()
    {
        return "ServerResponseException";
    }

    public ErrorCode c()
    {
        return code;
    }

    public ErrorType d()
    {
        return type;
    }
}
