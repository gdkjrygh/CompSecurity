// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable:
//            ConnectionConfiguration

public final class v
    implements android.os.Parcelable.Creator
{

    public v()
    {
    }

    static void a(ConnectionConfiguration connectionconfiguration, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, connectionconfiguration.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, connectionconfiguration.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, connectionconfiguration.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, connectionconfiguration.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 5, connectionconfiguration.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, connectionconfiguration.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, connectionconfiguration.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, connectionconfiguration.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, connectionconfiguration.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, connectionconfiguration.j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = zza.a(parcel);
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
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = zza.l(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = zza.l(parcel, i1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, i1);
                    break;

                case 5: // '\005'
                    i = zza.e(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = zza.c(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = zza.c(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = zza.l(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, i1);
                    break;

                case 10: // '\n'
                    s = zza.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
