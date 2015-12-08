// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RealTimeMessage cn(Parcel parcel)
        {
            return new RealTimeMessage(parcel);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return cn(parcel);
        }

        public RealTimeMessage[] dU(int i)
        {
            return new RealTimeMessage[i];
        }

        public Object[] newArray(int i)
        {
            return dU(i);
        }

    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String acl;
    private final byte acm[];
    private final int acn;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }


    public RealTimeMessage(String s, byte abyte0[], int i)
    {
        acl = (String)o.i(s);
        acm = (byte[])((byte[])o.i(abyte0)).clone();
        acn = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getMessageData()
    {
        return acm;
    }

    public String getSenderParticipantId()
    {
        return acl;
    }

    public boolean isReliable()
    {
        return acn == 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(acl);
        parcel.writeByteArray(acm);
        parcel.writeInt(acn);
    }

}
