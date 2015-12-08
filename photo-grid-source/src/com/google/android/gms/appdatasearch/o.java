// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            UsageInfo, DocumentId, DocumentContents

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    static void a(UsageInfo usageinfo, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, usageinfo.b, i, false);
        c.a(parcel, 1000, usageinfo.a);
        c.a(parcel, 2, usageinfo.c);
        c.a(parcel, 3, usageinfo.d);
        c.a(parcel, 4, usageinfo.e, false);
        c.a(parcel, 5, usageinfo.f, i, false);
        c.a(parcel, 6, usageinfo.g);
        c.a(parcel, 7, usageinfo.h);
        c.a(parcel, 8, usageinfo.i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        DocumentContents documentcontents = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        long l1 = 0L;
        int j = -1;
        boolean flag = false;
        String s = null;
        int k = 0;
        DocumentId documentid = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    documentid = (DocumentId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, DocumentId.CREATOR);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, j1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 5: // '\005'
                    documentcontents = (DocumentContents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, DocumentContents.CREATOR);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 8: // '\b'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new UsageInfo(l, documentid, l1, k, s, documentcontents, flag, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new UsageInfo[i];
    }
}
