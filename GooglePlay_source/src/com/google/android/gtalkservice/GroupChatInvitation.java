// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

public class GroupChatInvitation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new GroupChatInvitation(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new GroupChatInvitation[i];
        }

    };
    private long mGroupContactId;
    private String mInviter;
    private String mPassword;
    private String mReason;
    private String mRoomAddress;

    public GroupChatInvitation(Parcel parcel)
    {
        mRoomAddress = parcel.readString();
        mInviter = parcel.readString();
        mReason = parcel.readString();
        mPassword = parcel.readString();
        mGroupContactId = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mRoomAddress);
        parcel.writeString(mInviter);
        parcel.writeString(mReason);
        parcel.writeString(mPassword);
        parcel.writeLong(mGroupContactId);
    }

}
