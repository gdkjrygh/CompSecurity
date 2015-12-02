// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            ag

public class GraphUserPostParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ag();
    private final int a;
    private final String b;
    private final String c;

    private GraphUserPostParams(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
    }

    GraphUserPostParams(Parcel parcel, ag ag1)
    {
        this(parcel);
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
