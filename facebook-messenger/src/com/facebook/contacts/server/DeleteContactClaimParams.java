// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            f

public class DeleteContactClaimParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final String a;
    private final String b;
    private final String c;

    private DeleteContactClaimParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    DeleteContactClaimParams(Parcel parcel, f f1)
    {
        this(parcel);
    }

    public DeleteContactClaimParams(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
