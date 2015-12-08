// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.io.Serializable;
import java.util.Map;

public class NetworkResponse
    implements Serializable
{

    private static final long serialVersionUID = 0xffffedac4b026f90L;
    public final int a;
    public final byte b[];
    public final Map c;
    public final boolean d;
    public final long e;

    public NetworkResponse(int i, byte abyte0[], Map map, boolean flag, long l)
    {
        a = i;
        b = abyte0;
        c = map;
        d = flag;
        e = l;
    }

    public NetworkResponse(byte abyte0[], Map map)
    {
        this(200, abyte0, map, false, 0L);
    }
}
