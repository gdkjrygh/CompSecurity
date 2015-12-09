// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public LoginClient.Request a(Parcel parcel)
    {
        return new LoginClient.Request(parcel, null);
    }

    public LoginClient.Request[] a(int i)
    {
        return new LoginClient.Request[i];
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
