// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, googlemapoptions.getVersionCode());
        b.a(parcel, 2, googlemapoptions.nD());
        b.a(parcel, 3, googlemapoptions.nE());
        b.c(parcel, 4, googlemapoptions.getMapType());
        b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        b.a(parcel, 6, googlemapoptions.nF());
        b.a(parcel, 7, googlemapoptions.nG());
        b.a(parcel, 8, googlemapoptions.nH());
        b.a(parcel, 9, googlemapoptions.nI());
        b.a(parcel, 10, googlemapoptions.nJ());
        b.a(parcel, 11, googlemapoptions.nK());
        b.a(parcel, 12, googlemapoptions.nL());
        b.a(parcel, 14, googlemapoptions.nM());
        b.H(parcel, j);
    }

    public GoogleMapOptions cX(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
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
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
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
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cX(parcel);
    }

    public GoogleMapOptions[] eT(int i)
    {
        return new GoogleMapOptions[i];
    }

    public Object[] newArray(int i)
    {
        return eT(i);
    }
}
