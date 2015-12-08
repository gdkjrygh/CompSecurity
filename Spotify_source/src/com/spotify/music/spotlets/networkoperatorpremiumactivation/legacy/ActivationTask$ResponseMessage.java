// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class mMessage
    implements JacksonModel
{

    private final String mMessage;
    private final String mStatus;

    public String getMessage()
    {
        return mMessage;
    }

    public boolean isSuccess()
    {
        return "success".equals(mStatus);
    }

    public String toString()
    {
        return (new StringBuilder("ResponseMessage{mStatus='")).append(mStatus).append('\'').append(", mMessage='").append(mMessage).append('\'').append('}').toString();
    }

    public (String s, String s1)
    {
        mStatus = s;
        mMessage = s1;
    }
}
