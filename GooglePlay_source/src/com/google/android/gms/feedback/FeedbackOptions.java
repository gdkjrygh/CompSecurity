// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.feedback:
//            FeedbackOptionsCreator, LogOptions, ThemeSettings

public class FeedbackOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private ArrayList mFileTeleporters;
        private Bundle mPsdBundle;
        public Bitmap mScreenshot;

        public final FeedbackOptions build()
        {
            return FeedbackOptions.access$100(new FeedbackOptions((byte)0), mScreenshot).mAccountInUse = null.mDescription = null.mPsdBundle = mPsdBundle.mCategoryTag = null.mFileTeleporters = mFileTeleporters.mExcludePii = false.mThemeSettings = null.mLogOptions = null;
        }

        public Builder()
        {
            mPsdBundle = new Bundle();
            mFileTeleporters = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new FeedbackOptionsCreator();
    public String mAccountInUse;
    public ApplicationErrorReport mApplicationErrorReport;
    public BitmapTeleporter mBitmapTeleporter;
    public String mCategoryTag;
    public String mDescription;
    public boolean mExcludePii;
    public ArrayList mFileTeleporters;
    public LogOptions mLogOptions;
    public String mPackageName;
    public Bundle mPsdBundle;
    public ThemeSettings mThemeSettings;
    public final int mVersionCode;

    private FeedbackOptions()
    {
        this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
    }

    FeedbackOptions(byte byte0)
    {
        this();
    }

    FeedbackOptions(int i, String s, Bundle bundle, String s1, ApplicationErrorReport applicationerrorreport, String s2, BitmapTeleporter bitmapteleporter, 
            String s3, ArrayList arraylist, boolean flag, ThemeSettings themesettings, LogOptions logoptions)
    {
        mVersionCode = i;
        mAccountInUse = s;
        mPsdBundle = bundle;
        mDescription = s1;
        mApplicationErrorReport = applicationerrorreport;
        mCategoryTag = s2;
        mBitmapTeleporter = bitmapteleporter;
        mPackageName = s3;
        mFileTeleporters = arraylist;
        mExcludePii = flag;
        mThemeSettings = themesettings;
        mLogOptions = logoptions;
    }

    public int describeContents()
    {
        return 0;
    }

    public final android.app.ApplicationErrorReport.CrashInfo getCrashInfo()
    {
        if (mApplicationErrorReport == null)
        {
            return null;
        } else
        {
            return mApplicationErrorReport.crashInfo;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FeedbackOptionsCreator.writeToParcel(this, parcel, i);
    }



/*
    static FeedbackOptions access$100(FeedbackOptions feedbackoptions, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            feedbackoptions.mBitmapTeleporter = new BitmapTeleporter(bitmap);
        }
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$200(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.mAccountInUse = null;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$300(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.mDescription = null;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$400(FeedbackOptions feedbackoptions, Bundle bundle)
    {
        feedbackoptions.mPsdBundle = bundle;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$500(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.mCategoryTag = null;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$600(FeedbackOptions feedbackoptions, ArrayList arraylist)
    {
        feedbackoptions.mFileTeleporters = arraylist;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$700(FeedbackOptions feedbackoptions, boolean flag)
    {
        feedbackoptions.mExcludePii = false;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$800(FeedbackOptions feedbackoptions, ThemeSettings themesettings)
    {
        feedbackoptions.mThemeSettings = null;
        return feedbackoptions;
    }

*/


/*
    static FeedbackOptions access$900(FeedbackOptions feedbackoptions, LogOptions logoptions)
    {
        feedbackoptions.mLogOptions = null;
        return feedbackoptions;
    }

*/
}
