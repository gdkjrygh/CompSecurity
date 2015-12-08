// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

public final class kpw
    implements android.os.Parcelable.Creator
{

    public kpw()
    {
    }

    public static void a(GoogleHelp googlehelp, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, googlehelp.a);
        b.a(parcel, 2, googlehelp.b, false);
        b.a(parcel, 3, googlehelp.c, i, false);
        b.a(parcel, 4, googlehelp.d, false);
        b.a(parcel, 5, googlehelp.h);
        b.a(parcel, 6, googlehelp.i);
        b.b(parcel, 7, googlehelp.j, false);
        b.a(parcel, 10, googlehelp.k, false);
        b.a(parcel, 11, googlehelp.l, i, false);
        b.a(parcel, 14, googlehelp.p, false);
        b.a(parcel, 15, googlehelp.q, i, false);
        b.c(parcel, 17, 0);
        b.c(parcel, 16, googlehelp.r, false);
        b.a(parcel, 19, googlehelp.m, false);
        b.c(parcel, 18, googlehelp.t, false);
        b.c(parcel, 21, googlehelp.o);
        b.c(parcel, 20, googlehelp.n);
        b.a(parcel, 23, googlehelp.v, i, false);
        b.a(parcel, 22, googlehelp.u);
        b.a(parcel, 25, googlehelp.s, i, false);
        b.c(parcel, 29, googlehelp.f);
        b.a(parcel, 28, googlehelp.e, false);
        b.a(parcel, 31, googlehelp.w, i, false);
        b.c(parcel, 30, googlehelp.g);
        b.c(parcel, 32, googlehelp.x);
        b.a(parcel, 33, googlehelp.y, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l1 = b.b(parcel);
        int k1 = 0;
        String s2 = null;
        Account account = null;
        android.os.Bundle bundle1 = null;
        String s1 = null;
        int j1 = 0;
        int i1 = 0;
        boolean flag2 = false;
        boolean flag1 = false;
        java.util.ArrayList arraylist2 = null;
        android.os.Bundle bundle = null;
        Bitmap bitmap = null;
        byte abyte0[] = null;
        int l = 0;
        int k = 0;
        String s = null;
        Uri uri = null;
        java.util.ArrayList arraylist1 = null;
        int j = 0;
        ThemeSettings themesettings = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        ErrorReport errorreport = null;
        TogglingData togglingdata = null;
        int i = 0;
        PendingIntent pendingintent = null;
        do
        {
            if (parcel.dataPosition() < l1)
            {
                int i2 = parcel.readInt();
                switch (0xffff & i2)
                {
                case 8: // '\b'
                case 9: // '\t'
                case 12: // '\f'
                case 13: // '\r'
                case 24: // '\030'
                case 26: // '\032'
                case 27: // '\033'
                default:
                    b.b(parcel, i2);
                    break;

                case 1: // '\001'
                    k1 = b.e(parcel, i2);
                    break;

                case 2: // '\002'
                    s2 = b.i(parcel, i2);
                    break;

                case 3: // '\003'
                    account = (Account)b.a(parcel, i2, Account.CREATOR);
                    break;

                case 4: // '\004'
                    bundle1 = b.k(parcel, i2);
                    break;

                case 5: // '\005'
                    flag2 = b.c(parcel, i2);
                    break;

                case 6: // '\006'
                    flag1 = b.c(parcel, i2);
                    break;

                case 7: // '\007'
                    arraylist2 = b.p(parcel, i2);
                    break;

                case 10: // '\n'
                    bundle = b.k(parcel, i2);
                    break;

                case 11: // '\013'
                    bitmap = (Bitmap)b.a(parcel, i2, Bitmap.CREATOR);
                    break;

                case 14: // '\016'
                    s = b.i(parcel, i2);
                    break;

                case 15: // '\017'
                    uri = (Uri)b.a(parcel, i2, Uri.CREATOR);
                    break;

                case 17: // '\021'
                    j = b.e(parcel, i2);
                    break;

                case 16: // '\020'
                    arraylist1 = b.c(parcel, i2, OverflowMenuItem.CREATOR);
                    break;

                case 19: // '\023'
                    abyte0 = b.l(parcel, i2);
                    break;

                case 18: // '\022'
                    arraylist = b.c(parcel, i2, OfflineSuggestion.CREATOR);
                    break;

                case 21: // '\025'
                    k = b.e(parcel, i2);
                    break;

                case 20: // '\024'
                    l = b.e(parcel, i2);
                    break;

                case 23: // '\027'
                    errorreport = (ErrorReport)b.a(parcel, i2, ErrorReport.CREATOR);
                    break;

                case 22: // '\026'
                    flag = b.c(parcel, i2);
                    break;

                case 25: // '\031'
                    themesettings = (ThemeSettings)b.a(parcel, i2, ThemeSettings.CREATOR);
                    break;

                case 29: // '\035'
                    j1 = b.e(parcel, i2);
                    break;

                case 28: // '\034'
                    s1 = b.i(parcel, i2);
                    break;

                case 31: // '\037'
                    togglingdata = (TogglingData)b.a(parcel, i2, TogglingData.CREATOR);
                    break;

                case 30: // '\036'
                    i1 = b.e(parcel, i2);
                    break;

                case 32: // ' '
                    i = b.e(parcel, i2);
                    break;

                case 33: // '!'
                    pendingintent = (PendingIntent)b.a(parcel, i2, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l1)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(l1).toString(), parcel);
            } else
            {
                return new GoogleHelp(k1, s2, account, bundle1, s1, j1, i1, flag2, flag1, arraylist2, bundle, bitmap, abyte0, l, k, s, uri, arraylist1, j, themesettings, arraylist, flag, errorreport, togglingdata, i, pendingintent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GoogleHelp[i];
    }
}
