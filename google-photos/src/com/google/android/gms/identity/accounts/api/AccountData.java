// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import krc;

public final class AccountData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new krc();
    public final int a;
    public final String b;
    public final String c;

    public AccountData(int i, String s, String s1)
    {
        b.a(s, "Account name must not be empty.");
        a = i;
        b = s;
        c = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        krc.a(this, parcel);
    }

}
