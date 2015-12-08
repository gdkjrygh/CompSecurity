// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.dm;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RealTimeMessage[] U(int i)
        {
            return new RealTimeMessage[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return x(parcel);
        }

        public Object[] newArray(int i)
        {
            return U(i);
        }

        public RealTimeMessage x(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String oa;
    private final byte ob[];
    private final int oc;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        oa = (String)dm.e(s);
        ob = (byte[])((byte[])dm.e(abyte0)).clone();
        oc = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return ob;
    }

    public String getSenderParticipantId()
    {
        return oa;
    }

    public boolean isReliable()
    {
        return oc == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(oa);
        parcel.writeByteArray(ob);
        parcel.writeInt(oc);
    }

}
