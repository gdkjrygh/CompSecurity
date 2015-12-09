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
//            b

public class FeedbackOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private Bitmap afS;
        private String mAccountInUse;
        private String mCategoryTag;
        private String mDescription;
        private boolean mExcludePii;
        private ArrayList mFileTeleporters;
        private String mPrimaryThemeColor;
        private Bundle mPsdBundle;

        public final Builder addPsdBundle(Bundle bundle)
        {
            if (bundle != null)
            {
                mPsdBundle.putAll(bundle);
            }
            return this;
        }

        public final FeedbackOptions build()
        {
            return FeedbackOptions.a(FeedbackOptions.a(FeedbackOptions.d(FeedbackOptions.c(FeedbackOptions.a(FeedbackOptions.b(FeedbackOptions.a(FeedbackOptions.a(new FeedbackOptions(), afS), mAccountInUse), mDescription), mPsdBundle), mPrimaryThemeColor), mCategoryTag), mFileTeleporters), mExcludePii);
        }

        public final Builder setAccountInUse(String s1)
        {
            mAccountInUse = s1;
            return this;
        }

        public final Builder setCategoryTag(String s1)
        {
            mCategoryTag = s1;
            return this;
        }

        public final Builder setDescription(String s1)
        {
            mDescription = s1;
            return this;
        }

        public Builder()
        {
            mPsdBundle = new Bundle();
            mFileTeleporters = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final int VERSION_CODE = 1;
    public String mAccountInUse;
    public ApplicationErrorReport mApplicationErrorReport;
    public BitmapTeleporter mBitmapTeleporter;
    public String mCategoryTag;
    public String mDescription;
    public boolean mExcludePii;
    public ArrayList mFileTeleporters;
    public String mPackageName;
    public String mPrimaryThemeColor;
    public Bundle mPsdBundle;
    public final int mVersionCode;

    private FeedbackOptions()
    {
        this(1, null, null, null, null, new ApplicationErrorReport(), null, null, null, null, true);
    }

    FeedbackOptions(int i, String s1, Bundle bundle, String s2, String s3, ApplicationErrorReport applicationerrorreport, String s4, 
            BitmapTeleporter bitmapteleporter, String s5, ArrayList arraylist, boolean flag)
    {
        mVersionCode = i;
        mAccountInUse = s1;
        mPsdBundle = bundle;
        mPrimaryThemeColor = s2;
        mDescription = s3;
        mApplicationErrorReport = applicationerrorreport;
        mCategoryTag = s4;
        mBitmapTeleporter = bitmapteleporter;
        mPackageName = s5;
        mFileTeleporters = arraylist;
        mExcludePii = flag;
    }


    private FeedbackOptions O(boolean flag)
    {
        mExcludePii = flag;
        return this;
    }

    static FeedbackOptions a(FeedbackOptions feedbackoptions, Bitmap bitmap)
    {
        return feedbackoptions.c(bitmap);
    }

    static FeedbackOptions a(FeedbackOptions feedbackoptions, Bundle bundle)
    {
        return feedbackoptions.s(bundle);
    }

    static FeedbackOptions a(FeedbackOptions feedbackoptions, String s1)
    {
        return feedbackoptions.bH(s1);
    }

    static FeedbackOptions a(FeedbackOptions feedbackoptions, ArrayList arraylist)
    {
        return feedbackoptions.d(arraylist);
    }

    static FeedbackOptions a(FeedbackOptions feedbackoptions, boolean flag)
    {
        return feedbackoptions.O(flag);
    }

    static FeedbackOptions b(FeedbackOptions feedbackoptions, String s1)
    {
        return feedbackoptions.bJ(s1);
    }

    private FeedbackOptions bH(String s1)
    {
        mAccountInUse = s1;
        return this;
    }

    private FeedbackOptions bI(String s1)
    {
        mPrimaryThemeColor = s1;
        return this;
    }

    private FeedbackOptions bJ(String s1)
    {
        mDescription = s1;
        return this;
    }

    private FeedbackOptions bK(String s1)
    {
        mCategoryTag = s1;
        return this;
    }

    private FeedbackOptions c(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            mBitmapTeleporter = new BitmapTeleporter(bitmap);
        }
        return this;
    }

    static FeedbackOptions c(FeedbackOptions feedbackoptions, String s1)
    {
        return feedbackoptions.bI(s1);
    }

    static FeedbackOptions d(FeedbackOptions feedbackoptions, String s1)
    {
        return feedbackoptions.bK(s1);
    }

    private FeedbackOptions d(ArrayList arraylist)
    {
        mFileTeleporters = arraylist;
        return this;
    }

    private FeedbackOptions s(Bundle bundle)
    {
        mPsdBundle = bundle;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getAccountInUse()
    {
        return mAccountInUse;
    }

    public final BitmapTeleporter getBitmapTeleporter()
    {
        return mBitmapTeleporter;
    }

    public final String getCategoryTag()
    {
        return mCategoryTag;
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

    public final String getDescription()
    {
        return mDescription;
    }

    public final boolean getExcludePii()
    {
        return mExcludePii;
    }

    public final ArrayList getFileTeleporters()
    {
        return mFileTeleporters;
    }

    public final String getPackageName()
    {
        return mPackageName;
    }

    public final String getPrimaryThemeColor()
    {
        return mPrimaryThemeColor;
    }

    public final Bundle getPsdBundle()
    {
        return mPsdBundle;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.feedback.b.a(this, parcel, i);
    }

}
