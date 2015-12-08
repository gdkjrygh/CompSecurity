// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class lao extends kbo
{

    public Context a;

    public lao(Context context, Looper looper, jyq jyq, jys jys, kax kax)
    {
        super(context, looper, 29, kax, jyq, jys);
        a = context;
    }

    public static ErrorReport a(FeedbackOptions feedbackoptions, File file)
    {
        ErrorReport errorreport = new ErrorReport();
        if (feedbackoptions != null)
        {
            if (feedbackoptions.c != null && feedbackoptions.c.size() > 0)
            {
                errorreport.E = feedbackoptions.c;
            }
            if (!TextUtils.isEmpty(feedbackoptions.b))
            {
                errorreport.C = feedbackoptions.b;
            }
            if (!TextUtils.isEmpty(feedbackoptions.d))
            {
                errorreport.c = feedbackoptions.d;
            }
            if (feedbackoptions.a() != null)
            {
                errorreport.N = feedbackoptions.a().throwMethodName;
                errorreport.L = feedbackoptions.a().throwLineNumber;
                errorreport.M = feedbackoptions.a().throwClassName;
                errorreport.O = feedbackoptions.a().stackTrace;
                errorreport.J = feedbackoptions.a().exceptionClassName;
                errorreport.P = feedbackoptions.a().exceptionMessage;
                errorreport.K = feedbackoptions.a().throwFileName;
            }
            if (feedbackoptions.k != null)
            {
                errorreport.Z = feedbackoptions.k;
            }
            if (!TextUtils.isEmpty(feedbackoptions.f))
            {
                errorreport.Q = feedbackoptions.f;
            }
            if (!TextUtils.isEmpty(feedbackoptions.h))
            {
                errorreport.b.packageName = feedbackoptions.h;
            }
            if (feedbackoptions.g != null && file != null)
            {
                errorreport.T = feedbackoptions.g;
                BitmapTeleporter bitmapteleporter = errorreport.T;
                if (file == null)
                {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bitmapteleporter.d = file;
            }
            if (feedbackoptions.i != null && feedbackoptions.i.size() != 0 && file != null)
            {
                for (Iterator iterator = feedbackoptions.i.iterator(); iterator.hasNext();)
                {
                    FileTeleporter fileteleporter = (FileTeleporter)iterator.next();
                    if (file == null)
                    {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    fileteleporter.e = file;
                }

                errorreport.V = (FileTeleporter[])feedbackoptions.i.toArray(new FileTeleporter[feedbackoptions.i.size()]);
            }
            if (feedbackoptions.l != null)
            {
                errorreport.aa = feedbackoptions.l;
            }
            errorreport.X = feedbackoptions.j;
        }
        return errorreport;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return laq.a(ibinder);
    }

    protected final String c()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    protected final String d()
    {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }
}
