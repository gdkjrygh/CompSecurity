// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fq;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RealTimeMessage aw(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

        public RealTimeMessage[] bp(int i)
        {
            return new RealTimeMessage[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return aw(parcel);
        }

        public Object[] newArray(int i)
        {
            return bp(i);
        }

    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String MH;
    private final byte MI[];
    private final int MJ;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        MH = (String)fq.f(s);
        MI = (byte[])((byte[])fq.f(abyte0)).clone();
        MJ = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return MI;
    }

    public String getSenderParticipantId()
    {
        return MH;
    }

    public boolean isReliable()
    {
        return MJ == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(MH);
        parcel.writeByteArray(MI);
        parcel.writeInt(MJ);
    }

}
