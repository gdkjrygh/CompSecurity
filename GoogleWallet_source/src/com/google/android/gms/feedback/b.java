// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.feedback:
//            FeedbackOptions, FileTeleporter

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(FeedbackOptions feedbackoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, feedbackoptions.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, feedbackoptions.mAccountInUse, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, feedbackoptions.mPsdBundle, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, feedbackoptions.mPrimaryThemeColor, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, feedbackoptions.mDescription, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, feedbackoptions.mApplicationErrorReport, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, feedbackoptions.mCategoryTag, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, feedbackoptions.mBitmapTeleporter, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, feedbackoptions.mPackageName, false);
        com.google.android.gms.common.internal.safeparcel.b.d(parcel, 10, feedbackoptions.mFileTeleporters, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, feedbackoptions.mExcludePii);
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, j);
    }

    private static FeedbackOptions dG(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        BitmapTeleporter bitmapteleporter = null;
        String s1 = null;
        ApplicationErrorReport applicationerrorreport = null;
        String s2 = null;
        String s3 = null;
        android.os.Bundle bundle = null;
        String s4 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.r(parcel, k);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 6: // '\006'
                    applicationerrorreport = (ApplicationErrorReport)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ApplicationErrorReport.CREATOR);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 8: // '\b'
                    bitmapteleporter = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, FileTeleporter.CREATOR);
                    break;

                case 11: // '\013'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new FeedbackOptions(i, s4, bundle, s3, s2, applicationerrorreport, s1, bitmapteleporter, s, arraylist, flag);
            }
        } while (true);
    }

    private static FeedbackOptions[] ft(int i)
    {
        return new FeedbackOptions[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return dG(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ft(i);
    }
}
