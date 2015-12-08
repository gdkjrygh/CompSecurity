// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.events:
//            CompletionEvent

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(CompletionEvent completionevent, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, completionevent.CK);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, completionevent.Oj, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, completionevent.DZ, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, completionevent.OY, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, completionevent.OZ, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, completionevent.Pa, i, false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 7, completionevent.Pb, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 8, completionevent.FP);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, completionevent.Pc, false);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }

    public CompletionEvent Y(Parcel parcel)
    {
        int i = 0;
        android.os.IBinder ibinder = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        java.util.ArrayList arraylist = null;
        MetadataBundle metadatabundle = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        ParcelFileDescriptor parcelfiledescriptor1 = null;
        String s = null;
        DriveId driveid = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 4: // '\004'
                    parcelfiledescriptor1 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 5: // '\005'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 6: // '\006'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MetadataBundle.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, l);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 9: // '\t'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CompletionEvent(j, driveid, s, parcelfiledescriptor1, parcelfiledescriptor, metadatabundle, arraylist, i, ibinder);
            }
        } while (true);
    }

    public CompletionEvent[] bg(int i)
    {
        return new CompletionEvent[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return Y(parcel);
    }

    public Object[] newArray(int i)
    {
        return bg(i);
    }
}
