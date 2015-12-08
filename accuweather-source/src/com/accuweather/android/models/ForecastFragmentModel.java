// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

public class ForecastFragmentModel
    implements Serializable
{

    private static final long serialVersionUID = 0x4e39b67b3ab9be4dL;
    private boolean mIsGraphShowing;
    private String mLocationKey;

    public ForecastFragmentModel(String s, boolean flag)
    {
        mLocationKey = s;
        mIsGraphShowing = flag;
    }

    public String getLocationKey()
    {
        return mLocationKey;
    }

    public boolean isGraphShowing()
    {
        return mIsGraphShowing;
    }

    public void setGraphShowing(boolean flag)
    {
        mIsGraphShowing = flag;
    }

    public void setLocationKey(String s)
    {
        mLocationKey = s;
    }
}
