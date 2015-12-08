// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback.internal;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class FeedbackClientImpl extends GmsClient
{

    private Context mContext;

    public FeedbackClientImpl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ClientSettings clientsettings)
    {
        super(context, looper, 29, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mContext = context;
    }

    public static ErrorReport getErrorReport(FeedbackOptions feedbackoptions, File file)
    {
        ErrorReport errorreport = new ErrorReport();
        if (feedbackoptions != null)
        {
            if (feedbackoptions.mPsdBundle != null && feedbackoptions.mPsdBundle.size() > 0)
            {
                errorreport.psdBundle = feedbackoptions.mPsdBundle;
            }
            if (!TextUtils.isEmpty(feedbackoptions.mAccountInUse))
            {
                errorreport.account = feedbackoptions.mAccountInUse;
            }
            if (!TextUtils.isEmpty(feedbackoptions.mDescription))
            {
                errorreport.description = feedbackoptions.mDescription;
            }
            if (feedbackoptions.getCrashInfo() != null)
            {
                errorreport.throwMethodName = feedbackoptions.getCrashInfo().throwMethodName;
                errorreport.throwLineNumber = feedbackoptions.getCrashInfo().throwLineNumber;
                errorreport.throwClassName = feedbackoptions.getCrashInfo().throwClassName;
                errorreport.stackTrace = feedbackoptions.getCrashInfo().stackTrace;
                errorreport.exceptionClassName = feedbackoptions.getCrashInfo().exceptionClassName;
                errorreport.exceptionMessage = feedbackoptions.getCrashInfo().exceptionMessage;
                errorreport.throwFileName = feedbackoptions.getCrashInfo().throwFileName;
            }
            if (feedbackoptions.mThemeSettings != null)
            {
                errorreport.themeSettings = feedbackoptions.mThemeSettings;
            }
            if (!TextUtils.isEmpty(feedbackoptions.mCategoryTag))
            {
                errorreport.categoryTag = feedbackoptions.mCategoryTag;
            }
            if (!TextUtils.isEmpty(feedbackoptions.mPackageName))
            {
                errorreport.applicationErrorReport.packageName = feedbackoptions.mPackageName;
            }
            if (feedbackoptions.mBitmapTeleporter != null && file != null)
            {
                errorreport.bitmapTeleporter = feedbackoptions.mBitmapTeleporter;
                errorreport.bitmapTeleporter.setTempDir(file);
            }
            if (feedbackoptions.mFileTeleporters != null && feedbackoptions.mFileTeleporters.size() != 0 && file != null)
            {
                for (Iterator iterator = feedbackoptions.mFileTeleporters.iterator(); iterator.hasNext();)
                {
                    FileTeleporter fileteleporter = (FileTeleporter)iterator.next();
                    if (file == null)
                    {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    fileteleporter.mTempDir = file;
                }

                errorreport.fileTeleporterList = (FileTeleporter[])feedbackoptions.mFileTeleporters.toArray(new FileTeleporter[feedbackoptions.mFileTeleporters.size()]);
            }
            if (feedbackoptions.mLogOptions != null)
            {
                errorreport.logOptions = feedbackoptions.mLogOptions;
            }
            errorreport.excludePii = feedbackoptions.mExcludePii;
        }
        return errorreport;
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IFeedbackService.Stub.asInterface(ibinder);
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }
}
