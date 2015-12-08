// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableCollaborator

public class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(ParcelableCollaborator parcelablecollaborator, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, parcelablecollaborator.CK);
        b.a(parcel, 2, parcelablecollaborator.SH);
        b.a(parcel, 3, parcelablecollaborator.SI);
        b.a(parcel, 4, parcelablecollaborator.vZ, false);
        b.a(parcel, 5, parcelablecollaborator.SJ, false);
        b.a(parcel, 6, parcelablecollaborator.OS, false);
        b.a(parcel, 7, parcelablecollaborator.SK, false);
        b.a(parcel, 8, parcelablecollaborator.SL, false);
        b.H(parcel, i);
    }

    public ParcelableCollaborator be(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        boolean flag1 = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ParcelableCollaborator(i, flag1, flag, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return be(parcel);
    }

    public ParcelableCollaborator[] cu(int i)
    {
        return new ParcelableCollaborator[i];
    }

    public Object[] newArray(int i)
    {
        return cu(i);
    }
}
