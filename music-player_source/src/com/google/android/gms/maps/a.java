// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
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
        int j = c.a(parcel);
        c.a(parcel, 1, googlemapoptions.a());
        c.a(parcel, 2, googlemapoptions.b());
        c.a(parcel, 3, googlemapoptions.c());
        c.a(parcel, 4, googlemapoptions.j());
        c.a(parcel, 5, googlemapoptions.k(), i, false);
        c.a(parcel, 6, googlemapoptions.d());
        c.a(parcel, 7, googlemapoptions.e());
        c.a(parcel, 8, googlemapoptions.f());
        c.a(parcel, 9, googlemapoptions.g());
        c.a(parcel, 10, googlemapoptions.h());
        c.a(parcel, 11, googlemapoptions.i());
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte byte0 = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    byte7 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 3: // '\003'
                    byte6 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CameraPosition.a);
                    break;

                case 6: // '\006'
                    byte5 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte7, byte6, i, cameraposition, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }
}
