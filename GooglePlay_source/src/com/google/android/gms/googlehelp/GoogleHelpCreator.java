// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

// Referenced classes of package com.google.android.gms.googlehelp:
//            GoogleHelp, OfflineSuggestion

public final class GoogleHelpCreator
    implements android.os.Parcelable.Creator
{

    public GoogleHelpCreator()
    {
    }

    static void writeToParcel(GoogleHelp googlehelp, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, googlehelp.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, googlehelp.mHelpCenterContext, false);
        SafeParcelWriter.writeParcelable(parcel, 3, googlehelp.mGoogleAccount, i, false);
        SafeParcelWriter.writeBundle(parcel, 4, googlehelp.mPsdBundle, false);
        SafeParcelWriter.writeBoolean(parcel, 5, googlehelp.mSearchEnabled);
        SafeParcelWriter.writeBoolean(parcel, 6, googlehelp.mMetricsReportingEnabled);
        SafeParcelWriter.writeStringList(parcel, 7, googlehelp.mSupportPhoneNumbers, false);
        SafeParcelWriter.writeBundle(parcel, 10, googlehelp.mFeedbackPsdBundle, false);
        SafeParcelWriter.writeParcelable(parcel, 11, googlehelp.mBackupScreenshot, i, false);
        SafeParcelWriter.writeString(parcel, 14, googlehelp.mApiDebugOption, false);
        SafeParcelWriter.writeParcelable(parcel, 15, googlehelp.mFallbackSupportUri, i, false);
        SafeParcelWriter.writeInt(parcel, 17, 0);
        SafeParcelWriter.writeTypedList(parcel, 16, googlehelp.mOverflowMenuItems, false);
        SafeParcelWriter.writeByteArray(parcel, 19, googlehelp.mScreenshotBytes, false);
        SafeParcelWriter.writeTypedList(parcel, 18, googlehelp.mOfflineSuggestions, false);
        SafeParcelWriter.writeInt(parcel, 21, googlehelp.mScreenshotHeight);
        SafeParcelWriter.writeInt(parcel, 20, googlehelp.mScreenshotWidth);
        SafeParcelWriter.writeParcelable(parcel, 23, googlehelp.mFeedbackErrorReport, i, false);
        SafeParcelWriter.writeBoolean(parcel, 22, googlehelp.mShowContactCardFirst);
        SafeParcelWriter.writeParcelable(parcel, 25, googlehelp.mThemeSettings, i, false);
        SafeParcelWriter.writeInt(parcel, 29, googlehelp.mAppLabelResId);
        SafeParcelWriter.writeString(parcel, 28, googlehelp.mCallingPackageName, false);
        SafeParcelWriter.writeParcelable(parcel, 31, googlehelp.mTogglingData, i, false);
        SafeParcelWriter.writeInt(parcel, 30, googlehelp.mAppIconResId);
        SafeParcelWriter.writeInt(parcel, 32, googlehelp.mPipInitPos);
        SafeParcelWriter.writeParcelable(parcel, 33, googlehelp.mCustomFeedbackPendingIntent, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l1 = SafeParcelReader.validateObjectHeader(parcel);
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
                    SafeParcelReader.skipUnknownField(parcel, i2);
                    break;

                case 1: // '\001'
                    k1 = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, i2);
                    break;

                case 3: // '\003'
                    account = (Account)SafeParcelReader.createParcelable(parcel, i2, Account.CREATOR);
                    break;

                case 4: // '\004'
                    bundle1 = SafeParcelReader.createBundle(parcel, i2);
                    break;

                case 5: // '\005'
                    flag2 = SafeParcelReader.readBoolean(parcel, i2);
                    break;

                case 6: // '\006'
                    flag1 = SafeParcelReader.readBoolean(parcel, i2);
                    break;

                case 7: // '\007'
                    arraylist2 = SafeParcelReader.createStringList(parcel, i2);
                    break;

                case 10: // '\n'
                    bundle = SafeParcelReader.createBundle(parcel, i2);
                    break;

                case 11: // '\013'
                    bitmap = (Bitmap)SafeParcelReader.createParcelable(parcel, i2, Bitmap.CREATOR);
                    break;

                case 14: // '\016'
                    s = SafeParcelReader.createString(parcel, i2);
                    break;

                case 15: // '\017'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, i2, Uri.CREATOR);
                    break;

                case 17: // '\021'
                    j = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 16: // '\020'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, i2, OverflowMenuItem.CREATOR);
                    break;

                case 19: // '\023'
                    abyte0 = SafeParcelReader.createByteArray(parcel, i2);
                    break;

                case 18: // '\022'
                    arraylist = SafeParcelReader.createTypedList(parcel, i2, OfflineSuggestion.CREATOR);
                    break;

                case 21: // '\025'
                    k = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 20: // '\024'
                    l = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 23: // '\027'
                    errorreport = (ErrorReport)SafeParcelReader.createParcelable(parcel, i2, ErrorReport.CREATOR);
                    break;

                case 22: // '\026'
                    flag = SafeParcelReader.readBoolean(parcel, i2);
                    break;

                case 25: // '\031'
                    themesettings = (ThemeSettings)SafeParcelReader.createParcelable(parcel, i2, ThemeSettings.CREATOR);
                    break;

                case 29: // '\035'
                    j1 = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 28: // '\034'
                    s1 = SafeParcelReader.createString(parcel, i2);
                    break;

                case 31: // '\037'
                    togglingdata = (TogglingData)SafeParcelReader.createParcelable(parcel, i2, TogglingData.CREATOR);
                    break;

                case 30: // '\036'
                    i1 = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 32: // ' '
                    i = SafeParcelReader.readInt(parcel, i2);
                    break;

                case 33: // '!'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, i2, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l1).toString(), parcel);
            } else
            {
                return new GoogleHelp(k1, s2, account, bundle1, s1, j1, i1, flag2, flag1, arraylist2, bundle, bitmap, abyte0, l, k, s, uri, arraylist1, j, themesettings, arraylist, flag, errorreport, togglingdata, i, pendingintent);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleHelp[i];
    }
}
