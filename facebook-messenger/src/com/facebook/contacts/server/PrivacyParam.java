// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            z

public class PrivacyParam
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    public static final PrivacyParam a = new PrivacyParam("MUTUAL_FRIENDS");
    public static final PrivacyParam b = new PrivacyParam("SELF");
    private final String c;

    private PrivacyParam(Parcel parcel)
    {
        c = parcel.readString();
    }

    PrivacyParam(Parcel parcel, z z1)
    {
        this(parcel);
    }

    public PrivacyParam(String s)
    {
        c = s;
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{'value':'");
        stringbuilder.append(c);
        stringbuilder.append("'}");
        return stringbuilder.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(c);
    }

}
