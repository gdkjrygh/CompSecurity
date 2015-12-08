// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            jj

public class jk
    implements android.os.Parcelable.Creator
{

    public jk()
    {
    }

    static void a(jj jj1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, jj1.version);
        b.c(parcel, 2, jj1.MD);
        b.c(parcel, 3, jj1.ME);
        b.a(parcel, 4, jj1.MF, false);
        b.a(parcel, 5, jj1.MG, false);
        b.a(parcel, 6, jj1.MH, i, false);
        b.a(parcel, 7, jj1.MI, false);
        b.H(parcel, j);
    }

    public jj D(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new jj(k, j, i, s, ibinder, ascope, bundle);
            }
        } while (true);
    }

    public jj[] aC(int i)
    {
        return new jj[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return D(parcel);
    }

    public Object[] newArray(int i)
    {
        return aC(i);
    }
}
