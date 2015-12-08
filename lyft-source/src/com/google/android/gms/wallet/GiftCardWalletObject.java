// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            zzg

public final class GiftCardWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    final int a;
    CommonWalletObject b;
    String c;
    String d;
    String e;
    long f;
    String g;
    long h;
    String i;

    GiftCardWalletObject()
    {
        b = CommonWalletObject.a().a();
        a = 1;
    }

    GiftCardWalletObject(int j, CommonWalletObject commonwalletobject, String s, String s1, String s2, long l, 
            String s3, long l1, String s4)
    {
        b = CommonWalletObject.a().a();
        a = j;
        b = commonwalletobject;
        c = s;
        d = s1;
        f = l;
        g = s3;
        h = l1;
        i = s4;
        e = s2;
    }

    public int a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        zzg.a(this, parcel, j);
    }

}
