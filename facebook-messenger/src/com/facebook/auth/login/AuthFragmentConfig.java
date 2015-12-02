// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.auth.login:
//            b

public class AuthFragmentConfig
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final Class a;
    final Bundle b;

    private AuthFragmentConfig(Parcel parcel)
    {
        a = Class.forName(parcel.readString());
        b = (Bundle)parcel.readParcelable(null);
    }

    AuthFragmentConfig(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public AuthFragmentConfig(Class class1, Bundle bundle)
    {
        a = class1;
        b = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.getCanonicalName());
        parcel.writeParcelable(b, i);
    }

}
