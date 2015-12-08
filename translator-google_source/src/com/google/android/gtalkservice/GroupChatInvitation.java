// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gtalkservice:
//            c

public class GroupChatInvitation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private String a;
    private String b;
    private String c;
    private String d;
    private long e;

    public GroupChatInvitation(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        d = parcel.readString();
        c = parcel.readString();
        e = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(d);
        parcel.writeString(c);
        parcel.writeLong(e);
    }

}
