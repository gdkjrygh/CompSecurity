// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.images.WebImage;

public final class jxa
    implements android.os.Parcelable.Creator
{

    public jxa()
    {
    }

    public static void a(ApplicationMetadata applicationmetadata, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, applicationmetadata.a);
        b.a(parcel, 2, applicationmetadata.b, false);
        b.a(parcel, 3, applicationmetadata.c, false);
        b.c(parcel, 4, applicationmetadata.d, false);
        b.b(parcel, 5, applicationmetadata.e, false);
        b.a(parcel, 6, applicationmetadata.f, false);
        b.a(parcel, 7, applicationmetadata.g, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = b.b(parcel);
        int i = 0;
        String s = null;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = b.i(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = b.c(parcel, k, WebImage.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist = b.p(parcel, k);
                    break;

                case 6: // '\006'
                    s = b.i(parcel, k);
                    break;

                case 7: // '\007'
                    uri = (Uri)b.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ApplicationMetadata(i, s2, s1, arraylist1, arraylist, s, uri);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ApplicationMetadata[i];
    }
}
