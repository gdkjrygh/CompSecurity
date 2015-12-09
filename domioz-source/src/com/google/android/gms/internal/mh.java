// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzvz

public final class mh
    implements android.os.Parcelable.Creator
{

    public mh()
    {
    }

    static void a(zzvz zzvz1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzvz1.a());
        c.a(parcel, 2, zzvz1.a);
        c.a(parcel, zzvz1.b);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        byte abyte0[][] = null;
        String as[] = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int j = parcel.readInt();
                switch (0xffff & j)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j);
                    break;

                case 2: // '\002'
                    as = com.google.android.gms.common.internal.safeparcel.a.r(parcel, j);
                    break;

                case 3: // '\003'
                    int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel, j);
                    int j1 = parcel.dataPosition();
                    if (i1 == 0)
                    {
                        abyte0 = null;
                    } else
                    {
                        int k1 = parcel.readInt();
                        abyte0 = new byte[k1][];
                        for (int k = 0; k < k1; k++)
                        {
                            abyte0[k] = parcel.createByteArray();
                        }

                        parcel.setDataPosition(j1 + i1);
                    }
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
                }
                return new zzvz(i, as, abyte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzvz[i];
    }
}
