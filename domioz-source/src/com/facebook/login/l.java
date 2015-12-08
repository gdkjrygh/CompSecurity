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

    public final Object createFromParcel(Parcel parcel)
    {
        return new LoginClient.Result(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LoginClient.Result[i];
    }
}
