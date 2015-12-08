// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.Collections;
import java.util.Map;

public class NetworkResponse
{

    public final byte data[];
    public final Map headers;
    public final boolean notModified;
    public final int statusCode;

    public NetworkResponse(int i, byte abyte0[], Map map, boolean flag)
    {
        statusCode = i;
        data = abyte0;
        headers = map;
        notModified = flag;
    }

    public NetworkResponse(byte abyte0[])
    {
        this(200, abyte0, Collections.emptyMap(), false);
    }

    public NetworkResponse(byte abyte0[], Map map)
    {
        this(200, abyte0, map, false);
    }
}
