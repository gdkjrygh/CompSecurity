// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class <init>
    implements Parcelable
{

    public static final android.os.r.StatusItems._cls1 CREATOR = new _cls1();
    private String code;
    private String description;
    private String user;

    public int describeContents()
    {
        return 0;
    }

    public String getCode()
    {
        return code;
    }

    public String getDescription()
    {
        return description;
    }

    public String getUser()
    {
        return user;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setUser(String s)
    {
        user = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(code);
        parcel.writeString(description);
        parcel.writeString(user);
    }


    private _cls1(Parcel parcel)
    {
        code = parcel.readString();
        description = parcel.readString();
        user = parcel.readString();
    }

    user(Parcel parcel, user user1)
    {
        this(parcel);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CarryoutOrder.StatusItems createFromParcel(Parcel parcel)
        {
            return new CarryoutOrder.StatusItems(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CarryoutOrder.StatusItems[] newArray(int i)
        {
            return new CarryoutOrder.StatusItems[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
