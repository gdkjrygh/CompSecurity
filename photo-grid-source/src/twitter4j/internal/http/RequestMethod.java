// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;


public final class RequestMethod extends Enum
{

    private static final RequestMethod $VALUES[];
    public static final RequestMethod DELETE;
    public static final RequestMethod GET;
    public static final RequestMethod HEAD;
    public static final RequestMethod POST;
    public static final RequestMethod PUT;

    private RequestMethod(String s, int i)
    {
        super(s, i);
    }

    public static RequestMethod valueOf(String s)
    {
        return (RequestMethod)Enum.valueOf(twitter4j/internal/http/RequestMethod, s);
    }

    public static RequestMethod[] values()
    {
        return (RequestMethod[])$VALUES.clone();
    }

    static 
    {
        GET = new RequestMethod("GET", 0);
        POST = new RequestMethod("POST", 1);
        DELETE = new RequestMethod("DELETE", 2);
        HEAD = new RequestMethod("HEAD", 3);
        PUT = new RequestMethod("PUT", 4);
        $VALUES = (new RequestMethod[] {
            GET, POST, DELETE, HEAD, PUT
        });
    }
}
