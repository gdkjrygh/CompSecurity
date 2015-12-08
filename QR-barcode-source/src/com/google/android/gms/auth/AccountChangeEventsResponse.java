// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsResponseCreator

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final AccountChangeEventsResponseCreator CREATOR = new AccountChangeEventsResponseCreator();
    final int Di;
    final List me;

    AccountChangeEventsResponse(int i, List list)
    {
        Di = i;
        me = (List)o.i(list);
    }

    public AccountChangeEventsResponse(List list)
    {
        Di = 1;
        me = (List)o.i(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public List getEvents()
    {
        return me;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventsResponseCreator.a(this, parcel, i);
    }

}
