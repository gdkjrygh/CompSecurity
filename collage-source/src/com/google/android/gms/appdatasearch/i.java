// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(RegisterSectionInfo registersectioninfo, Parcel parcel, int j)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, registersectioninfo.b, false);
        b.a(parcel, 1000, registersectioninfo.a);
        b.a(parcel, 2, registersectioninfo.c, false);
        b.a(parcel, 3, registersectioninfo.d);
        b.a(parcel, 4, registersectioninfo.e);
        b.a(parcel, 5, registersectioninfo.f);
        b.a(parcel, 6, registersectioninfo.g, false);
        b.a(parcel, 7, registersectioninfo.h, j, false);
        b.a(parcel, 8, registersectioninfo.i, false);
        b.a(parcel, 11, registersectioninfo.j, false);
        b.a(parcel, k);
    }

    public RegisterSectionInfo a(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 1;
        int ai[] = null;
        Feature afeature[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    afeature = (Feature[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1, Feature.CREATOR);
                    break;

                case 8: // '\b'
                    ai = com.google.android.gms.common.internal.safeparcel.a.k(parcel, i1);
                    break;

                case 11: // '\013'
                    s = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new RegisterSectionInfo(k, s3, s2, flag1, j, flag, s1, afeature, ai, s);
            }
        } while (true);
    }

    public RegisterSectionInfo[] a(int j)
    {
        return new RegisterSectionInfo[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
