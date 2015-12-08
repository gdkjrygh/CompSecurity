// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.jx;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RealTimeMessage cB(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return cB(parcel);
        }

        public RealTimeMessage[] en(int i)
        {
            return new RealTimeMessage[i];
        }

        public Object[] newArray(int i)
        {
            return en(i);
        }

    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String aee;
    private final byte aef[];
    private final int aeg;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        aee = (String)jx.i(s);
        aef = (byte[])((byte[])jx.i(abyte0)).clone();
        aeg = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return aef;
    }

    public String getSenderParticipantId()
    {
        return aee;
    }

    public boolean isReliable()
    {
        return aeg == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(aee);
        parcel.writeByteArray(aef);
        parcel.writeInt(aeg);
    }

}
