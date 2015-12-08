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
    String Dd;
    final int Di;
    int Dl;

    public AccountChangeEventsRequest()
    {
        Di = 1;
    }

    AccountChangeEventsRequest(int i, int j, String s)
    {
        Di = i;
        Dl = j;
        Dd = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return Dd;
    }

    public int getEventIndex()
    {
        return Dl;
    }

    public AccountChangeEventsRequest setAccountName(String s)
    {
        Dd = s;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i)
    {
        Dl = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventsRequestCreator.a(this, parcel, i);
    }

}
