// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class GetAccountResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String email;
    private boolean emailOptin;
    private String firstName;
    private String id;
    private String lastName;
    private String password;

    protected GetAccountResponse(Parcel parcel)
    {
        id = parcel.readString();
        lastName = parcel.readString();
        email = parcel.readString();
        firstName = parcel.readString();
        password = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPassword()
    {
        return password;
    }

    public boolean isEmailOptin()
    {
        return emailOptin;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setEmailOptin(boolean flag)
    {
        emailOptin = flag;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setPassword(String s)
    {
        password = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(lastName);
        parcel.writeString(email);
        parcel.writeString(firstName);
        parcel.writeString(password);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public GetAccountResponse createFromParcel(Parcel parcel)
        {
            return new GetAccountResponse(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public GetAccountResponse[] newArray(int i)
        {
            return new GetAccountResponse[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
