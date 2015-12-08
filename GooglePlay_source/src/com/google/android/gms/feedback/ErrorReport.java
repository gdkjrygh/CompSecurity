// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.feedback:
//            ErrorReportCreator, FileTeleporter, LogOptions, ThemeSettings

public class ErrorReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ErrorReportCreator();
    public String account;
    public String anrStackTraces;
    public ApplicationErrorReport applicationErrorReport;
    public BitmapTeleporter bitmapTeleporter;
    public String board;
    public String brand;
    public String buildFingerprint;
    public String buildId;
    public String buildType;
    public String categoryTag;
    public Bundle classificationSignals;
    public String codename;
    public String color;
    public String description;
    public String device;
    public String eventLog[];
    public String exceptionClassName;
    public String exceptionMessage;
    public boolean excludePii;
    public FileTeleporter fileTeleporterList[];
    public List highlightBounds;
    public String incremental;
    public boolean isCtlAllowed;
    public boolean isSilentSend;
    public String launcher;
    public String localeString;
    public LogOptions logOptions;
    public String model;
    public int networkMcc;
    public int networkMnc;
    public String networkName;
    public int networkType;
    public int packageVersion;
    public String packageVersionName;
    public int phoneType;
    public String product;
    public Bundle psdBundle;
    public String psdFilePaths[];
    public String release;
    public String runningApplications[];
    public String screenshot;
    public byte screenshotBytes[];
    public int screenshotHeight;
    public String screenshotPath;
    public int screenshotWidth;
    public int sdk_int;
    public String stackTrace;
    public String submittingPackageName;
    public String suggestionSessionId;
    public boolean suggestionShown;
    public String systemLog[];
    public ThemeSettings themeSettings;
    public String throwClassName;
    public String throwFileName;
    public int throwLineNumber;
    public String throwMethodName;
    public final int versionCode;

    public ErrorReport()
    {
        applicationErrorReport = new ApplicationErrorReport();
        versionCode = 9;
    }

    ErrorReport(int i, ApplicationErrorReport applicationerrorreport, String s, int j, String s1, String s2, String s3, 
            String s4, String s5, String s6, String s7, int k, String s8, String s9, 
            String s10, String s11, String s12, String as[], String as1[], String as2[], String s13, 
            String s14, byte abyte0[], int l, int i1, int j1, int k1, String s15, 
            String s16, String s17, Bundle bundle, boolean flag, int l1, int i2, boolean flag1, 
            String s18, String s19, int j2, String s20, String s21, String s22, String s23, 
            String s24, String s25, String s26, BitmapTeleporter bitmapteleporter, String s27, FileTeleporter afileteleporter[], String as3[], 
            boolean flag2, String s28, ThemeSettings themesettings, LogOptions logoptions, String s29, boolean flag3, Bundle bundle1, 
            List list)
    {
        applicationErrorReport = new ApplicationErrorReport();
        versionCode = i;
        applicationErrorReport = applicationerrorreport;
        description = s;
        packageVersion = j;
        packageVersionName = s1;
        device = s2;
        buildId = s3;
        buildType = s4;
        model = s5;
        product = s6;
        buildFingerprint = s7;
        sdk_int = k;
        release = s8;
        incremental = s9;
        codename = s10;
        board = s11;
        brand = s12;
        runningApplications = as;
        systemLog = as1;
        eventLog = as2;
        anrStackTraces = s13;
        screenshot = s14;
        screenshotBytes = abyte0;
        screenshotHeight = l;
        screenshotWidth = i1;
        phoneType = j1;
        networkType = k1;
        networkName = s15;
        account = s16;
        localeString = s17;
        psdBundle = bundle;
        isSilentSend = flag;
        networkMcc = l1;
        networkMnc = i2;
        isCtlAllowed = flag1;
        exceptionClassName = s18;
        throwFileName = s19;
        throwLineNumber = j2;
        throwClassName = s20;
        throwMethodName = s21;
        stackTrace = s22;
        exceptionMessage = s23;
        categoryTag = s24;
        color = s25;
        submittingPackageName = s26;
        bitmapTeleporter = bitmapteleporter;
        screenshotPath = s27;
        fileTeleporterList = afileteleporter;
        psdFilePaths = as3;
        excludePii = flag2;
        launcher = s28;
        themeSettings = themesettings;
        logOptions = logoptions;
        suggestionSessionId = s29;
        suggestionShown = flag3;
        classificationSignals = bundle1;
        highlightBounds = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ErrorReportCreator.writeToParcel(this, parcel, i);
    }

}
