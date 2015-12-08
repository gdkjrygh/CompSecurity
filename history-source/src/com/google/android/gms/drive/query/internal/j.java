// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            MatchAllFilter

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(MatchAllFilter matchallfilter, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1000, matchallfilter.CK);
        b.H(parcel, i);
    }

    public MatchAllFilter aZ(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new MatchAllFilter(i);
            }
        } while (true);
    }

    public MatchAllFilter[] co(int i)
    {
        return new MatchAllFilter[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aZ(parcel);
    }

    public Object[] newArray(int i)
    {
        return co(i);
    }
}
