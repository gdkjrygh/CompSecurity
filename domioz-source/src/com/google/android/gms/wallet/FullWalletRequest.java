// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            q, b, Cart

public final class FullWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    String a;
    String b;
    Cart c;
    private final int d;

    FullWalletRequest()
    {
        d = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        d = i;
        a = s;
        b = s1;
        c = cart;
    }

    public static b a()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return new b(fullwalletrequest, (byte)0);
    }

    public final int b()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
