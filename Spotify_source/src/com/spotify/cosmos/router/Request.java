// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.spotify.cosmos.router:
//            NativeHelpers

public class Request
{

    public static final String DELETE = "DELETE";
    public static final byte EMPTY_BODY[] = new byte[0];
    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String SUB = "SUB";
    private String mAction;
    private byte mBody[];
    private Map mHeaders;
    private String mUri;

    public Request()
    {
    }

    public Request(String s, String s1)
    {
        this(s, s1, ((Map) (new HashMap())), EMPTY_BODY);
    }

    public Request(String s, String s1, Map map, byte abyte0[])
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("URI cannot be null");
        }
        if (s1.length() == 0)
        {
            throw new IllegalArgumentException("URI cannot be empty");
        } else
        {
            mHeaders = map;
            mAction = s;
            mUri = s1;
            mBody = abyte0;
            return;
        }
    }

    private byte[] getHeadersArray()
    {
        return NativeHelpers.mapToByteArray(mHeaders);
    }

    public String getAction()
    {
        return mAction;
    }

    public byte[] getBody()
    {
        return mBody;
    }

    public Map getHeaders()
    {
        return mHeaders;
    }

    public String getUri()
    {
        return mUri;
    }

    public void setAction(String s)
    {
        mAction = s;
    }

    public void setBody(byte abyte0[])
    {
        mBody = abyte0;
    }

    public void setHeaders(Map map)
    {
        mHeaders = map;
    }

    public void setUri(String s)
    {
        mUri = s;
    }

}
