// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.location.DetectedActivity;

public final class lgq
    implements android.os.Parcelable.Creator
{

    public lgq()
    {
    }

    public static void a(DetectedActivity detectedactivity, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, detectedactivity.b);
        b.c(parcel, 1000, detectedactivity.a);
        b.c(parcel, 2, detectedactivity.c);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = b.b(parcel);
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
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new DetectedActivity(i, j, k);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DetectedActivity[i];
    }
}
