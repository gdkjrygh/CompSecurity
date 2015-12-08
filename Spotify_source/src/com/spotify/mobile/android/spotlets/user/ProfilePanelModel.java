// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class ProfilePanelModel
    implements JacksonModel
{

    private final Integer mUnclaimedInvitationCodeCount;

    public ProfilePanelModel(Integer integer)
    {
        mUnclaimedInvitationCodeCount = integer;
    }

    public Integer getUnclaimedInvitationCodeCount()
    {
        return mUnclaimedInvitationCodeCount;
    }
}
