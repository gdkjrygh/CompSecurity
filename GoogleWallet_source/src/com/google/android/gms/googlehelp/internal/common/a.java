// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            OverflowMenuItem

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(OverflowMenuItem overflowmenuitem, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, overflowmenuitem.mVersionCode);
        b.c(parcel, 2, overflowmenuitem.mId);
        b.a(parcel, 3, overflowmenuitem.Yv, false);
        b.a(parcel, 4, overflowmenuitem.mIntent, i, false);
        b.J(parcel, j);
    }

    private static OverflowMenuItem fd(Parcel parcel)
    {
        Intent intent = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 4: // '\004'
                    intent = (Intent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Intent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OverflowMenuItem(i, j, s, intent);
            }
        } while (true);
    }

    private static OverflowMenuItem[] hl(int i)
    {
        return new OverflowMenuItem[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fd(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hl(i);
    }
}
