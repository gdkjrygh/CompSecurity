// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            a

public class GetConsentIntentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    final String b;
    final int c;
    final String d;
    final Account e;
    final ScopeDetail f[];
    final boolean g;
    final int h;

    GetConsentIntentRequest(int i, String s, int j, String s1, Account account, ScopeDetail ascopedetail[], boolean flag, 
            int k)
    {
        a = i;
        b = s;
        c = j;
        d = s1;
        e = (Account)u.a(account);
        f = ascopedetail;
        g = flag;
        h = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.consent.a.a(this, parcel, i);
    }

}
