// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            d

public final class LegalDocsForCountry
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final String aVH;
    final String aVI;
    final String aVJ[];
    final int mVersionCode;

    LegalDocsForCountry(int i, String s, String s1, String as[])
    {
        mVersionCode = i;
        aVH = s;
        aVI = s1;
        if (as == null)
        {
            as = new String[0];
        }
        aVJ = as;
    }

    public LegalDocsForCountry(String s, String s1, String as[])
    {
        this(1, s, s1, as);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getCountryCode()
    {
        return aVH;
    }

    public final String[] getLegalDocumentIds()
    {
        return aVJ;
    }

    public final String getLegalDocumentUrl()
    {
        return aVI;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
