// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

// Referenced classes of package com.google.android.gms.googlehelp:
//            GoogleHelp, OfflineSuggestion

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(GoogleHelp googlehelp, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, googlehelp.mVersionCode);
        b.a(parcel, 2, googlehelp.arN, false);
        b.a(parcel, 3, googlehelp.arO, i, false);
        b.a(parcel, 4, googlehelp.mPsdBundle, false);
        b.a(parcel, 5, googlehelp.arP);
        b.a(parcel, 6, googlehelp.arQ);
        b.c(parcel, 7, googlehelp.arR, false);
        b.a(parcel, 10, googlehelp.arS, false);
        b.a(parcel, 11, googlehelp.arT, i, false);
        b.a(parcel, 14, googlehelp.arX, false);
        b.a(parcel, 15, googlehelp.arY, i, false);
        b.c(parcel, 17, googlehelp.asa);
        b.d(parcel, 16, googlehelp.arZ, false);
        b.a(parcel, 19, googlehelp.arU, false);
        b.d(parcel, 18, googlehelp.asb, false);
        b.c(parcel, 21, googlehelp.arW);
        b.c(parcel, 20, googlehelp.arV);
        b.a(parcel, 23, googlehelp.asd, i, false);
        b.a(parcel, 22, googlehelp.asc);
        b.J(parcel, j);
    }

    private static GoogleHelp fb(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int l = 0;
        String s1 = null;
        Account account = null;
        android.os.Bundle bundle1 = null;
        boolean flag2 = false;
        boolean flag1 = false;
        java.util.ArrayList arraylist2 = null;
        android.os.Bundle bundle = null;
        Bitmap bitmap = null;
        byte abyte0[] = null;
        int k = 0;
        int j = 0;
        String s = null;
        Uri uri = null;
        java.util.ArrayList arraylist1 = null;
        int i = 0;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        ErrorReport errorreport = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(j1))
                {
                case 8: // '\b'
                case 9: // '\t'
                case 12: // '\f'
                case 13: // '\r'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, j1);
                    break;

                case 3: // '\003'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Account.CREATOR);
                    break;

                case 4: // '\004'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, j1);
                    break;

                case 5: // '\005'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.E(parcel, j1);
                    break;

                case 10: // '\n'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, j1);
                    break;

                case 11: // '\013'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Bitmap.CREATOR);
                    break;

                case 14: // '\016'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, j1);
                    break;

                case 15: // '\017'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 17: // '\021'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 16: // '\020'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, OverflowMenuItem.CREATOR);
                    break;

                case 19: // '\023'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, j1);
                    break;

                case 18: // '\022'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, OfflineSuggestion.CREATOR);
                    break;

                case 21: // '\025'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 20: // '\024'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 23: // '\027'
                    errorreport = (ErrorReport)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, ErrorReport.CREATOR);
                    break;

                case 22: // '\026'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GoogleHelp(l, s1, account, bundle1, flag2, flag1, arraylist2, bundle, bitmap, abyte0, k, j, s, uri, arraylist1, i, arraylist, flag, errorreport);
            }
        } while (true);
    }

    private static GoogleHelp[] hj(int i)
    {
        return new GoogleHelp[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fb(parcel);
    }

    public final Object[] newArray(int i)
    {
        return hj(i);
    }
}
