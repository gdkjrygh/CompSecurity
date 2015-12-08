// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.events:
//            FileConflictEvent

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(FileConflictEvent fileconflictevent, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, fileconflictevent.xM);
        b.a(parcel, 2, fileconflictevent.Hz, i, false);
        b.a(parcel, 3, fileconflictevent.yQ, false);
        b.a(parcel, 4, fileconflictevent.Ij, i, false);
        b.a(parcel, 5, fileconflictevent.Ik, i, false);
        b.a(parcel, 6, fileconflictevent.Il, i, false);
        b.a(parcel, 7, fileconflictevent.Im, false);
        b.G(parcel, j);
    }

    public FileConflictEvent Q(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        MetadataBundle metadatabundle = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        ParcelFileDescriptor parcelfiledescriptor1 = null;
        String s = null;
        DriveId driveid = null;
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
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    parcelfiledescriptor1 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 5: // '\005'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 6: // '\006'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, MetadataBundle.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new FileConflictEvent(i, driveid, s, parcelfiledescriptor1, parcelfiledescriptor, metadatabundle, arraylist);
            }
        } while (true);
    }

    public FileConflictEvent[] aL(int i)
    {
        return new FileConflictEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return Q(parcel);
    }

    public Object[] newArray(int i)
    {
        return aL(i);
    }
}
