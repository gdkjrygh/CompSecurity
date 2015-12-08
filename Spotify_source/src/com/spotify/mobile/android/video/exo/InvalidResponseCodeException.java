// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import bde;
import java.util.Map;

public class InvalidResponseCodeException extends com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException
{

    private static final long serialVersionUID = 0x2267f7b73L;
    public final Map mHeaderFields;
    public final String mResponseBody;
    public final int mResponseCode;

    public InvalidResponseCodeException(int i, Map map, String s, bde bde)
    {
        super((new StringBuilder("Response code: ")).append(i).toString(), bde);
        mResponseCode = i;
        mHeaderFields = map;
        mResponseBody = s;
    }
}
