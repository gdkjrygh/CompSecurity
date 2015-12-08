// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            l, CountrySpecification, Cart

public final class MaskedWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
    boolean aTA;
    boolean aTB;
    CountrySpecification aTD[];
    ArrayList aTE;
    String aTg;
    String aTm;
    Cart aTv;
    boolean aTz;
    String aUi;
    String aUj;
    boolean aUk;
    boolean aUl;
    boolean aUm;
    boolean aUn;
    private final int mVersionCode;

    MaskedWalletRequest()
    {
        mVersionCode = 3;
        aUm = true;
        aUn = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist)
    {
        mVersionCode = i;
        aTm = s;
        aTz = flag;
        aTA = flag1;
        aTB = flag2;
        aUi = s1;
        aTg = s2;
        aUj = s3;
        aTv = cart;
        aUk = flag3;
        aUl = flag4;
        aTD = acountryspecification;
        aUm = flag5;
        aUn = flag6;
        aTE = arraylist;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
