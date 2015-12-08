// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime;

import com.google.android.gms.common.internal.Objects;

public final class RoomParticipant
{

    public final int mCapabilities;
    public boolean mConnectionFailed;
    public boolean mInConnectedSet;
    public final String mParticipantId;
    public int mParticipantStatus;
    public String mPublicProfileJid;

    public RoomParticipant(String s, String s1, int i, boolean flag, int j)
    {
        mParticipantId = s;
        mPublicProfileJid = s1;
        mParticipantStatus = i;
        mInConnectedSet = flag;
        mCapabilities = j;
        mConnectionFailed = false;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("mParticipantId", mParticipantId).add("mPublicProfileJid", mPublicProfileJid).add("mParticipantStatus", Integer.valueOf(mParticipantStatus)).add("mInConnectedSet", Boolean.valueOf(mInConnectedSet)).add("mCapabilities", Integer.valueOf(mCapabilities)).toString();
    }
}
