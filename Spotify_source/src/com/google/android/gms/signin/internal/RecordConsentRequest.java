// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqe;

public class RecordConsentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqe();
    public final int a;
    public final Account b;
    public final Scope c[];
    public final String d;

    public RecordConsentRequest(int i, Account account, Scope ascope[], String s)
    {
        a = i;
        b = account;
        c = ascope;
        d = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cqe.a(this, parcel, i);
    }

}
