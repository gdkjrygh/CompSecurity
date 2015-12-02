// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;

public final class azy
    implements android.os.Parcelable.Creator
{

    public azy()
    {
    }

    public static GoogleMapOptions a(Parcel parcel)
    {
        int k = up.b(parcel);
        int j = 0;
        byte byte9 = -1;
        byte byte8 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
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
                int l = up.a(parcel);
                switch (up.a(l))
                {
                case 13: // '\r'
                default:
                    up.a(parcel, l);
                    break;

                case 1: // '\001'
                    j = up.e(parcel, l);
                    break;

                case 2: // '\002'
                    byte9 = up.c(parcel, l);
                    break;

                case 3: // '\003'
                    byte8 = up.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = up.e(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)up.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte7 = up.c(parcel, l);
                    break;

                case 7: // '\007'
                    byte6 = up.c(parcel, l);
                    break;

                case 8: // '\b'
                    byte5 = up.c(parcel, l);
                    break;

                case 9: // '\t'
                    byte4 = up.c(parcel, l);
                    break;

                case 10: // '\n'
                    byte3 = up.c(parcel, l);
                    break;

                case 11: // '\013'
                    byte2 = up.c(parcel, l);
                    break;

                case 12: // '\f'
                    byte1 = up.c(parcel, l);
                    break;

                case 14: // '\016'
                    byte0 = up.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new uq((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = ur.a(parcel);
        ur.a(parcel, 1, googlemapoptions.a());
        ur.a(parcel, 2, googlemapoptions.b());
        ur.a(parcel, 3, googlemapoptions.c());
        ur.a(parcel, 4, googlemapoptions.l());
        ur.a(parcel, 5, googlemapoptions.m(), i, false);
        ur.a(parcel, 6, googlemapoptions.d());
        ur.a(parcel, 7, googlemapoptions.e());
        ur.a(parcel, 8, googlemapoptions.f());
        ur.a(parcel, 9, googlemapoptions.g());
        ur.a(parcel, 10, googlemapoptions.h());
        ur.a(parcel, 11, googlemapoptions.i());
        ur.a(parcel, 12, googlemapoptions.j());
        ur.a(parcel, 14, googlemapoptions.k());
        ur.a(parcel, j);
    }

    private static GoogleMapOptions[] a(int i)
    {
        return new GoogleMapOptions[i];
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
