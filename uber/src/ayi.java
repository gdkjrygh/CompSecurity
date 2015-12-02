// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;

public final class ayi
    implements android.os.Parcelable.Creator
{

    public ayi()
    {
    }

    public static CameraUpdateParcelable a(Parcel parcel)
    {
        int j = 0;
        int k = up.b(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = up.a(parcel);
                switch (up.a(l))
                {
                default:
                    up.a(parcel, l);
                    break;

                case 1: // '\001'
                    i = up.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = up.e(parcel, l);
                    break;

                case 3: // '\003'
                    bundle = up.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CameraUpdateParcelable(i, j, bundle);
            }
        } while (true);
    }

    public static void a(CameraUpdateParcelable cameraupdateparcelable, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, cameraupdateparcelable.a());
        ur.a(parcel, 2, cameraupdateparcelable.b());
        ur.a(parcel, 3, cameraupdateparcelable.c());
        ur.a(parcel, i);
    }

    private static CameraUpdateParcelable[] a(int i)
    {
        return new CameraUpdateParcelable[i];
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
