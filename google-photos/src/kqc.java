// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.googlehelp.OfflineSuggestion;

public final class kqc
    implements android.os.Parcelable.Creator
{

    public kqc()
    {
    }

    public static void a(OfflineSuggestion offlinesuggestion, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, offlinesuggestion.a);
        b.a(parcel, 2, offlinesuggestion.b, false);
        b.a(parcel, 3, offlinesuggestion.c, false);
        b.a(parcel, 4, offlinesuggestion.d, false);
        b.a(parcel, 5, offlinesuggestion.e, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = b.b(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = b.i(parcel, k);
                    break;

                case 5: // '\005'
                    s = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OfflineSuggestion(i, s3, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new OfflineSuggestion[i];
    }
}
