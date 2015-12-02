// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            ae, af

public class GetPhoneContactsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ae();
    public static int a = 0;
    public static int b = 1;
    private final int c;
    private final int d;
    private final String e;
    private final String f;

    private GetPhoneContactsParams(Parcel parcel)
    {
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readString();
        f = parcel.readString();
    }

    GetPhoneContactsParams(Parcel parcel, ae ae1)
    {
        this(parcel);
    }

    public static af newBuilder()
    {
        return new af();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeString(e);
        parcel.writeString(f);
    }

}
