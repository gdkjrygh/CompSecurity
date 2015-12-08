// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.cast:
//            CastDevice

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(CastDevice castdevice, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.C(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, castdevice.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, castdevice.getDeviceId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, castdevice.Ai, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, castdevice.getFriendlyName(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, castdevice.getModelName(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, castdevice.getDeviceVersion(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 7, castdevice.getServicePort());
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 8, castdevice.getIcons(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 9, castdevice.getCapabilities());
        com.google.android.gms.common.internal.safeparcel.b.G(parcel, i);
    }

    public CastDevice[] P(int i)
    {
        return new CastDevice[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return s(parcel);
    }

    public Object[] newArray(int i)
    {
        return P(i);
    }

    public CastDevice s(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, WebImage.CREATOR);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CastDevice(k, s5, s4, s3, s2, s1, j, arraylist, i);
            }
        } while (true);
    }
}
