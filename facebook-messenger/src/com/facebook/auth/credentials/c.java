// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import android.os.Parcel;

// Referenced classes of package com.facebook.auth.credentials:
//            PasswordCredentials

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public PasswordCredentials a(Parcel parcel)
    {
        return new PasswordCredentials(parcel, null);
    }

    public PasswordCredentials[] a(int i)
    {
        return new PasswordCredentials[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
