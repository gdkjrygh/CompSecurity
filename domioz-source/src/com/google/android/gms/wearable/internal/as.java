// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zze

public final class as
    implements android.os.Parcelable.Creator
{

    public as()
    {
    }

    static void a(zze zze1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zze1.a);
        c.a(parcel, 2, zze1.a());
        c.a(parcel, 3, zze1.b());
        c.a(parcel, 4, zze1.c());
        c.a(parcel, 5, zze1.d());
        c.a(parcel, 6, zze1.e());
        c.a(parcel, 7, zze1.f());
        c.a(parcel, 8, zze1.g());
        c.a(parcel, 9, zze1.h());
        c.a(parcel, 10, zze1.i());
        c.a(parcel, 11, zze1.j());
        c.a(parcel, 12, zze1.k());
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        byte byte3 = 0;
        byte byte2 = 0;
        byte byte1 = 0;
        byte byte0 = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zze(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zze[i];
    }
}
