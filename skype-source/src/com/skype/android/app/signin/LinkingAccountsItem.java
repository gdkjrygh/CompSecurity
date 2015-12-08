// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class LinkingAccountsItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final LinkingAccountsItem createFromParcel(Parcel parcel)
        {
            return new LinkingAccountsItem(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LinkingAccountsItem[] newArray(int i)
        {
            return new LinkingAccountsItem[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String account;
    private String avatar;
    private String firstName;
    private String lastName;

    public LinkingAccountsItem(Parcel parcel)
    {
        avatar = parcel.readString();
        firstName = parcel.readString();
        lastName = parcel.readString();
        account = parcel.readString();
    }

    public LinkingAccountsItem(String s, String s1, String s2, String s3)
    {
        avatar = s;
        firstName = s1;
        lastName = s2;
        account = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccount()
    {
        return account;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFullname()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(firstName))
        {
            stringbuilder.append(firstName);
        }
        if (!TextUtils.isEmpty(lastName))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append(lastName);
        }
        return stringbuilder.toString();
    }

    public String getLastName()
    {
        return lastName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(avatar);
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(account);
    }

}
