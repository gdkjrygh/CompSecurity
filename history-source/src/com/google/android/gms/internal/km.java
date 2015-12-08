// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kn, ko

public class km
    implements SafeParcelable
{

    public static final kn CREATOR = new kn();
    private final int CK;
    private final ko NF;

    km(int i, ko ko1)
    {
        CK = i;
        NF = ko1;
    }

    private km(ko ko1)
    {
        CK = 1;
        NF = ko1;
    }

    public static km a(kr.b b)
    {
        if (b instanceof ko)
        {
            return new km((ko)b);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        kn kn1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return CK;
    }

    ko hF()
    {
        return NF;
    }

    public kr.b hG()
    {
        if (NF != null)
        {
            return NF;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kn kn1 = CREATOR;
        kn.a(this, parcel, i);
    }

}
