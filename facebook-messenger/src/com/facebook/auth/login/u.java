// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.os.Parcel;

final class u
    implements android.os.Parcelable.Creator
{

    u()
    {
    }

    public AuthStateMachineConfig.ParcelableConfigInformation a(Parcel parcel)
    {
        return new AuthStateMachineConfig.ParcelableConfigInformation(parcel, null);
    }

    public AuthStateMachineConfig.ParcelableConfigInformation[] a(int i)
    {
        return new AuthStateMachineConfig.ParcelableConfigInformation[i];
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
