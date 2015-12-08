// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.data:
//            BitmapTeleporter

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(BitmapTeleporter bitmapteleporter, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, bitmapteleporter.a);
        b.a(parcel, 2, bitmapteleporter.b, i);
        b.a(parcel, 3, bitmapteleporter.c);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new BitmapTeleporter(i, parcelfiledescriptor, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new BitmapTeleporter[i];
    }
}
