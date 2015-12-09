// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.b.h;
import java.lang.reflect.Type;

public class WebPromotionData
    implements Parcelable, h
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public WebPromotionData createFromParcel(Parcel parcel)
        {
            return new WebPromotionData(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public WebPromotionData[] newArray(int i)
        {
            return new WebPromotionData[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private String mBannerUrl;
    private String mClickEvent;
    private String mClickUrl;
    private String mPromotionId;
    private String mShowEvent;

    private WebPromotionData()
    {
    }

    public WebPromotionData(Parcel parcel)
    {
        setPromotionId(parcel.readString());
        setBannerUrl(parcel.readString());
        setClickUrl(parcel.readString());
        setClickEvent(parcel.readString());
        setShowEvent(parcel.readString());
    }

    public WebPromotionData createInstance(Type type)
    {
        return new WebPromotionData();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getBannerUrl()
    {
        return mBannerUrl;
    }

    public String getClickEvent()
    {
        return mClickEvent;
    }

    public String getClickUrl()
    {
        return mClickUrl;
    }

    public String getPromotionId()
    {
        return mPromotionId;
    }

    public String getShowEvent()
    {
        return mShowEvent;
    }

    public void setBannerUrl(String s)
    {
        mBannerUrl = s;
    }

    public void setClickEvent(String s)
    {
        mClickEvent = s;
    }

    public void setClickUrl(String s)
    {
        mClickUrl = s;
    }

    public void setPromotionId(String s)
    {
        mPromotionId = s;
    }

    public void setShowEvent(String s)
    {
        mShowEvent = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getPromotionId());
        parcel.writeString(getBannerUrl());
        parcel.writeString(getClickUrl());
        parcel.writeString(getClickEvent());
        parcel.writeString(getShowEvent());
    }

}
