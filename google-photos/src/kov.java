// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ApplicationErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

public final class kov extends kou
{

    public final ApplicationErrorReport e = new ApplicationErrorReport();

    public kov()
    {
        e.crashInfo = new android.app.ApplicationErrorReport.CrashInfo();
        e.crashInfo.throwLineNumber = -1;
    }

    public final FeedbackOptions a()
    {
        b.d(e.crashInfo.exceptionClassName);
        b.d(e.crashInfo.throwFileName);
        b.d(e.crashInfo.throwClassName);
        b.d(e.crashInfo.throwMethodName);
        b.d(e.crashInfo.stackTrace);
        return FeedbackOptions.d(FeedbackOptions.a(super.a(), e.crashInfo), null);
    }
}
