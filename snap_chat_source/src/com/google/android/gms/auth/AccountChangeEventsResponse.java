// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsResponseCreator

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final AccountChangeEventsResponseCreator CREATOR = new AccountChangeEventsResponseCreator();
    final int zzHe;
    final List zzmv;

    AccountChangeEventsResponse(int i, List list)
    {
        zzHe = i;
        zzmv = (List)zzx.zzl(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventsResponseCreator.zza(this, parcel, i);
    }

}
