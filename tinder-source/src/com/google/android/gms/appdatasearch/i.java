// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            UsageInfo, DocumentId, DocumentContents

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(UsageInfo usageinfo, Parcel parcel, int j)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, usageinfo.b, j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, usageinfo.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, usageinfo.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, usageinfo.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, usageinfo.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, usageinfo.f, j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, usageinfo.g);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 7, usageinfo.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 8, usageinfo.i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        DocumentContents documentcontents = null;
        int j = 0;
        int j1 = zza.a(parcel);
        long l1 = 0L;
        int k = -1;
        boolean flag = false;
        String s = null;
        int l = 0;
        DocumentId documentid = null;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    zza.b(parcel, k1);
                    break;

                case 1: // '\001'
                    documentid = (DocumentId)zza.a(parcel, k1, DocumentId.CREATOR);
                    break;

                case 1000: 
                    i1 = zza.e(parcel, k1);
                    break;

                case 2: // '\002'
                    l1 = zza.f(parcel, k1);
                    break;

                case 3: // '\003'
                    l = zza.e(parcel, k1);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k1);
                    break;

                case 5: // '\005'
                    documentcontents = (DocumentContents)zza.a(parcel, k1, DocumentContents.CREATOR);
                    break;

                case 6: // '\006'
                    flag = zza.c(parcel, k1);
                    break;

                case 7: // '\007'
                    k = zza.e(parcel, k1);
                    break;

                case 8: // '\b'
                    j = zza.e(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new UsageInfo(i1, documentid, l1, l, s, documentcontents, flag, k, j);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new UsageInfo[j];
    }
}
