// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class UserModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new UserModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new UserModel[i];
        }

    };
    private String mImage;
    private String mName;
    private String mUri;

    private UserModel(Parcel parcel)
    {
        mImage = parcel.readString();
        mName = parcel.readString();
        mUri = parcel.readString();
    }


    public UserModel(String s, String s1, String s2)
    {
        mImage = s;
        mName = s1;
        mUri = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserModel))
            {
                return false;
            }
            obj = (UserModel)obj;
            if (mImage == null ? ((UserModel) (obj)).mImage != null : !mImage.equals(((UserModel) (obj)).mImage))
            {
                return false;
            }
            if (mName == null ? ((UserModel) (obj)).mName != null : !mName.equals(((UserModel) (obj)).mName))
            {
                return false;
            }
            if (mUri == null ? ((UserModel) (obj)).mUri != null : !mUri.equals(((UserModel) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getImage()
    {
        return mImage;
    }

    public String getName()
    {
        return mName;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (mImage != null)
        {
            i = mImage.hashCode();
        } else
        {
            i = 0;
        }
        if (mName != null)
        {
            j = mName.hashCode();
        } else
        {
            j = 0;
        }
        if (mUri != null)
        {
            k = mUri.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mImage);
        parcel.writeString(mName);
        parcel.writeString(mUri);
    }

}
