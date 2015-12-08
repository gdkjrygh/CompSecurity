// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable:
//            ConnectionConfiguration

public final class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(ConnectionConfiguration connectionconfiguration, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, connectionconfiguration.a);
        b.a(parcel, 2, connectionconfiguration.a());
        b.a(parcel, 3, connectionconfiguration.b());
        b.a(parcel, 4, connectionconfiguration.c());
        b.a(parcel, 5, connectionconfiguration.d());
        b.a(parcel, 6, connectionconfiguration.i());
        b.a(parcel, 7, connectionconfiguration.e());
        b.a(parcel, 8, connectionconfiguration.f());
        b.a(parcel, 9, connectionconfiguration.g());
        b.a(parcel, 10, connectionconfiguration.h());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s1 = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        int j = 0;
        String s2 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ConnectionConfiguration(k, s3, s2, j, i, flag2, flag1, s1, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectionConfiguration[i];
    }
}
