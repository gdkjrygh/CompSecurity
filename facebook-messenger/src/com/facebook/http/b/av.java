// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;


public final class av extends Enum
{

    private static final av $VALUES[];
    public static final av HTTP_CLIENT_EXECUTE;
    public static final av READ_RESPONSE_BODY;
    private final String mName;

    private av(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static av valueOf(String s)
    {
        return (av)Enum.valueOf(com/facebook/http/b/av, s);
    }

    public static av[] values()
    {
        return (av[])$VALUES.clone();
    }

    public String toString()
    {
        return mName;
    }

    static 
    {
        HTTP_CLIENT_EXECUTE = new av("HTTP_CLIENT_EXECUTE", 0, "http_client_execute");
        READ_RESPONSE_BODY = new av("READ_RESPONSE_BODY", 1, "read_response_body");
        $VALUES = (new av[] {
            HTTP_CLIENT_EXECUTE, READ_RESPONSE_BODY
        });
    }
}
