// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;

public class Teaser
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Teaser createFromParcel(Parcel parcel)
        {
            return new Teaser(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Teaser[] newArray(int i)
        {
            return new Teaser[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String mString;
    public String mType;

    protected Teaser(Parcel parcel)
    {
        mType = parcel.readString();
        mString = parcel.readString();
    }

    public Teaser(String s, String s1)
    {
        mType = s;
        mString = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public Spanned getSpanned()
    {
        return Html.fromHtml(mString);
    }

    public String getType()
    {
        return mType;
    }

    public String toString()
    {
        return mString;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mType);
        parcel.writeString(mString);
    }

}
