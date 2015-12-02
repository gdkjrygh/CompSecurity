// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.internal.BitmapDescriptorParcelable;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;

public final class azi
    implements android.os.Parcelable.Creator
{

    public azi()
    {
    }

    public static MarkerOptionsParcelable a(Parcel parcel)
    {
        int j = up.b(parcel);
        int i = 0;
        BitmapDescriptorParcelable bitmapdescriptorparcelable = null;
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
                    bitmapdescriptorparcelable = (BitmapDescriptorParcelable)up.a(parcel, k, BitmapDescriptorParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MarkerOptionsParcelable(i, bitmapdescriptorparcelable);
            }
        } while (true);
    }

    public static void a(MarkerOptionsParcelable markeroptionsparcelable, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, markeroptionsparcelable.a());
        ur.a(parcel, 2, markeroptionsparcelable.b(), i, false);
        ur.a(parcel, j);
    }

    private static MarkerOptionsParcelable[] a(int i)
    {
        return new MarkerOptionsParcelable[i];
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
