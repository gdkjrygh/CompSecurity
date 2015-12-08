// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;

public final class jtn
    implements android.os.Parcelable.Creator
{

    public jtn()
    {
    }

    public static void a(DocumentContents documentcontents, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.a(parcel, 1, documentcontents.b, i, false);
        b.c(parcel, 1000, documentcontents.a);
        b.a(parcel, 2, documentcontents.c, false);
        b.a(parcel, 3, documentcontents.d);
        b.a(parcel, 4, documentcontents.e, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = b.b(parcel);
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
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    adocumentsection = (DocumentSection[])b.b(parcel, k, DocumentSection.CREATOR);
                    break;

                case 1000: 
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    flag = b.c(parcel, k);
                    break;

                case 4: // '\004'
                    account = (Account)b.a(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
