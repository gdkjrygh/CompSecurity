// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.appdatasearch.DocumentId;

public final class jto
    implements android.os.Parcelable.Creator
{

    public jto()
    {
    }

    public static void a(DocumentId documentid, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.a(parcel, 1, documentid.b, false);
        b.c(parcel, 1000, documentid.a);
        b.a(parcel, 2, documentid.c, false);
        b.a(parcel, 3, documentid.d, false);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = b.b(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s = b.i(parcel, k);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = b.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DocumentId(i, s, s1, s2);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DocumentId[i];
    }
}
