// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(PlayLoggerContext playloggercontext, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, playloggercontext.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, playloggercontext.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, playloggercontext.c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, playloggercontext.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, playloggercontext.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, playloggercontext.f);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, playloggercontext.g);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, playloggercontext.h);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, playloggercontext.i);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, playloggercontext.j);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag1 = true;
        boolean flag = false;
        String s1 = null;
        String s2 = null;
        int j = 0;
        int k = 0;
        String s3 = null;
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
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 7: // '\007'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(l, s3, k, j, s2, s1, flag1, s, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlayLoggerContext[i];
    }
}
