// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, DriveId

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Contents contents, Parcel parcel, int i)
    {
        int j = b.p(parcel);
        b.c(parcel, 1, contents.xH);
        b.a(parcel, 2, contents.Cj, i, false);
        b.c(parcel, 3, contents.Eu);
        b.c(parcel, 4, contents.Ev);
        b.a(parcel, 5, contents.Ew, i, false);
        b.F(parcel, j);
    }

    public Contents[] ac(int i)
    {
        return new Contents[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return y(parcel);
    }

    public Object[] newArray(int i)
    {
        return ac(i);
    }

    public Contents y(Parcel parcel)
    {
        DriveId driveid = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int j = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new Contents(k, parcelfiledescriptor, j, i, driveid);
            }
        } while (true);
    }
}
