// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentSection, RegisterSectionInfo

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(DocumentSection documentsection, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, documentsection.c, false);
        c.a(parcel, 1000, documentsection.b);
        c.a(parcel, 3, documentsection.d, j, false);
        c.a(parcel, 4, documentsection.e);
        c.a(parcel, 5, documentsection.f);
        c.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        int j = -1;
        RegisterSectionInfo registersectioninfo = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 3: // '\003'
                    registersectioninfo = (RegisterSectionInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, RegisterSectionInfo.CREATOR);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, i1);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new DocumentSection(k, s, registersectioninfo, j, abyte0);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new DocumentSection[j];
    }
}
