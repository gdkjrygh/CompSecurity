// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class GoogleMapOptionsCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public GoogleMapOptionsCreator()
    {
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, googlemapoptions.getVersionCode());
        b.a(parcel, 2, googlemapoptions.jq());
        b.a(parcel, 3, googlemapoptions.jr());
        b.c(parcel, 4, googlemapoptions.getMapType());
        b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        b.a(parcel, 6, googlemapoptions.js());
        b.a(parcel, 7, googlemapoptions.jt());
        b.a(parcel, 8, googlemapoptions.ju());
        b.a(parcel, 9, googlemapoptions.jv());
        b.a(parcel, 10, googlemapoptions.jw());
        b.a(parcel, 11, googlemapoptions.jx());
        b.G(parcel, j);
    }

    public GoogleMapOptions createFromParcel(Parcel parcel)
    {
        byte byte0 = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        CameraPosition cameraposition = null;
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        byte byte5 = 0;
        int i = 0;
        byte byte6 = 0;
        byte byte7 = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    byte7 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 3: // '\003'
                    byte6 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 7: // '\007'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 8: // '\b'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 9: // '\t'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 10: // '\n'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 11: // '\013'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte7, byte6, i, cameraposition, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public GoogleMapOptions[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
