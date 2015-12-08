// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(FastJsonResponse.Field field, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, field.a());
        c.a(parcel, 2, field.b());
        c.a(parcel, 3, field.c());
        c.a(parcel, 4, field.d());
        c.a(parcel, 5, field.e());
        c.a(parcel, 6, field.f(), false);
        c.a(parcel, 7, field.g());
        c.a(parcel, 8, field.i(), false);
        c.a(parcel, 9, field.k(), i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ConverterWrapper converterwrapper = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 9: // '\t'
                    converterwrapper = (ConverterWrapper)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, ConverterWrapper.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
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
