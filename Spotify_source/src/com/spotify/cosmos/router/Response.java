// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router;

import java.util.Map;

// Referenced classes of package com.spotify.cosmos.router:
//            NativeHelpers

public class Response
{

    private byte mBody[];
    private Map mHeaders;
    private int mStatus;
    private String mUri;

    public Response(int i, String s, Map map, byte abyte0[])
    {
        mStatus = i;
        mUri = s;
        mHeaders = map;
        mBody = abyte0;
    }

    private Response(int i, String s, byte abyte0[], byte abyte1[])
    {
        mStatus = i;
        mUri = s;
        mHeaders = NativeHelpers.byteArrayToMap(abyte0);
        mBody = abyte1;
    }

    public byte[] getBody()
    {
        return mBody;
    }

    public Map getHeaders()
    {
        return mHeaders;
    }

    public int getStatus()
    {
        return mStatus;
    }

    public String getUri()
    {
        return mUri;
    }
}
