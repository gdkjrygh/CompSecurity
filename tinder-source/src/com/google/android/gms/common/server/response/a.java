// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(FastJsonResponse.Field field, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, field.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, field.a());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, field.b());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, field.c());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, field.d());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, field.e());
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, field.f());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, field.h());
        if (field.k == null)
        {
            field = null;
        } else
        {
            field = ConverterWrapper.a(field.k);
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, field, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ConverterWrapper converterwrapper = null;
        int i = 0;
        int i1 = zza.a(parcel);
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
                    k = zza.e(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, j1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = zza.l(parcel, j1);
                    break;

                case 7: // '\007'
                    i = zza.e(parcel, j1);
                    break;

                case 8: // '\b'
                    s = zza.l(parcel, j1);
                    break;

                case 9: // '\t'
                    converterwrapper = (ConverterWrapper)zza.a(parcel, j1, ConverterWrapper.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new FastJsonResponse.Field(l, k, flag1, j, flag, s1, i, s, converterwrapper);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FastJsonResponse.Field[i];
    }
}
