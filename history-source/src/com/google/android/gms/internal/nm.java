// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            nl, nd

public class nm
    implements android.os.Parcelable.Creator
{

    public nm()
    {
    }

    static void a(nl nl1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, nl1.We, i, false);
        b.c(parcel, 1000, nl1.getVersionCode());
        b.a(parcel, 2, nl1.ahh);
        b.a(parcel, 3, nl1.ahi);
        b.a(parcel, 4, nl1.ahj);
        b.c(parcel, 5, nl1.ahk, false);
        b.a(parcel, 6, nl1.mTag, false);
        b.H(parcel, j);
    }

    public nl cM(Parcel parcel)
    {
        String s = null;
        boolean flag = true;
        boolean flag2 = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        Object obj = nl.ahg;
        boolean flag1 = true;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, nd.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new nl(i, locationrequest, flag2, flag1, flag, ((java.util.List) (obj)), s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cM(parcel);
    }

    public nl[] eG(int i)
    {
        return new nl[i];
    }

    public Object[] newArray(int i)
    {
        return eG(i);
    }
}
