// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.RectF;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.feedback:
//            ErrorReport, FileTeleporter, LogOptions, ThemeSettings

public final class ErrorReportCreator
    implements android.os.Parcelable.Creator
{

    public ErrorReportCreator()
    {
    }

    static void writeToParcel(ErrorReport errorreport, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, errorreport.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, errorreport.applicationErrorReport, i, false);
        SafeParcelWriter.writeString(parcel, 3, errorreport.description, false);
        SafeParcelWriter.writeInt(parcel, 4, errorreport.packageVersion);
        SafeParcelWriter.writeString(parcel, 5, errorreport.packageVersionName, false);
        SafeParcelWriter.writeString(parcel, 6, errorreport.device, false);
        SafeParcelWriter.writeString(parcel, 7, errorreport.buildId, false);
        SafeParcelWriter.writeString(parcel, 8, errorreport.buildType, false);
        SafeParcelWriter.writeString(parcel, 9, errorreport.model, false);
        SafeParcelWriter.writeString(parcel, 10, errorreport.product, false);
        SafeParcelWriter.writeString(parcel, 11, errorreport.buildFingerprint, false);
        SafeParcelWriter.writeInt(parcel, 12, errorreport.sdk_int);
        SafeParcelWriter.writeString(parcel, 13, errorreport.release, false);
        SafeParcelWriter.writeString(parcel, 14, errorreport.incremental, false);
        SafeParcelWriter.writeString(parcel, 15, errorreport.codename, false);
        SafeParcelWriter.writeString(parcel, 17, errorreport.brand, false);
        SafeParcelWriter.writeString(parcel, 16, errorreport.board, false);
        SafeParcelWriter.writeStringArray(parcel, 19, errorreport.systemLog, false);
        SafeParcelWriter.writeStringArray(parcel, 18, errorreport.runningApplications, false);
        SafeParcelWriter.writeString(parcel, 21, errorreport.anrStackTraces, false);
        SafeParcelWriter.writeStringArray(parcel, 20, errorreport.eventLog, false);
        SafeParcelWriter.writeByteArray(parcel, 23, errorreport.screenshotBytes, false);
        SafeParcelWriter.writeString(parcel, 22, errorreport.screenshot, false);
        SafeParcelWriter.writeInt(parcel, 25, errorreport.screenshotWidth);
        SafeParcelWriter.writeInt(parcel, 24, errorreport.screenshotHeight);
        SafeParcelWriter.writeInt(parcel, 27, errorreport.networkType);
        SafeParcelWriter.writeInt(parcel, 26, errorreport.phoneType);
        SafeParcelWriter.writeString(parcel, 29, errorreport.account, false);
        SafeParcelWriter.writeString(parcel, 28, errorreport.networkName, false);
        SafeParcelWriter.writeBundle(parcel, 31, errorreport.psdBundle, false);
        SafeParcelWriter.writeString(parcel, 30, errorreport.localeString, false);
        SafeParcelWriter.writeInt(parcel, 34, errorreport.networkMnc);
        SafeParcelWriter.writeBoolean(parcel, 35, errorreport.isCtlAllowed);
        SafeParcelWriter.writeBoolean(parcel, 32, errorreport.isSilentSend);
        SafeParcelWriter.writeInt(parcel, 33, errorreport.networkMcc);
        SafeParcelWriter.writeInt(parcel, 38, errorreport.throwLineNumber);
        SafeParcelWriter.writeString(parcel, 39, errorreport.throwClassName, false);
        SafeParcelWriter.writeString(parcel, 36, errorreport.exceptionClassName, false);
        SafeParcelWriter.writeString(parcel, 37, errorreport.throwFileName, false);
        SafeParcelWriter.writeString(parcel, 42, errorreport.exceptionMessage, false);
        SafeParcelWriter.writeString(parcel, 43, errorreport.categoryTag, false);
        SafeParcelWriter.writeString(parcel, 40, errorreport.throwMethodName, false);
        SafeParcelWriter.writeString(parcel, 41, errorreport.stackTrace, false);
        SafeParcelWriter.writeParcelable(parcel, 46, errorreport.bitmapTeleporter, i, false);
        SafeParcelWriter.writeString(parcel, 47, errorreport.screenshotPath, false);
        SafeParcelWriter.writeString(parcel, 44, errorreport.color, false);
        SafeParcelWriter.writeString(parcel, 45, errorreport.submittingPackageName, false);
        SafeParcelWriter.writeString(parcel, 51, errorreport.launcher, false);
        SafeParcelWriter.writeBoolean(parcel, 50, errorreport.excludePii);
        SafeParcelWriter.writeStringArray(parcel, 49, errorreport.psdFilePaths, false);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 48, errorreport.fileTeleporterList, i);
        SafeParcelWriter.writeBoolean(parcel, 55, errorreport.suggestionShown);
        SafeParcelWriter.writeString(parcel, 54, errorreport.suggestionSessionId, false);
        SafeParcelWriter.writeParcelable(parcel, 53, errorreport.logOptions, i, false);
        SafeParcelWriter.writeParcelable(parcel, 52, errorreport.themeSettings, i, false);
        SafeParcelWriter.writeTypedList(parcel, 57, errorreport.highlightBounds, false);
        SafeParcelWriter.writeBundle(parcel, 56, errorreport.classificationSignals, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k2 = SafeParcelReader.validateObjectHeader(parcel);
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
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < k2)
            {
                int l2 = parcel.readInt();
                switch (0xffff & l2)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l2);
                    break;

                case 1: // '\001'
                    j2 = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 2: // '\002'
                    applicationerrorreport = (ApplicationErrorReport)SafeParcelReader.createParcelable(parcel, l2, ApplicationErrorReport.CREATOR);
                    break;

                case 3: // '\003'
                    s29 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 4: // '\004'
                    i2 = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 5: // '\005'
                    s28 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 6: // '\006'
                    s27 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 7: // '\007'
                    s26 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 8: // '\b'
                    s25 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 9: // '\t'
                    s24 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 10: // '\n'
                    s23 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 11: // '\013'
                    s22 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 12: // '\f'
                    l1 = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 13: // '\r'
                    s21 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 14: // '\016'
                    s20 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 15: // '\017'
                    s19 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 17: // '\021'
                    s17 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 16: // '\020'
                    s18 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 19: // '\023'
                    as2 = SafeParcelReader.createStringArray(parcel, l2);
                    break;

                case 18: // '\022'
                    as3 = SafeParcelReader.createStringArray(parcel, l2);
                    break;

                case 21: // '\025'
                    s16 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 20: // '\024'
                    as1 = SafeParcelReader.createStringArray(parcel, l2);
                    break;

                case 23: // '\027'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l2);
                    break;

                case 22: // '\026'
                    s15 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 25: // '\031'
                    j1 = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 24: // '\030'
                    k1 = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 27: // '\033'
                    l = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 26: // '\032'
                    i1 = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 29: // '\035'
                    s13 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 28: // '\034'
                    s14 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 31: // '\037'
                    bundle1 = SafeParcelReader.createBundle(parcel, l2);
                    break;

                case 30: // '\036'
                    s12 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 34: // '"'
                    j = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 35: // '#'
                    flag2 = SafeParcelReader.readBoolean(parcel, l2);
                    break;

                case 32: // ' '
                    flag3 = SafeParcelReader.readBoolean(parcel, l2);
                    break;

                case 33: // '!'
                    k = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 38: // '&'
                    i = SafeParcelReader.readInt(parcel, l2);
                    break;

                case 39: // '\''
                    s9 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 36: // '$'
                    s11 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 37: // '%'
                    s10 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 42: // '*'
                    s6 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 43: // '+'
                    s5 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 40: // '('
                    s8 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 41: // ')'
                    s7 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 46: // '.'
                    bitmapteleporter = (BitmapTeleporter)SafeParcelReader.createParcelable(parcel, l2, BitmapTeleporter.CREATOR);
                    break;

                case 47: // '/'
                    s2 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 44: // ','
                    s4 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 45: // '-'
                    s3 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 51: // '3'
                    s1 = SafeParcelReader.createString(parcel, l2);
                    break;

                case 50: // '2'
                    flag1 = SafeParcelReader.readBoolean(parcel, l2);
                    break;

                case 49: // '1'
                    as = SafeParcelReader.createStringArray(parcel, l2);
                    break;

                case 48: // '0'
                    afileteleporter = (FileTeleporter[])SafeParcelReader.createTypedArray(parcel, l2, FileTeleporter.CREATOR);
                    break;

                case 55: // '7'
                    flag = SafeParcelReader.readBoolean(parcel, l2);
                    break;

                case 54: // '6'
                    s = SafeParcelReader.createString(parcel, l2);
                    break;

                case 53: // '5'
                    logoptions = (LogOptions)SafeParcelReader.createParcelable(parcel, l2, LogOptions.CREATOR);
                    break;

                case 52: // '4'
                    themesettings = (ThemeSettings)SafeParcelReader.createParcelable(parcel, l2, ThemeSettings.CREATOR);
                    break;

                case 57: // '9'
                    arraylist = SafeParcelReader.createTypedList(parcel, l2, RectF.CREATOR);
                    break;

                case 56: // '8'
                    bundle = SafeParcelReader.createBundle(parcel, l2);
                    break;
                }
            } else
            if (parcel.dataPosition() != k2)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k2).toString(), parcel);
            } else
            {
                return new ErrorReport(j2, applicationerrorreport, s29, i2, s28, s27, s26, s25, s24, s23, s22, l1, s21, s20, s19, s18, s17, as3, as2, as1, s16, s15, abyte0, k1, j1, i1, l, s14, s13, s12, bundle1, flag3, k, j, flag2, s11, s10, i, s9, s8, s7, s6, s5, s4, s3, bitmapteleporter, s2, afileteleporter, as, flag1, s1, themesettings, logoptions, s, flag, bundle, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ErrorReport[i];
    }
}
