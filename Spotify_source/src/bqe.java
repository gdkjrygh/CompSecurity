// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Collections;

public final class bqe
    implements android.os.Parcelable.Creator
{

    public bqe()
    {
    }

    public static void a(CastDevice castdevice, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, castdevice.a);
        brp.a(parcel, 2, castdevice.b);
        brp.a(parcel, 3, castdevice.c);
        brp.a(parcel, 4, castdevice.d);
        brp.a(parcel, 5, castdevice.e);
        brp.a(parcel, 6, castdevice.f);
        brp.b(parcel, 7, castdevice.g);
        brp.b(parcel, 8, Collections.unmodifiableList(castdevice.h));
        brp.b(parcel, 9, castdevice.i);
        brp.b(parcel, 10, castdevice.j);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int i1 = zza.a(parcel);
        int j = 0;
        int k = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    s4 = zza.h(parcel, j1);
                    break;

                case 3: // '\003'
                    s3 = zza.h(parcel, j1);
                    break;

                case 4: // '\004'
                    s2 = zza.h(parcel, j1);
                    break;

                case 5: // '\005'
                    s1 = zza.h(parcel, j1);
                    break;

                case 6: // '\006'
                    s = zza.h(parcel, j1);
                    break;

                case 7: // '\007'
                    k = zza.e(parcel, j1);
                    break;

                case 8: // '\b'
                    arraylist = zza.c(parcel, j1, WebImage.CREATOR);
                    break;

                case 9: // '\t'
                    j = zza.e(parcel, j1);
                    break;

                case 10: // '\n'
                    i = zza.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new CastDevice(l, s4, s3, s2, s1, s, k, arraylist, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CastDevice[i];
    }
}
