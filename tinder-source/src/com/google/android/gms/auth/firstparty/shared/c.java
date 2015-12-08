// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
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
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, scopedetail.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, scopedetail.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, scopedetail.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, scopedetail.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, scopedetail.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, scopedetail.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, scopedetail.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, scopedetail.h, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        FACLData facldata = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = zza.l(parcel, k);
                    break;

                case 6: // '\006'
                    s = zza.l(parcel, k);
                    break;

                case 7: // '\007'
                    arraylist = zza.t(parcel, k);
                    break;

                case 8: // '\b'
                    facldata = (FACLData)zza.a(parcel, k, FACLData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
