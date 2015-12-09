// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.feedback.internal.FeedbackClientImpl;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.googlehelp:
//            GoogleHelpCreator

public final class GoogleHelp
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GoogleHelpCreator();
    String mApiDebugOption;
    int mAppIconResId;
    int mAppLabelResId;
    Bitmap mBackupScreenshot;
    String mCallingPackageName;
    PendingIntent mCustomFeedbackPendingIntent;
    public Uri mFallbackSupportUri;
    ErrorReport mFeedbackErrorReport;
    Bundle mFeedbackPsdBundle;
    public Account mGoogleAccount;
    String mHelpCenterContext;
    boolean mMetricsReportingEnabled;
    List mOfflineSuggestions;
    List mOverflowMenuItems;
    int mPipInitPos;
    Bundle mPsdBundle;
    byte mScreenshotBytes[];
    int mScreenshotHeight;
    int mScreenshotWidth;
    boolean mSearchEnabled;
    boolean mShowContactCardFirst;
    List mSupportPhoneNumbers;
    public ThemeSettings mThemeSettings;
    public TogglingData mTogglingData;
    final int mVersionCode;

    GoogleHelp(int i, String s, Account account, Bundle bundle, String s1, int j, int k, 
            boolean flag, boolean flag1, List list, Bundle bundle1, Bitmap bitmap, byte abyte0[], int l, 
            int i1, String s2, Uri uri, List list1, int j1, ThemeSettings themesettings, List list2, 
            boolean flag2, ErrorReport errorreport, TogglingData togglingdata, int k1, PendingIntent pendingintent)
    {
        mFeedbackErrorReport = new ErrorReport();
        mVersionCode = i;
        mHelpCenterContext = s;
        mGoogleAccount = account;
        mPsdBundle = bundle;
        mCallingPackageName = s1;
        mAppLabelResId = j;
        mAppIconResId = k;
        mSearchEnabled = flag;
        mMetricsReportingEnabled = flag1;
        mSupportPhoneNumbers = list;
        mCustomFeedbackPendingIntent = pendingintent;
        mFeedbackPsdBundle = bundle1;
        mBackupScreenshot = bitmap;
        mScreenshotBytes = abyte0;
        mScreenshotWidth = l;
        mScreenshotHeight = i1;
        mApiDebugOption = s2;
        mFallbackSupportUri = uri;
        mOverflowMenuItems = list1;
        if (mVersionCode >= 4) goto _L2; else goto _L1
_L1:
        themesettings = new ThemeSettings();
        themesettings.mThemeId = j1;
_L4:
        mThemeSettings = themesettings;
        mOfflineSuggestions = list2;
        mShowContactCardFirst = flag2;
        mFeedbackErrorReport = errorreport;
        if (mFeedbackErrorReport != null)
        {
            mFeedbackErrorReport.launcher = "GoogleHelp";
        }
        mTogglingData = togglingdata;
        mPipInitPos = k1;
        return;
_L2:
        if (themesettings == null)
        {
            themesettings = new ThemeSettings();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private GoogleHelp(String s)
    {
        this(7, s, null, null, null, 0, 0, true, true, ((List) (new ArrayList())), null, null, null, 0, 0, null, null, ((List) (new ArrayList())), 0, null, ((List) (new ArrayList())), false, new ErrorReport(), null, 0, null);
    }

    public static Bitmap getScreenshot(Activity activity)
    {
        Bitmap bitmap;
        activity = activity.getWindow().getDecorView().getRootView();
        bitmap = Bitmap.createBitmap(activity.getWidth(), activity.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        activity.draw(new Canvas(bitmap));
        return bitmap;
        activity;
_L2:
        Log.w("GOOGLEHELP_GoogleHelp", "Get screenshot failed!", activity);
        return null;
        activity;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static GoogleHelp newInstance(String s)
    {
        return new GoogleHelp(s);
    }

    public final Intent buildHelpIntent()
    {
        return (new Intent("com.google.android.gms.googlehelp.HELP")).setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final GoogleHelp setFeedbackOptions(FeedbackOptions feedbackoptions, File file)
    {
        mFeedbackErrorReport = FeedbackClientImpl.getErrorReport(feedbackoptions, file);
        mFeedbackErrorReport.launcher = "GoogleHelp";
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GoogleHelpCreator.writeToParcel(this, parcel, i);
    }

}
