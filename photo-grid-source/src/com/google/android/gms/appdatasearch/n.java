// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(RegisterSectionInfo registersectioninfo, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, registersectioninfo.b, false);
        c.a(parcel, 1000, registersectioninfo.a);
        c.a(parcel, 2, registersectioninfo.c, false);
        c.a(parcel, 3, registersectioninfo.d);
        c.a(parcel, 4, registersectioninfo.e);
        c.a(parcel, 5, registersectioninfo.f);
        c.a(parcel, 6, registersectioninfo.g, false);
        c.a(parcel, 7, registersectioninfo.h, i);
        c.a(parcel, registersectioninfo.i);
        c.a(parcel, 11, registersectioninfo.j, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 1;
        int ai[] = null;
        Feature afeature[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 7: // '\007'
                    afeature = (Feature[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Feature.CREATOR);
                    break;

                case 8: // '\b'
                    ai = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 11: // '\013'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RegisterSectionInfo(j, s3, s2, flag1, i, flag, s1, afeature, ai, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RegisterSectionInfo[i];
    }
}
