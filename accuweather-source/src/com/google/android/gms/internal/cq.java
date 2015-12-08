// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            cr

public class cq
    implements android.os.Parcelable.Creator
{

    public cq()
    {
    }

    static void a(cr cr1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, cr1.versionCode);
        b.a(parcel, 2, cr1.aY(), false);
        b.a(parcel, 3, cr1.aZ(), false);
        b.a(parcel, 4, cr1.ba(), false);
        b.a(parcel, 5, cr1.bb(), false);
        b.G(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return g(parcel);
    }

    public cr g(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    ibinder3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 4: // '\004'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new cr(i, ibinder3, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    public cr[] k(int i)
    {
        return new cr[i];
    }

    public Object[] newArray(int i)
    {
        return k(i);
    }
}
