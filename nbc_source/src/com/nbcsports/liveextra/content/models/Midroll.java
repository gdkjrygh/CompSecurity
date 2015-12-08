// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class Midroll
    implements Parcelable
{
    public static class Collection extends ArrayList
    {

        public Collection()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Midroll createFromParcel(Parcel parcel)
        {
            Midroll midroll = new Midroll();
            midroll.cueID = parcel.readLong();
            midroll.cueType = parcel.readString();
            midroll.key = parcel.readString();
            midroll.value = parcel.readString();
            midroll.pictureByPictureAd = parcel.readString().equals("1");
            return midroll;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Midroll[] newArray(int i)
        {
            return new Midroll[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    long cueID;
    String cueType;
    String key;
    boolean pictureByPictureAd;
    String value;

    public Midroll()
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public long getCueID()
    {
        return cueID;
    }

    public String getCueType()
    {
        return cueType;
    }

    public String getFreewheelParam()
    {
        String s1 = (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
        String s = s1;
        if (s1.length() == 1)
        {
            s = "";
        }
        return s;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }

    public boolean isPictureByPictureAd()
    {
        return pictureByPictureAd;
    }

    public void setCueID(long l)
    {
        cueID = l;
    }

    public void setCueType(String s)
    {
        cueType = s;
    }

    public void setKey(String s)
    {
        key = s;
    }

    public void setPictureByPictureAd(boolean flag)
    {
        pictureByPictureAd = flag;
    }

    public void setValue(String s)
    {
        value = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(cueID);
        parcel.writeString(cueType);
        parcel.writeString(key);
        parcel.writeString(value);
        String s;
        if (pictureByPictureAd)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        parcel.writeString(s);
    }

}
