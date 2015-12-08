// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(FastJsonResponse.Field field, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, field.a());
        zzb.a(parcel, 2, field.b());
        zzb.a(parcel, 3, field.c());
        zzb.a(parcel, 4, field.d());
        zzb.a(parcel, 5, field.e());
        zzb.a(parcel, 6, field.f(), false);
        zzb.a(parcel, 7, field.g());
        zzb.a(parcel, 8, field.i(), false);
        zzb.a(parcel, 9, field.k(), i, false);
        zzb.a(parcel, j);
    }

    public FastJsonResponse.Field a(Parcel parcel)
    {
        ConverterWrapper converterwrapper = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        String s = null;
        String s1 = null;
        boolean flag = false;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, j1);
                    break;

                case 9: // '\t'
                    converterwrapper = (ConverterWrapper)com.google.android.gms.common.internal.safeparcel.zza.a(parcel, j1, ConverterWrapper.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new FastJsonResponse.Field(l, k, flag1, j, flag, s1, i, s, converterwrapper);
            }
        } while (true);
    }

    public FastJsonResponse.Field[] a(int i)
    {
        return new FastJsonResponse.Field[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
