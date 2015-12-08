// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public static final class >
{

    public int mAdType;
    public String mAdUnitId;
    public String mChannelName;
    public String mEditionName;
    public int mPosition;
    public Map mTargetingParams;

    public final kR a()
    {
        if (mEditionName == null)
        {
            throw new IllegalArgumentException("editionName should not be null.");
        }
        if (mChannelName == null)
        {
            throw new IllegalArgumentException("channelName should not be null.");
        } else
        {
            return new kR(mEditionName, mChannelName, mAdUnitId, mTargetingParams, mPosition, mAdType, (byte)0);
        }
    }

    public >()
    {
    }
}
