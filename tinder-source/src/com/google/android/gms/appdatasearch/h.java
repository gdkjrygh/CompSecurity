// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(RegisterSectionInfo registersectioninfo, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, registersectioninfo.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, registersectioninfo.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, registersectioninfo.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, registersectioninfo.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, registersectioninfo.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, registersectioninfo.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, registersectioninfo.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, registersectioninfo.h, i);
        int ai[] = registersectioninfo.i;
        if (ai != null)
        {
            i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8);
            parcel.writeIntArray(ai);
            com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, registersectioninfo.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s3 = zza.l(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    s2 = zza.l(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = zza.l(parcel, l);
                    break;

                case 7: // '\007'
                    afeature = (Feature[])zza.b(parcel, l, Feature.CREATOR);
                    break;

                case 8: // '\b'
                    ai = zza.p(parcel, l);
                    break;

                case 11: // '\013'
                    s = zza.l(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
