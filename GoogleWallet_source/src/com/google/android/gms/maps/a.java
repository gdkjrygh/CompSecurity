// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, googlemapoptions.getVersionCode());
        b.a(parcel, 2, googlemapoptions.pR());
        b.a(parcel, 3, googlemapoptions.pS());
        b.c(parcel, 4, googlemapoptions.getMapType());
        b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        b.a(parcel, 6, googlemapoptions.pT());
        b.a(parcel, 7, googlemapoptions.pU());
        b.a(parcel, 8, googlemapoptions.pV());
        b.a(parcel, 9, googlemapoptions.pW());
        b.a(parcel, 10, googlemapoptions.pX());
        b.a(parcel, 11, googlemapoptions.pY());
        b.a(parcel, 12, googlemapoptions.pZ());
        b.a(parcel, 14, googlemapoptions.qa());
        b.J(parcel, j);
    }

    public static GoogleMapOptions gj(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int j = 0;
        byte byte9 = 0;
        byte byte8 = 0;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte7 = 0;
        byte byte6 = 0;
        byte byte5 = 0;
        byte byte4 = 0;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                case 13: // '\r'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    byte9 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 3: // '\003'
                    byte8 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte7 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 7: // '\007'
                    byte6 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 8: // '\b'
                    byte5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 9: // '\t'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 10: // '\n'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 11: // '\013'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 12: // '\f'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 14: // '\016'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    private static GoogleMapOptions[] iI(int i)
    {
        return new GoogleMapOptions[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gj(parcel);
    }

    public final Object[] newArray(int i)
    {
        return iI(i);
    }
}
