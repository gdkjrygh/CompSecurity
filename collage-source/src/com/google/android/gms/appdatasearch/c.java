// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentId

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(DocumentId documentid, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, documentid.b, false);
        b.a(parcel, 1000, documentid.a);
        b.a(parcel, 2, documentid.c, false);
        b.a(parcel, 3, documentid.d, false);
        b.a(parcel, i);
    }

    public DocumentId a(Parcel parcel)
    {
        String s2 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DocumentId(i, s, s1, s2);
            }
        } while (true);
    }

    public DocumentId[] a(int i)
    {
        return new DocumentId[i];
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
