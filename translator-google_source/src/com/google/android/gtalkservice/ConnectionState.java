// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gtalkservice:
//            b

public final class ConnectionState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private volatile int a;

    public ConnectionState(Parcel parcel)
    {
        a = parcel.readInt();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        switch (a)
        {
        default:
            return "IDLE";

        case 1: // '\001'
            return "RECONNECTION_SCHEDULED";

        case 2: // '\002'
            return "CONNECTING";

        case 3: // '\003'
            return "AUTHENTICATED";

        case 4: // '\004'
            return "ONLINE";
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
    }

}
