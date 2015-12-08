// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsRequestCreator

public class AccountChangeEventsRequest
    implements SafeParcelable
{

    public static final AccountChangeEventsRequestCreator CREATOR = new AccountChangeEventsRequestCreator();
    String Fl;
    final int Gf;
    int Gi;

    public AccountChangeEventsRequest()
    {
        Gf = 1;
    }

    AccountChangeEventsRequest(int i, int j, String s)
    {
        Gf = i;
        Gi = j;
        Fl = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public final AccountChangeEventsRequest setAccountName(String s)
    {
        Fl = s;
        return this;
    }

    public final AccountChangeEventsRequest setEventIndex(int i)
    {
        Gi = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventsRequestCreator.a(this, parcel, i);
    }

}
