// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.images.WebImage;
import java.util.Collections;

public final class jxb
    implements android.os.Parcelable.Creator
{

    public jxb()
    {
    }

    public static void a(CastDevice castdevice, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, castdevice.a);
        b.a(parcel, 2, castdevice.b, false);
        b.a(parcel, 3, castdevice.c, false);
        b.a(parcel, 4, castdevice.d, false);
        b.a(parcel, 5, castdevice.e, false);
        b.a(parcel, 6, castdevice.f, false);
        b.c(parcel, 7, castdevice.g);
        b.c(parcel, 8, Collections.unmodifiableList(castdevice.h), false);
        b.c(parcel, 9, castdevice.i);
        b.c(parcel, 10, castdevice.j);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int i1 = b.b(parcel);
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
                    b.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = b.e(parcel, j1);
                    break;

                case 2: // '\002'
                    s4 = b.i(parcel, j1);
                    break;

                case 3: // '\003'
                    s3 = b.i(parcel, j1);
                    break;

                case 4: // '\004'
                    s2 = b.i(parcel, j1);
                    break;

                case 5: // '\005'
                    s1 = b.i(parcel, j1);
                    break;

                case 6: // '\006'
                    s = b.i(parcel, j1);
                    break;

                case 7: // '\007'
                    k = b.e(parcel, j1);
                    break;

                case 8: // '\b'
                    arraylist = b.c(parcel, j1, WebImage.CREATOR);
                    break;

                case 9: // '\t'
                    j = b.e(parcel, j1);
                    break;

                case 10: // '\n'
                    i = b.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
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
