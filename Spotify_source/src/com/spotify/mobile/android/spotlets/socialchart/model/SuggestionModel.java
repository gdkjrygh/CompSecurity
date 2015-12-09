// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class SuggestionModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SuggestionModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SuggestionModel[i];
        }

    };
    private final String mName;

    public SuggestionModel(Parcel parcel)
    {
        mName = parcel.readString();
    }

    public SuggestionModel(String s)
    {
        mName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SuggestionModel)obj;
            if (mName == null ? ((SuggestionModel) (obj)).mName != null : !mName.equals(((SuggestionModel) (obj)).mName))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (mName != null)
        {
            return mName.hashCode();
        } else
        {
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mName);
    }

}
