// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.service:
//            GaiaStateUpdateIdJacksonModel

public class GaiaJacksonModel
    implements JacksonModel
{

    private final List mDeviceJacksonModelList;
    private final boolean mIsActive;
    private final boolean mIsRunning;
    private final String mLocalName;
    private final GaiaStateUpdateIdJacksonModel mStateUpdateId;

    public GaiaJacksonModel(List list, boolean flag, boolean flag1, String s, GaiaStateUpdateIdJacksonModel gaiastateupdateidjacksonmodel)
    {
        mDeviceJacksonModelList = list;
        mIsActive = flag;
        mIsRunning = flag1;
        mLocalName = s;
        mStateUpdateId = gaiastateupdateidjacksonmodel;
    }

    public List getDeviceJacksonModelList()
    {
        return mDeviceJacksonModelList;
    }

    public String getLocalName()
    {
        return mLocalName;
    }

    public GaiaStateUpdateIdJacksonModel getStateUpdateId()
    {
        return mStateUpdateId;
    }

    public boolean isActive()
    {
        return mIsActive;
    }

    public boolean isRunning()
    {
        return mIsRunning;
    }

    public String toString()
    {
        return (new StringBuilder("GaiaJacksonModel{mDeviceJacksonModelList=")).append(mDeviceJacksonModelList).append(", mIsActive=").append(mIsActive).append(", mIsRunning=").append(mIsRunning).append(", mLocalName='").append(mLocalName).append('\'').append(", mStateUpdateId=").append(mStateUpdateId).append('}').toString();
    }
}
