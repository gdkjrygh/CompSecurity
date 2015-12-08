// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileIntentSenderRequest

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(CreateFileIntentSenderRequest createfileintentsenderrequest, Parcel parcel, int j)
    {
        int k = b.D(parcel);
        b.c(parcel, 1, createfileintentsenderrequest.BR);
        b.a(parcel, 2, createfileintentsenderrequest.Ol, j, false);
        b.c(parcel, 3, createfileintentsenderrequest.uQ);
        b.a(parcel, 4, createfileintentsenderrequest.Nw, false);
        b.a(parcel, 5, createfileintentsenderrequest.Ny, j, false);
        b.a(parcel, 6, createfileintentsenderrequest.Om, false);
        b.H(parcel, k);
    }

    public CreateFileIntentSenderRequest ab(Parcel parcel)
    {
        int j = 0;
        Integer integer = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        DriveId driveid = null;
        String s = null;
        MetadataBundle metadatabundle = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, MetadataBundle.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, DriveId.CREATOR);
                    break;

                case 6: // '\006'
                    integer = com.google.android.gms.common.internal.safeparcel.a.h(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CreateFileIntentSenderRequest(k, metadatabundle, j, s, driveid, integer);
            }
        } while (true);
    }

    public CreateFileIntentSenderRequest[] bl(int j)
    {
        return new CreateFileIntentSenderRequest[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ab(parcel);
    }

    public Object[] newArray(int j)
    {
        return bl(j);
    }
}
