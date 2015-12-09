// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.people.model:
//            AvatarReference

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(AvatarReference avatarreference, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, avatarreference.getSource());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, avatarreference.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, avatarreference.getLocation(), false);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, i);
    }

    public static AvatarReference gL(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        int i = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AvatarReference(i, j, s);
            }
        } while (true);
    }

    private static AvatarReference[] jq(int i)
    {
        return new AvatarReference[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gL(parcel);
    }

    public final Object[] newArray(int i)
    {
        return jq(i);
    }
}
