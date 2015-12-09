// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.feedback:
//            FileTeleporter

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(FileTeleporter fileteleporter, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, fileteleporter.mVersionCode);
        b.a(parcel, 2, fileteleporter.TQ, i, false);
        b.a(parcel, 3, fileteleporter.afU, false);
        b.a(parcel, 4, fileteleporter.afV, false);
        b.J(parcel, j);
    }

    private static FileTeleporter dH(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FileTeleporter(i, parcelfiledescriptor, s, s1);
            }
        } while (true);
    }

    private static FileTeleporter[] fu(int i)
    {
        return new FileTeleporter[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return dH(parcel);
    }

    public final Object[] newArray(int i)
    {
        return fu(i);
    }
}
