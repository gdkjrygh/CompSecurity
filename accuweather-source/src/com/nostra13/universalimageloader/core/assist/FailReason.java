// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;


public class FailReason
{
    public static final class FailType extends Enum
    {

        private static final FailType $VALUES[];
        public static final FailType DECODING_ERROR;
        public static final FailType IO_ERROR;
        public static final FailType NETWORK_DENIED;
        public static final FailType OUT_OF_MEMORY;
        public static final FailType UNKNOWN;

        public static FailType valueOf(String s)
        {
            return (FailType)Enum.valueOf(com/nostra13/universalimageloader/core/assist/FailReason$FailType, s);
        }

        public static FailType[] values()
        {
            return (FailType[])$VALUES.clone();
        }

        static 
        {
            IO_ERROR = new FailType("IO_ERROR", 0);
            DECODING_ERROR = new FailType("DECODING_ERROR", 1);
            NETWORK_DENIED = new FailType("NETWORK_DENIED", 2);
            OUT_OF_MEMORY = new FailType("OUT_OF_MEMORY", 3);
            UNKNOWN = new FailType("UNKNOWN", 4);
            $VALUES = (new FailType[] {
                IO_ERROR, DECODING_ERROR, NETWORK_DENIED, OUT_OF_MEMORY, UNKNOWN
            });
        }

        private FailType(String s, int i)
        {
            super(s, i);
        }
    }


    private final Throwable cause;
    private final FailType type;

    public FailReason(FailType failtype, Throwable throwable)
    {
        type = failtype;
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }

    public FailType getType()
    {
        return type;
    }
}
