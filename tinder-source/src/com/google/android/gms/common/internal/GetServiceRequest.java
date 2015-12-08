// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            i, a

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope f[];
    Bundle g;
    Account h;

    public GetServiceRequest(int j)
    {
        a = 2;
        c = b.a;
        b = j;
    }

    GetServiceRequest(int j, int k, int l, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        a = j;
        b = k;
        c = l;
        d = s;
        if (j < 2)
        {
            s = null;
            if (ibinder != null)
            {
                s = com.google.android.gms.common.internal.a.a(o.a.a(ibinder));
            }
            h = s;
        } else
        {
            e = ibinder;
            h = account;
        }
        f = ascope;
        g = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
