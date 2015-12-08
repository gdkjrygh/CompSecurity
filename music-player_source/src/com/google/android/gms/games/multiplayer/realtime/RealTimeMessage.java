// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gt;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            a

public final class RealTimeMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;
    private final byte b[];
    private final int c;

    private RealTimeMessage(Parcel parcel)
    {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    RealTimeMessage(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private RealTimeMessage(String s, byte abyte0[], int i)
    {
        a = (String)gt.a(s);
        b = (byte[])((byte[])gt.a(abyte0)).clone();
        c = i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeByteArray(b);
        parcel.writeInt(c);
    }

}
