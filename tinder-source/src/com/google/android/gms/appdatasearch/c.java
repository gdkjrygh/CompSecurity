// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentSection, RegisterSectionInfo

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(DocumentSection documentsection, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, documentsection.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, documentsection.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, documentsection.d, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, documentsection.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, documentsection.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int k = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s = zza.l(parcel, l);
                    break;

                case 1000: 
                    j = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    registersectioninfo = (RegisterSectionInfo)zza.a(parcel, l, RegisterSectionInfo.CREATOR);
                    break;

                case 4: // '\004'
                    i = zza.e(parcel, l);
                    break;

                case 5: // '\005'
                    abyte0 = zza.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
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
