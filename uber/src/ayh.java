// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.BitmapDescriptorParcelable;

public final class ayh
    implements android.os.Parcelable.Creator
{

    public ayh()
    {
    }

    public static BitmapDescriptorParcelable a(Parcel parcel)
    {
        Bitmap bitmap = null;
        int j = up.b(parcel);
        byte byte0 = 0;
        int i = 0;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = up.a(parcel);
                switch (up.a(k))
                {
                default:
                    up.a(parcel, k);
                    break;

                case 1: // '\001'
                    i = up.e(parcel, k);
                    break;

                case 2: // '\002'
                    byte0 = up.c(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = up.n(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)up.a(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new BitmapDescriptorParcelable(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    public static void a(BitmapDescriptorParcelable bitmapdescriptorparcelable, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, bitmapdescriptorparcelable.a());
        ur.a(parcel, 2, bitmapdescriptorparcelable.b());
        ur.a(parcel, 3, bitmapdescriptorparcelable.c());
        ur.a(parcel, 4, bitmapdescriptorparcelable.d(), i, false);
        ur.a(parcel, j);
    }

    private static BitmapDescriptorParcelable[] a(int i)
    {
        return new BitmapDescriptorParcelable[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }
}
