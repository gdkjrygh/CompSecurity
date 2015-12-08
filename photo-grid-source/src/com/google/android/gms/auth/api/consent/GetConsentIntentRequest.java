// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            a

public class GetConsentIntentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final ScopeDetail a[];
    private final int b;
    private final String c;
    private final int d;
    private final String e;
    private final Account f;
    private final boolean g;
    private final int h;

    GetConsentIntentRequest(int i, String s, int j, String s1, Account account, ScopeDetail ascopedetail[], boolean flag, 
            int k)
    {
        b = i;
        c = s;
        d = j;
        e = s1;
        f = (Account)bl.a(account);
        a = ascopedetail;
        g = flag;
        h = k;
    }

    public final int a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Account e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

    public final int g()
    {
        return h;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.consent.a.a(this, parcel, i);
    }

}
