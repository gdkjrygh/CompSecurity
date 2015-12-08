// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            HasFilter

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(HasFilter hasfilter, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1000, hasfilter.xM);
        b.a(parcel, 1, hasfilter.KM, i, false);
        b.G(parcel, j);
    }

    public HasFilter aJ(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        MetadataBundle metadatabundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 1: // '\001'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, MetadataBundle.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new HasFilter(i, metadatabundle);
            }
        } while (true);
    }

    public HasFilter[] bF(int i)
    {
        return new HasFilter[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return bF(i);
    }
}
