// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;

public final class azs
    implements android.os.Parcelable.Creator
{

    public azs()
    {
    }

    private static StreetViewPanoramaLink a(Parcel parcel)
    {
        int j = up.b(parcel);
        int i = 0;
        String s = null;
        float f = 0.0F;
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
                    s = up.l(parcel, k);
                    break;

                case 3: // '\003'
                    f = up.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLink(i, s, f);
            }
        } while (true);
    }

    public static void a(StreetViewPanoramaLink streetviewpanoramalink, Parcel parcel)
    {
        int i = ur.a(parcel);
        ur.a(parcel, 1, streetviewpanoramalink.a());
        ur.a(parcel, 2, streetviewpanoramalink.a, false);
        ur.a(parcel, 3, streetviewpanoramalink.b);
        ur.a(parcel, i);
    }

    private static StreetViewPanoramaLink[] a(int i)
    {
        return new StreetViewPanoramaLink[i];
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
