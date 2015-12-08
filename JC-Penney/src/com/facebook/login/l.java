// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;

final class l
    implements android.os.Parcelable.Creator
{

    l()
    {
    }

    public LoginClient.Result a(Parcel parcel)
    {
        return new LoginClient.Result(parcel, null);
    }

    public LoginClient.Result[] a(int i)
    {
        return new LoginClient.Result[i];
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
