// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import lmq;

public final class AccountToken
    implements SafeParcelable
{

    public static final lmq CREATOR = new lmq();
    public final int a;
    public final String b;
    public final String c;

    public AccountToken(int i, String s, String s1)
    {
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
        lmq.a(this, parcel);
    }

}
