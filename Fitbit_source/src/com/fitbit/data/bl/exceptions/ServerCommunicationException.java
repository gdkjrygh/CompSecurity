// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            UserFriendlyTextException

public class ServerCommunicationException extends UserFriendlyTextException
{
    public static final class ServerErrorType extends Enum
    {

        public static final ServerErrorType a;
        private static final ServerErrorType b[];

        public static ServerErrorType valueOf(String s)
        {
            return (ServerErrorType)Enum.valueOf(com/fitbit/data/bl/exceptions/ServerCommunicationException$ServerErrorType, s);
        }

        public static ServerErrorType[] values()
        {
            return (ServerErrorType[])b.clone();
        }

        static 
        {
            a = new ServerErrorType("VALIDATION", 0);
            b = (new ServerErrorType[] {
                a
            });
        }

        private ServerErrorType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int d = -1;
    public static final int e = 0xfcee8adb;
    private static final long serialVersionUID = 0xb89023e066d0fdffL;
    private int statusCode;
    private ServerErrorType type;

    public ServerCommunicationException()
    {
        statusCode = -1;
    }

    public ServerCommunicationException(int i, String s)
    {
        super(s);
        statusCode = -1;
        a(i);
    }

    public ServerCommunicationException(String s)
    {
        super(s);
        statusCode = -1;
    }

    public ServerCommunicationException(String s, Throwable throwable)
    {
        super(s, throwable);
        statusCode = -1;
    }

    public ServerCommunicationException(Throwable throwable)
    {
        super(throwable);
        statusCode = -1;
    }

    public int a()
    {
        return statusCode != 400 && statusCode != 401 && statusCode != 403 && statusCode != 404 && statusCode != 500 && statusCode != 502 && statusCode != 503 ? 0x7f08018e : 0x7f08018f;
    }

    public void a(int i)
    {
        statusCode = i;
    }

    public void a(ServerErrorType servererrortype)
    {
        type = servererrortype;
    }

    public String b()
    {
        return "ServerCommunicationException";
    }

    public int e()
    {
        return statusCode;
    }

    public ServerErrorType f()
    {
        return type;
    }
}
