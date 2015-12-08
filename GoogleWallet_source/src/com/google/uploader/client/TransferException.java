// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


public final class TransferException extends Exception
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type BAD_URL;
        public static final Type CANCELED;
        public static final Type CONNECTION_ERROR;
        public static final Type REQUEST_BODY_READ_ERROR;
        public static final Type SERVER_ERROR;
        public static final Type UNKNOWN;
        private final boolean recoverable;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/google/uploader/client/TransferException$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        final boolean isRecoverable()
        {
            return recoverable;
        }

        static 
        {
            BAD_URL = new Type("BAD_URL", 0, false);
            CANCELED = new Type("CANCELED", 1, false);
            REQUEST_BODY_READ_ERROR = new Type("REQUEST_BODY_READ_ERROR", 2, false);
            CONNECTION_ERROR = new Type("CONNECTION_ERROR", 3, true);
            SERVER_ERROR = new Type("SERVER_ERROR", 4, true);
            UNKNOWN = new Type("UNKNOWN", 5, false);
            $VALUES = (new Type[] {
                BAD_URL, CANCELED, REQUEST_BODY_READ_ERROR, CONNECTION_ERROR, SERVER_ERROR, UNKNOWN
            });
        }

        private Type(String s, int i, boolean flag)
        {
            super(s, i);
            recoverable = flag;
        }
    }


    private final Type type;

    public TransferException(Type type1, String s)
    {
        this(type1, s, null);
    }

    public TransferException(Type type1, String s, Throwable throwable)
    {
        super(s, throwable);
        type = type1;
    }

    public TransferException(Type type1, Throwable throwable)
    {
        this(type1, null, throwable);
    }

    public final Type getType()
    {
        return type;
    }

    public final boolean isRecoverable()
    {
        return type.isRecoverable();
    }
}
