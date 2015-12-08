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

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(CreateFileIntentSenderRequest createfileintentsenderrequest, Parcel parcel, int i)
    {
        int k = b.H(parcel);
        b.c(parcel, 1, createfileintentsenderrequest.CK);
        b.a(parcel, 2, createfileintentsenderrequest.Px, i, false);
        b.c(parcel, 3, createfileintentsenderrequest.ve);
        b.a(parcel, 4, createfileintentsenderrequest.OH, false);
        b.a(parcel, 5, createfileintentsenderrequest.OJ, i, false);
        b.a(parcel, 6, createfileintentsenderrequest.Py, false);
        b.H(parcel, k);
    }

    public CreateFileIntentSenderRequest ag(Parcel parcel)
    {
        int i = 0;
        Integer integer = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        DriveId driveid = null;
        String s = null;
        MetadataBundle metadatabundle = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
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
                return new CreateFileIntentSenderRequest(k, metadatabundle, i, s, driveid, integer);
            }
        } while (true);
    }

    public CreateFileIntentSenderRequest[] br(int i)
    {
        return new CreateFileIntentSenderRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ag(parcel);
    }

    public Object[] newArray(int i)
    {
        return br(i);
    }
}
