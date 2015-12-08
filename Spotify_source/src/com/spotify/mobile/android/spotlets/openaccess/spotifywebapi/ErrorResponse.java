// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.spotifywebapi;

import com.spotify.mobile.android.cosmos.JacksonModel;
import exq;

public class ErrorResponse
    implements JacksonModel
{

    private final exq mError;

    private ErrorResponse(exq exq)
    {
        mError = exq;
    }

    public exq getError()
    {
        return mError;
    }
}
