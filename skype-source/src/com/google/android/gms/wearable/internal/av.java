// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelable

public final class av
    implements android.os.Parcelable.Creator
{

    public av()
    {
    }

    static void a(AncsNotificationParcelable ancsnotificationparcelable, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, ancsnotificationparcelable.a);
        b.a(parcel, 2, ancsnotificationparcelable.a());
        b.a(parcel, 3, ancsnotificationparcelable.b());
        b.a(parcel, 4, ancsnotificationparcelable.c());
        b.a(parcel, 5, ancsnotificationparcelable.d());
        b.a(parcel, 6, ancsnotificationparcelable.e());
        b.a(parcel, 7, ancsnotificationparcelable.f());
        b.a(parcel, 8, ancsnotificationparcelable.g());
        b.a(parcel, 9, ancsnotificationparcelable.h());
        b.a(parcel, 10, ancsnotificationparcelable.i());
        b.a(parcel, 11, ancsnotificationparcelable.j());
        b.a(parcel, 12, ancsnotificationparcelable.k());
        b.a(parcel, i);
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
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
