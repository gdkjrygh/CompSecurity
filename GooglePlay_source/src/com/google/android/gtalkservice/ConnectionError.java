// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

public final class ConnectionError
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new ConnectionError(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ConnectionError[i];
        }

    };
    private int mError;

    public ConnectionError(Parcel parcel)
    {
        mError = parcel.readInt();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        switch (mError)
        {
        case 9: // '\t'
        default:
            return "NO ERROR";

        case 1: // '\001'
            return "NO NETWORK";

        case 2: // '\002'
            return "CONNECTION FAILED";

        case 3: // '\003'
            return "UNKNOWN HOST";

        case 4: // '\004'
            return "AUTH FAILED";

        case 5: // '\005'
            return "AUTH EXPIRED";

        case 6: // '\006'
            return "HEARTBEAT TIMEOUT";

        case 7: // '\007'
            return "SERVER FAILED";

        case 8: // '\b'
            return "SERVER REJECT - RATE LIMIT";

        case 10: // '\n'
            return "UNKNOWN";
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mError);
    }

}
