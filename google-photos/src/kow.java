// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;

public final class kow
    implements android.os.Parcelable.Creator
{

    public kow()
    {
    }

    public static void a(ErrorReport errorreport, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, errorreport.a);
        b.a(parcel, 2, errorreport.b, i, false);
        b.a(parcel, 3, errorreport.c, false);
        b.c(parcel, 4, errorreport.d);
        b.a(parcel, 5, errorreport.e, false);
        b.a(parcel, 6, errorreport.f, false);
        b.a(parcel, 7, errorreport.g, false);
        b.a(parcel, 8, errorreport.h, false);
        b.a(parcel, 9, errorreport.i, false);
        b.a(parcel, 10, errorreport.j, false);
        b.a(parcel, 11, errorreport.k, false);
        b.c(parcel, 12, errorreport.l);
        b.a(parcel, 13, errorreport.m, false);
        b.a(parcel, 14, errorreport.n, false);
        b.a(parcel, 15, errorreport.o, false);
        b.a(parcel, 17, errorreport.q, false);
        b.a(parcel, 16, errorreport.p, false);
        b.a(parcel, 19, errorreport.s, false);
        b.a(parcel, 18, errorreport.r, false);
        b.a(parcel, 21, errorreport.u, false);
        b.a(parcel, 20, errorreport.t, false);
        b.a(parcel, 23, errorreport.w, false);
        b.a(parcel, 22, errorreport.v, false);
        b.c(parcel, 25, errorreport.y);
        b.c(parcel, 24, errorreport.x);
        b.c(parcel, 27, errorreport.A);
        b.c(parcel, 26, errorreport.z);
        b.a(parcel, 29, errorreport.C, false);
        b.a(parcel, 28, errorreport.B, false);
        b.a(parcel, 31, errorreport.E, false);
        b.a(parcel, 30, errorreport.D, false);
        b.c(parcel, 34, errorreport.H);
        b.a(parcel, 35, errorreport.I);
        b.a(parcel, 32, errorreport.F);
        b.c(parcel, 33, errorreport.G);
        b.c(parcel, 38, errorreport.L);
        b.a(parcel, 39, errorreport.M, false);
        b.a(parcel, 36, errorreport.J, false);
        b.a(parcel, 37, errorreport.K, false);
        b.a(parcel, 42, errorreport.P, false);
        b.a(parcel, 43, errorreport.Q, false);
        b.a(parcel, 40, errorreport.N, false);
        b.a(parcel, 41, errorreport.O, false);
        b.a(parcel, 46, errorreport.T, i, false);
        b.a(parcel, 47, errorreport.U, false);
        b.a(parcel, 44, errorreport.R, false);
        b.a(parcel, 45, errorreport.S, false);
        b.a(parcel, 51, errorreport.Y, false);
        b.a(parcel, 50, errorreport.X);
        b.a(parcel, 49, errorreport.W, false);
        b.a(parcel, 48, errorreport.V, i, false);
        b.a(parcel, 55, errorreport.ac);
        b.a(parcel, 54, errorreport.ab, false);
        b.a(parcel, 53, errorreport.aa, i, false);
        b.a(parcel, 52, errorreport.Z, i, false);
        b.a(parcel, 56, errorreport.ad, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k2 = b.b(parcel);
        int j2 = 0;
        ApplicationErrorReport applicationerrorreport = null;
        String s29 = null;
        int i2 = 0;
        String s28 = null;
        String s27 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        int l1 = 0;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        String s17 = null;
        String as3[] = null;
        String as2[] = null;
        String as1[] = null;
        String s16 = null;
        String s15 = null;
        byte abyte0[] = null;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s14 = null;
        String s13 = null;
        String s12 = null;
        android.os.Bundle bundle1 = null;
        boolean flag3 = false;
        int k = 0;
        int j = 0;
        boolean flag2 = false;
        String s11 = null;
        String s10 = null;
        int i = 0;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        BitmapTeleporter bitmapteleporter = null;
        String s2 = null;
        FileTeleporter afileteleporter[] = null;
        String as[] = null;
        boolean flag1 = false;
        String s1 = null;
        ThemeSettings themesettings = null;
        LogOptions logoptions = null;
        String s = null;
        boolean flag = false;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < k2)
            {
                int l2 = parcel.readInt();
                switch (0xffff & l2)
                {
                default:
                    b.b(parcel, l2);
                    break;

                case 1: // '\001'
                    j2 = b.e(parcel, l2);
                    break;

                case 2: // '\002'
                    applicationerrorreport = (ApplicationErrorReport)b.a(parcel, l2, ApplicationErrorReport.CREATOR);
                    break;

                case 3: // '\003'
                    s29 = b.i(parcel, l2);
                    break;

                case 4: // '\004'
                    i2 = b.e(parcel, l2);
                    break;

                case 5: // '\005'
                    s28 = b.i(parcel, l2);
                    break;

                case 6: // '\006'
                    s27 = b.i(parcel, l2);
                    break;

                case 7: // '\007'
                    s26 = b.i(parcel, l2);
                    break;

                case 8: // '\b'
                    s25 = b.i(parcel, l2);
                    break;

                case 9: // '\t'
                    s24 = b.i(parcel, l2);
                    break;

                case 10: // '\n'
                    s23 = b.i(parcel, l2);
                    break;

                case 11: // '\013'
                    s22 = b.i(parcel, l2);
                    break;

                case 12: // '\f'
                    l1 = b.e(parcel, l2);
                    break;

                case 13: // '\r'
                    s21 = b.i(parcel, l2);
                    break;

                case 14: // '\016'
                    s20 = b.i(parcel, l2);
                    break;

                case 15: // '\017'
                    s19 = b.i(parcel, l2);
                    break;

                case 17: // '\021'
                    s17 = b.i(parcel, l2);
                    break;

                case 16: // '\020'
                    s18 = b.i(parcel, l2);
                    break;

                case 19: // '\023'
                    as2 = b.n(parcel, l2);
                    break;

                case 18: // '\022'
                    as3 = b.n(parcel, l2);
                    break;

                case 21: // '\025'
                    s16 = b.i(parcel, l2);
                    break;

                case 20: // '\024'
                    as1 = b.n(parcel, l2);
                    break;

                case 23: // '\027'
                    abyte0 = b.l(parcel, l2);
                    break;

                case 22: // '\026'
                    s15 = b.i(parcel, l2);
                    break;

                case 25: // '\031'
                    j1 = b.e(parcel, l2);
                    break;

                case 24: // '\030'
                    k1 = b.e(parcel, l2);
                    break;

                case 27: // '\033'
                    l = b.e(parcel, l2);
                    break;

                case 26: // '\032'
                    i1 = b.e(parcel, l2);
                    break;

                case 29: // '\035'
                    s13 = b.i(parcel, l2);
                    break;

                case 28: // '\034'
                    s14 = b.i(parcel, l2);
                    break;

                case 31: // '\037'
                    bundle1 = b.k(parcel, l2);
                    break;

                case 30: // '\036'
                    s12 = b.i(parcel, l2);
                    break;

                case 34: // '"'
                    j = b.e(parcel, l2);
                    break;

                case 35: // '#'
                    flag2 = b.c(parcel, l2);
                    break;

                case 32: // ' '
                    flag3 = b.c(parcel, l2);
                    break;

                case 33: // '!'
                    k = b.e(parcel, l2);
                    break;

                case 38: // '&'
                    i = b.e(parcel, l2);
                    break;

                case 39: // '\''
                    s9 = b.i(parcel, l2);
                    break;

                case 36: // '$'
                    s11 = b.i(parcel, l2);
                    break;

                case 37: // '%'
                    s10 = b.i(parcel, l2);
                    break;

                case 42: // '*'
                    s6 = b.i(parcel, l2);
                    break;

                case 43: // '+'
                    s5 = b.i(parcel, l2);
                    break;

                case 40: // '('
                    s8 = b.i(parcel, l2);
                    break;

                case 41: // ')'
                    s7 = b.i(parcel, l2);
                    break;

                case 46: // '.'
                    bitmapteleporter = (BitmapTeleporter)b.a(parcel, l2, BitmapTeleporter.CREATOR);
                    break;

                case 47: // '/'
                    s2 = b.i(parcel, l2);
                    break;

                case 44: // ','
                    s4 = b.i(parcel, l2);
                    break;

                case 45: // '-'
                    s3 = b.i(parcel, l2);
                    break;

                case 51: // '3'
                    s1 = b.i(parcel, l2);
                    break;

                case 50: // '2'
                    flag1 = b.c(parcel, l2);
                    break;

                case 49: // '1'
                    as = b.n(parcel, l2);
                    break;

                case 48: // '0'
                    afileteleporter = (FileTeleporter[])b.b(parcel, l2, FileTeleporter.CREATOR);
                    break;

                case 55: // '7'
                    flag = b.c(parcel, l2);
                    break;

                case 54: // '6'
                    s = b.i(parcel, l2);
                    break;

                case 53: // '5'
                    logoptions = (LogOptions)b.a(parcel, l2, LogOptions.CREATOR);
                    break;

                case 52: // '4'
                    themesettings = (ThemeSettings)b.a(parcel, l2, ThemeSettings.CREATOR);
                    break;

                case 56: // '8'
                    bundle = b.k(parcel, l2);
                    break;
                }
            } else
            if (parcel.dataPosition() != k2)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(k2).toString(), parcel);
            } else
            {
                return new ErrorReport(j2, applicationerrorreport, s29, i2, s28, s27, s26, s25, s24, s23, s22, l1, s21, s20, s19, s18, s17, as3, as2, as1, s16, s15, abyte0, k1, j1, i1, l, s14, s13, s12, bundle1, flag3, k, j, flag2, s11, s10, i, s9, s8, s7, s6, s5, s4, s3, bitmapteleporter, s2, afileteleporter, as, flag1, s1, themesettings, logoptions, s, flag, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ErrorReport[i];
    }
}
