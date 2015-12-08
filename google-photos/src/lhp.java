// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.internal.ParcelableGeofence;

public final class lhp
    implements android.os.Parcelable.Creator
{

    public lhp()
    {
    }

    public static void a(ParcelableGeofence parcelablegeofence, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, parcelablegeofence.b, false);
        b.c(parcel, 1000, parcelablegeofence.a);
        b.a(parcel, 2, parcelablegeofence.c);
        short word0 = parcelablegeofence.d;
        b.b(parcel, 3, 4);
        parcel.writeInt(word0);
        b.a(parcel, 4, parcelablegeofence.e);
        b.a(parcel, 5, parcelablegeofence.f);
        b.a(parcel, 6, parcelablegeofence.g);
        b.c(parcel, 7, parcelablegeofence.h);
        b.c(parcel, 8, parcelablegeofence.i);
        b.c(parcel, 9, parcelablegeofence.j);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i1 = b.b(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    b.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = b.i(parcel, j1);
                    break;

                case 1000: 
                    l = b.e(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = b.f(parcel, j1);
                    break;

                case 3: // '\003'
                    b.a(parcel, j1, 4);
                    word0 = (short)parcel.readInt();
                    break;

                case 4: // '\004'
                    d1 = b.h(parcel, j1);
                    break;

                case 5: // '\005'
                    d = b.h(parcel, j1);
                    break;

                case 6: // '\006'
                    f = b.g(parcel, j1);
                    break;

                case 7: // '\007'
                    k = b.e(parcel, j1);
                    break;

                case 8: // '\b'
                    j = b.e(parcel, j1);
                    break;

                case 9: // '\t'
                    i = b.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ParcelableGeofence(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ParcelableGeofence[i];
    }
}
