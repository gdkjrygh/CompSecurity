// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable

public final class ax
    implements android.os.Parcelable.Creator
{

    public ax()
    {
    }

    static void a(AncsNotificationParcelable ancsnotificationparcelable, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, ancsnotificationparcelable.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, ancsnotificationparcelable.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, ancsnotificationparcelable.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, ancsnotificationparcelable.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, ancsnotificationparcelable.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, ancsnotificationparcelable.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, ancsnotificationparcelable.g);
        String s;
        if (ancsnotificationparcelable.h == null)
        {
            s = ancsnotificationparcelable.c;
        } else
        {
            s = ancsnotificationparcelable.h;
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, s);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, ancsnotificationparcelable.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, ancsnotificationparcelable.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, ancsnotificationparcelable.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, ancsnotificationparcelable.l);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    s5 = zza.l(parcel, l);
                    break;

                case 4: // '\004'
                    s4 = zza.l(parcel, l);
                    break;

                case 5: // '\005'
                    s3 = zza.l(parcel, l);
                    break;

                case 6: // '\006'
                    s2 = zza.l(parcel, l);
                    break;

                case 7: // '\007'
                    s1 = zza.l(parcel, l);
                    break;

                case 8: // '\b'
                    s = zza.l(parcel, l);
                    break;

                case 9: // '\t'
                    byte3 = zza.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte2 = zza.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte1 = zza.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte0 = zza.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AncsNotificationParcelable(j, i, s5, s4, s3, s2, s1, s, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new AncsNotificationParcelable[i];
    }
}
