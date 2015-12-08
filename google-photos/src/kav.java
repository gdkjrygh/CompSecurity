// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;

public final class kav
    implements android.os.Parcelable.Creator
{

    public kav()
    {
    }

    public static void a(WebImage webimage, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, webimage.a);
        b.a(parcel, 2, webimage.b, i, false);
        b.c(parcel, 3, webimage.c);
        b.c(parcel, 4, webimage.d);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = b.b(parcel);
        int j = 0;
        Uri uri = null;
        int i = 0;
        int k = 0;
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
                    i = b.e(parcel, i1);
                    break;

                case 2: // '\002'
                    uri = (Uri)b.a(parcel, i1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    j = b.e(parcel, i1);
                    break;

                case 4: // '\004'
                    k = b.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new WebImage(i, uri, j, k);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new WebImage[i];
    }
}
