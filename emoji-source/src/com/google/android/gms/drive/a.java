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
        int j = b.C(parcel);
        b.c(parcel, 1, contents.xM);
        b.a(parcel, 2, contents.Fj, i, false);
        b.c(parcel, 3, contents.ra);
        b.c(parcel, 4, contents.Hy);
        b.a(parcel, 5, contents.Hz, i, false);
        b.a(parcel, 6, contents.HA, false);
        b.a(parcel, 7, contents.HB);
        b.G(parcel, j);
    }

    public Contents M(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        DriveId driveid = null;
        int i = 0;
        int j = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
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

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new Contents(k, parcelfiledescriptor, j, i, driveid, s, flag);
            }
        } while (true);
    }

    public Contents[] aG(int i)
    {
        return new Contents[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return M(parcel);
    }

    public Object[] newArray(int i)
    {
        return aG(i);
    }
}
