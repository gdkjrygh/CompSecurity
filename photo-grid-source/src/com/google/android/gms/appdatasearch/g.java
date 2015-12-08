// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentContents, DocumentSection

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(DocumentContents documentcontents, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, documentcontents.b, i);
        c.a(parcel, 1000, documentcontents.a);
        c.a(parcel, 2, documentcontents.c, false);
        c.a(parcel, 3, documentcontents.d);
        c.a(parcel, 4, documentcontents.e, i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    adocumentsection = (DocumentSection[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, DocumentSection.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
