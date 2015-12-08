// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

public final class lnb
    implements android.os.Parcelable.Creator
{

    public lnb()
    {
    }

    public static ParcelableLoadImageOptions a(Parcel parcel)
    {
        boolean flag = false;
        int l = b.b(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    b.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = b.e(parcel, i1);
                    break;

                case 1000: 
                    i = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    k = b.e(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = b.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParcelableLoadImageOptions(i, j, k, flag);
            }
        } while (true);
    }

    public static void a(ParcelableLoadImageOptions parcelableloadimageoptions, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, parcelableloadimageoptions.b);
        b.c(parcel, 1000, parcelableloadimageoptions.a);
        b.c(parcel, 2, parcelableloadimageoptions.c);
        b.a(parcel, 3, parcelableloadimageoptions.d);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ParcelableLoadImageOptions[i];
    }
}
