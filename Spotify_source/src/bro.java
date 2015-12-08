// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bro
    implements android.os.Parcelable.Creator
{

    public bro()
    {
    }

    public static void a(WebImage webimage, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, webimage.a);
        brp.a(parcel, 2, webimage.b, i);
        brp.b(parcel, 3, webimage.c);
        brp.b(parcel, 4, webimage.d);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    uri = (Uri)zza.a(parcel, i1, Uri.CREATOR);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, i1);
                    break;

                case 4: // '\004'
                    k = zza.e(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
