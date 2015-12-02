// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.reporter;

import android.content.Context;

public interface ReportsCrashes
{

    public abstract String[] additionalDropBoxTags();

    public abstract void checkSSLCertsOnCrashReport(boolean flag);

    public abstract boolean checkSSLCertsOnCrashReport();

    public abstract int dropboxCollectionMinutes();

    public abstract String formPostFormat();

    public abstract Context getApplicationContext();

    public abstract String getUserAgent();

    public abstract boolean includeDropBoxSystemTags();

    public abstract String[] logcatArguments();

    public abstract int socketTimeout();
}
