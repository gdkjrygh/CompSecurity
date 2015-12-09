// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new RealTimeMessage(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new RealTimeMessage[i];
        }

    };
    private final int mIsReliable;
    private final byte mMessageData[];
    private final String mSenderParticipantId;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    RealTimeMessage(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        mSenderParticipantId = (String)Preconditions.checkNotNull(s);
        mMessageData = (byte[])((byte[])Preconditions.checkNotNull(abyte0)).clone();
        mIsReliable = i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mSenderParticipantId);
        parcel.writeByteArray(mMessageData);
        parcel.writeInt(mIsReliable);
    }

}
