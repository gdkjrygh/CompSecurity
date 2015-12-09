// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            kb, kj, mk

public final class mj extends kb
{

    private Context mContext;

    public mj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, null);
        mContext = context;
    }

    private static ErrorReport a(FeedbackOptions feedbackoptions, File file)
    {
        ErrorReport errorreport = new ErrorReport();
        if (feedbackoptions != null)
        {
            if (feedbackoptions.getPsdBundle() != null && feedbackoptions.getPsdBundle().size() > 0)
            {
                errorreport.psdBundle = feedbackoptions.getPsdBundle();
            }
            if (!TextUtils.isEmpty(feedbackoptions.getAccountInUse()))
            {
                errorreport.account = feedbackoptions.getAccountInUse();
            }
            if (!TextUtils.isEmpty(feedbackoptions.getDescription()))
            {
                errorreport.description = feedbackoptions.getDescription();
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
            if (!TextUtils.isEmpty(feedbackoptions.getPrimaryThemeColor()))
            {
                errorreport.color = feedbackoptions.getPrimaryThemeColor();
            }
            if (!TextUtils.isEmpty(feedbackoptions.getCategoryTag()))
            {
                errorreport.categoryTag = feedbackoptions.getCategoryTag();
            }
            if (!TextUtils.isEmpty(feedbackoptions.getPackageName()))
            {
                errorreport.applicationErrorReport.packageName = feedbackoptions.getPackageName();
            }
            if (feedbackoptions.getBitmapTeleporter() != null)
            {
                errorreport.bitmapTeleporter = feedbackoptions.getBitmapTeleporter();
                errorreport.bitmapTeleporter.setTempDir(file);
            }
            if (feedbackoptions.getFileTeleporters() != null && feedbackoptions.getFileTeleporters().size() != 0)
            {
                for (Iterator iterator = feedbackoptions.getFileTeleporters().iterator(); iterator.hasNext(); ((FileTeleporter)iterator.next()).setTempDir(file)) { }
                errorreport.fileTeleporterList = (FileTeleporter[])feedbackoptions.getFileTeleporters().toArray(new FileTeleporter[feedbackoptions.getFileTeleporters().size()]);
            }
            errorreport.excludePii = feedbackoptions.getExcludePii();
        }
        return errorreport;
    }

    private static mk bI(IBinder ibinder)
    {
        return mk.a.bJ(ibinder);
    }

    private ErrorReport c(FeedbackOptions feedbackoptions)
    {
        return a(feedbackoptions, mContext.getCacheDir());
    }

    protected final void a(kj kj1, kb.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        kj1.m(e, 0x648278, getContext().getPackageName(), bundle);
    }

    public final boolean a(FeedbackOptions feedbackoptions)
    {
        try
        {
            ((mk)iP()).a(c(feedbackoptions));
        }
        // Misplaced declaration of an exception variable
        catch (FeedbackOptions feedbackoptions)
        {
            if (feedbackoptions.getMessage() != null)
            {
                Log.w("FeedbackClientImpl", feedbackoptions.getMessage());
            } else
            {
                Log.w("FeedbackClientImpl", "Remote Exception: null");
            }
            return false;
        }
        return true;
    }

    protected final String bK()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final String bL()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final IInterface p(IBinder ibinder)
    {
        return bI(ibinder);
    }
}
