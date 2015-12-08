// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            ScopeDetail, FACLData

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(ScopeDetail scopedetail, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, scopedetail.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, scopedetail.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, scopedetail.c, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, scopedetail.d, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, scopedetail.e, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, scopedetail.f, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, scopedetail.g, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, scopedetail.h, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        FACLData facldata = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        ArrayList arraylist = new ArrayList();
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;

                case 8: // '\b'
                    facldata = (FACLData)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, FACLData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ScopeDetail(i, s4, s3, s2, s1, s, arraylist, facldata);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ScopeDetail[i];
    }
}
