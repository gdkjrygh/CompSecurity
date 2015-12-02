// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            e, PrivacyParam

public class CreateContactClaimParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final String a;
    private final String b;
    private final String c;
    private final PrivacyParam d;

    private CreateContactClaimParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = (PrivacyParam)parcel.readParcelable(com/facebook/contacts/server/PrivacyParam.getClassLoader());
    }

    CreateContactClaimParams(Parcel parcel, e e1)
    {
        this(parcel);
    }

    public CreateContactClaimParams(String s, String s1, String s2, PrivacyParam privacyparam)
    {
        a = s;
        b = s1;
        c = s2;
        d = privacyparam;
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

    public PrivacyParam d()
    {
        return d;
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
        parcel.writeParcelable(d, i);
    }

}
