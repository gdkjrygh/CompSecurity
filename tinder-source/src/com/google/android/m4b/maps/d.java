// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import com.google.android.m4b.maps.model.CameraPosition;

// Referenced classes of package com.google.android.m4b.maps:
//            GoogleMapOptions

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    public static GoogleMapOptions a(Parcel parcel)
    {
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        int j = 0;
        byte byte10 = -1;
        byte byte9 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte8 = -1;
        byte byte7 = -1;
        byte byte6 = -1;
        byte byte5 = -1;
        byte byte4 = -1;
        byte byte3 = -1;
        byte byte2 = -1;
        byte byte1 = -1;
        byte byte0 = -1;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 13: // '\r'
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    byte10 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 3: // '\003'
                    byte9 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.m4b.maps.k.a.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte8 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte7 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte6 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte5 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte4 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte3 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte2 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 14: // '\016'
                    byte1 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 15: // '\017'
                    byte0 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte10, byte9, i, cameraposition, byte8, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, googlemapoptions.a);
        b.a(parcel, 2, com.google.android.m4b.maps.df.a.a(googlemapoptions.b));
        b.a(parcel, 3, com.google.android.m4b.maps.df.a.a(googlemapoptions.c));
        b.b(parcel, 4, googlemapoptions.d);
        b.a(parcel, 5, googlemapoptions.e, i);
        b.a(parcel, 6, com.google.android.m4b.maps.df.a.a(googlemapoptions.f));
        b.a(parcel, 7, com.google.android.m4b.maps.df.a.a(googlemapoptions.g));
        b.a(parcel, 8, com.google.android.m4b.maps.df.a.a(googlemapoptions.h));
        b.a(parcel, 9, com.google.android.m4b.maps.df.a.a(googlemapoptions.i));
        b.a(parcel, 10, com.google.android.m4b.maps.df.a.a(googlemapoptions.j));
        b.a(parcel, 11, com.google.android.m4b.maps.df.a.a(googlemapoptions.k));
        b.a(parcel, 12, com.google.android.m4b.maps.df.a.a(googlemapoptions.l));
        b.a(parcel, 14, com.google.android.m4b.maps.df.a.a(googlemapoptions.m));
        b.a(parcel, 15, com.google.android.m4b.maps.df.a.a(googlemapoptions.n));
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }
}
