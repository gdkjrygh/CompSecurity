// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            NodeParcelable

public final class ad
    implements android.os.Parcelable.Creator
{

    public ad()
    {
    }

    static void a(NodeParcelable nodeparcelable, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, nodeparcelable.a);
        b.a(parcel, 2, nodeparcelable.a());
        b.a(parcel, 3, nodeparcelable.b());
        b.a(parcel, 4, nodeparcelable.c());
        b.a(parcel, 5, nodeparcelable.d());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s1 = null;
        int j = 0;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new NodeParcelable(j, s1, s, i, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new NodeParcelable[i];
    }
}
