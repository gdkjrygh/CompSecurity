// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public class GoogleLoginCredentialsResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new GoogleLoginCredentialsResult(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new GoogleLoginCredentialsResult[i];
        }

    };
    private String mAccount;
    private Intent mCredentialsIntent;
    private String mCredentialsString;

    public GoogleLoginCredentialsResult()
    {
        mCredentialsString = null;
        mCredentialsIntent = null;
        mAccount = null;
    }

    private GoogleLoginCredentialsResult(Parcel parcel)
    {
        mAccount = parcel.readString();
        mCredentialsString = parcel.readString();
        int i = parcel.readInt();
        mCredentialsIntent = null;
        if (i == 1)
        {
            mCredentialsIntent = new Intent();
            mCredentialsIntent.readFromParcel(parcel);
            mCredentialsIntent.setExtrasClassLoader(getClass().getClassLoader());
        }
    }

    GoogleLoginCredentialsResult(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public int describeContents()
    {
        if (mCredentialsIntent != null)
        {
            return mCredentialsIntent.describeContents();
        } else
        {
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mAccount);
        parcel.writeString(mCredentialsString);
        if (mCredentialsIntent != null)
        {
            parcel.writeInt(1);
            mCredentialsIntent.writeToParcel(parcel, 0);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }

}
