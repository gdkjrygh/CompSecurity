// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnMetadataResponse

public class am
    implements android.os.Parcelable.Creator
{

    public am()
    {
    }

    static void a(OnMetadataResponse onmetadataresponse, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, onmetadataresponse.xM);
        b.a(parcel, 2, onmetadataresponse.IE, i, false);
        b.G(parcel, j);
    }

    public OnMetadataResponse an(Parcel parcel)
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

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, MetadataBundle.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnMetadataResponse(i, metadatabundle);
            }
        } while (true);
    }

    public OnMetadataResponse[] bj(int i)
    {
        return new OnMetadataResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return an(parcel);
    }

    public Object[] newArray(int i)
    {
        return bj(i);
    }
}
