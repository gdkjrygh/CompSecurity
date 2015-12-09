// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.feedback:
//            ErrorReport, FileTeleporter

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ErrorReport errorreport, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, errorreport.versionCode);
        b.a(parcel, 2, errorreport.applicationErrorReport, i, false);
        b.a(parcel, 3, errorreport.description, false);
        b.c(parcel, 4, errorreport.packageVersion);
        b.a(parcel, 5, errorreport.packageVersionName, false);
        b.a(parcel, 6, errorreport.device, false);
        b.a(parcel, 7, errorreport.buildId, false);
        b.a(parcel, 8, errorreport.buildType, false);
        b.a(parcel, 9, errorreport.model, false);
        b.a(parcel, 10, errorreport.product, false);
        b.a(parcel, 11, errorreport.buildFingerprint, false);
        b.c(parcel, 12, errorreport.sdk_int);
        b.a(parcel, 13, errorreport.release, false);
        b.a(parcel, 14, errorreport.incremental, false);
        b.a(parcel, 15, errorreport.codename, false);
        b.a(parcel, 17, errorreport.brand, false);
        b.a(parcel, 16, errorreport.board, false);
        b.a(parcel, 19, errorreport.systemLog, false);
        b.a(parcel, 18, errorreport.runningApplications, false);
        b.a(parcel, 21, errorreport.anrStackTraces, false);
        b.a(parcel, 20, errorreport.eventLog, false);
        b.a(parcel, 23, errorreport.screenshotBytes, false);
        b.a(parcel, 22, errorreport.screenshot, false);
        b.c(parcel, 25, errorreport.screenshotWidth);
        b.c(parcel, 24, errorreport.screenshotHeight);
        b.c(parcel, 27, errorreport.networkType);
        b.c(parcel, 26, errorreport.phoneType);
        b.a(parcel, 29, errorreport.account, false);
        b.a(parcel, 28, errorreport.networkName, false);
        b.a(parcel, 31, errorreport.psdBundle, false);
        b.a(parcel, 30, errorreport.localeString, false);
        b.c(parcel, 34, errorreport.networkMnc);
        b.a(parcel, 35, errorreport.isCtlAllowed);
        b.a(parcel, 32, errorreport.isSilentSend);
        b.c(parcel, 33, errorreport.networkMcc);
        b.c(parcel, 38, errorreport.throwLineNumber);
        b.a(parcel, 39, errorreport.throwClassName, false);
        b.a(parcel, 36, errorreport.exceptionClassName, false);
        b.a(parcel, 37, errorreport.throwFileName, false);
        b.a(parcel, 42, errorreport.exceptionMessage, false);
        b.a(parcel, 43, errorreport.categoryTag, false);
        b.a(parcel, 40, errorreport.throwMethodName, false);
        b.a(parcel, 41, errorreport.stackTrace, false);
        b.a(parcel, 46, errorreport.bitmapTeleporter, i, false);
        b.a(parcel, 47, errorreport.screenshotPath, false);
        b.a(parcel, 44, errorreport.color, false);
        b.a(parcel, 45, errorreport.submittingPackageName, false);
        b.a(parcel, 51, errorreport.launcher, false);
        b.a(parcel, 50, errorreport.excludePii);
        b.a(parcel, 49, errorreport.psdFilePaths, false);
        b.a(parcel, 48, errorreport.fileTeleporterList, i, false);
        b.J(parcel, j);
    }

    private static ErrorReport dF(Parcel parcel)
    {
        int k2 = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int j2 = 0;
        ApplicationErrorReport applicationerrorreport = null;
        String s28 = null;
        int i2 = 0;
        String s27 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        String s21 = null;
        int l1 = 0;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        String s17 = null;
        String s16 = null;
        String as3[] = null;
        String as2[] = null;
        String as1[] = null;
        String s15 = null;
        String s14 = null;
        byte abyte0[] = null;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s13 = null;
        String s12 = null;
        String s11 = null;
        android.os.Bundle bundle = null;
        boolean flag2 = false;
        int k = 0;
        int j = 0;
        boolean flag1 = false;
        String s10 = null;
        String s9 = null;
        int i = 0;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        BitmapTeleporter bitmapteleporter = null;
        String s1 = null;
        FileTeleporter afileteleporter[] = null;
        String as[] = null;
        boolean flag = false;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k2)
            {
                int l2 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l2))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l2);
                    break;

                case 1: // '\001'
                    j2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 2: // '\002'
                    applicationerrorreport = (ApplicationErrorReport)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l2, ApplicationErrorReport.CREATOR);
                    break;

                case 3: // '\003'
                    s28 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 4: // '\004'
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 5: // '\005'
                    s27 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 6: // '\006'
                    s26 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 7: // '\007'
                    s25 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 8: // '\b'
                    s24 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 9: // '\t'
                    s23 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 10: // '\n'
                    s22 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 11: // '\013'
                    s21 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 13: // '\r'
                    s20 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 14: // '\016'
                    s19 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 15: // '\017'
                    s18 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 17: // '\021'
                    s16 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 16: // '\020'
                    s17 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 19: // '\023'
                    as2 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, l2);
                    break;

                case 18: // '\022'
                    as3 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, l2);
                    break;

                case 21: // '\025'
                    s15 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 20: // '\024'
                    as1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, l2);
                    break;

                case 23: // '\027'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, l2);
                    break;

                case 22: // '\026'
                    s14 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 25: // '\031'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 24: // '\030'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 27: // '\033'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 26: // '\032'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 29: // '\035'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 28: // '\034'
                    s13 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 31: // '\037'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l2);
                    break;

                case 30: // '\036'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 34: // '"'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 35: // '#'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l2);
                    break;

                case 32: // ' '
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l2);
                    break;

                case 33: // '!'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 38: // '&'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l2);
                    break;

                case 39: // '\''
                    s8 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 36: // '$'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 37: // '%'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 42: // '*'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 43: // '+'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 40: // '('
                    s7 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 41: // ')'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 46: // '.'
                    bitmapteleporter = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l2, BitmapTeleporter.CREATOR);
                    break;

                case 47: // '/'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 44: // ','
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 45: // '-'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 51: // '3'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l2);
                    break;

                case 50: // '2'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l2);
                    break;

                case 49: // '1'
                    as = com.google.android.gms.common.internal.safeparcel.a.B(parcel, l2);
                    break;

                case 48: // '0'
                    afileteleporter = (FileTeleporter[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l2, FileTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k2)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(k2).toString(), parcel);
            } else
            {
                return new ErrorReport(j2, applicationerrorreport, s28, i2, s27, s26, s25, s24, s23, s22, s21, l1, s20, s19, s18, s17, s16, as3, as2, as1, s15, s14, abyte0, k1, j1, i1, l, s13, s12, s11, bundle, flag2, k, j, flag1, s10, s9, i, s8, s7, s6, s5, s4, s3, s2, bitmapteleporter, s1, afileteleporter, as, flag, s);
            }
        } while (true);
    }

    private static ErrorReport[] fs(int i)
    {
        return new ErrorReport[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return dF(parcel);
    }

    public final Object[] newArray(int i)
    {
        return fs(i);
    }
}
