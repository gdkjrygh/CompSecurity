// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class Contact
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static Contact createFromParcel(Parcel parcel)
        {
            return new Contact(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        private static Contact[] newArray(int i)
        {
            return new Contact[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String TAG = com/google/android/apps/wallet/p2p/api/Contact.getSimpleName();
    private final String avatarUrl;
    private final String circles;
    private final String emailAddress;
    private final String realName;

    public Contact(String s)
    {
        this(null, "", s, "");
    }

    public Contact(String s, String s1, String s2, String s3)
    {
        Preconditions.checkNotNull(s1);
        avatarUrl = s;
        s = s1;
        if (s1.equals(s2))
        {
            s = "";
        }
        realName = s;
        emailAddress = s2;
        circles = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getEmailAddress()
    {
        return emailAddress;
    }

    public final String getPhoto()
    {
        return avatarUrl;
    }

    public final String getPreferredHumanIdentifier()
    {
        if (!Strings.isNullOrEmpty(realName))
        {
            return realName;
        } else
        {
            return emailAddress;
        }
    }

    public final String getRealName()
    {
        return realName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(avatarUrl);
        parcel.writeString(realName);
        parcel.writeString(emailAddress);
        parcel.writeString(circles);
    }

}
