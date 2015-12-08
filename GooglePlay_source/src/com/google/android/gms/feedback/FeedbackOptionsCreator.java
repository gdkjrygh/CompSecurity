// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.feedback:
//            FeedbackOptions, FileTeleporter, ThemeSettings, LogOptions

public final class FeedbackOptionsCreator
    implements android.os.Parcelable.Creator
{

    public FeedbackOptionsCreator()
    {
    }

    static void writeToParcel(FeedbackOptions feedbackoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, feedbackoptions.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, feedbackoptions.mAccountInUse, false);
        SafeParcelWriter.writeBundle(parcel, 3, feedbackoptions.mPsdBundle, false);
        SafeParcelWriter.writeString(parcel, 5, feedbackoptions.mDescription, false);
        SafeParcelWriter.writeParcelable(parcel, 6, feedbackoptions.mApplicationErrorReport, i, false);
        SafeParcelWriter.writeString(parcel, 7, feedbackoptions.mCategoryTag, false);
        SafeParcelWriter.writeParcelable(parcel, 8, feedbackoptions.mBitmapTeleporter, i, false);
        SafeParcelWriter.writeString(parcel, 9, feedbackoptions.mPackageName, false);
        SafeParcelWriter.writeTypedList(parcel, 10, feedbackoptions.mFileTeleporters, false);
        SafeParcelWriter.writeBoolean(parcel, 11, feedbackoptions.mExcludePii);
        SafeParcelWriter.writeParcelable(parcel, 12, feedbackoptions.mThemeSettings, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, feedbackoptions.mLogOptions, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s3 = null;
        android.os.Bundle bundle = null;
        String s2 = null;
        ApplicationErrorReport applicationerrorreport = null;
        String s1 = null;
        BitmapTeleporter bitmapteleporter = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        ThemeSettings themesettings = null;
        LogOptions logoptions = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 4: // '\004'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    applicationerrorreport = (ApplicationErrorReport)SafeParcelReader.createParcelable(parcel, k, ApplicationErrorReport.CREATOR);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    bitmapteleporter = (BitmapTeleporter)SafeParcelReader.createParcelable(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, FileTeleporter.CREATOR);
                    break;

                case 11: // '\013'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 12: // '\f'
                    themesettings = (ThemeSettings)SafeParcelReader.createParcelable(parcel, k, ThemeSettings.CREATOR);
                    break;

                case 13: // '\r'
                    logoptions = (LogOptions)SafeParcelReader.createParcelable(parcel, k, LogOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FeedbackOptions(i, s3, bundle, s2, applicationerrorreport, s1, bitmapteleporter, s, arraylist, flag, themesettings, logoptions);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FeedbackOptions[i];
    }
}
