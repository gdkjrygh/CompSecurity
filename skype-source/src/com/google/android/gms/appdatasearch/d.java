// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentSection, RegisterSectionInfo

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(DocumentSection documentsection, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, documentsection.c);
        b.a(parcel, 1000, documentsection.b);
        b.a(parcel, 3, documentsection.d, i);
        b.a(parcel, 4, documentsection.e);
        b.a(parcel, 5, documentsection.f);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = -1;
        RegisterSectionInfo registersectioninfo = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    registersectioninfo = (RegisterSectionInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, RegisterSectionInfo.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new DocumentSection(j, s, registersectioninfo, i, abyte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DocumentSection[i];
    }
}
