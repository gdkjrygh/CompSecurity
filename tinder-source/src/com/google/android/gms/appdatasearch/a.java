// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentContents, DocumentSection

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(DocumentContents documentcontents, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, documentcontents.b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, documentcontents.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, documentcontents.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, documentcontents.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, documentcontents.e, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = zza.a(parcel);
        String s = null;
        DocumentSection adocumentsection[] = null;
        int i = 0;
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
                    adocumentsection = (DocumentSection[])zza.b(parcel, k, DocumentSection.CREATOR);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, k);
                    break;

                case 3: // '\003'
                    flag = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    account = (Account)zza.a(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DocumentContents(i, adocumentsection, s, flag, account);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DocumentContents[i];
    }
}
