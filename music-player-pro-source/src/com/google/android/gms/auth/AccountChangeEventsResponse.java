// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsResponseCreator

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final AccountChangeEventsResponseCreator CREATOR = new AccountChangeEventsResponseCreator();
    final int Ef;
    final List mp;

    AccountChangeEventsResponse(int i, List list)
    {
        Ef = i;
        mp = (List)jx.i(list);
    }

    public AccountChangeEventsResponse(List list)
    {
        Ef = 1;
        mp = (List)jx.i(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public List getEvents()
    {
        return mp;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventsResponseCreator.a(this, parcel, i);
    }

}
