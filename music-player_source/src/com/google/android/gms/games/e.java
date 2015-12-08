// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.games:
//            GameEntity

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(GameEntity gameentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, gameentity.b(), false);
        c.a(parcel, 2, gameentity.c(), false);
        c.a(parcel, 3, gameentity.d(), false);
        c.a(parcel, 4, gameentity.e(), false);
        c.a(parcel, 5, gameentity.f(), false);
        c.a(parcel, 6, gameentity.g(), false);
        c.a(parcel, 7, gameentity.h(), i, false);
        c.a(parcel, 8, gameentity.j(), i, false);
        c.a(parcel, 9, gameentity.l(), i, false);
        c.a(parcel, 10, gameentity.n());
        c.a(parcel, 11, gameentity.p());
        c.a(parcel, 12, gameentity.q(), false);
        c.a(parcel, 13, gameentity.r());
        c.a(parcel, 14, gameentity.s());
        c.a(parcel, 15, gameentity.t());
        c.a(parcel, 17, gameentity.v());
        c.a(parcel, 16, gameentity.u());
        c.a(parcel, 1000, gameentity.w());
        c.a(parcel, 19, gameentity.k(), false);
        c.a(parcel, 18, gameentity.i(), false);
        c.a(parcel, 21, gameentity.o());
        c.a(parcel, 20, gameentity.m(), false);
        c.a(parcel, j);
    }

    public GameEntity a(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l = 0;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        Uri uri2 = null;
        Uri uri1 = null;
        Uri uri = null;
        boolean flag4 = false;
        boolean flag3 = false;
        String s3 = null;
        int k = 0;
        int j = 0;
        int i = 0;
        boolean flag2 = false;
        boolean flag1 = false;
        String s2 = null;
        String s1 = null;
        String s = null;
        boolean flag = false;
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
                    s9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 2: // '\002'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 4: // '\004'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 5: // '\005'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 6: // '\006'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 7: // '\007'
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 11: // '\013'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 12: // '\f'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 13: // '\r'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 14: // '\016'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 15: // '\017'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 17: // '\021'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 16: // '\020'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 19: // '\023'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 18: // '\022'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 21: // '\025'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 20: // '\024'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GameEntity(l, s9, s8, s7, s6, s5, s4, uri2, uri1, uri, flag4, flag3, s3, k, j, i, flag2, flag1, s2, s1, s, flag);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new GameEntity[i];
    }
}
