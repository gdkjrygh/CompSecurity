// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;

public final class kox
    implements android.os.Parcelable.Creator
{

    public kox()
    {
    }

    public static void a(FeedbackOptions feedbackoptions, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, feedbackoptions.a);
        b.a(parcel, 2, feedbackoptions.b, false);
        b.a(parcel, 3, feedbackoptions.c, false);
        b.a(parcel, 5, feedbackoptions.d, false);
        b.a(parcel, 6, feedbackoptions.e, i, false);
        b.a(parcel, 7, feedbackoptions.f, false);
        b.a(parcel, 8, feedbackoptions.g, i, false);
        b.a(parcel, 9, feedbackoptions.h, false);
        b.c(parcel, 10, feedbackoptions.i, false);
        b.a(parcel, 11, feedbackoptions.j);
        b.a(parcel, 12, feedbackoptions.k, i, false);
        b.a(parcel, 13, feedbackoptions.l, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
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
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = b.i(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = b.k(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = b.i(parcel, k);
                    break;

                case 6: // '\006'
                    applicationerrorreport = (ApplicationErrorReport)b.a(parcel, k, ApplicationErrorReport.CREATOR);
                    break;

                case 7: // '\007'
                    s1 = b.i(parcel, k);
                    break;

                case 8: // '\b'
                    bitmapteleporter = (BitmapTeleporter)b.a(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 9: // '\t'
                    s = b.i(parcel, k);
                    break;

                case 10: // '\n'
                    arraylist = b.c(parcel, k, FileTeleporter.CREATOR);
                    break;

                case 11: // '\013'
                    flag = b.c(parcel, k);
                    break;

                case 12: // '\f'
                    themesettings = (ThemeSettings)b.a(parcel, k, ThemeSettings.CREATOR);
                    break;

                case 13: // '\r'
                    logoptions = (LogOptions)b.a(parcel, k, LogOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FeedbackOptions(i, s3, bundle, s2, applicationerrorreport, s1, bitmapteleporter, s, arraylist, flag, themesettings, logoptions);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new FeedbackOptions[i];
    }
}
