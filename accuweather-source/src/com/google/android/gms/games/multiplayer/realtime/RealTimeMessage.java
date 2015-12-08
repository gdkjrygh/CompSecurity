// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.hn;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RealTimeMessage bn(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return bn(parcel);
        }

        public RealTimeMessage[] cz(int i)
        {
            return new RealTimeMessage[i];
        }

        public Object[] newArray(int i)
        {
            return cz(i);
        }

    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String Te;
    private final byte Tf[];
    private final int Tg;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        Te = (String)hn.f(s);
        Tf = (byte[])((byte[])hn.f(abyte0)).clone();
        Tg = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return Tf;
    }

    public String getSenderParticipantId()
    {
        return Te;
    }

    public boolean isReliable()
    {
        return Tg == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(Te);
        parcel.writeByteArray(Tf);
        parcel.writeInt(Tg);
    }

}
