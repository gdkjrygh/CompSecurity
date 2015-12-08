// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            UsageInfo, DocumentId, DocumentContents

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(UsageInfo usageinfo, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, usageinfo.b, i, false);
        b.a(parcel, 1000, usageinfo.a);
        b.a(parcel, 2, usageinfo.c);
        b.a(parcel, 3, usageinfo.d);
        b.a(parcel, 4, usageinfo.e, false);
        b.a(parcel, 5, usageinfo.f, i, false);
        b.a(parcel, 6, usageinfo.g);
        b.a(parcel, 7, usageinfo.h);
        b.a(parcel, 8, usageinfo.i);
        b.a(parcel, k);
    }

    public UsageInfo a(Parcel parcel)
    {
        DocumentContents documentcontents = null;
        int i = 0;
        int j1 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
                int k1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    documentid = (DocumentId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, DocumentId.CREATOR);
                    break;

                case 1000: 
                    i1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k1);
                    break;

                case 5: // '\005'
                    documentcontents = (DocumentContents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k1, DocumentContents.CREATOR);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new UsageInfo(i1, documentid, l1, l, s, documentcontents, flag, k, i);
            }
        } while (true);
    }

    public UsageInfo[] a(int i)
    {
        return new UsageInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
