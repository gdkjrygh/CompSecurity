// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            ak, ai

public class <init>
    implements Parcelable
{

    public static final android.os.d.SingleBroadcastResult.a CREATOR = new ak();
    public final int a;
    public final String b;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(null);
    }


    public (int i, String s)
    {
        a = i;
        b = s;
    }

    private b(Parcel parcel)
    {
        a = parcel.readInt();
        String s = parcel.readString();
        parcel = s;
        if (s.equals(""))
        {
            parcel = null;
        }
        b = parcel;
    }

    b(Parcel parcel, ai ai)
    {
        this(parcel);
    }
}
