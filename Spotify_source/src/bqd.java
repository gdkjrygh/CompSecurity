// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bqd
    implements android.os.Parcelable.Creator
{

    public bqd()
    {
    }

    public static void a(ApplicationMetadata applicationmetadata, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, applicationmetadata.a);
        brp.a(parcel, 2, applicationmetadata.b);
        brp.a(parcel, 3, applicationmetadata.c);
        brp.b(parcel, 4, applicationmetadata.d);
        brp.a(parcel, 5, applicationmetadata.e);
        brp.a(parcel, 6, applicationmetadata.f);
        brp.a(parcel, 7, applicationmetadata.g, i);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.h(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = zza.c(parcel, k, WebImage.CREATOR);
                    break;

                case 5: // '\005'
                    arraylist = zza.l(parcel, k);
                    break;

                case 6: // '\006'
                    s = zza.h(parcel, k);
                    break;

                case 7: // '\007'
                    uri = (Uri)zza.a(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
