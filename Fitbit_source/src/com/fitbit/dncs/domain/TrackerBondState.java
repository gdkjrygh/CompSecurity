// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.domain;

import android.os.Parcel;
import android.os.Parcelable;

public final class TrackerBondState extends Enum
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TrackerBondState a(Parcel parcel)
        {
            return TrackerBondState.a(parcel.readInt());
        }

        public TrackerBondState[] a(int i)
        {
            return new TrackerBondState[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static final TrackerBondState a;
    public static final TrackerBondState b;
    public static final TrackerBondState c;
    public static final TrackerBondState d;
    private static final TrackerBondState e[];

    private TrackerBondState(String s, int i)
    {
        super(s, i);
    }

    public static TrackerBondState a(int i)
    {
        if (i >= 0 && i < values().length)
        {
            return values()[i];
        } else
        {
            return null;
        }
    }

    public static TrackerBondState a(com.fitbit.galileo.ota.GalileoOtaMessages.RFBondInfoPacket rfbondinfopacket)
    {
        if (rfbondinfopacket != null)
        {
            if (rfbondinfopacket.isBondedToCurrentPeer != 0)
            {
                return b;
            }
            if (rfbondinfopacket.isTrackerBonded != 0)
            {
                if (rfbondinfopacket.isAncsReady != 0)
                {
                    return d;
                } else
                {
                    return c;
                }
            }
        }
        return a;
    }

    public static TrackerBondState valueOf(String s)
    {
        return (TrackerBondState)Enum.valueOf(com/fitbit/dncs/domain/TrackerBondState, s);
    }

    public static TrackerBondState[] values()
    {
        return (TrackerBondState[])e.clone();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(ordinal());
    }

    static 
    {
        a = new TrackerBondState("NOT_BONDED", 0);
        b = new TrackerBondState("BONDED_TO_CURRENT", 1);
        c = new TrackerBondState("BONDED_TO_OTHER", 2);
        d = new TrackerBondState("BONDED_NOT_SECURE", 3);
        e = (new TrackerBondState[] {
            a, b, c, d
        });
    }
}
