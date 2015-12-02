// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.reporter;

import android.app.Application;

public interface ReportsCrashes
{

    public abstract String[] additionalDropBoxTags();

    public abstract boolean checkSSLCertsOnCrashReport();

    public abstract int dropboxCollectionMinutes();

    public abstract String formPostFormat();

    public abstract Application getApplication();

    public abstract boolean includeDropBoxSystemTags();

    public abstract String[] logcatArguments();

    public abstract int socketTimeout();
}
